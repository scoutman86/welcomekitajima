package net.coutman.welcomekitajima.init;

import com.google.common.collect.Maps;
import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.entity.*;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public class ACCGruntRenderer extends MobRenderer<ACCGrunt, PlayerModel<ACCGrunt>> {
    private static final Map<ElementalVariance, ResourceLocation> LOCATION_BY_VARIANT = Maps.newEnumMap(ElementalVariance.class);

    static {
        LOCATION_BY_VARIANT.put(ElementalVariance.PYRO, new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/acc_grunt/pyro.png"));
        LOCATION_BY_VARIANT.put(ElementalVariance.HYDRO, new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/acc_grunt/hydro.png"));
        LOCATION_BY_VARIANT.put(ElementalVariance.ANEMO, new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/acc_grunt/anemo.png"));
        LOCATION_BY_VARIANT.put(ElementalVariance.ELECTRO, new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/acc_grunt/electro.png"));
        LOCATION_BY_VARIANT.put(ElementalVariance.DENDRO, new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/acc_grunt/dendro.png"));
        LOCATION_BY_VARIANT.put(ElementalVariance.CRYO, new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/acc_grunt/cryo.png"));
        LOCATION_BY_VARIANT.put(ElementalVariance.GEO, new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/acc_grunt/geo.png"));
    }

    public ACCGruntRenderer(EntityRendererProvider.Context context) {
        super(context, new PlayerModel<>(context.bakeLayer(ModelLayers.PLAYER_SLIM), true), 0.5f);

        this.addLayer(new ItemInHandLayer<>(this, context.getItemInHandRenderer()));
    }

    @Override
    public ResourceLocation getTextureLocation(ACCGrunt entity) {
        return LOCATION_BY_VARIANT.getOrDefault(entity.getVariant(), LOCATION_BY_VARIANT.get(ElementalVariance.ANEMO));
    }
}