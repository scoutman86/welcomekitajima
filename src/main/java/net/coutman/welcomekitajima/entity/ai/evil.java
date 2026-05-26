package net.coutman.welcomekitajima.entity.ai;

import net.coutman.welcomekitajima.entity.ACCGrunt;
import net.coutman.welcomekitajima.item.BowWeapon;
import net.minecraft.world.entity.ai.goal.RangedBowAttackGoal;
import net.minecraft.world.entity.monster.RangedAttackMob;

public class evil<T extends ACCGrunt & RangedAttackMob> extends RangedBowAttackGoal<T> {
    private final T mob;

    public evil (T mob, double speedModifier, int attackIntervalMin, float attackRadius) {
        super(mob, speedModifier, attackIntervalMin, attackRadius);
        this.mob = mob;
    }

    @Override
    public boolean canUse() {
        return super.canUse() || (this.mob.getTarget() != null && this.isHoldingCustomBow());
    }

    @Override
    public boolean canContinueToUse() {
        return super.canContinueToUse() || (this.mob.getTarget() != null && this.isHoldingCustomBow());
    }

    private boolean isHoldingCustomBow() {
        return this.mob.getMainHandItem().getItem() instanceof BowWeapon;
    }
}