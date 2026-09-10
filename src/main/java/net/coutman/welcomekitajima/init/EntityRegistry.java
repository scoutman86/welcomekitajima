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

    public static EntityType<ElementalGolem> registerGolem(String name, Element element) {
        EntityType<ElementalGolem> type = Registry.register(
                BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(WelcomeKitajima.MODID, name),
                FabricEntityTypeBuilder.<ElementalGolem>create(MobCategory.MONSTER,
                                (entityType, level) -> new ElementalGolem(entityType, level, element))
                        .dimensions(EntityDimensions.fixed(1f, 2.5f)) // I have no fucking idea how big this is
                        .build()
        );

        FabricDefaultAttributeRegistry.register(type, ElementalGolem.createAttributes());
        return type;
    }

    private static EntityType<ElementalSpirit> registerSpirit(String name, Element element) {
        EntityType<ElementalSpirit> type = Registry.register(
                BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(WelcomeKitajima.MODID, name),
                FabricEntityTypeBuilder.<ElementalSpirit>create(MobCategory.MONSTER,
                                (entityType, level) -> new ElementalSpirit(entityType, level, element))
                        .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                        .build()
        );

        FabricDefaultAttributeRegistry.register(type, ElementalSpirit.createAttributes());
        return type;
    }

    // you're special. you get the vanilla builder.
    public static final EntityType<CatalystProjectile> CATALYST_PROJECTILE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(WelcomeKitajima.MODID, "catalyst_projectile"),
            EntityType.Builder.<CatalystProjectile>of(CatalystProjectile::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(10)
                    .build("catalyst_projectile")
    );

    public static final EntityType<ElementalGolem> GEO_GOLEM_ENTITY_TYPE = registerGolem("geo_golem", Element.GEO);
    public static final EntityType<ElementalGolem> DENDRO_GOLEM_ENTITY_TYPE = registerGolem("dendro_golem", Element.DENDRO);
    public static final EntityType<ElementalGolem> ANEMO_GOLEM_ENTITY_TYPE = registerGolem("anemo_golem", Element.ANEMO);

    public static final EntityType<ElementalSpirit> PYRO_SPIRIT = registerSpirit("pyro_spirit", Element.PYRO);
    public static final EntityType<ElementalSpirit> HYDRO_SPIRIT = registerSpirit("hydro_spirit", Element.HYDRO);
    public static final EntityType<ElementalSpirit> ELECTRO_SPIRIT = registerSpirit("electro_spirit", Element.ELECTRO);
    public static final EntityType<ElementalSpirit> CRYO_SPIRIT = registerSpirit("cryo_spirit", Element.CRYO);

    public static void load() {
        FabricDefaultAttributeRegistry.register(ACC_GRUNT_ENTITY_TYPE, ACCGrunt.createAttributes());
    }

    public static void clientLoadRenderer(){
        // no no, you go first. I insist
        EntityRendererRegistry.register(CATALYST_PROJECTILE, CatalystProjectileRenderer::new);

        EntityRendererRegistry.register(EntityRegistry.ACC_GRUNT_ENTITY_TYPE, ACCGruntRenderer::new);
        EntityRendererRegistry.register(GEO_GOLEM_ENTITY_TYPE, ElementalGolemRenderer::new);
        EntityRendererRegistry.register(DENDRO_GOLEM_ENTITY_TYPE, ElementalGolemRenderer::new);
        EntityRendererRegistry.register(ANEMO_GOLEM_ENTITY_TYPE, ElementalGolemRenderer::new);
        EntityRendererRegistry.register(PYRO_SPIRIT, ElementalSpiritRenderer::new);
        EntityRendererRegistry.register(HYDRO_SPIRIT, ElementalSpiritRenderer::new);
        EntityRendererRegistry.register(ELECTRO_SPIRIT, ElementalSpiritRenderer::new);
        EntityRendererRegistry.register(CRYO_SPIRIT, ElementalSpiritRenderer::new);
    }
}