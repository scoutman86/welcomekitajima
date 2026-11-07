package net.coutman.welcomekitajima.block;

import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Collections;
import java.util.List;

public class PeridotClusterBlock extends Block {
    private static final VoxelShape SHAPE = Block.box(2, 0,2, 14, 14, 14);
    public static Properties PROPERTIES = Properties.of()
            .ignitedByLava()
            .sound(SoundType.GLASS)
            .mapColor(MapColor.GLOW_LICHEN)
            .strength(1.0f, 1.5f)
            .noOcclusion();

    public PeridotClusterBlock() {
        super(PROPERTIES);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(this));

    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos belowPos = pos.below();
        BlockState belowState = level.getBlockState(belowPos);

        return !belowState.isAir() && !belowState.is(this);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    @Override
    @SuppressWarnings("deprecation")
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
