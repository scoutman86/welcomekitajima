
package net.coutman.welcomekitajima.block;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.Collections;
import java.util.List;

public class BlackVolcanicSand extends FallingBlock {
	public static Properties PROPERTIES = Properties.of()
			.instrument(NoteBlockInstrument.SNARE)
			.sound(SoundType.SAND)
			.strength(1.8f, 10f)
			.mapColor(MapColor.COLOR_BLACK);

	static String blockRegistryName = "black_volcanic_sand";

	public static final Block BLACK_VOLCANIC_SAND = new BlackVolcanicSand();

	public BlackVolcanicSand() {
		super(PROPERTIES);
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(this));
	}

	@Override
	@SuppressWarnings("all")
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	public static void register() {
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(WelcomeKitajima.MODID, blockRegistryName), BLACK_VOLCANIC_SAND);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, blockRegistryName), new BlockItem(BLACK_VOLCANIC_SAND, new Item.Properties()));
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(BLACK_VOLCANIC_SAND, RenderType.solid());
	}
}
