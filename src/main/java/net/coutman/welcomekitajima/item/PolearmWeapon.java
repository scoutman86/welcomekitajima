package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.*;

public class PolearmWeapon extends ShovelItem {
    public static final Map<String, ShovelItem> POLEARM_REGISTRY = new HashMap<>();

    public PolearmWeapon(Tier tier, int damage, float attackSpeed, Properties properties) {
        super(tier, damage, attackSpeed, properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
    }

    public record PolearmList(String registryName, Tier tier, int damage, float attackSpeed, Rarity rarity) {
        public Properties getProperties() {
            return new Properties().rarity(this.rarity).stacksTo(1).durability(0);
        }
    }

    public static final List<PolearmList> POLEARM_LISTS = List.of(
        new PolearmList("pearlescent_staff", Tiers.IRON, 1, -1.6f, Rarity.UNCOMMON),
        new PolearmList("frostbearer_staff", Tiers.DIAMOND, 2, -1.9f, Rarity.RARE),
        new PolearmList("celestial_spear", Tiers.DIAMOND, 1, -1.3f, Rarity.RARE),
        new PolearmList("writer_instrument", Tiers.DIAMOND, 2, -1.6f, Rarity.RARE)
    );

    public static void register() {
        for (PolearmList entry : POLEARM_LISTS) {
            ShovelItem item = new PolearmWeapon(entry.tier, entry.damage, entry.attackSpeed, entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);

            POLEARM_REGISTRY.put(entry.registryName, item);
        }
    }
}
