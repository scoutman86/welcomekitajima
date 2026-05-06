package net.coutman.welcomekitajima.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.BlockPos;

import net.coutman.welcomekitajima.init.SoundRegistry;

public class DiscEnterNoiseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), SoundRegistry.BLOCK_DRIVE_CLOSE, SoundSource.BLOCKS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, SoundRegistry.BLOCK_DRIVE_CLOSE, SoundSource.BLOCKS, 1, 1, false);
			}
		}
	}
}
