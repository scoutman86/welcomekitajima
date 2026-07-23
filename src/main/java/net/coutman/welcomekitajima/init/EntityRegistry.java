package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.entity.*;
import net.coutman.welcomekitajima.entity.renderers.*;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
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
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f))
                    .build()
    );

    public static final EntityType<GeoGolem> GEO_GOLEM_ENTITY_TYPE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(WelcomeKitajima.MODID, "geo_golem"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, GeoGolem::new)
                    .dimensions(EntityDimensions.fixed(1f, 2.5f)) // I have no fucking idea how big this is
                    .build()
    );

    public static final EntityType<DendroGolem> DENDRO_GOLEM_ENTITY_TYPE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(WelcomeKitajima.MODID, "dendro_golem"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, DendroGolem::new)
                    .dimensions(EntityDimensions.fixed(1f, 2.5f)) // I have no fucking idea how big this is
                    .build()
    );

    public static final EntityType<AnemoGolem> ANEMO_GOLEM_ENTITY_TYPE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(WelcomeKitajima.MODID, "anemo_golem"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, AnemoGolem::new)
                    .dimensions(EntityDimensions.fixed(1f, 2.5f)) // I have no fucking idea how big this is
                    .build()
    );

    public static final EntityType<PyroSpirit> PYRO_SPIRIT_ENTITY_TYPE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(WelcomeKitajima.MODID, "pyro_spirit"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, PyroSpirit::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)) // I have no fucking idea how big this is
                    .build()
    );

    public static final EntityType<ElectroSpirit> ELECTRO_SPIRIT_ENTITY_TYPE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(WelcomeKitajima.MODID, "electro_spirit"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, ElectroSpirit::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)) // I have no fucking idea how big this is
                    .build()
    );

    public static void load() {
        FabricDefaultAttributeRegistry.register(ACC_GRUNT_ENTITY_TYPE, ACCGrunt.createAttributes());
        FabricDefaultAttributeRegistry.register(GEO_GOLEM_ENTITY_TYPE, GeoGolem.createAttributes());
        FabricDefaultAttributeRegistry.register(DENDRO_GOLEM_ENTITY_TYPE, DendroGolem.createAttributes());
        FabricDefaultAttributeRegistry.register(ANEMO_GOLEM_ENTITY_TYPE, AnemoGolem.createAttributes());
        FabricDefaultAttributeRegistry.register(PYRO_SPIRIT_ENTITY_TYPE, PyroSpirit.createAttributes());
        FabricDefaultAttributeRegistry.register(ELECTRO_SPIRIT_ENTITY_TYPE, ElectroSpirit.createAttributes());
    }

    public static void clientLoadRenderer(){
        EntityRendererRegistry.register(EntityRegistry.ACC_GRUNT_ENTITY_TYPE, ACCGruntRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.GEO_GOLEM_ENTITY_TYPE, GeoGolemRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.DENDRO_GOLEM_ENTITY_TYPE, DendroGolemRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.ANEMO_GOLEM_ENTITY_TYPE, AnemoGolemRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.PYRO_SPIRIT_ENTITY_TYPE, PyroSpiritRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.ELECTRO_SPIRIT_ENTITY_TYPE, ElectroSpiritRenderer::new);
    }
}