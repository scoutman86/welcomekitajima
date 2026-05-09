package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

public class ClaymoreWeapon extends SwordItem {
    public ClaymoreWeapon(Tier tier, int damage, float attackSpeed, Properties properties) {
        super(tier, damage, attackSpeed, properties);
    }

    public record ClaymoreList(String registryName, Tier tier, int damage, float attackSpeed, Rarity rarity) {
        public Properties getProperties() {
            return new Properties().rarity(this.rarity).stacksTo(1);
        }
    }

    public static final List<ClaymoreList> CLAYMORE_LISTS = List.of(
        new ClaymoreList("shining_greatsword", Tiers.IRON, 5, -3.1f, Rarity.UNCOMMON),
        new ClaymoreList("frostbearer_strength", Tiers.DIAMOND, 7, -3.6f, Rarity.RARE),
            new ClaymoreList("stelliform_greatsword", Tiers.DIAMOND, 6, -3.2f, Rarity.RARE)
    );

    public static void register() {
        for (ClaymoreList entry : CLAYMORE_LISTS) {
            SwordItem item = new ClaymoreWeapon(entry.tier, entry.damage, entry.attackSpeed, entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);
        }
    }
}
