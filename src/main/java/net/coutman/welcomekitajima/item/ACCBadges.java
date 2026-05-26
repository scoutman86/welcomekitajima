package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.*;

public class ACCBadges extends Item {
    public static final Map<String, Item> ACC_BADGE_REGISTRY = new HashMap<>();

    public ACCBadges(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
    }

    public record ACCBadgeList(String registryName, Rarity rarity) {
        public Item.Properties getProperties() {
            return new Item.Properties().rarity(this.rarity);
        }
    }

    public static final List<ACCBadgeList> ACC_BADGE_LISTS = List.of(
            new ACCBadgeList("acc_badge_bronze", Rarity.COMMON),
            new ACCBadgeList("acc_badge_silver", Rarity.UNCOMMON),
            new ACCBadgeList("acc_badge_gold", Rarity.RARE)
    );

    public static void register() {
        for (ACCBadgeList entry : ACC_BADGE_LISTS) {
            Item item = new ACCBadges(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);

            ACC_BADGE_REGISTRY.put(entry.registryName, item);
        }
    }
}

