package fr.silenthill99.codelyokomod.init.entities.blok;// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import fr.silenthill99.codelyokomod.init.entities.blok.Blok;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BlokModel<T extends Blok> extends EntityModel<T> {
	private final ModelRenderer pate;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer pate2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer pate3;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer pate4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer pate5;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer pate6;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r13;

	public BlokModel() {
		texWidth = 128;
		texHeight = 128;

		pate = new ModelRenderer(this);
		pate.setPos(0.0F, 16.5F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 2.0F, 11.1962F);
		pate.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.0472F, 0.0F, 0.0F);
		cube_r1.texOffs(22, 82).addBox(-1.0F, -0.634F, 0.2321F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 8.0F);
		pate.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
		cube_r2.texOffs(82, 64).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		pate2 = new ModelRenderer(this);
		pate2.setPos(0.0F, 16.5F, 0.0F);
		setRotationAngle(pate2, 0.0F, 1.0472F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 2.0F, 11.1962F);
		pate2.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.0472F, 0.0F, 0.0F);
		cube_r3.texOffs(12, 81).addBox(-1.0F, -0.634F, 0.2321F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 8.0F);
		pate2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.5236F, 0.0F, 0.0F);
		cube_r4.texOffs(28, 69).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		pate3 = new ModelRenderer(this);
		pate3.setPos(0.0F, 16.5F, 0.0F);
		setRotationAngle(pate3, 0.0F, 2.0944F, 0.0F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, 2.0F, 11.1962F);
		pate3.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.0472F, 0.0F, 0.0F);
		cube_r5.texOffs(16, 22).addBox(-1.0F, -0.634F, 0.2321F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, 0.0F, 8.0F);
		pate3.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
		cube_r6.texOffs(54, 64).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		pate4 = new ModelRenderer(this);
		pate4.setPos(0.0F, 16.5F, 0.0F);
		setRotationAngle(pate4, 0.0F, 3.1416F, 0.0F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.0F, 2.0F, 11.1962F);
		pate4.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.0472F, 0.0F, 0.0F);
		cube_r7.texOffs(16, 15).addBox(-1.0F, -0.634F, 0.2321F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.0F, 0.0F, 8.0F);
		pate4.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.5236F, 0.0F, 0.0F);
		cube_r8.texOffs(28, 64).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		pate5 = new ModelRenderer(this);
		pate5.setPos(0.0F, 16.5F, 0.0F);
		setRotationAngle(pate5, 0.0F, -2.0944F, 0.0F);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(0.0F, 2.0F, 11.1962F);
		pate5.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.0472F, 0.0F, 0.0F);
		cube_r9.texOffs(16, 7).addBox(-1.0F, -0.634F, 0.2321F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(0.0F, 0.0F, 8.0F);
		pate5.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.5236F, 0.0F, 0.0F);
		cube_r10.texOffs(0, 20).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		pate6 = new ModelRenderer(this);
		pate6.setPos(0.0F, 16.5F, 0.0F);
		setRotationAngle(pate6, 0.0F, -1.0472F, 0.0F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(0.0F, 2.0F, 11.1962F);
		pate6.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.0472F, 0.0F, 0.0F);
		cube_r11.texOffs(16, 0).addBox(-1.0F, -0.634F, 0.2321F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(0.0F, 0.0F, 8.0F);
		pate6.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.5236F, 0.0F, 0.0F);
		cube_r12.texOffs(0, 15).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(0, 0).addBox(-16.0F, -51.0F, -16.0F, 32.0F, 32.0F, 32.0F, 0.0F, false);
		bb_main.texOffs(0, 64).addBox(-2.0F, -19.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
		bb_main.texOffs(0, 81).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 11.0F, 4.0F, 0.0F, false);
		bb_main.texOffs(76, 77).addBox(2.0F, -19.0F, -2.0F, 2.0F, 11.0F, 4.0F, 0.0F, false);
		bb_main.texOffs(0, 64).addBox(-3.0F, -8.0F, -8.0F, 6.0F, 1.0F, 16.0F, 0.0F, false);
		bb_main.texOffs(0, 15).addBox(-4.0F, -8.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(3.0F, -8.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		bb_main.texOffs(56, 64).addBox(4.0F, -8.0F, -6.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);
		bb_main.texOffs(28, 64).addBox(-6.0F, -8.0F, -6.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);
		bb_main.texOffs(72, 64).addBox(-7.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.texOffs(44, 64).addBox(6.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.texOffs(0, 7).addBox(7.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-8.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(0.0F, -8.0F, 0.0F);
		bb_main.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 1.5708F, 0.0F);
		cube_r13.texOffs(40, 77).addBox(-4.0F, -11.0F, -2.0F, 2.0F, 11.0F, 4.0F, 0.0F, false);
		cube_r13.texOffs(52, 77).addBox(2.0F, -11.0F, -2.0F, 2.0F, 11.0F, 4.0F, 0.0F, false);
		cube_r13.texOffs(64, 77).addBox(2.0F, -11.0F, -2.0F, 2.0F, 11.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		pate.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		pate2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		pate3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		pate4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		pate5.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		pate6.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}