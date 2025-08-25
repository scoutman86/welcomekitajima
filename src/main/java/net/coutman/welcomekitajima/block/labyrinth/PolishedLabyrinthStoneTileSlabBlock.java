
package net.coutman.welcomekitajima.block.labyrinth;

import net.coutman.welcomekitajima.init.WelcomekitajimaModBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.Collections;
import java.util.List;

public class PolishedLabyrinthStoneTileSlabBlock extends SlabBlock {
    public static Properties PROPERTIES = Properties.of()
            .instrument(NoteBlockInstrument.BASEDRUM)
            .sound(SoundType.STONE)
            .strength(1.8f, 10f)
            .requiresCorrectToolForDrops()
            .dynamicShape();

    public PolishedLabyrinthStoneTileSlabBlock() {
        super(PROPERTIES);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(this));
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(
                new ItemStack(this, state.getValue(TYPE) == SlabType.DOUBLE ? 2 : 1));
    }

    @Environment(EnvType.CLIENT)
    public static void clientInit() {
        BlockRenderLayerMap.INSTANCE.putBlock(WelcomekitajimaModBlocks.POLISHED_LABYRINTH_STONE_TILE_SLAB, RenderType.solid());
    }
}
