package net.coutman.welcomekitajima.block;

import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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

public class StardustDust extends Block {
    private static final VoxelShape SHAPE = Block.box(4, 0,4, 12, 2, 12);
    public static Properties PROPERTIES = Properties.of()
            .sound(SoundType.SAND)
            .mapColor(MapColor.COLOR_PURPLE);

    public StardustDust() {
        super(PROPERTIES);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
    }
    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos supportPos = pos.below();
        BlockState supportState = level.getBlockState(supportPos);

        return supportState.isFaceSturdy(level, supportPos, Direction.UP);
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
