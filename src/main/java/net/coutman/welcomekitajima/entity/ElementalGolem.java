package net.coutman.welcomekitajima.entity;

import io.github.xrickastley.sevenelements.component.ElementComponent;
import io.github.xrickastley.sevenelements.element.Element;
import io.github.xrickastley.sevenelements.element.ElementalApplication;
import io.github.xrickastley.sevenelements.element.ElementalApplications;
import io.github.xrickastley.sevenelements.element.InternalCooldownContext;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.Path;

public class ElementalGolem extends IronGolem {
    private final Element element;

    public ElementalGolem(EntityType<? extends IronGolem> entityType, Level level, Element element) {
        super(entityType, level);
        this.element = element;
    }

    public Element getElement() {
        return this.element;
    }

    private static class ElementalAuraApplicationGoal extends Goal {
        private final ElementalGolem elementalGolem;

        public ElementalAuraApplicationGoal(ElementalGolem elementalGolem) {
            this.elementalGolem = elementalGolem;
        }

        @Override
        public boolean canUse() {
            return this.elementalGolem != null;
        }

        @Override
        @SuppressWarnings("all")
        public void start() {
            LivingEntity auraTarget = this.elementalGolem;
            if (auraTarget != null) {
                ElementComponent component = ElementComponent.KEY.get(auraTarget);
                ElementalApplication application = ElementalApplications.gaugeUnits(
                        auraTarget,
                        this.elementalGolem.getElement(),
                        16384.0,
                        true
                );
                component.addElementalApplication(application, InternalCooldownContext.ofNone());
            }
        }
    }

    private static class ResetTargetGoal extends Goal {
        private final ElementalGolem elementalGolem;

        public ResetTargetGoal(ElementalGolem elementalGolem) {
            this.elementalGolem = elementalGolem;
        }

        @Override
        public boolean canUse() {
            LivingEntity target = this.elementalGolem.getTarget();
            return target != null && !target.isAlive();
        }

        @Override
        public void start() {
            this.elementalGolem.setTarget(null);
            this.elementalGolem.getNavigation().moveTo((Path) null, 0);
        }
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new ElementalAuraApplicationGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, false));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1));

        this.targetSelector.addGoal(0, new ElementalGolem.ResetTargetGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return IronGolem.createAttributes()
                .add(Attributes.MAX_HEALTH, 100.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.ATTACK_DAMAGE, 5.0D);
    }
}
