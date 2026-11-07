package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class TreeRegistry {
    public static final ResourceKey<ConfiguredFeature<?, ?>> MIYASHITA_SAKURA_TREE = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            new ResourceLocation(WelcomeKitajima.MODID, "miyashita_sakura")
    );

    public static class MiyashitaSakuraGrower extends AbstractTreeGrower {
        @Nullable
        @Override
        protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean hasFlowers) {
            return MIYASHITA_SAKURA_TREE;
        }
    }
}
