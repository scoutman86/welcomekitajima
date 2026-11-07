package net.coutman.welcomekitajima.block;

import net.coutman.welcomekitajima.init.TreeRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class Saplings {
    public static Block MIYASHITA_SAKURA_SAPLING = new SaplingBlock(
            new TreeRegistry.MiyashitaSakuraGrower(),
            BlockBehaviour.Properties.copy(Blocks.CHERRY_SAPLING));

    public static void clientInit() {
        BlockRenderLayerMap.INSTANCE.putBlock(MIYASHITA_SAKURA_SAPLING, RenderType.cutoutMipped());
    }
}
