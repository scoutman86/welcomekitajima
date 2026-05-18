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
    public static class VisionTypes {
        public String visionType;
        public Item item;

        public VisionTypes(String visionType, Item item) {
            this.visionType = visionType;
            this.item = item;
        }

        public Item.Properties getProperties() {
            return new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC);
        }
    }

    public Vision(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
    }

    public static Item PYRO_VISION;
    public static Item HYDRO_VISION;
    public static Item ANEMO_VISION;
    public static Item ELECTRO_VISION;
    public static Item DENDRO_VISION;
    public static Item CRYO_VISION;
    public static Item GEO_VISION;

    public static final List<VisionTypes> VISION_TYPES = List.of(
        new VisionTypes("pyro_vision", PYRO_VISION),
        new VisionTypes("hydro_vision", HYDRO_VISION),
        new VisionTypes("anemo_vision", ANEMO_VISION),
        new VisionTypes("electro_vision", ELECTRO_VISION),
        new VisionTypes("dendro_vision", DENDRO_VISION),
        new VisionTypes("cryo_vision", CRYO_VISION),
        new VisionTypes("geo_vision", GEO_VISION)
    );

    public static String getVisionElement(Item item) {
        if (item == Vision.PYRO_VISION) return "pyro";
        if (item == Vision.HYDRO_VISION) return "hydro";
        if (item == Vision.ANEMO_VISION) return "anemo";
        if (item == Vision.ELECTRO_VISION) return "electro";
        if (item == Vision.DENDRO_VISION) return "dendro";
        if (item == Vision.CRYO_VISION) return "cryo";
        if (item == Vision.GEO_VISION) return "geo";
        else return "default";
    }

    public static void register() {
        for (VisionTypes entry : VISION_TYPES) {
            entry.item = new Vision(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.visionType), entry.item);
        }
    }
}