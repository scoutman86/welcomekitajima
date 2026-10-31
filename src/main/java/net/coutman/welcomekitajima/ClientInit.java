package net.coutman.welcomekitajima;

import net.coutman.welcomekitajima.block.ashwood.AshwoodSignBlock;
import net.coutman.welcomekitajima.block.fuyuki.FuyukiSignBlock;
import net.coutman.welcomekitajima.block.miyashita_sakura.MiyashitaSakuraSignBlock;
import net.coutman.welcomekitajima.entity.models.CatalystProjectileModel;
import net.coutman.welcomekitajima.init.EntityRegistry;
import net.coutman.welcomekitajima.init.WoodRegistry;
import net.coutman.welcomekitajima.item.BowWeapon;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

import net.coutman.welcomekitajima.init.BlockRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.level.FoliageColor;

@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// I have no idea what I'm doing so hopefully this works and I don't explode
		WoodRegistry.registerWoodTypes();

		EntityModelLayerRegistry.registerModelLayer(
				ModelLayers.createSignModelName(WoodRegistry.FUYUKI_WOOD_TYPE),
				SignRenderer::createSignLayer
		);
		EntityModelLayerRegistry.registerModelLayer(
				ModelLayers.createSignModelName(WoodRegistry.MIYASHITA_SAKURA_WOOD_TYPE),
				SignRenderer::createSignLayer
		);
		EntityModelLayerRegistry.registerModelLayer(
				ModelLayers.createSignModelName(WoodRegistry.ASHWOOD_WOOD_TYPE),
				SignRenderer::createSignLayer
		);

		BlockEntityRendererRegistry.register(FuyukiSignBlock.FUYUKI_SIGN_BLOCK_ENTITY, SignRenderer::new);
		BlockEntityRendererRegistry.register(MiyashitaSakuraSignBlock.MIYASHITA_SAKURA_SIGN_BLOCK_ENTITY, SignRenderer::new);
		BlockEntityRendererRegistry.register(AshwoodSignBlock.ASHWOOD_SIGN_BLOCK_ENTITY, SignRenderer::new);

		BlockRegistry.clientLoad();

		EntityModelLayerRegistry.registerModelLayer(
				CatalystProjectileModel.LAYER_LOCATION,
				CatalystProjectileModel::createBodyLayer
		);
		EntityRegistry.clientLoadRenderer();
		ColorProviderRegistry.BLOCK.register(
				(state, world, pos, tintIndex) -> {
					if (world != null && pos != null) {
						return BiomeColors.getAverageFoliageColor(world, pos);
					}
					return FoliageColor.getDefaultColor();
				},
				BlockRegistry.FUYUKI_LEAVES,
				BlockRegistry.ASHWOOD_LEAVES
		);

		ColorProviderRegistry.ITEM.register(
				(stack, tintIndex) -> FoliageColor.getDefaultColor(),
				BlockRegistry.FUYUKI_LEAVES,
				BlockRegistry.ASHWOOD_LEAVES
		);

		BowWeapon.registerBowPredicates();
	}
}
