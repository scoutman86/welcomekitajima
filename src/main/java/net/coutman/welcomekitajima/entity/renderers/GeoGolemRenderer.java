package net.coutman.welcomekitajima.entity.renderers;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.entity.GeoGolem;
import net.minecraft.client.model.IronGolemModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GeoGolemRenderer extends MobRenderer<GeoGolem, IronGolemModel<GeoGolem>> {
    public GeoGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new IronGolemModel<>(context.bakeLayer(ModelLayers.IRON_GOLEM)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(GeoGolem entity) {
        return new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/golem/geo.png");
    }
}