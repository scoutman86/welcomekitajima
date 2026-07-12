package net.coutman.welcomekitajima.entity;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.Objects;

// ai code.
public class CatalystProjectileEntity extends ThrowableItemProjectile {

    public CatalystProjectileEntity(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public CatalystProjectileEntity(Level level, LivingEntity shooter) {
        super(EntityType.SNOWBALL, shooter, level);
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

    /*

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity target = entityHitResult.getEntity();
        Entity owner = this.getOwner();

        if (!this.level().isClientSide && target instanceof LivingEntity livingTarget && owner instanceof LivingEntity shooter) {

            DamageSource source = new DamageSource(
                    this.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(),
                    this,
                    shooter
            );

            livingTarget.hurt(source, 5.0F);
        }
    }

     */
}