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

import dev.emi.trinkets.api.TrinketsApi;

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

    private String getVisionElement(Player player) {
        var component = TrinketsApi.getTrinketComponent(player);
        if (component.isPresent()) {
            var vision = component.get().getAllEquipped();

            for (var tuple : vision) {
                ItemStack itemStack = tuple.getB();
                Item item = itemStack.getItem();

                WelcomeKitajima.LOGGER.info(itemStack.getItem().toString());

                if (item == Vision.PYRO_VISION) return "pyro";
                if (item == Vision.HYDRO_VISION) return "hydro";
                if (item == Vision.ANEMO_VISION) return "anemo";
                if (item == Vision.ELECTRO_VISION) return "electro";
                if (item == Vision.DENDRO_VISION) return "dendro";
                if (item == Vision.CRYO_VISION) return "cryo";
                if (item == Vision.GEO_VISION) return "geo";
            }
        } else {
            WelcomeKitajima.LOGGER.info("FUCK.");
        }
        return "default";
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            String element = getVisionElement(player);
            WelcomeKitajima.LOGGER.info(("Returned element: " + element));
            // projectile here
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
