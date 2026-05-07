package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import java.util.List;

public class WeaponBillet extends Item {
    public record BilletFamily(String billetCollectionName) {
        public Item.Properties getProperties() {
            return new FabricItemSettings().rarity(Rarity.EPIC);
        }
    }

    public WeaponBillet(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
    }

    public static final List<BilletFamily> BILLET_FAMILIES = List.of(
        new BilletFamily("island")
    );

    public static void registerBilletFamilies() {
        for (BilletFamily entry : BILLET_FAMILIES) {
            Item sword_billet = new WeaponBillet(entry.getProperties());
            Item bow_billet = new WeaponBillet(entry.getProperties());
            Item claymore_billet = new WeaponBillet(entry.getProperties());
            Item catalyst_billet = new WeaponBillet(entry.getProperties());
            Item polearm_billet = new WeaponBillet(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, (entry.billetCollectionName + "_sword_billet")), sword_billet);
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, (entry.billetCollectionName + "_bow_billet")), bow_billet);
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, (entry.billetCollectionName + "_claymore_billet")), claymore_billet);
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, (entry.billetCollectionName + "_catalyst_billet")), catalyst_billet);
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, (entry.billetCollectionName + "_polearm_billet")), polearm_billet);
        }
    }
}
