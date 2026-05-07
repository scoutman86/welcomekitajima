package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

public class PolearmWeapon extends SwordItem {
    public PolearmWeapon(Tier tier, int damage, float attackSpeed, Properties properties) {
        super(tier, damage, attackSpeed, properties);
    }

    public record PolearmList(String registryName, Tier tier, int damage, float attackSpeed, Rarity rarity) {
        public Properties getProperties() {
            return new Properties().rarity(this.rarity).stacksTo(1);
        }
    }

    public static final List<PolearmList> POLEARM_LISTS = List.of(
        new PolearmList("pearlescent_staff", Tiers.IRON, 1, -1.6f, Rarity.UNCOMMON)
    );

    public static void register() {
        for (PolearmList entry : POLEARM_LISTS) {
            SwordItem item = new PolearmWeapon(entry.tier, entry.damage, entry.attackSpeed, entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);
        }
    }
}
