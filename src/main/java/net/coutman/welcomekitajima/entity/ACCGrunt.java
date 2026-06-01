package net.coutman.welcomekitajima.entity;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.item.*;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.*;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.pathfinder.Path;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.RandomSource;

public class ACCGrunt extends Monster implements RangedAttackMob {
    private final RangedAttackGoal bowAttackGoal = new RangedAttackGoal(this, 1.0D, 60, 15.0F);
    private final MeleeAttackGoal meleeAttackGoal = new MeleeAttackGoal(this, 1.2D, false);

    private static final EntityDataAccessor<String> DATA_ID_TYPE_VARIANT =
            SynchedEntityData.defineId(ACCGrunt.class, EntityDataSerializers.STRING);

    public ACCGrunt(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public boolean isAggressive() {
        return this.isBow() || super.isAggressive();
    }

    public boolean isBow() {
        return this.getMainHandItem().getItem() instanceof net.minecraft.world.item.BowItem;
    }

    @Override
    public void setItemSlot(EquipmentSlot slot, ItemStack stack) {
        super.setItemSlot(slot, stack);
        if (!this.level().isClientSide && slot == EquipmentSlot.MAINHAND) {
            this.reassessWeaponGoal();
        }
    }

    public void reassessWeaponGoal() {
        if (this.level() != null && !this.level().isClientSide) {
            this.goalSelector.removeGoal(this.meleeAttackGoal);
            this.goalSelector.removeGoal(this.bowAttackGoal);

            ItemStack itemstack = this.getMainHandItem();
            if (this.isBow()) {
                this.goalSelector.addGoal(1, this.bowAttackGoal);
            } else {
                this.goalSelector.addGoal(1, this.meleeAttackGoal);
            }
        }
    }

    private class ResetTargetGoal extends Goal {
        private final ACCGrunt grunt;

        public ResetTargetGoal(ACCGrunt grunt) {
            this.grunt = grunt;
        }

        @Override
        public boolean canUse() {
            LivingEntity target = this.grunt.getTarget();
            return target != null && !target.isAlive();
        }

        @Override
        public void start() {
            this.grunt.setTarget(null);
            this.grunt.getNavigation().moveTo((Path) null, 0);
        }
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(4, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1));

        this.targetSelector.addGoal(0, new ResetTargetGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this, ACCGrunt.class).setAlertOthers());
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.ATTACK_DAMAGE, 3.0D);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE_VARIANT, "pyro");
    }

    @Override
    public void performRangedAttack(LivingEntity target, float pullProgress) {
        AbstractArrow arrow = ProjectileUtil.getMobArrow(this, new ItemStack(Items.ARROW), pullProgress);

        double d0 = target.getX() - this.getX();
        double d1 = target.getY(0.3333333333333333D) - arrow.getY();
        double d2 = target.getZ() - this.getZ();
        double d3 = Math.sqrt(d0 * d0 + d2 * d2);

        arrow.shoot(d0, d1 + d3 * 0.20000000298023224D, d2, 1.6F, (float)(14 - this.level().getDifficulty().getId() * 4));

        this.playSound(SoundEvents.SKELETON_SHOOT, 1.0F, 1.0F / (this.getRandom().nextFloat() * 0.4F + 0.8F));

        this.level().addFreshEntity(arrow);
    }

    public ElementalVariance getVariant() {
        return ElementalVariance.byId(this.entityData.get(DATA_ID_TYPE_VARIANT));
    }

    public void setVariant(ElementalVariance variant) {
        this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId());
    }

    protected ResourceLocation getDefaultLootTableResourceLocation() {
        return new ResourceLocation(WelcomeKitajima.MODID, "entities/acc_grunt");
    }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty,
                                        MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData,
                                        @Nullable CompoundTag powerTag) {

        SpawnGroupData data = super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData, powerTag);
        RandomSource random = level.getRandom();

        Item[] randomWeapons = {
                SwordWeapon.SWORD_REGISTRY.get("silver_blade"),
                Items.BOW,
                ClaymoreWeapon.CLAYMORE_REGISTRY.get("shining_greatsword"),
                PolearmWeapon.POLEARM_REGISTRY.get("pearlescent_staff")
        };

        Item selectedItem = randomWeapons[this.getRandom().nextInt(randomWeapons.length)];

        if (selectedItem == null) {
            this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_AXE));
        } else {
            this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(selectedItem));
        }

        this.setDropChance(EquipmentSlot.MAINHAND, 0.0F);

        if (spawnType == MobSpawnType.NATURAL || spawnType == MobSpawnType.SPAWNER || spawnType == MobSpawnType.SPAWN_EGG || spawnType == MobSpawnType.COMMAND) {
            ElementalVariance randomVariant = ElementalVariance.values()[random.nextInt(ElementalVariance.values().length)];
            this.setVariant(randomVariant);
        }

        this.reassessWeaponGoal();

        return data;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putString("Variant", this.getVariant().getId());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.setVariant(ElementalVariance.byId(compound.getString("Variant")));
    }
}