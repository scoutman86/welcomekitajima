package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.init.*;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.entity.*;
import net.coutman.welcomekitajima.init.SoundRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
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

    private final float speed;
    private final float cooldown;
    private final SoundEvent catalystFireSound;

    public CatalystWeapon(Properties properties, float speed, float cooldown, SoundEvent catalystFireSound) {
        super(properties);
        this.speed = speed;
        this.cooldown = cooldown;
        this.catalystFireSound = catalystFireSound;
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));
    }

    public record CatalystList(String registryName, Rarity rarity, float speed, float cooldown, SoundEvent sound) {
        public Item.Properties getProperties() {
            return new Item.Properties().rarity(this.rarity).stacksTo(1);
        }
    }

    public static final List<CatalystList> CATALYST_LISTS = List.of(
        new CatalystList("classic_poetry", Rarity.UNCOMMON, 1.5f, 10f, SoundRegistry.CATALYST_SHOOT),
        new CatalystList("frigid_core", Rarity.RARE, 1.5f, 10f, SoundRegistry.CATALYST_SHOOT),
        new CatalystList("glimmering_twilight", Rarity.RARE, 1.5f, 10f, SoundRegistry.CATALYST_SHOOT),
        new CatalystList("adventurer_tome", Rarity.RARE, 1.5f, 10f, SoundRegistry.CATALYST_SHOOT),
        new CatalystList("unyielding_blaze", Rarity.RARE, 5f, 20f, SoundRegistry.SHOTGUN_SHOOT)
    );

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
                CatalystProjectile projectile = new CatalystProjectile(level, player);
                projectile.sevenelements$setOriginStack(player.getItemInHand(hand));
                projectile.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0f, this.speed, 1.0f);
                level.addFreshEntity(projectile);

                level.playSound(
                        null,
                        player.getX(), player.getY(), player.getZ(),
                        this.catalystFireSound,
                        net.minecraft.sounds.SoundSource.PLAYERS,
                        0.8F,
                        1.0F
                );

                player.getCooldowns().addCooldown(this, Math.round(this.cooldown));
            }

        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
    }

    public static void register() {
        for (CatalystList entry : CATALYST_LISTS) {
            Item item = new CatalystWeapon(entry.getProperties(), entry.speed, entry.cooldown, entry.sound);
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.registryName), item);

            CATALYST_REGISTRY.put(entry.registryName, item);
        }
    }
}
