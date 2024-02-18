package net.qzimyion.cellulose.client;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.screen.CelluloseScreens;
import net.qzimyion.cellulose.screen.sawmill.SawmillScreen;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

@SuppressWarnings({"Deprecated API usage", "deprecation"})
public class CelluloseClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        RenderLayer Render = RenderLayer.getCutout();
        RenderLayer Render1 = RenderLayer.getTranslucent();
        RenderLayer Render2 = RenderLayer.getCutoutMipped();

        BlockRenderLayerMap.INSTANCE.putBlock(SAWMILL, Render);

        //Frames
        BlockRenderLayerMap.INSTANCE.putBlock(OAK_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BIRCH_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(SPRUCE_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_OAK_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(ACACIA_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CRIMSON_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(WARPED_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(MANGROVE_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BAMBOO_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CHERRY_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(AZALEA_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BLOOMING_AZALEA_FRAME, Render);


        //Lintels
        BlockRenderLayerMap.INSTANCE.putBlock(OAK_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BIRCH_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(SPRUCE_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_OAK_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(ACACIA_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CRIMSON_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(WARPED_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(MANGROVE_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BAMBOO_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CHERRY_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(AZALEA_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BLOOMING_AZALEA_LINTELS, Render);

        //Nature
        BlockRenderLayerMap.INSTANCE.putBlock(AZALEA_FLOWERS, Render);


        //Screen
        ScreenRegistry.register(CelluloseScreens.SAWMILL_SCREEN_HANDLER, SawmillScreen::new);

        //Boats
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "cactus_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "cactus_chest_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "azalea_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "azalea_chest_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "blooming_azalea_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "blooming_azalea_chest_boat"), false);

        //Doors and Trapdoors
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_DOOR, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_TRAPDOOR, Render);

        //Signs and Hanging signs

        //Shoji
        BlockRenderLayerMap.INSTANCE.putBlock(OAK_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(BIRCH_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(SPRUCE_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_OAK_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(ACACIA_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(CRIMSON_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(WARPED_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(MANGROVE_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(BAMBOO_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(CHERRY_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(AZALEA_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(BLOOMING_AZALEA_SHOJI, Render1);

        //Ghost Shoji
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_OAK_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_BIRCH_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_SPRUCE_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_DARK_OAK_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_JUNGLE_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_ACACIA_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_CRIMSON_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_WARPED_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_MANGROVE_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_BAMBOO_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_CHERRY_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_CACTUS_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_AZALEA_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(GHOST_BLOOMING_AZALEA_SHOJI, Render1);

        //Plant stuff
        BlockRenderLayerMap.INSTANCE.putBlock(CEDAR_SAPLING, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CEDAR_LEAVES, Render2);

        //Tints
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> FoliageColors.getSpruceColor(), CEDAR_LEAVES);

    }
}
