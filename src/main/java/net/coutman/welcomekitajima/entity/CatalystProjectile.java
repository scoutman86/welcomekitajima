package net.coutman.welcomekitajima.entity;

import io.github.xrickastley.sevenelements.element.ElementalDamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class CatalystProjectile extends ThrowableItemProjectile {
    public CatalystProjectile(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public CatalystProjectile(Level level, LivingEntity shooter) {
        super(EntityType., shooter, level);
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }

    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);
        if (!this.level().isClientSide) {
            this.discard();
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity target = entityHitResult.getEntity();
        Entity owner = this.getOwner();

        if (!this.level().isClientSide && target instanceof LivingEntity livingTarget && owner instanceof LivingEntity shooter) {
            livingTarget.hurt(ElementalDamageSource.of(DamageTypes.PLAYER_ATTACK, target), 3.0F);
        }
    }
}