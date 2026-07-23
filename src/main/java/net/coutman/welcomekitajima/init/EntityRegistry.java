package net.coutman.welcomekitajima.init;

import io.github.xrickastley.sevenelements.element.Element;
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

    private static EntityType<ElementalSpirit> registerSpirit(String name, Element element) {
        EntityType<ElementalSpirit> type = Registry.register(
                BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(WelcomeKitajima.MODID, name),
                FabricEntityTypeBuilder.<ElementalSpirit>create(MobCategory.MONSTER,
                                (entityType, level) -> new ElementalSpirit(entityType, level, element))
                        .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                        .build()
        );

        // Auto-register attributes & renderer to keep things clean
        FabricDefaultAttributeRegistry.register(type, ElementalSpirit.createAttributes());
        return type;
    }

    public static final EntityType<ElementalSpirit> PYRO_SPIRIT = registerSpirit("pyro_spirit", Element.PYRO);
    public static final EntityType<ElementalSpirit> HYDRO_SPIRIT = registerSpirit("hydro_spirit", Element.HYDRO);
    public static final EntityType<ElementalSpirit> ELECTRO_SPIRIT = registerSpirit("electro_spirit", Element.ELECTRO);
    public static final EntityType<ElementalSpirit> CRYO_SPIRIT = registerSpirit("cryo_spirit", Element.CRYO);

    public static void load() {
        FabricDefaultAttributeRegistry.register(ACC_GRUNT_ENTITY_TYPE, ACCGrunt.createAttributes());
        FabricDefaultAttributeRegistry.register(GEO_GOLEM_ENTITY_TYPE, GeoGolem.createAttributes());
        FabricDefaultAttributeRegistry.register(DENDRO_GOLEM_ENTITY_TYPE, DendroGolem.createAttributes());
        FabricDefaultAttributeRegistry.register(ANEMO_GOLEM_ENTITY_TYPE, AnemoGolem.createAttributes());
    }

    public static void clientLoadRenderer(){
        EntityRendererRegistry.register(EntityRegistry.ACC_GRUNT_ENTITY_TYPE, ACCGruntRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.GEO_GOLEM_ENTITY_TYPE, GeoGolemRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.DENDRO_GOLEM_ENTITY_TYPE, DendroGolemRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.ANEMO_GOLEM_ENTITY_TYPE, AnemoGolemRenderer::new);
        EntityRendererRegistry.register(PYRO_SPIRIT, ElementalSpiritRenderer::new);
        EntityRendererRegistry.register(HYDRO_SPIRIT, ElementalSpiritRenderer::new);
        EntityRendererRegistry.register(ELECTRO_SPIRIT, ElementalSpiritRenderer::new);
        EntityRendererRegistry.register(CRYO_SPIRIT, ElementalSpiritRenderer::new);
    }
}