package net.coutman.welcomekitajima.entity;

import io.github.xrickastley.sevenelements.component.ElementComponent;
import io.github.xrickastley.sevenelements.element.Element;
import io.github.xrickastley.sevenelements.element.ElementalApplication;
import io.github.xrickastley.sevenelements.element.ElementalApplications;
import io.github.xrickastley.sevenelements.element.InternalCooldownContext;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.phys.Vec3;

import java.util.EnumSet;

public class ElectroSpirit extends Allay {
    public ElectroSpirit(EntityType<? extends Allay> entityType, Level level) {
        super(entityType, level);
    }

    private static class ElectroAuraApplicationGoal extends Goal {
        private final ElectroSpirit electroSpirit;

        public ElectroAuraApplicationGoal(ElectroSpirit electroSpirit) {
            this.electroSpirit = electroSpirit;
        }

        @Override
        public boolean canUse() {
            return this.electroSpirit != null;
        }

        @Override
        @SuppressWarnings("all")
        public void tick() {
            LivingEntity auraTarget = this.electroSpirit;
            ElementComponent component = ElementComponent.KEY.get(auraTarget);

            if (auraTarget != null) {
                ElementalApplication application = ElementalApplications.gaugeUnits(
                        auraTarget,
                        Element.ELECTRO,
                        50.0,
                        true
                );
                component.addElementalApplication(application, InternalCooldownContext.ofNone());
            }
        }
    }

    // imported from Java 1.20.1's codebase
    /*
    class ElectroSpiritChargeAttackGoal extends Goal {
        public ElectroSpiritChargeAttackGoal() {
            this.setFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        @Override
        public boolean canUse() {
            LivingEntity $$0 = ElectroSpirit.this.getTarget();
            if ($$0 != null && $$0.isAlive() && !ElectroSpirit.this.getMoveControl().hasWanted() && ElectroSpirit.this.random.nextInt(reducedTickDelay(7)) == 0) {
                return ElectroSpirit.this.distanceToSqr($$0) > 4.0;
            } else {
                return false;
            }
        }

        @Override
        public boolean canContinueToUse() {
            return ElectroSpirit.this.getMoveControl().hasWanted() && ElectroSpirit.this.isCharging() && ElectroSpirit.this.getTarget() != null && ElectroSpirit.this.getTarget().isAlive();
        }

        @Override
        public void start() {
            LivingEntity $$0 = ElectroSpirit.this.getTarget();
            if ($$0 != null) {
                Vec3 $$1 = $$0.getEyePosition();
                ElectroSpirit.this.moveControl.setWantedPosition($$1.x, $$1.y, $$1.z, 1.0);
            }

            ElectroSpirit.this.setIsCharging(true);
            ElectroSpirit.this.playSound(SoundEvents.VEX_CHARGE, 1.0F, 1.0F);
        }

        @Override
        public void stop() {
            ElectroSpirit.this.setIsCharging(false);
        }

        @Override
        public boolean requiresUpdateEveryTick() {
            return true;
        }

        @Override
        public void tick() {
            LivingEntity $$0 = ElectroSpirit.this.getTarget();
            if ($$0 != null) {
                if (ElectroSpirit.this.getBoundingBox().intersects($$0.getBoundingBox())) {
                    ElectroSpirit.this.doHurtTarget($$0);
                    ElectroSpirit.this.setIsCharging(false);
                } else {
                    double $$1 = ElectroSpirit.this.distanceToSqr($$0);
                    if ($$1 < 9.0) {
                        Vec3 $$2 = $$0.getEyePosition();
                        ElectroSpirit.this.moveControl.setWantedPosition($$2.x, $$2.y, $$2.z, 1.0);
                    }
                }
            }
        }
    }
     */

    private static class ResetTargetGoal extends Goal {
        private final ElectroSpirit electroSpirit;

        public ResetTargetGoal(ElectroSpirit electroSpirit) {
            this.electroSpirit = electroSpirit;
        }

        @Override
        public boolean canUse() {
            LivingEntity target = this.electroSpirit.getTarget();
            return target != null && !target.isAlive();
        }

        @Override
        public void start() {
            this.electroSpirit.setTarget(null);
            this.electroSpirit.getNavigation().moveTo((Path) null, 0);
        }
    }

    @Override
    protected void registerGoals() {
        // this.goalSelector.addGoal(0, new ElectroAuraApplicationGoal(this));
        this.goalSelector.addGoal(1, new FloatGoal(this));
        // this.goalSelector.addGoal(2, new ElectroSpiritChargeAttackGoal());
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2D, false));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomFlyingGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));

        this.targetSelector.addGoal(0, new ElectroSpirit.ResetTargetGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Allay.createAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.5D)
                .add(Attributes.ATTACK_DAMAGE, 2.0D);
    }
}
