package net.qzimyion.cellulose.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.ChestBoatEntityModel;
import net.qzimyion.cellulose.entities.CelluloseBoatEntity;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.screen.CelluloseScreens;
import net.qzimyion.cellulose.screen.sawmill.SawmillScreen;

public class CelluloseClient implements ClientModInitializer
{
    private static void registerBoatModel(boolean chest, CelluloseBoatEntity.CelluloseBoat boat) {
        var type = boat.entityType(chest);
        EntityRendererRegistry.register(type, context -> new CelluloseBoatEntityRenderer(context, chest, boat));
        EntityModelLayerRegistry.registerModelLayer(CelluloseBoatEntityRenderer.getModelLayer(boat, chest),
                () -> chest ? ChestBoatEntityModel.getTexturedModelData() : BoatEntityModel.getTexturedModelData());
    }

    @Override
    public void onInitializeClient()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.SAWMILL, RenderLayer.getCutout());

        //Frames
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.OAK_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.BIRCH_FRAME, RenderLayer.getCutout());

        //Lintels
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.OAK_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.BIRCH_FRAME, RenderLayer.getCutout());

        //Screen
        ScreenRegistry.register(CelluloseScreens.SAWMILL_SCREEN_HANDLER, SawmillScreen::new);

        for (CelluloseBoatEntity.CelluloseBoat boat : CelluloseBoatEntity.CelluloseBoat.values()) {
            registerBoatModel(true, boat);
            registerBoatModel(false, boat);
        }
    }
}
