package net.coutman.welcomekitajima.entity;

import io.github.xrickastley.sevenelements.element.ElementalDamageSource;
import io.github.xrickastley.sevenelements.element.ElementalApplication;
import io.github.xrickastley.sevenelements.element.ElementalApplications;
import io.github.xrickastley.sevenelements.element.InternalCooldownContext;
import io.github.xrickastley.sevenelements.interfaces.InfusableProjectile;
import io.github.xrickastley.sevenelements.component.ElementalInfusionComponent;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.init.EntityRegistry;

import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import java.util.Optional;

import org.joml.Vector3f;

public class CatalystProjectile extends Projectile implements InfusableProjectile {
    private static final EntityDataAccessor<ItemStack> DATA_ITEM_STACK =
            SynchedEntityData.defineId(CatalystProjectile.class, EntityDataSerializers.ITEM_STACK);

    private int maxBeamAge = 20;

    private ParticleOptions getElementalParticle() {
        Vector3f color = switch (this.getInfusedElementId()) {
            case "pyro"    -> new Vector3f(0.93f, 0.62f, 0.22f);
            case "hydro"   -> new Vector3f(0.39f, 0.79f, 0.96f);
            case "anemo"   -> new Vector3f(0.569f, 0.98f, 0.82f);
            case "electro" -> new Vector3f(0.84f, 0.62f, 0.97f);
            case "dendro"  -> new Vector3f(0.38f, 0.82f, 0.38f);
            case "cryo"    -> new Vector3f(0.68f, 0.99f, 1.0f);
            case "geo"     -> new Vector3f(0.97f, 0.81f, 0.47f);
            default        -> new Vector3f(1.0F, 1.0F, 1.0F);
        };
        return new DustParticleOptions(color, 1.0F);
    }

    private void spawnDeathParticles() {
        if (this.level() instanceof ServerLevel serverLevel) {
            ParticleOptions particle = this.getElementalParticle();

            serverLevel.sendParticles(
                    particle,
                    this.getX(),
                    this.getY() + 0.2,
                    this.getZ(),
                    20,
                    0.1D, 0.1D, 0.1D,
                    0.15D
            );
        }
    }

    public CatalystProjectile(EntityType<? extends CatalystProjectile> entityType, Level level) {
        super(entityType, level);
        this.noPhysics = false;
    }

    public CatalystProjectile(Level level, LivingEntity owner) {
        this(EntityRegistry.CATALYST_PROJECTILE, level);
        this.setOwner(owner);
        this.setPos(owner.getX(), owner.getEyeY() - 0.4D, owner.getZ());
    }

    @Override
    protected void defineSynchedData() {
        this.entityData.define(DATA_ITEM_STACK, ItemStack.EMPTY);
    }

    public ItemStack getItemStack() {
        return this.entityData.get(DATA_ITEM_STACK);
    }

    public void setItemStack(ItemStack stack) {
        this.entityData.set(DATA_ITEM_STACK, stack.copy());
    }

    @Override
    public boolean isNoGravity() {
        return true;
    }

    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide) {
            this.level().addParticle(
                    this.getElementalParticle(),
                    this.getX(),
                    this.getY() + 0.2,
                    this.getZ(),
                    0.0, 0.0, 0.0
            );
        }

        HitResult hitResult = ProjectileUtil.getHitResultOnMoveVector(this, this::canHitEntity);
        if (hitResult.getType() != HitResult.Type.MISS) {
            this.onHit(hitResult);
        }

        Vec3 velocity = this.getDeltaMovement();
        this.setPos(this.getX() + velocity.x, this.getY() + velocity.y, this.getZ() + velocity.z);

        if (!this.level().isClientSide && this.tickCount >= this.maxBeamAge) {
            this.spawnDeathParticles();
            this.discard();
        }
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if (!this.level().isClientSide && hitResult.getType() != HitResult.Type.MISS) {
            this.spawnDeathParticles();
            this.discard();
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity target = entityHitResult.getEntity();
        Entity owner = this.getOwner();

        if (!this.level().isClientSide && target instanceof LivingEntity livingTarget && owner instanceof Player betterOwner) {
            var baseDamageSource = damageSources().playerAttack(betterOwner);

            var infusedDamageSource = this.sevenelements$attemptInfusion(baseDamageSource, target);

            if (infusedDamageSource.isPresent()) {
                livingTarget.hurt(infusedDamageSource.get(), 3.0F);
            } else {
                livingTarget.hurt(baseDamageSource, 3.0F);
            }

            this.discard();
        }
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        this.maxBeamAge = tag.getInt("MaxAge");
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("MaxAge", this.maxBeamAge);
    }

    @Override
    public Packet<ClientGamePacketListener> getAddEntityPacket() {
        return new ClientboundAddEntityPacket(this);
    }

    // residual from when based on the snowball
    @Override
    public void sevenelements$setOriginStack(ItemStack originStack) {
        this.setItemStack(originStack);
    }

    public String getInfusedElementId() {
        ItemStack stack = this.getItemStack();
        if (stack.isEmpty()) {
            return "none";
        }

        ElementalInfusionComponent component = ElementalInfusionComponent.get(stack);
        if (component == null || !component.hasElementalInfusion()) {
            return "none";
        }

        return component.getElement().name().toLowerCase();
    }

    @Override
    public Optional<ElementalDamageSource> sevenelements$attemptInfusion(DamageSource source, Entity target) {
        if (!(target instanceof LivingEntity livingTarget) || !(source.getEntity() instanceof LivingEntity attacker)) {
            return Optional.empty();
        }

        ItemStack stack = this.getItemStack();
        if (stack.isEmpty()) {
            return Optional.empty();
        }

        @Nullable ElementalInfusionComponent infusionComponent = ElementalInfusionComponent.get(stack);

        if ((infusionComponent == null || !infusionComponent.hasElementalInfusion())) {
            return Optional.empty();
        }

        if (infusionComponent == null || !infusionComponent.hasElementalInfusion()) {
            return Optional.empty();
        }

        return Optional.of(
                new ElementalDamageSource(
                        source,
                        infusionComponent.getElementalInfusion(livingTarget),
                        infusionComponent.internalCooldown().build(attacker)
                )
        );
    }
}