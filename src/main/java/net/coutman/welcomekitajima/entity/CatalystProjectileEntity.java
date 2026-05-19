package net.coutman.welcomekitajima.entity;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.effect.MobEffectInstance;
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
    private String element = "none";

    public CatalystProjectileEntity(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public CatalystProjectileEntity(Level level, LivingEntity shooter, String element) {
        super(EntityType.SNOWBALL, shooter, level); // Replace with your registered EntityType later
        this.element = element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide) {
            if (Objects.equals(this.element, "pyro")) {
                this.level().addParticle(
                        (ParticleOptions) BuiltInRegistries.PARTICLE_TYPE.get(new ResourceLocation("minecraft", "flame")),
                        this.getX(), this.getY() + 0.5, this.getZ(), 0, 0, 0
                );
            } else if (Objects.equals(this.element, "hydro")) {
                this.level().addParticle(
                        (ParticleOptions) BuiltInRegistries.PARTICLE_TYPE.get(new ResourceLocation("minecraft", "dripping_water")),
                        this.getX(), this.getY() + 0.5, this.getZ(), 0, 0, 0
                );
            } else if (Objects.equals(this.element, "anemo")) {
                this.level().addParticle(
                        (ParticleOptions) BuiltInRegistries.PARTICLE_TYPE.get(new ResourceLocation("minecraft", "cloud")),
                        this.getX(), this.getY() + 0.5, this.getZ(), 0, 0, 0
                );
            } else if (Objects.equals(this.element, "electro")) {
                this.level().addParticle(
                        (ParticleOptions) BuiltInRegistries.PARTICLE_TYPE.get(new ResourceLocation("minecraft", "electric_spark")),
                        this.getX(), this.getY() + 0.5, this.getZ(), 0, 0, 0
                );
            } else if (Objects.equals(this.element, "dendro")) {
                this.level().addParticle(
                        (ParticleOptions) BuiltInRegistries.PARTICLE_TYPE.get(new ResourceLocation("minecraft", "falling_spore_blossom")),
                        this.getX(), this.getY() + 0.5, this.getZ(), 0, 0, 0
                );
            } else if (Objects.equals(this.element, "cryo")) {
                this.level().addParticle(
                        (ParticleOptions) BuiltInRegistries.PARTICLE_TYPE.get(new ResourceLocation("minecraft", "snowflake")),
                        this.getX(), this.getY() + 0.5, this.getZ(), 0, 0, 0
                );
            } else if (Objects.equals(this.element, "geo")) {
                this.level().addParticle(
                        (ParticleOptions) BuiltInRegistries.PARTICLE_TYPE.get(new ResourceLocation("minecraft", "ash")),
                        this.getX(), this.getY() + 0.5, this.getZ(), 0, 0, 0
                );
            }
        }
    }

    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);
        if (!this.level().isClientSide) {
            this.discard(); // Destroy projectile on impact
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity target = entityHitResult.getEntity();
        Entity owner = this.getOwner();

        if (!this.level().isClientSide && target instanceof LivingEntity livingTarget && owner instanceof LivingEntity shooter) {
            WelcomeKitajima.LOGGER.info(this.element);
            // 1. Get your custom Damage Type Registry Key dynamically based on the element
            ResourceKey<DamageType> damageTypeKey = ResourceKey.create(
                    Registries.DAMAGE_TYPE,
                    new ResourceLocation(WelcomeKitajima.MODID, this.element + "_damage")
            );

            // 2. Create the damage source
            DamageSource source = new DamageSource(
                    this.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(damageTypeKey),
                    this,
                    shooter
            );

            // 3. Deal damage (e.g., 5.0F base damage)
            livingTarget.hurt(source, 5.0F);

            // 4. Apply status effect for elemental reactions
            // Assuming you have registered custom MobEffects named after your elements
            var effect = net.minecraft.core.registries.BuiltInRegistries.MOB_EFFECT.get(
                    new ResourceLocation(WelcomeKitajima.MODID, this.element + "_status")
            );

            if (effect != null) {
                livingTarget.addEffect(new MobEffectInstance(effect, 100, 0, false, true));
            }
        }
    }
}