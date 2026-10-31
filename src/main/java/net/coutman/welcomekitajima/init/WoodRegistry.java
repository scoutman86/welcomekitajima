package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class WoodRegistry {
    public static BlockSetType FUYUKI_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.OAK)
            .build(new ResourceLocation(WelcomeKitajima.MODID, "fuyuki"));
    public static WoodType FUYUKI_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK)
            .register(new ResourceLocation(WelcomeKitajima.MODID, "fuyuki"), FUYUKI_SET_TYPE);

    public static final BlockSetType MIYASHITA_SAKURA_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.CHERRY)
            .build(new ResourceLocation(WelcomeKitajima.MODID, "miyashita_sakura"));
    public static final WoodType MIYASHITA_SAKURA_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.CHERRY)
            .register(new ResourceLocation(WelcomeKitajima.MODID, "miyashita_sakura"), MIYASHITA_SAKURA_SET_TYPE);

    public static final BlockSetType ASHWOOD_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.OAK)
            .build(new ResourceLocation(WelcomeKitajima.MODID, "ashwood"));
    public static final WoodType ASHWOOD_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK)
            .register(new ResourceLocation(WelcomeKitajima.MODID, "ashwood"), ASHWOOD_SET_TYPE);

    public static void registerWoodTypes() {


    }
}
