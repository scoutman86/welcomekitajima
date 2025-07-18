
package net.coutman.welcomekitajima.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.enums.SlabType;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.coutman.welcomekitajima.init.WelcomekitajimaModTabs;
import net.coutman.welcomekitajima.init.WelcomekitajimaModBlocks;

import java.util.List;
import java.util.Collections;

public class SmoothStudiopolisConcreteSlabBlock extends SlabBlock {
	public static AbstractBlock.Settings PROPERTIES = AbstractBlock.Settings.create().instrument(Instrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.STONE).strength(1.8f, 10f).requiresTool();

	public SmoothStudiopolisConcreteSlabBlock() {
		super(PROPERTIES);
		ItemGroupEvents.modifyEntriesEvent(WelcomekitajimaModTabs.TAB_CDS).register(content -> content.add(this));
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContextParameterSet.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(WelcomekitajimaModBlocks.SMOOTH_STUDIOPOLIS_CONCRETE_SLAB, RenderLayer.getSolid());
	}
}
