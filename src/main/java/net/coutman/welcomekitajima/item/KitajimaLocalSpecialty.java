package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.block.WinterIceleaBlock;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;

import java.util.List;

public class KitajimaLocalSpecialty extends Item {
    public record LocalSpecialties(String specialtyName, Rarity rarity, boolean isBlock, Block block) {
        public Properties getProperties() {
            return new Properties();
        }
    }

    public KitajimaLocalSpecialty(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
    }

    public static final List<LocalSpecialties> LOCAL_SPECIALTIES = List.of(
            new LocalSpecialties("winter_icelea", Rarity.UNCOMMON, true, new WinterIceleaBlock())
    );

    public static void register() {
        for (LocalSpecialties entry : LOCAL_SPECIALTIES) {
            Item item;

            if (entry.isBlock && entry.block != null) {
                Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(WelcomeKitajima.MODID, entry.specialtyName), entry.block);
                item = new BlockItem(entry.block, entry.getProperties());
                BlockRenderLayerMap.INSTANCE.putBlock(entry.block, RenderType.cutoutMipped());
            } else {
                item = new MiyashitaLocalSpecialty(entry.getProperties());
            }

            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.specialtyName), item);
        }
    }
}
