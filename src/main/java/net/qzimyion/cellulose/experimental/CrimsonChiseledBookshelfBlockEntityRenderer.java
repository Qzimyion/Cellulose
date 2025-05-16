package net.qzimyion.cellulose.experimental;

//import com.mojang.blaze3d.vertex.PoseStack;
//import net.minecraft.client.model.geom.ModelLayerLocation;
//import net.minecraft.client.model.geom.ModelPart;
//import net.minecraft.client.renderer.MultiBufferSource;
//import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.level.block.HorizontalDirectionalBlock;
//import net.qzimyion.cellulose.blocks.BlockEntity.CustomBookshelves.NineSlotBookshelfBlockEntity;
//
//public class CrimsonChiseledBookshelfBlockEntityRenderer implements BlockEntityRenderer<NineSlotBookshelfBlockEntity> {
//    public static final ModelLayerLocation MODEL_LAYER = new ModelLayerLocation(Trickster.id("book_shelf"), "book_shelf");
//    public static final ResourceLocation ATLAS_ID = Trickster.id("textures/atlas/book_shelf.png");
//
//    private final ModelPart[] scrollModels = new ModelPart[3 * 3];
//
//    public static TexturedModelData getTexturedModelData() {
//        ModelData modelData = new ModelData();
//        ModelPartData modelPartData = modelData.getRoot();
//        for (int i = 0; i < 3 * 3; i++) {
//            var x = i % 3;
//            var y = i / 3;
//            modelPartData.addChild("book_" + i, ModelPartBuilder.create()
//                            .uv(0, 0)
//                            .cuboid(15f / 3 * x + 1.5f, 15f / 3 * y + 1f, 16f, 3f, 3f, 1f),
//                    ModelTransform.NONE);
//        }
//        return TexturedModelData.of(modelData, 16, 16);
//    }
//
//    public CrimsonChiseledBookshelfBlockEntityRenderer(BlockEntityRenderer.Context ctx) {
//        var model = ctx.getLayerModelPart(MODEL_LAYER);
//        for (int i = 0; i < 3 * 3; i++) {
//            scrollModels[i] = model.getChild("book_" + i);
//        }
//    }
//
//    @Override
//    public void render(NineSlotBookshelfBlockEntity blockEntity, float f, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int j) {
//        var facing = blockEntity.getBlockState().getValue(HorizontalDirectionalBlock.FACING);
//        i = WorldRenderer.getLightmapCoordinates(blockEntity.getLevel(), blockEntity.getBlockPos().relative(facing));
//        matrices.push();
//        matrices.translate(0.5f, 0, 0.5f);
//        matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(facing.asRotation()));
//        matrices.translate(-0.5f, 0, -0.5f);
//
//        for (int i = 0; i < GRID_WIDTH * GRID_HEIGHT; i++) {
//            var stack = entity.getStack(i);
//            if (!stack.isEmpty()) {
//                var textureId = Registries.ITEM.getId(stack.getItem()).withPrefixedPath("entity/scroll_shelf/");
//                var spriteId = new SpriteIdentifier(ATLAS_ID, textureId);
//                var vertexConsumer = spriteId.getVertexConsumer(vertexConsumers, RenderLayer::getEntityCutout);
//                scrollModels[i].render(matrices, vertexConsumer, i, overlay);
//            }
//        }
//    }
//}
