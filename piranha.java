// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class piranha<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "piranha"), "main");
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart supreme_jaw;
	private final ModelPart body;
	private final ModelPart left_fin;
	private final ModelPart right_fin;
	private final ModelPart tail;

	public piranha(ModelPart root) {
		this.root = root.getChild("root");
		this.head = this.root.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.supreme_jaw = this.head.getChild("supreme_jaw");
		this.body = this.root.getChild("body");
		this.left_fin = this.root.getChild("left_fin");
		this.right_fin = this.root.getChild("right_fin");
		this.tail = this.root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, -5.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(42, 8).addBox(-3.0F, 0.0F, -8.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(42, 46).addBox(-3.0F, -1.0F, -8.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition supreme_jaw = head.addOrReplaceChild("supreme_jaw", CubeListBuilder.create().texOffs(22, 24).addBox(-3.0F, -5.0F, -8.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(50, 19).addBox(-3.0F, 1.0F, -8.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r1 = supreme_jaw.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, 0.5F, -4.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -3.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.0F, -5.0F, 8.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(22, 46).addBox(0.0F, -13.0F, -3.0F, 0.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition left_fin = root.addOrReplaceChild("left_fin", CubeListBuilder.create().texOffs(22, 38).addBox(-8.0F, 0.0F, -5.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -2.0F, 0.0F));

		PartDefinition right_fin = root.addOrReplaceChild("right_fin", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, 0.0F, -5.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		PartDefinition tail = root.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, -7.0F, -1.0F, 0.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 9.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}