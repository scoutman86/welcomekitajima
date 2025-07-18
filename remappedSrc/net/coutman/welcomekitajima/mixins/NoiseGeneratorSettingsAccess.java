package net.coutman.welcomekitajima.mixins;

import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.Mutable;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ChunkGeneratorSettings.class)
public interface NoiseGeneratorSettingsAccess {
	@Accessor("surfaceRule")
	@Mutable
	void addSurfaceRules(MaterialRules.MaterialRule ruleSource);
}
