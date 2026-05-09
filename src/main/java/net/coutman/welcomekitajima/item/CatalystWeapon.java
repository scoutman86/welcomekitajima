package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;

import java.util.List;

// note: this is absolutely fucked.

public class CatalystWeapon extends Item {
    public CatalystWeapon(Properties properties) {
        super(properties);
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
            player.getCooldowns().addCooldown(this, 10);
        }
        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
    }

    /*
    public static void createItemModelData() {

    }
    */

    public static void register() {
        for (CatalystList entry : CATALYST_LISTS) {
            Item item = new CatalystWeapon(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);
        }
    }
}
