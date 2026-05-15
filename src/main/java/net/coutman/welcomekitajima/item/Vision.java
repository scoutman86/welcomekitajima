package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

public class Vision extends Item {
    public record VisionTypes(String visionType, Item item) {
        public Item.Properties getProperties() {
            return new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC);
        }
    }

    public Vision(Properties properties) {
        super(properties);
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

    public static void register() {
        for (VisionTypes entry : VISION_TYPES) {
            entry.item = new Vision(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.visionType), entry.item);
        }
    }
}