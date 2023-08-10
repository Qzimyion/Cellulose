package net.qzimyion.cellulose.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.qzimyion.cellulose.registry.CelluloseBlocks;
import net.qzimyion.cellulose.screen.CelluloseScreens;
import net.qzimyion.cellulose.screen.sawmill.SawmillScreen;
import net.qzimyion.cellulose.screen.sawmill.SawmillScreenHandler;

public class CelluloseClient implements ClientModInitializer
{

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
    }
}
