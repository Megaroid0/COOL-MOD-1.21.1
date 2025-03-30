package net.megaroid.MagicalWeaponry.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.megaroid.MagicalWeaponry.MagicalWeaponry;
import net.megaroid.MagicalWeaponry.entity.custom.MimicEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;




    public class MimicModel <T extends MimicEntity> extends HierarchicalModel<T> {
        // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
        public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(MagicalWeaponry.MODID, "mimic"), "main");
        private final ModelPart bone2;
        private final ModelPart bone;
        private final ModelPart bb_main;

        public MimicModel (ModelPart root) {
            this.bone2 = root.getChild("bone2");
            this.bone = this.bone2.getChild("bone");
            this.bb_main = root.getChild("bb_main");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();

            PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-6.0F, 13.0F, 0.0F));

            PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 91).addBox(0.0F, -4.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(64, 91).addBox(1.0F, -4.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(68, 91).addBox(1.0F, -4.0F, -8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(72, 91).addBox(1.0F, -4.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(92, 56).addBox(1.0F, -4.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(60, 91).addBox(1.0F, -4.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(44, 91).addBox(0.0F, -4.0F, -18.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -11.0F, 9.0F, 0.0F, 0.0F, -0.48F));

            PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 30).addBox(-2.0F, -8.0F, -9.0F, 4.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

            PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 30).addBox(-2.0F, -8.0F, -9.0F, 4.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

            PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 58).addBox(-2.0F, -8.0F, -9.0F, 4.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -14.0F, 0.0F, 0.0F, 0.0F, 1.0908F));

            PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -10.0F, -9.0F, 15.0F, 10.0F, 18.0F, new CubeDeformation(0.0F))
                    .texOffs(1, 0).addBox(-3.0F, -10.0F, -13.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(1, 0).addBox(2.0F, -10.0F, -13.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(-1, 1).addBox(-3.0F, -10.0F, -14.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(-1, 1).addBox(-3.0F, -10.0F, 13.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(1, 0).addBox(2.0F, -10.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(1, 0).addBox(-3.0F, -10.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(86, 85).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -4.0F, 9.0F, -0.192F, -0.7834F, 0.3175F));

            PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(78, 85).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -4.0F, -9.0F, 0.2929F, -0.799F, -0.0554F));

            PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 85).addBox(-1.0F, -2.0F, -5.0F, 11.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -9.0F, 2.0F, 0.0F, 0.0F, -0.3491F));

            PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 84).addBox(-3.0F, -10.0F, -9.0F, 4.0F, 11.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

            PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(66, 14).addBox(-7.0F, -11.0F, -1.0F, 14.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -9.0F, 0.2377F, 0.0287F, -0.0013F));

            PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 56).addBox(-3.0F, -10.0F, -9.0F, 4.0F, 11.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

            PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(66, 0).addBox(-7.0F, -11.0F, -1.0F, 14.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 9.0F, -0.1987F, 0.0287F, -0.0013F));

            return LayerDefinition.create(meshdefinition, 128, 128);
        }

        @Override
        public void setupAnim(MimicEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
            bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
            bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        }

        @Override
        public ModelPart root() {
            return bone2;
        }
    }

