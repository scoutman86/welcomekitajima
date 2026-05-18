package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

public class SwordWeapon extends SwordItem {
    public SwordWeapon(Tier tier, int damage, float attackSpeed, Properties properties) {
        super(tier, damage, attackSpeed, properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
    }

    public record SwordList(String registryName, Tier tier, int damage, float attackSpeed, Rarity rarity) {
        public Properties getProperties() {
            return new Properties().rarity(this.rarity).stacksTo(1);
        }
    }

    public static final List<SwordList> SWORD_LISTS = List.of(
        new SwordList("silver_blade", Tiers.IRON, 3, -2.2f, Rarity.UNCOMMON),
            new SwordList("frostbearer_might", Tiers.DIAMOND, 2, -1.6f, Rarity.RARE),
            new SwordList("starseeker_blade", Tiers.DIAMOND, 3, -1.8f, Rarity.RARE)
    );

    public static void register() {
        for (SwordList entry : SWORD_LISTS) {
            SwordItem item = new SwordWeapon(entry.tier, entry.damage, entry.attackSpeed, entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);
        }
    }
}
