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

public class DendroGolem extends IronGolem {
    public DendroGolem(EntityType<? extends IronGolem> entityType, Level level) {
        super(entityType, level);
    }

    private static class DendroAuraApplicationGoal extends Goal {
        private final DendroGolem dendroGolem;

        public DendroAuraApplicationGoal(DendroGolem dendroGolem) {
            this.dendroGolem = dendroGolem;
        }

        @Override
        public boolean canUse() {
            return this.dendroGolem != null;
        }

        @Override
        @SuppressWarnings("all")
        public void tick() {
            LivingEntity auraTarget = this.dendroGolem;
            ElementComponent component = ElementComponent.KEY.get(auraTarget);

            if (auraTarget != null) {
                ElementalApplication application = ElementalApplications.gaugeUnits(
                        auraTarget,
                        Element.DENDRO,
                        50.0,
                        true
                );
                component.addElementalApplication(application, InternalCooldownContext.ofNone());
            }
        }
    }

    private static class ResetTargetGoal extends Goal {
        private final DendroGolem dendroGolem;

        public ResetTargetGoal(DendroGolem dendroGolem) {
            this.dendroGolem = dendroGolem;
        }

        @Override
        public boolean canUse() {
            LivingEntity target = this.dendroGolem.getTarget();
            return target != null && !target.isAlive();
        }

        @Override
        public void start() {
            this.dendroGolem.setTarget(null);
            this.dendroGolem.getNavigation().moveTo((Path) null, 0);
        }
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new DendroAuraApplicationGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, false));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1));

        this.targetSelector.addGoal(0, new DendroGolem.ResetTargetGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return IronGolem.createAttributes()
                .add(Attributes.MAX_HEALTH, 100.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.ATTACK_DAMAGE, 5.0D);
    }
}
