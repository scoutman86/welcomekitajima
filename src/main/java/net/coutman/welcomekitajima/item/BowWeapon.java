package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.*;

public class BowWeapon extends BowItem {
    public static final Map<String, BowItem> BOW_REGISTRY = new HashMap<>();

    public BowWeapon(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
    }

    public record BowList(String registryName, Rarity rarity) {
        public Properties getProperties() {
            return new Properties().rarity(this.rarity).stacksTo(1).durability(0);
        }
    }

    public static final List<BowList> BOW_LISTS = List.of(
        new BowList("shimmering_bow", Rarity.UNCOMMON),
        new BowList("frigid_will", Rarity.RARE),
        new BowList("dusk_piercer", Rarity.RARE),
        new BowList("nocturne_reverie", Rarity.RARE)
    );

    public static void register() {
        for (BowList entry : BOW_LISTS) {
            BowItem item = new BowWeapon(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);

            BOW_REGISTRY.put(entry.registryName, item);
        }
    }

    public static void registerBowPredicates() {
        for (BowItem bow : BowWeapon.BOW_REGISTRY.values()) {
            ItemProperties.register(bow, new ResourceLocation("pulling"), (stack, world, entity, seed) ->
                    entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F
            );

            ItemProperties.register(bow, new ResourceLocation("pull"), (stack, world, entity, seed) -> {
                if (entity == null) {
                    return 0.0F;
                } else {
                    return entity.getUseItem() != stack ? 0.0F :
                            (float)(stack.getUseDuration() - entity.getUseItemRemainingTicks()) / 20.0F;
                }
            });
        }
    }
}
