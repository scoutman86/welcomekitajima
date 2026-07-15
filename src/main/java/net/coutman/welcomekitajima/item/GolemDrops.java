package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.*;

public class GolemDrops extends Item {
    public static final Map<String, Item> GOLEM_DROP_REGISTRY = new HashMap<>();

    public GolemDrops(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
    }

    public record GolemDropList(String registryName, Rarity rarity) {
        public Item.Properties getProperties() {
            return new Item.Properties().rarity(this.rarity);
        }
    }

    public static final List<GolemDropList> GOLEM_DROP_LISTS = List.of(
            new GolemDropList("", Rarity.COMMON)
    );
}
