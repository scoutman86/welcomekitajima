package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.block.*;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class HanasatoLocalSpecialty extends Item {
    public record LocalSpecialties(String specialtyName, Rarity rarity, boolean isBlock, Block block) {
        public Properties getProperties() {
            return new Properties();
        }
    }

    public HanasatoLocalSpecialty(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));
    }

    public static final List<LocalSpecialties> LOCAL_SPECIALTIES = List.of(
            // new LocalSpecialties("winter_icelea", Rarity.UNCOMMON, true, new WinterIceleaBlock()),
            new LocalSpecialties("peridot_cluster",Rarity.UNCOMMON, true, new PeridotClusterBlock())
    );

    public static void register() {
        for (LocalSpecialties entry : LOCAL_SPECIALTIES) {
            if (entry.isBlock && entry.block != null) {
                Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(WelcomeKitajima.MODID, entry.specialtyName), entry.block);
            }

            Item item;
            if (entry.isBlock) {
                item = new BlockItem(entry.block, entry.getProperties());
                if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
                    BlockRenderLayerMap.INSTANCE.putBlock(entry.block, RenderType.cutoutMipped());
                }
            } else {
                item = new HanasatoLocalSpecialty(entry.getProperties());
            }
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.specialtyName), item);
        }
    }
}
