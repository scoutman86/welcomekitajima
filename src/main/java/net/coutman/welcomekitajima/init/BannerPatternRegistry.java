package net.coutman.welcomekitajima.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BannerPattern;

import static net.coutman.welcomekitajima.WelcomeKitajima.LOGGER;

public class BannerPatternRegistry {
        public static final BannerPattern PYRO_PATTERN = Registry.register(
                BuiltInRegistries.BANNER_PATTERN,
                new ResourceLocation("welcomekitajima", "pyro"),
                new BannerPattern("pyr")
        );
        public static final BannerPattern HYDRO_PATTERN = Registry.register(
                BuiltInRegistries.BANNER_PATTERN,
                new ResourceLocation("welcomekitajima", "hydro"),
                new BannerPattern("hyd")
        );
        public static final BannerPattern ANEMO_PATTERN = Registry.register(
                BuiltInRegistries.BANNER_PATTERN,
                new ResourceLocation("welcomekitajima", "anemo"),
                new BannerPattern("anm")
        );
        public static final BannerPattern ELECTRO_PATTERN = Registry.register(
            BuiltInRegistries.BANNER_PATTERN,
            new ResourceLocation("welcomekitajima", "electro"),
            new BannerPattern("electro")
        );
        public static final BannerPattern DENDRO_PATTERN = Registry.register(
                BuiltInRegistries.BANNER_PATTERN,
                new ResourceLocation("welcomekitajima", "dendro"),
                new BannerPattern("den")
        );
        public static final BannerPattern CRYO_PATTERN = Registry.register(
                BuiltInRegistries.BANNER_PATTERN,
                new ResourceLocation("welcomekitajima", "cryo"),
                new BannerPattern("cry")
        );
        public static final BannerPattern GEO_PATTERN = Registry.register(
                BuiltInRegistries.BANNER_PATTERN,
                new ResourceLocation("welcomekitajima", "geo"),
                new BannerPattern("geo")
        );
        public static final BannerPattern MIYASHITA_SAKURA_PATTERN = Registry.register(
                BuiltInRegistries.BANNER_PATTERN,
                new ResourceLocation("welcomekitajima", "miyashita_sakura"),
                new BannerPattern("mys")
        );



        public static void load() {
                LOGGER.info("If you see this, banner patterns have loaded.");
        }
}