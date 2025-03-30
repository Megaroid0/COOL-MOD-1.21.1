package net.megaroid.MagicalWeaponry.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.megaroid.MagicalWeaponry.MagicalWeaponry;
import net.megaroid.MagicalWeaponry.entity.custom.MimicEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MimicRenderer extends MobRenderer<MimicEntity,MimicModel<MimicEntity>> {

    public MimicRenderer(EntityRendererProvider.Context context) {
        super(context, new MimicModel<>(context.bakeLayer(MimicModel.LAYER_LOCATION)),1);
    }

    @Override
    public ResourceLocation getTextureLocation(MimicEntity mimicEntity) {
        return ResourceLocation.fromNamespaceAndPath(MagicalWeaponry.MODID,"textures/entity/mimic/mimic.png");
    }

    @Override
    public void render(MimicEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()){
            poseStack.scale(0.5f,0.5f,0.5f);
        } else {
            poseStack.scale(1f,1f,1f);
        }
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
