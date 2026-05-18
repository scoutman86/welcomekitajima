package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

public class Vision extends Item {
    public static Item.Properties PROPERTIES = new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC);

    public Vision(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
    }

    public static Item PYRO_VISION = new Vision(PROPERTIES);
    public static Item HYDRO_VISION = new Vision(PROPERTIES);
    public static Item ANEMO_VISION = new Vision(PROPERTIES);
    public static Item ELECTRO_VISION = new Vision(PROPERTIES);
    public static Item DENDRO_VISION = new Vision(PROPERTIES);
    public static Item CRYO_VISION = new Vision(PROPERTIES);
    public static Item GEO_VISION = new Vision(PROPERTIES);

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "pyro_vision"), PYRO_VISION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "hydro_vision"), HYDRO_VISION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "anemo_vision"), ANEMO_VISION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "electro_vision"), ELECTRO_VISION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "dendro_vision"), DENDRO_VISION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "cryo_vision"), CRYO_VISION);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "geo_vision"), GEO_VISION);
    }
}