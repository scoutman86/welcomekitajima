package net.coutman.welcomekitajima.entity;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.client.model.IronGolemModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AnemoGolemRenderer extends MobRenderer<AnemoGolem, IronGolemModel<AnemoGolem>> {
    public AnemoGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new IronGolemModel<>(context.bakeLayer(ModelLayers.IRON_GOLEM)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(AnemoGolem entity) {
        return new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/golem/anemo.png");
    }
}