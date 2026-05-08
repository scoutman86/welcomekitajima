package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

public class BowWeapon extends BowItem {
    public BowWeapon(Properties properties) {
        super(properties);
    }

    public record ClaymoreList(String registryName, Rarity rarity) {
        public Properties getProperties() {
            return new Properties().rarity(this.rarity).stacksTo(1);
        }
    }

    public static final List<ClaymoreList> CLAYMORE_LISTS = List.of(
        new ClaymoreList("shimmering_bow", Rarity.UNCOMMON)
    );

    public static void register() {
        for (ClaymoreList entry : CLAYMORE_LISTS) {
            BowItem item = new BowWeapon(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);
        }
    }
}
