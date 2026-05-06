package net.coutman.welcomekitajima.block;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import java.util.HashMap;
import java.util.Map;

public class TrafficLampBlockCollectionThingHelp extends Block {
    // this probably doesn't work
    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    public static final Map<DyeColor, Block> TRAFFIC_LAMPS = new HashMap<>();

    public TrafficLampBlockCollectionThingHelp(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(LIT, context.getLevel().hasNeighborSignal(context.getClickedPos()));
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos neighborPos, boolean moved) {
        if (!level.isClientSide) {
            boolean isPowered = level.hasNeighborSignal(pos);
            if (isPowered != state.getValue(LIT)) {
                if (isPowered) {
                    level.setBlock(pos, state.setValue(LIT, true), 3);
                } else {
                    level.scheduleTick(pos, this, 4);
                }
            }
        }
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT) && !level.hasNeighborSignal(pos)) {
            level.setBlock(pos, state.setValue(LIT, false), 3);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of()
            .lightLevel((state) -> state.getValue(TrafficLampBlockCollectionThingHelp.LIT) ? 15 : 0)
            .instrument(NoteBlockInstrument.PLING)
            .sound(SoundType.GLASS)
            .strength(1.8f, 10f);

    // block (note: I hate you so much. look at what COULD have been)

    /*
    public static Block TRAFFIC_LAMP_RED = register("red_traffic_lamp", new TrafficLampRed());
    public static Block TRAFFIC_LAMP_ORANGE = register("orange_traffic_lamp", new TrafficLampOrange());
    public static Block TRAFFIC_LAMP_YELLOW = register("yellow_traffic_lamp", new TrafficLampYellow());
    public static Block TRAFFIC_LAMP_LIME = register("lime_traffic_lamp", new TrafficLampLime());
    public static Block TRAFFIC_LAMP_GREEN = register("green_traffic_lamp", new TrafficLampGreen());
    public static Block TRAFFIC_LAMP_BLUE = register("blue_traffic_lamp", new TrafficLampBlue());
    public static Block TRAFFIC_LAMP_CYAN = register("cyan_traffic_lamp", new TrafficLampCyan());
    public static Block TRAFFIC_LAMP_LIGHT_BLUE = register("light_blue_traffic_lamp", new TrafficLampLightBlue());
    public static Block TRAFFIC_LAMP_PURPLE = register("purple_traffic_lamp", new TrafficLampPurple());
    public static Block TRAFFIC_LAMP_MAGENTA = register("magenta_traffic_lamp", new TrafficLampMagenta());
    public static Block TRAFFIC_LAMP_PINK = register("pink_traffic_lamp", new TrafficLampPink());
    public static Block TRAFFIC_LAMP_BROWN = register("brown_traffic_lamp", new TrafficLampBrown());
    public static Block TRAFFIC_LAMP_WHITE = register("white_traffic_lamp", new TrafficLampWhite());
    public static Block TRAFFIC_LAMP_LIGHT_GRAY = register("light_gray_traffic_lamp", new TrafficLampLightGray());
    public static Block TRAFFIC_LAMP_GRAY = register("gray_traffic_lamp", new TrafficLampGray());
    public static Block TRAFFIC_LAMP_BLACK = register("black_traffic_lamp", new TrafficLampBlack());
    */

    // weep

    public static void registerBlocks() {
        for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_traffic_lamp";
            Block block = new TrafficLampBlockCollectionThingHelp(PROPERTIES);

            register(name, block);
            TRAFFIC_LAMPS.put(color, block);
        }
    }

    private static void register(String registryName, Block call) {
        Block block = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(WelcomeKitajima.MODID, registryName), call);
        Item item = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, registryName), new BlockItem(block, new Item.Properties()));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(content -> content.accept(item));
    }

    public static void clientInit() {
        TRAFFIC_LAMPS.values().forEach(block ->
                BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.solid())
        );
    }
}

