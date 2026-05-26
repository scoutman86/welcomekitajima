package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.entity.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class EntityRegistry {
    public static final EntityType<ACCGrunt> ACC_GRUNT_ENTITY_TYPE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(WelcomeKitajima.MODID, "acc_grunt"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, ACCGrunt::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f)) // Standard humanoid hit-box
                    .build()
    );

    public static void load() {
        FabricDefaultAttributeRegistry.register(ACC_GRUNT_ENTITY_TYPE, ACCGrunt.createAttributes());
    }
}