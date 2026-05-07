package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

public class Vision extends Item {
    public record VisionTypes(String visionType) {
        public Item.Properties getProperties() {
            return new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC);
        }
    }

    public Vision(Properties properties) {
        super(properties);
    }

    public static final List<VisionTypes> VISION_TYPES = List.of(
        new VisionTypes("pyro_vision"),
        new VisionTypes("hydro_vision"),
        new VisionTypes("anemo_vision"),
        new VisionTypes("electro_vision"),
        new VisionTypes("dendro_vision"),
        new VisionTypes("cryo_vision"),
        new VisionTypes("geo_vision")
    );

    public static void register() {
        for (VisionTypes entry : VISION_TYPES) {
            Item item = new Vision(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.visionType), item);
        }
    }
}