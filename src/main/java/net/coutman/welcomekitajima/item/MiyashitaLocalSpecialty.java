package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.block.MiyashitaSakuraBlock;
import net.coutman.welcomekitajima.block.StardustDust;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;

import java.util.List;

public class MiyashitaLocalSpecialty extends Item {
    public record LocalSpecialties(String specialtyName, Rarity rarity, boolean isBlock, Block block) {
        public Item.Properties getProperties() {
            return new Properties();
        }
    }

    public MiyashitaLocalSpecialty(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
    }

    public static final List<LocalSpecialties> LOCAL_SPECIALTIES = List.of(
            new LocalSpecialties("stardust", Rarity.UNCOMMON, true, new StardustDust()),
            new LocalSpecialties("starbit", Rarity.RARE, false, null),
            new LocalSpecialties("miyashita_sakura", Rarity.UNCOMMON, true, new MiyashitaSakuraBlock())
    );

    public static void register() {
        for (LocalSpecialties entry : LOCAL_SPECIALTIES) {
            if (entry.isBlock && entry.block != null) {
                // heavy assumptions are being made here
                Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(WelcomeKitajima.MODID, entry.specialtyName), entry.block);
            }

            Item item;
            if (entry.isBlock) {
                item = new BlockItem(entry.block, entry.getProperties());
                if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
                    BlockRenderLayerMap.INSTANCE.putBlock(entry.block, RenderType.cutoutMipped());
                }
            } else {
                item = new MiyashitaLocalSpecialty(entry.getProperties());
            }
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.specialtyName), item);
        }
    }
}
