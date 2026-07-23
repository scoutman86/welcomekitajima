package net.coutman.welcomekitajima.entity.renderers;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.entity.PyroSpirit;
import net.coutman.welcomekitajima.entity.models.VexSpiritModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PyroSpiritRenderer extends MobRenderer<PyroSpirit, VexSpiritModel<PyroSpirit>> {
    public PyroSpiritRenderer(EntityRendererProvider.Context context) {
        super(context, new VexSpiritModel<>(context.bakeLayer(ModelLayers.ALLAY)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(PyroSpirit entity) {
        return new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/spirit/pyro.png");
    }
}