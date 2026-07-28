package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadiantDroplets extends Item {
    public static final Map<String, Item> RADIANT_DROPLET_REGISTRY = new HashMap<>();

    public RadiantDroplets(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
    }

    public record RadiantDropletList(String registryName, Rarity rarity) {
        public Properties getProperties() {
            return new Properties().rarity(this.rarity);
        }
    }

    public static final List<RadiantDropletList> RADIANT_DROPLET_LIST = List.of(
            new RadiantDropletList("radiant_shards", Rarity.COMMON),
            new RadiantDropletList("radiant_fragment", Rarity.UNCOMMON),
            new RadiantDropletList("radiant_droplet", Rarity.RARE)
    );

    public static void register() {
        for (RadiantDropletList entry : RADIANT_DROPLET_LIST) {
            Item item = new RadiantDroplets(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);

            RADIANT_DROPLET_REGISTRY.put(entry.registryName, item);
        }
    }
}
