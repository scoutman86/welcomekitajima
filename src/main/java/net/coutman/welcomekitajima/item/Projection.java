package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.init.*;

import io.github.xrickastley.sevenelements.effect.SevenElementsStatusEffects;
import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.entity.CatalystProjectile;
import net.coutman.welcomekitajima.init.SoundRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class Projection extends Item {
    public static Properties PROPERTIES = new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC);

    public Projection(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));
    }

    public static Item PYRO_PROJECTION = new Projection(PROPERTIES);
    public static Item HYDRO_PROJECTION = new Projection(PROPERTIES);
    public static Item ANEMO_PROJECTION = new Projection(PROPERTIES);
    public static Item ELECTRO_PROJECTION = new Projection(PROPERTIES);
    public static Item DENDRO_PROJECTION = new Projection(PROPERTIES);
    public static Item CRYO_PROJECTION = new Projection(PROPERTIES);
    public static Item GEO_PROJECTION = new Projection(PROPERTIES);

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 2, false, false, true));
            player.addEffect(new MobEffectInstance(SevenElementsStatusEffects.SUPERCONDUCT, 1200, 3, false, false, true));
            level.playSound(
                    null,
                    player.getX(), player.getY(), player.getZ(),
                    SoundEvents.CONDUIT_ACTIVATE,
                    net.minecraft.sounds.SoundSource.PLAYERS,
                    0.8F,
                    1.0F
            );

            player.getCooldowns().addCooldown(this, 1200);
        }

        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
    }

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "pyro_projection"), PYRO_PROJECTION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "hydro_projection"), HYDRO_PROJECTION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "anemo_projection"), ANEMO_PROJECTION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "electro_projection"), ELECTRO_PROJECTION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "dendro_projection"), DENDRO_PROJECTION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "cryo_projection"), CRYO_PROJECTION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "geo_projection"), GEO_PROJECTION);
    }
}