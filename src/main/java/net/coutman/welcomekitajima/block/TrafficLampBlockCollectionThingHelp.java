package net.coutman.welcomekitajima.block;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class TrafficLampBlockCollectionThingHelp {
    // this probably doesn't work
    public static Block TRAFFIC_LAMP_RED = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "red_traffic_lamp"),
            new TrafficLampRed()
    );
    public static Block TRAFFIC_LAMP_ORANGE = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "orange_traffic_lamp"),
            new TrafficLampOrange()
    );
    public static Block TRAFFIC_LAMP_YELLOW = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "yellow_traffic_lamp"),
            new TrafficLampYellow()
    );
    public static Block TRAFFIC_LAMP_LIME = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "lime_traffic_lamp"),
            new TrafficLampLime()
    );
    public static Block TRAFFIC_LAMP_GREEN = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "green_traffic_lamp"),
            new TrafficLampGreen()
    );
    public static Block TRAFFIC_LAMP_BLUE = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "blue_traffic_lamp"),
            new TrafficLampBlue()
    );
    public static Block TRAFFIC_LAMP_CYAN = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "cyan_traffic_lamp"),
            new TrafficLampCyan()
    );
    public static Block TRAFFIC_LAMP_LIGHT_BLUE = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "light_blue_traffic_lamp"),
            new TrafficLampLightBlue()
    );
    public static Block TRAFFIC_LAMP_PURPLE = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "purple_traffic_lamp"),
            new TrafficLampPurple()
    );
    public static Block TRAFFIC_LAMP_MAGENTA = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "magenta_traffic_lamp"),
            new TrafficLampMagenta()
    );
    public static Block TRAFFIC_LAMP_PINK = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "pink_traffic_lamp"),
            new TrafficLampPink()
    );
    public static Block TRAFFIC_LAMP_BROWN = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "brown_traffic_lamp"),
            new TrafficLampBrown()
    );
    public static Block TRAFFIC_LAMP_WHITE = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "white_traffic_lamp"),
            new TrafficLampWhite()
    );
    public static Block TRAFFIC_LAMP_LIGHT_GRAY = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "light_gray_traffic_lamp"),
            new TrafficLampLightGray()
    );
    public static Block TRAFFIC_LAMP_GRAY = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "gray_traffic_lamp"),
            new TrafficLampGray()
    );
    public static Block TRAFFIC_LAMP_BLACK = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(WelcomeKitajima.MODID, "black_traffic_lamp"),
            new TrafficLampBlack()
    );

    public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of()
            .instrument(NoteBlockInstrument.PLING)
            .sound(SoundType.GLASS)
            .strength(1.8f, 10f);

    public static class TrafficLampRed extends Block {
        public TrafficLampRed() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampOrange extends Block {
        public TrafficLampOrange() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampYellow extends Block {
        public TrafficLampYellow() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampLime extends Block {
        public TrafficLampLime() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampGreen extends Block {
        public TrafficLampGreen() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampBlue extends Block {
        public TrafficLampBlue() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampCyan extends Block {
        public TrafficLampCyan() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampLightBlue extends Block {
        public TrafficLampLightBlue() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampPurple extends Block {
        public TrafficLampPurple() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampMagenta extends Block {
        public TrafficLampMagenta() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampPink extends Block {
        public TrafficLampPink() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampBrown extends Block {
        public TrafficLampBrown() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampWhite extends Block {
        public TrafficLampWhite() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampLightGray extends Block {
        public TrafficLampLightGray() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampGray extends Block {
        public TrafficLampGray() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }
    public static class TrafficLampBlack extends Block {
        public TrafficLampBlack() {
            super(PROPERTIES);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(this));
        }
    }

    public static void clientInit() {
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_RED, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_ORANGE, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_YELLOW, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_LIME, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_GREEN, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_BLUE, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_CYAN, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_LIGHT_BLUE, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_PURPLE, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_MAGENTA, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_PINK, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_BROWN, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_WHITE, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_LIGHT_GRAY, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_GRAY, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(TRAFFIC_LAMP_BLACK, RenderType.solid());
    }
}

