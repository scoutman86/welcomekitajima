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
            new Egg("anemo_golem_spawn_egg", () -> EntityRegistry.ANEMO_GOLEM_ENTITY_TYPE, 0x3E3E3E, 0x79DDAF, Rarity.COMMON),
            new Egg("dendro_golem_spawn_egg", () -> EntityRegistry.DENDRO_GOLEM_ENTITY_TYPE, 0x3E3E3E, 0xA7E11D, Rarity.COMMON),
            new Egg("geo_golem_spawn_egg", () -> EntityRegistry.GEO_GOLEM_ENTITY_TYPE, 0x3E3E3E, 0xEDBB2D, Rarity.COMMON),
            new Egg("acc_grunt_spawn_egg", () -> EntityRegistry.ACC_GRUNT_ENTITY_TYPE, 0x63656B, 0x373736, Rarity.COMMON),
            new Egg("pyro_spirit_spawn_egg", () -> EntityRegistry.PYRO_SPIRIT, 0xFF702B, 0xFFE298, Rarity.COMMON),
            new Egg("hydro_spirit_spawn_egg", () -> EntityRegistry.HYDRO_SPIRIT, 0x039CFB, 0x4CE5FE, Rarity.COMMON),
            new Egg("electro_spirit_spawn_egg", () -> EntityRegistry.ELECTRO_SPIRIT, 0x8700FF, 0xD628FF, Rarity.COMMON),
            new Egg("cryo_spirit_spawn_egg", () -> EntityRegistry.CRYO_SPIRIT, 0x70DFF4, 0xADF7FE, Rarity.COMMON)
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
