package net.coutman.welcomekitajima.entity.renderers;

import com.mojang.blaze3d.vertex.PoseStack;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.entity.CatalystProjectile;

import net.coutman.welcomekitajima.entity.models.CatalystProjectileModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class CatalystProjectileRenderer extends EntityRenderer<CatalystProjectile> {
    private final CatalystProjectileModel model;

    private static final ResourceLocation BALLS = new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/catalyst_beam.png");

    private static final Map<String, ResourceLocation> ELEMENT_TEXTURES = new HashMap<>();

    static {
        ELEMENT_TEXTURES.put("pyro", new ResourceLocation("welcomekitajima", "textures/entity/catalyst_beam_pyro.png"));
        ELEMENT_TEXTURES.put("hydro", new ResourceLocation("welcomekitajima", "textures/entity/catalyst_beam_hydro.png"));
        ELEMENT_TEXTURES.put("anemo", new ResourceLocation("welcomekitajima", "textures/entity/catalyst_beam_anemo.png"));
        ELEMENT_TEXTURES.put("electro", new ResourceLocation("welcomekitajima", "textures/entity/catalyst_beam_electro.png"));
        ELEMENT_TEXTURES.put("dendro", new ResourceLocation("welcomekitajima", "textures/entity/catalyst_beam_dendro.png"));
        ELEMENT_TEXTURES.put("cryo", new ResourceLocation("welcomekitajima", "textures/entity/catalyst_beam_cryo.png"));
        ELEMENT_TEXTURES.put("geo", new ResourceLocation("welcomekitajima", "textures/entity/catalyst_beam_geo.png"));
    }

    public CatalystProjectileRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new CatalystProjectileModel(context.bakeLayer(CatalystProjectileModel.LAYER_LOCATION));
    }

    @Override
    public void render(CatalystProjectile entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        poseStack.pushPose();

        poseStack.mulPose(com.mojang.math.Axis.YP.rotationDegrees(entity.getYRot() + 180.0f));
        poseStack.mulPose(com.mojang.math.Axis.XP.rotationDegrees(entity.getXRot()));

        VertexConsumer vertexConsumer = buffer.getBuffer(RenderType.entityTranslucent(this.getTextureLocation(entity)));

        this.model.renderToBuffer(
                poseStack,
                vertexConsumer,
                packedLight,
                OverlayTexture.NO_OVERLAY,
                1.0F, 1.0F, 1.0F, 1.0F // RGBA color tinting (White with 100% opacity)
        );

        poseStack.popPose();
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(CatalystProjectile entity) {
        String element = entity.getInfusedElementId();
        return ELEMENT_TEXTURES.getOrDefault(element, BALLS);
    }
}
