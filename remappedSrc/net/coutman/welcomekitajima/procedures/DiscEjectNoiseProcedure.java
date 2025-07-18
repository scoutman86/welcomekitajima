package net.coutman.welcomekitajima.procedures;

import net.coutman.welcomekitajima.init.WelcomekitajimaModSounds;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class DiscEjectNoiseProcedure {
	public static void execute(WorldAccess world, double x, double y, double z) {
		if (world instanceof World _level) {
			if (!_level.isClient()) {
				_level.playSound(null, BlockPos.ofFloored(x, y, z), WelcomekitajimaModSounds.BLOCK_DRIVE_EJECT, SoundCategory.BLOCKS, 1, 1);
			} else {
				_level.playSound(x, y, z, WelcomekitajimaModSounds.BLOCK_DRIVE_EJECT, SoundCategory.BLOCKS, 1, 1, false);
			}
		}
	}
}
