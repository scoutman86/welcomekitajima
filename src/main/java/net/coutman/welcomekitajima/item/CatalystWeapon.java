package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.entity.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalystWeapon extends Item {
    public static final Map<String, Item> CATALYST_REGISTRY = new HashMap<>();

    public CatalystWeapon(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
    }

    public record CatalystList(String registryName, Rarity rarity) {
        public Item.Properties getProperties() {
            return new Item.Properties().rarity(this.rarity).stacksTo(1);
        }
    }

    public static final List<CatalystList> CATALYST_LISTS = List.of(
        new CatalystList("classic_poetry", Rarity.UNCOMMON),
        new CatalystList("frigid_core", Rarity.RARE),
        new CatalystList("glimmering_twilight", Rarity.RARE)
    );

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
                CatalystProjectile projectile = new CatalystProjectile(level, player);

                projectile.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                level.addFreshEntity(projectile);

                player.getCooldowns().addCooldown(this, 10);
            }

        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
    }

    public static void register() {
        for (CatalystList entry : CATALYST_LISTS) {
            Item item = new CatalystWeapon(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);

            CATALYST_REGISTRY.put(entry.registryName, item);
        }
    }
}
