package net.coutman.welcomekitajima.block;

import net.coutman.welcomekitajima.init.BlockRegistry;
import net.coutman.welcomekitajima.init.*;

import net.coutman.welcomekitajima.WelcomeKitajima;

import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.*;
import java.util.function.Supplier;

public class LabyrinthStoneBlockFamily {
    public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of()
            .instrument(NoteBlockInstrument.BASEDRUM)
            .sound(SoundType.STONE)
            .mapColor(MapColor.TERRACOTTA_YELLOW)
            .strength(1.8f, 10f)
            .requiresCorrectToolForDrops();

    public static class LabyrinthBaseBlock extends Block {
        private final Supplier<Item> drop;

        public LabyrinthBaseBlock(Properties properties, Supplier<Item> drop){
            super(properties);
            this.drop = drop;
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(this));
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));

            ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));

        }

        @Override
        public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
            List<ItemStack> dropsOriginal = super.getDrops(state, builder);
            if (!dropsOriginal.isEmpty()) return dropsOriginal;
            return Collections.singletonList(new ItemStack(drop != null ? drop.get() : this));
        }
    }

    public static class LabyrinthBaseStairBlock extends StairBlock {
        private final Supplier<Item> drop;

        public LabyrinthBaseStairBlock(BlockState blockState, Properties properties, Supplier<Item> drop){
            super(blockState, properties);
            this.drop = drop;
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(this));
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));

            ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));

        }

        @Override
        public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
            List<ItemStack> dropsOriginal = super.getDrops(state, builder);
            if (!dropsOriginal.isEmpty()) return dropsOriginal;
            return Collections.singletonList(new ItemStack(drop != null ? drop.get() : this));
        }
    }

    public static class LabyrinthBaseSlabBlock extends SlabBlock {
        private final Supplier<Item> drop;

        public LabyrinthBaseSlabBlock(Properties properties, Supplier<Item> drop){
            super(properties);
            this.drop = drop;
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(this));
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));

            ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));

        }

        @Override
        public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
            return 0;
        }

        @Override
        public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
            List<ItemStack> dropsOriginal = super.getDrops(state, builder);
            if (!dropsOriginal.isEmpty()) return dropsOriginal;
            return Collections.singletonList(new ItemStack(drop != null ? drop.get() : this));
        }
    }

    public static void clientInit() {
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.LABYRINTH_STONE, RenderType.solid());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.COBBLED_LABYRINTH_STONE, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.COBBLED_LABYRINTH_STONE_SLAB, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.COBBLED_LABYRINTH_STONE_STAIRS, RenderType.solid());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.POLISHED_LABYRINTH_STONE, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.POLISHED_LABYRINTH_STONE_SLAB, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.POLISHED_LABYRINTH_STONE_STAIRS, RenderType.solid());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.POLISHED_LABYRINTH_STONE_BRICKS, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.POLISHED_LABYRINTH_STONE_BRICK_SLAB, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.POLISHED_LABYRINTH_STONE_BRICK_STAIRS, RenderType.solid());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.POLISHED_LABYRINTH_STONE_TILES, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.POLISHED_LABYRINTH_STONE_TILE_SLAB, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.POLISHED_LABYRINTH_STONE_TILE_STAIRS, RenderType.solid());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.CHISELED_LABYRINTH_STONE, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.CHISELED_LABYRINTH_STONE_SLAB, RenderType.solid());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.CHISELED_LABYRINTH_STONE_STAIRS, RenderType.solid());
    }
}
