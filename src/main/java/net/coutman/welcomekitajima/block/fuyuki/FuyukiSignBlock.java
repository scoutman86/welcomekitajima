package net.coutman.welcomekitajima.block.fuyuki;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.coutman.welcomekitajima.init.WoodRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class FuyukiSignBlock {
    private static final String WOOD = "fuyuki";

    public static Properties PROPERTIES = Properties.of()
            .instrument(NoteBlockInstrument.BASS)
            .sound(SoundType.WOOD)
            .strength(1.0f)
            .noCollission();

    public static Block FUYUKI_SIGN = new StandingSignBlock(PROPERTIES, WoodRegistry.FUYUKI_WOOD_TYPE);
    public static Block FUYUKI_WALL_SIGN = new WallSignBlock(PROPERTIES, WoodRegistry.FUYUKI_WOOD_TYPE);

    public static BlockEntityType<SignBlockEntity> FUYUKI_SIGN_BLOCK_ENTITY = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(WelcomeKitajima.MODID, "fuyuki_sign_entity"),
            BlockEntityType.Builder.of(
                    SignBlockEntity::new,
                    FUYUKI_SIGN, FUYUKI_WALL_SIGN
            ).build(null)
    );

    private static void registerSign(String woodName, Block standingSign, Block wallSign) {
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(WelcomeKitajima.MODID, woodName + "_sign"), standingSign);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(WelcomeKitajima.MODID, woodName + "_wall_sign"), wallSign);

        Item item = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, woodName + "_sign"),
                new SignItem(new Item.Properties().stacksTo(16), standingSign, wallSign));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.accept(item));
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.GENERAL_KITAJIMA_TAB).register(content -> content.accept(item));
    }

    public static void register() {
        registerSign(WOOD, FUYUKI_SIGN, FUYUKI_WALL_SIGN);
    }
}
