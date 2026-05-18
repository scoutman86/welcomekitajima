package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

public class BowWeapon extends BowItem {
    public BowWeapon(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
    }

    public record BowList(String registryName, Rarity rarity) {
        public Properties getProperties() {
            return new Properties().rarity(this.rarity).stacksTo(1);
        }
    }

    public static final List<BowList> BOW_LISTS = List.of(
        new BowList("shimmering_bow", Rarity.UNCOMMON),
        new BowList("frigid_will", Rarity.RARE),
            new BowList("dusk_piercer", Rarity.RARE)
    );

    public static void register() {
        for (BowList entry : BOW_LISTS) {
            BowItem item = new BowWeapon(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);
        }
    }
}
