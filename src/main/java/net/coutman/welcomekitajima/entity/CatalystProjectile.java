package net.coutman.welcomekitajima.entity;

import io.github.xrickastley.sevenelements.element.ElementalDamageSource;
import io.github.xrickastley.sevenelements.element.ElementalApplication;
import io.github.xrickastley.sevenelements.element.ElementalApplications;
import io.github.xrickastley.sevenelements.element.InternalCooldownContext;
import io.github.xrickastley.sevenelements.interfaces.InfusableProjectile;
import io.github.xrickastley.sevenelements.component.ElementalInfusionComponent;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.Nullable;
import java.util.Optional;

public class CatalystProjectile extends ThrowableItemProjectile implements InfusableProjectile {
    private @Nullable ItemStack originStack;
    private @Nullable ItemStack projectileStack;

    public CatalystProjectile(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public CatalystProjectile(Level level, LivingEntity shooter) {
        super(EntityType.SNOWBALL, shooter, level);
        this.originStack = shooter.getMainHandItem().copy();
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
            var baseDamageSource = damageSources().playerAttack((net.minecraft.world.entity.player.Player) shooter);

            var infusedDamageSource = this.sevenelements$attemptInfusion(baseDamageSource, target);

            if (infusedDamageSource.isPresent()) {
                livingTarget.hurt(infusedDamageSource.get(), 3.0F);
            } else {
                livingTarget.hurt(baseDamageSource, 3.0F);
            }
        }
    }

    @Override
    public void sevenelements$setOriginStack(ItemStack originStack) {
        this.originStack = originStack != null ? originStack.copy() : null;
    }

    public void sevenelements$setProjectileStack(ItemStack projectileStack) {
        this.projectileStack = projectileStack != null ? projectileStack.copy() : null;
    }

    @Override
    public java.util.Optional<ElementalDamageSource> sevenelements$attemptInfusion(
            DamageSource source,
            Entity target) {

        if (!(target instanceof LivingEntity livingTarget) || !(source.getEntity() instanceof LivingEntity attacker)) {
            return java.util.Optional.empty();
        }

        // Try to get infusion from the origin weapon (CatalystWeapon) - 1.20.1-LTS compatible
        @Nullable ElementalInfusionComponent infusionComponent = ElementalInfusionComponent.get(this.originStack != null ? this.originStack : ItemStack.EMPTY);

        // Fallback: try the projectile stack if origin doesn't have infusion
        if ((infusionComponent == null || !infusionComponent.hasElementalInfusion()) && this.projectileStack != null) {
            infusionComponent = ElementalInfusionComponent.get(this.projectileStack);
        }

        // If no infusion component found or no infusion, return empty
        if (infusionComponent == null || !infusionComponent.hasElementalInfusion()) {
            return java.util.Optional.empty();
        }

        // Apply the infusion and create an ElementalDamageSource
        return java.util.Optional.of(
                new ElementalDamageSource(
                        source,
                        infusionComponent.getElementalInfusion(livingTarget),
                        infusionComponent.internalCooldown().build(attacker)
                )
        );
    }
}