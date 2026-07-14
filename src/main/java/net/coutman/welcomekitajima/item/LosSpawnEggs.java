package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.block.MiyashitaSakuraBlock;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.coutman.welcomekitajima.init.EntityRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.function.Supplier;

public class LosSpawnEggs extends SpawnEggItem {
    public record Egg(String entityName, Supplier<? extends EntityType<? extends Mob>> entityType, int primaryColor, int secondaryColor, Rarity rarity) {
        public Properties getProperties() {
            return new Properties();
        }
    }

    public LosSpawnEggs(EntityType<? extends Mob> type, int primaryColor, int secondaryColor, Properties properties) {
        super(type, primaryColor, secondaryColor, properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(this));
    }

    public static final List<Egg> LOS_EGGS = List.of(
            new Egg("anemo_golem_spawn_egg", () -> EntityRegistry.ANEMO_GOLEM_ENTITY_TYPE, 0xAFCCC3, 0x69A896, Rarity.COMMON),
            new Egg("dendro_golem_spawn_egg", () -> EntityRegistry.DENDRO_GOLEM_ENTITY_TYPE, 0xC1CB68, 0x81964F, Rarity.COMMON),
            new Egg("geo_golem_spawn_egg", () -> EntityRegistry.GEO_GOLEM_ENTITY_TYPE, 0xD5B77D, 0xB48955, Rarity.COMMON),
            new Egg("acc_grunt_spawn_egg", () -> EntityRegistry.ACC_GRUNT_ENTITY_TYPE, 0x63656B, 0x373736, Rarity.COMMON)
    );

    public static void register() {
        for (Egg egg : LOS_EGGS) {
            Item spawnEggItem = new LosSpawnEggs(
                    egg.entityType().get(),
                    egg.primaryColor(),
                    egg.secondaryColor(),
                    egg.getProperties()
            );

            Registry.register(
                    BuiltInRegistries.ITEM,
                    new ResourceLocation(WelcomeKitajima.MODID, egg.entityName()),
                    spawnEggItem
            );
        }
    }
}
