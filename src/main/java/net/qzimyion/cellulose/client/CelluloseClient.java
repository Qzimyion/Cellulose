package net.qzimyion.cellulose.client;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.screen.CelluloseScreens;
import net.qzimyion.cellulose.screen.sawmill.SawmillScreen;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

public class CelluloseClient implements ClientModInitializer
{
    @SuppressWarnings({"Deprecated API usage", "deprecation"})
    @Override
    public void onInitializeClient()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(SAWMILL, RenderLayer.getCutout());

        //Frames
        BlockRenderLayerMap.INSTANCE.putBlock(OAK_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BIRCH_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SPRUCE_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_OAK_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ACACIA_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CRIMSON_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WARPED_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MANGROVE_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BAMBOO_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHERRY_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_FRAME, RenderLayer.getCutout());


        //Lintels
        BlockRenderLayerMap.INSTANCE.putBlock(OAK_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BIRCH_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SPRUCE_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_OAK_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ACACIA_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CRIMSON_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WARPED_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MANGROVE_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BAMBOO_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHERRY_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_LINTELS, RenderLayer.getCutout());


        //Screen
        ScreenRegistry.register(CelluloseScreens.SAWMILL_SCREEN_HANDLER, SawmillScreen::new);

        //Boats
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "cactus_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "cactus_chest_boat"), false);

        //Doors and Trapdoors
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_OAK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_BIRCH_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_SPRUCE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_DARK_OAK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_JUNGLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_ACACIA_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_MANGROVE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_BAMBOO_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_CHERRY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_CACTUS_DOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_OAK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_BIRCH_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_SPRUCE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_DARK_OAK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_JUNGLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_ACACIA_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_MANGROVE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_BAMBOO_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_CHERRY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHARRED_CACTUS_TRAPDOOR, RenderLayer.getCutout());

        //CelluloseSigns and Hanging signs

    }
}
