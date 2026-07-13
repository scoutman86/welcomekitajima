package net.coutman.welcomekitajima.entity;

import io.github.xrickastley.sevenelements.component.ElementComponent;
import io.github.xrickastley.sevenelements.element.Element;
import io.github.xrickastley.sevenelements.element.ElementalApplication;
import io.github.xrickastley.sevenelements.element.ElementalApplications;

import io.github.xrickastley.sevenelements.element.InternalCooldownContext;
import io.github.xrickastley.sevenelements.element.reaction.ElementalReaction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.Path;

import java.util.List;

public class GeoGolem extends IronGolem {
    public GeoGolem(EntityType<? extends IronGolem> entityType, Level level) {
        super(entityType, level);
    }


  /*
    LivingEntity auraTarget = ;
    ElementComponent component = ElementComponent.KEY.get(this);

    ElementalApplication application = ElementalApplications.gaugeUnits(
            auraTarget,
            Element.GEO,
            100.0,
            true
    );

    List<ElementalReaction> reactions = component.addElementalApplication(application, InternalCooldownContext.ofNone());
 */

    private static class ResetTargetGoal extends Goal {
        private final GeoGolem geoGolem;

        public ResetTargetGoal(GeoGolem geoGolem) {
            this.geoGolem = geoGolem;
        }

        @Override
        public boolean canUse() {
            LivingEntity target = this.geoGolem.getTarget();
            return target != null && !target.isAlive();
        }

        @Override
        public void start() {
            this.geoGolem.setTarget(null);
            this.geoGolem.getNavigation().moveTo((Path) null, 0);
        }
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, false));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1));

        this.targetSelector.addGoal(0, new GeoGolem.ResetTargetGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this, GeoGolem.class).setAlertOthers());
    }

    public static AttributeSupplier.Builder createAttributes() {
        return IronGolem.createAttributes()
                .add(Attributes.MAX_HEALTH, 100.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.ATTACK_DAMAGE, 5.0D);
    }
}
