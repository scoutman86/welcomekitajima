/*
*	MCreator note:
*
*	If you lock base mod element files, you can edit this file and the proxy files
*	and they won't get overwritten. If you change your mod package or modid, you
*	need to apply these changes to this file MANUALLY.
*
*
*	If you do not lock base mod element files in Workspace settings, this file
*	will be REGENERATED on each build.
*
*/
package net.coutman.welcomekitajima;

import net.coutman.welcomekitajima.entity.models.CatalystProjectileModel;
import net.coutman.welcomekitajima.init.EntityRegistry;
import net.coutman.welcomekitajima.item.BowWeapon;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

import net.coutman.welcomekitajima.init.BlockRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;

@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// I have no idea what I'm doing so hopefully this works and I don't explode
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
