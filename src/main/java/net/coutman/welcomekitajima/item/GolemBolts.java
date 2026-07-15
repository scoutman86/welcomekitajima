package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.*;

public class GolemBolts extends Item {
    public static final Map<String, Item> GOLEM_BOLT_REGISTRY = new HashMap<>();

    public GolemBolts(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
    }

    public record GolemBoltList(String registryName, Rarity rarity) {
        public Item.Properties getProperties() {
            return new Item.Properties().rarity(this.rarity);
        }
    }

    public static final List<GolemBoltList> GOLEM_BOLT_LIST = List.of(
            new GolemBoltList("golem_bolt_bronze", Rarity.COMMON),
            new GolemBoltList("golem_bolt_silver", Rarity.UNCOMMON),
            new GolemBoltList("golem_bolt_gold", Rarity.RARE)
    );

    public static void register() {
        for (GolemBoltList entry : GOLEM_BOLT_LIST) {
            Item item = new GolemBolts(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);

            GOLEM_BOLT_REGISTRY.put(entry.registryName, item);
        }
    }
}
