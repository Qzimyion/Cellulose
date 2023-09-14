package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;


import static net.minecraft.block.Blocks.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

public class CelluloseModelProvider extends FabricModelProvider {
    public CelluloseModelProvider(FabricDataOutput output)
    {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Texturepool (Block)
        BlockStateModelGenerator.BlockTexturePool cactusTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cactusVerticalTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_CACTUS_PLANKS);

        BlockStateModelGenerator.BlockTexturePool VerticalOak = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_OAK_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalBirch = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_BIRCH_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalSpruce = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_SPRUCE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalDarkOak = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_DARK_OAK_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalJungle = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_JUNGLE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalAcacia = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_ACACIA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalCrimson = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_CRIMSON_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalWarped = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_WARPED_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalMangrove = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_MANGROVE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalBamboo = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_BAMBOO_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalCherry = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_CHERRY_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalAzalea = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_AZALEA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalBloomingAzalea = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_BLOOMING_AZALEA_PLANKS);

        BlockStateModelGenerator.BlockTexturePool MosaicOak = blockStateModelGenerator.registerCubeAllModelTexturePool(OAK_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicBirch = blockStateModelGenerator.registerCubeAllModelTexturePool(BIRCH_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicSpruce = blockStateModelGenerator.registerCubeAllModelTexturePool(SPRUCE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicDarkOak = blockStateModelGenerator.registerCubeAllModelTexturePool(DARK_OAK_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicJungle = blockStateModelGenerator.registerCubeAllModelTexturePool(JUNGLE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicAcacia = blockStateModelGenerator.registerCubeAllModelTexturePool(ACACIA_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicCrimson = blockStateModelGenerator.registerCubeAllModelTexturePool(CRIMSON_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicWarped = blockStateModelGenerator.registerCubeAllModelTexturePool(WARPED_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicMangrove = blockStateModelGenerator.registerCubeAllModelTexturePool(MANGROVE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicCherry = blockStateModelGenerator.registerCubeAllModelTexturePool(CHERRY_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool cactusMosaicTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicAzalea = blockStateModelGenerator.registerCubeAllModelTexturePool(AZALEA_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicBloomingAzalea = blockStateModelGenerator.registerCubeAllModelTexturePool(BLOOMING_AZALEA_MOSAIC);

        BlockStateModelGenerator.BlockTexturePool ChippedPlankOak = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_OAK_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankBirch = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_BIRCH_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankSpruce = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_SPRUCE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankDarkOak = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_DARK_OAK_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankJungle = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_JUNGLE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankAcacia = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_ACACIA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankCrimson = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_CRIMSON_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankWarped = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_WARPED_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankMangrove = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_MANGROVE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankBamboo = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_BAMBOO_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankCherry = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_CHERRY_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankCactus = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_CACTUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankAzalea = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_AZALEA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ChippedPlankBloomingAzalea = blockStateModelGenerator.registerCubeAllModelTexturePool(CHIPPED_BLOOMING_AZALEA_PLANKS);


        BlockStateModelGenerator.BlockTexturePool TilesOak = blockStateModelGenerator.registerCubeAllModelTexturePool(OAK_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesBirch = blockStateModelGenerator.registerCubeAllModelTexturePool(BIRCH_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesSpruce = blockStateModelGenerator.registerCubeAllModelTexturePool(SPRUCE_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesDarkOak = blockStateModelGenerator.registerCubeAllModelTexturePool(DARK_OAK_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesJungle = blockStateModelGenerator.registerCubeAllModelTexturePool(JUNGLE_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesAcacia = blockStateModelGenerator.registerCubeAllModelTexturePool(ACACIA_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesCrimson = blockStateModelGenerator.registerCubeAllModelTexturePool(CRIMSON_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesWarped = blockStateModelGenerator.registerCubeAllModelTexturePool(WARPED_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesMangrove = blockStateModelGenerator.registerCubeAllModelTexturePool(MANGROVE_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesBamboo = blockStateModelGenerator.registerCubeAllModelTexturePool(BAMBOO_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesCherry = blockStateModelGenerator.registerCubeAllModelTexturePool(CHERRY_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesCactus = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_TILES);

        BlockStateModelGenerator.BlockTexturePool BoardsOak = blockStateModelGenerator.registerCubeAllModelTexturePool(OAK_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsBirch = blockStateModelGenerator.registerCubeAllModelTexturePool(BIRCH_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsSpruce = blockStateModelGenerator.registerCubeAllModelTexturePool(SPRUCE_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsDarkOak = blockStateModelGenerator.registerCubeAllModelTexturePool(DARK_OAK_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsJungle = blockStateModelGenerator.registerCubeAllModelTexturePool(JUNGLE_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsAcacia = blockStateModelGenerator.registerCubeAllModelTexturePool(ACACIA_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsCrimson = blockStateModelGenerator.registerCubeAllModelTexturePool(CRIMSON_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsWarped = blockStateModelGenerator.registerCubeAllModelTexturePool(WARPED_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsMangrove = blockStateModelGenerator.registerCubeAllModelTexturePool(MANGROVE_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsBamboo = blockStateModelGenerator.registerCubeAllModelTexturePool(BAMBOO_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsCherry = blockStateModelGenerator.registerCubeAllModelTexturePool(CHERRY_BOARDS);
        BlockStateModelGenerator.BlockTexturePool BoardsCactus = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_BOARDS);

        BlockStateModelGenerator.BlockTexturePool GlazedOak = blockStateModelGenerator.registerCubeAllModelTexturePool(OAK_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedBirch = blockStateModelGenerator.registerCubeAllModelTexturePool(BIRCH_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedSpruce = blockStateModelGenerator.registerCubeAllModelTexturePool(SPRUCE_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedDarkOak = blockStateModelGenerator.registerCubeAllModelTexturePool(DARK_OAK_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedJungle = blockStateModelGenerator.registerCubeAllModelTexturePool(JUNGLE_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedAcacia = blockStateModelGenerator.registerCubeAllModelTexturePool(ACACIA_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedCrimson = blockStateModelGenerator.registerCubeAllModelTexturePool(CRIMSON_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedWarped = blockStateModelGenerator.registerCubeAllModelTexturePool(WARPED_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedMangrove = blockStateModelGenerator.registerCubeAllModelTexturePool(MANGROVE_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedBamboo = blockStateModelGenerator.registerCubeAllModelTexturePool(BAMBOO_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedCherry = blockStateModelGenerator.registerCubeAllModelTexturePool(CHERRY_GLAZED);
        BlockStateModelGenerator.BlockTexturePool GlazedCactus = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_GLAZED);

        //Texturepool (PillarBlocks)
        BlockStateModelGenerator.LogTexturePool ChippedOak = blockStateModelGenerator.registerLog(CHIPPED_OAK);
        BlockStateModelGenerator.LogTexturePool ChippedBirch = blockStateModelGenerator.registerLog(CHIPPED_BIRCH);
        BlockStateModelGenerator.LogTexturePool ChippedSpruce = blockStateModelGenerator.registerLog(CHIPPED_SPRUCE);
        BlockStateModelGenerator.LogTexturePool ChippedDarkOak = blockStateModelGenerator.registerLog(CHIPPED_DARK_OAK);
        BlockStateModelGenerator.LogTexturePool ChippedJungle = blockStateModelGenerator.registerLog(CHIPPED_JUNGLE);
        BlockStateModelGenerator.LogTexturePool ChippedAcacia = blockStateModelGenerator.registerLog(CHIPPED_ACACIA);
        BlockStateModelGenerator.LogTexturePool ChippedCrimson = blockStateModelGenerator.registerLog(CHIPPED_CRIMSON);
        BlockStateModelGenerator.LogTexturePool ChippedWarped = blockStateModelGenerator.registerLog(CHIPPED_WARPED);
        BlockStateModelGenerator.LogTexturePool ChippedMangrove = blockStateModelGenerator.registerLog(CHIPPED_MANGROVE);
        BlockStateModelGenerator.LogTexturePool ChippedBamboo = blockStateModelGenerator.registerLog(CHIPPED_BAMBOO_BLOCK);
        BlockStateModelGenerator.LogTexturePool ChippedStrippedBamboo = blockStateModelGenerator.registerLog(CHIPPED_STRIPPED_BAMBOO_BLOCK);
        BlockStateModelGenerator.LogTexturePool ChippedCherry = blockStateModelGenerator.registerLog(CHIPPED_CHERRY);
        BlockStateModelGenerator.LogTexturePool ChippedCactus = blockStateModelGenerator.registerLog(CHIPPED_CACTUS);
        BlockStateModelGenerator.LogTexturePool ChippedAzalea = blockStateModelGenerator.registerLog(CHIPPED_AZALEA);

        BlockStateModelGenerator.LogTexturePool StrippedChippedOak = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_OAK);
        BlockStateModelGenerator.LogTexturePool StrippedChippedBirch = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_BIRCH);
        BlockStateModelGenerator.LogTexturePool StrippedChippedSpruce = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_SPRUCE);
        BlockStateModelGenerator.LogTexturePool StrippedChippedDarkOak = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_DARK_OAK);
        BlockStateModelGenerator.LogTexturePool StrippedChippedJungle = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_JUNGLE);
        BlockStateModelGenerator.LogTexturePool StrippedChippedAcacia = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_ACACIA);
        BlockStateModelGenerator.LogTexturePool StrippedChippedCrimson = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_CRIMSON);
        BlockStateModelGenerator.LogTexturePool StrippedChippedWarped = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_WARPED);
        BlockStateModelGenerator.LogTexturePool StrippedChippedMangrove = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_MANGROVE);
        BlockStateModelGenerator.LogTexturePool StrippedChippedCherry = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_CHERRY);
        BlockStateModelGenerator.LogTexturePool StrippedChippedCactus = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_CACTUS);
        BlockStateModelGenerator.LogTexturePool StrippedChippedAzalea = blockStateModelGenerator.registerLog(STRIPPED_CHIPPED_AZALEA);


        BlockStateModelGenerator.LogTexturePool EngravedOak = blockStateModelGenerator.registerLog(ENGRAVED_OAK);
        BlockStateModelGenerator.LogTexturePool EngravedBirch = blockStateModelGenerator.registerLog(ENGRAVED_BIRCH);
        BlockStateModelGenerator.LogTexturePool EngravedSpruce = blockStateModelGenerator.registerLog(ENGRAVED_SPRUCE);
        BlockStateModelGenerator.LogTexturePool EngravedDarkOak = blockStateModelGenerator.registerLog(ENGRAVED_DARK_OAK);
        BlockStateModelGenerator.LogTexturePool EngravedJungle = blockStateModelGenerator.registerLog(ENGRAVED_JUNGLE);
        BlockStateModelGenerator.LogTexturePool EngravedAcacia = blockStateModelGenerator.registerLog(ENGRAVED_ACACIA);
        BlockStateModelGenerator.LogTexturePool EngravedCrimson = blockStateModelGenerator.registerLog(ENGRAVED_CRIMSON);
        BlockStateModelGenerator.LogTexturePool EngravedWarped = blockStateModelGenerator.registerLog(ENGRAVED_WARPED);
        BlockStateModelGenerator.LogTexturePool EngravedMangrove = blockStateModelGenerator.registerLog(ENGRAVED_MANGROVE);
        BlockStateModelGenerator.LogTexturePool EngravedCherry = blockStateModelGenerator.registerLog(ENGRAVED_CHERRY);
        BlockStateModelGenerator.LogTexturePool EngravedCactus = blockStateModelGenerator.registerLog(ENGRAVED_CACTUS);
        BlockStateModelGenerator.LogTexturePool EngravedAzalea = blockStateModelGenerator.registerLog(ENGRAVED_AZALEA);

        BlockStateModelGenerator.LogTexturePool PlankPillarOak = blockStateModelGenerator.registerLog(OAK_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarBirch = blockStateModelGenerator.registerLog(BIRCH_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarSpruce = blockStateModelGenerator.registerLog(SPRUCE_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarDarkOak = blockStateModelGenerator.registerLog(DARK_OAK_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarJungle = blockStateModelGenerator.registerLog(JUNGLE_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarAcacia = blockStateModelGenerator.registerLog(ACACIA_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarCrimson = blockStateModelGenerator.registerLog(CRIMSON_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarWarped = blockStateModelGenerator.registerLog(WARPED_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarMangrove = blockStateModelGenerator.registerLog(MANGROVE_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarBamboo = blockStateModelGenerator.registerLog(BAMBOO_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarCherry = blockStateModelGenerator.registerLog(CHERRY_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarCactus = blockStateModelGenerator.registerLog(CACTUS_PLANK_PILLARS);

        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarOak = blockStateModelGenerator.registerLog(VERTICAL_OAK_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarBirch = blockStateModelGenerator.registerLog(VERTICAL_BIRCH_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarSpruce = blockStateModelGenerator.registerLog(VERTICAL_SPRUCE_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarDarkOak = blockStateModelGenerator.registerLog(VERTICAL_DARK_OAK_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarJungle = blockStateModelGenerator.registerLog(VERTICAL_JUNGLE_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarAcacia = blockStateModelGenerator.registerLog(VERTICAL_ACACIA_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarCrimson = blockStateModelGenerator.registerLog(VERTICAL_CRIMSON_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarWarped = blockStateModelGenerator.registerLog(VERTICAL_WARPED_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarMangrove = blockStateModelGenerator.registerLog(VERTICAL_MANGROVE_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarBamboo = blockStateModelGenerator.registerLog(VERTICAL_BAMBOO_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarCherry = blockStateModelGenerator.registerLog(VERTICAL_CHERRY_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool VerticalPlankPillarCactus = blockStateModelGenerator.registerLog(VERTICAL_CACTUS_PLANK_PILLARS);

        BlockStateModelGenerator.LogTexturePool BeamOak = blockStateModelGenerator.registerLog(OAK_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamBirch = blockStateModelGenerator.registerLog(BIRCH_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamSpruce = blockStateModelGenerator.registerLog(SPRUCE_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamDarkOak = blockStateModelGenerator.registerLog(DARK_OAK_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamJungle = blockStateModelGenerator.registerLog(JUNGLE_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamAcacia = blockStateModelGenerator.registerLog(ACACIA_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamCrimson = blockStateModelGenerator.registerLog(CRIMSON_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamWarped = blockStateModelGenerator.registerLog(WARPED_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamMangrove = blockStateModelGenerator.registerLog(MANGROVE_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamBamboo = blockStateModelGenerator.registerLog(BAMBOO_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamCherry = blockStateModelGenerator.registerLog(CHERRY_BEAM);
        BlockStateModelGenerator.LogTexturePool BeamCactus = blockStateModelGenerator.registerLog(CACTUS_BEAM);

        /*
        Woodsets
         */

        //Cactus Wood
        BlockStateModelGenerator.LogTexturePool Cactus = blockStateModelGenerator.registerLog(CACTUS_BUNDLE);
        BlockStateModelGenerator.LogTexturePool StrippedCactus = blockStateModelGenerator.registerLog(STRIPPED_CACTUS);

        //Charred Wood
        BlockStateModelGenerator.LogTexturePool CharredOakLog = blockStateModelGenerator.registerLog(CHARRED_OAK_LOG);
        BlockStateModelGenerator.LogTexturePool CharredBirchLog = blockStateModelGenerator.registerLog(CHARRED_HORIZONTAL_LOG);
        BlockStateModelGenerator.LogTexturePool CharredBambooBlock = blockStateModelGenerator.registerLog(CHARRED_BAMBOO);
        BlockStateModelGenerator.BlockTexturePool CharredPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(CHARRED_PLANKS);
        BlockStateModelGenerator.BlockTexturePool CharredBambooPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(CHARRED_BAMBOO_PLANKS);
        BlockStateModelGenerator.LogTexturePool CharredStrippedOakLog = blockStateModelGenerator.registerLog(STRIPPED_CHARRED_OAK_LOG);
        BlockStateModelGenerator.LogTexturePool CharredStrippedJungleLog = blockStateModelGenerator.registerLog(STRIPPED_CHARRED_HORIZONTAL_LOG);

        //Azalea Wood
        BlockStateModelGenerator.LogTexturePool Azalea = blockStateModelGenerator.registerLog(AZALEA_LOG);
        BlockStateModelGenerator.LogTexturePool StrippedAzalea = blockStateModelGenerator.registerLog(STRIPPED_AZALEA);
        BlockStateModelGenerator.LogTexturePool BloomingAzalea = blockStateModelGenerator.registerLog(BLOOMING_AZALEA_LOG);
        BlockStateModelGenerator.LogTexturePool BloomingEngravedAzalea = blockStateModelGenerator.registerLog(ENGRAVED_BLOOMING_AZALEA);
        BlockStateModelGenerator.LogTexturePool BloomingStrippedAzalea = blockStateModelGenerator.registerLog(BLOOMING_STRIPPED_AZALEA);
        BlockStateModelGenerator.BlockTexturePool AzaleaPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(AZALEA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool BloomingAzaleaPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(BLOOMING_AZALEA_PLANKS);

        //Red Mushroom wood

        //Brown Mushroom wood

        //Apple Wood

        /*
        Actual additions:-
         */

        //Log
        //(Engraved)
        EngravedOak.log(ENGRAVED_OAK);
        EngravedBirch.log(ENGRAVED_BIRCH);
        EngravedSpruce.log(ENGRAVED_SPRUCE);
        EngravedDarkOak.log(ENGRAVED_DARK_OAK);
        EngravedJungle.log(ENGRAVED_JUNGLE);
        EngravedAcacia.log(ENGRAVED_ACACIA);
        EngravedCrimson.log(ENGRAVED_CRIMSON);
        EngravedWarped.log(ENGRAVED_WARPED);
        EngravedMangrove.log(ENGRAVED_MANGROVE);
        EngravedCherry.log(ENGRAVED_CHERRY);
        //(Chipped)
        ChippedOak.log(CHIPPED_OAK);
        ChippedBirch.log(CHIPPED_BIRCH);
        ChippedSpruce.log(CHIPPED_SPRUCE);
        ChippedDarkOak.log(CHIPPED_DARK_OAK);
        ChippedJungle.log(CHIPPED_JUNGLE);
        ChippedAcacia.log(CHIPPED_ACACIA);
        ChippedCrimson.log(CHIPPED_CRIMSON);
        ChippedWarped.log(CHIPPED_WARPED);
        ChippedMangrove.log(CHIPPED_MANGROVE);
        ChippedBamboo.log(CHIPPED_BAMBOO_BLOCK);
        ChippedStrippedBamboo.log(CHIPPED_STRIPPED_BAMBOO_BLOCK);
        ChippedCherry.log(CHIPPED_CHERRY);
        //(Stripped_Chipped)
        StrippedChippedOak.log(STRIPPED_CHIPPED_OAK);
        StrippedChippedBirch.log(STRIPPED_CHIPPED_BIRCH);
        StrippedChippedSpruce.log(STRIPPED_CHIPPED_SPRUCE);
        StrippedChippedDarkOak.log(STRIPPED_CHIPPED_DARK_OAK);
        StrippedChippedJungle.log(STRIPPED_CHIPPED_JUNGLE);
        StrippedChippedAcacia.log(STRIPPED_CHIPPED_ACACIA);
        StrippedChippedCrimson.log(STRIPPED_CHIPPED_CRIMSON);
        StrippedChippedWarped.log(STRIPPED_CHIPPED_WARPED);
        StrippedChippedMangrove.log(STRIPPED_CHIPPED_MANGROVE);
        StrippedChippedCherry.log(STRIPPED_CHIPPED_CHERRY);
        //Plank pillars
        PlankPillarOak.log(OAK_PLANK_PILLARS);
        PlankPillarBirch.log(BIRCH_PLANK_PILLARS);
        PlankPillarSpruce.log(SPRUCE_PLANK_PILLARS);
        PlankPillarDarkOak.log(DARK_OAK_PLANK_PILLARS);
        PlankPillarJungle.log(JUNGLE_PLANK_PILLARS);
        PlankPillarAcacia.log(ACACIA_PLANK_PILLARS);
        PlankPillarCrimson.log(CRIMSON_PLANK_PILLARS);
        PlankPillarWarped.log(WARPED_PLANK_PILLARS);
        PlankPillarMangrove.log(MANGROVE_PLANK_PILLARS);
        PlankPillarBamboo.log(BAMBOO_PLANK_PILLARS);
        PlankPillarCherry.log(CHERRY_PLANK_PILLARS);
        //Vertical Plank pillars
        VerticalPlankPillarOak.log(VERTICAL_OAK_PLANK_PILLARS);
        VerticalPlankPillarBirch.log(VERTICAL_BIRCH_PLANK_PILLARS);
        VerticalPlankPillarSpruce.log(VERTICAL_SPRUCE_PLANK_PILLARS);
        VerticalPlankPillarDarkOak.log(VERTICAL_DARK_OAK_PLANK_PILLARS);
        VerticalPlankPillarJungle.log(VERTICAL_JUNGLE_PLANK_PILLARS);
        VerticalPlankPillarAcacia.log(VERTICAL_ACACIA_PLANK_PILLARS);
        VerticalPlankPillarCrimson.log(VERTICAL_CRIMSON_PLANK_PILLARS);
        VerticalPlankPillarWarped.log(VERTICAL_WARPED_PLANK_PILLARS);
        VerticalPlankPillarMangrove.log(VERTICAL_MANGROVE_PLANK_PILLARS);
        VerticalPlankPillarBamboo.log(VERTICAL_BAMBOO_PLANK_PILLARS);
        VerticalPlankPillarCherry.log(VERTICAL_CHERRY_PLANK_PILLARS);
        //Wood
        //(Engraved)
        EngravedOak.wood(ENGRAVED_OAK_WOOD);
        EngravedBirch.wood(ENGRAVED_BIRCH_WOOD);
        EngravedSpruce.wood(ENGRAVED_SPRUCE_WOOD);
        EngravedDarkOak.wood(ENGRAVED_DARK_OAK_WOOD);
        EngravedJungle.wood(ENGRAVED_JUNGLE_WOOD);
        EngravedAcacia.wood(ENGRAVED_ACACIA_WOOD);
        EngravedCrimson.wood(ENGRAVED_CRIMSON_HYPHAE);
        EngravedWarped.wood(ENGRAVED_WARPED_HYPHAE);
        EngravedMangrove.wood(ENGRAVED_MANGROVE_WOOD);
        EngravedCherry.wood(ENGRAVED_CHERRY_WOOD);
        //(Chipped)
        ChippedOak.wood(CHIPPED_OAK_WOOD);
        ChippedBirch.wood(CHIPPED_BIRCH_WOOD);
        ChippedSpruce.wood(CHIPPED_SPRUCE_WOOD);
        ChippedDarkOak.wood(CHIPPED_DARK_OAK_WOOD);
        ChippedJungle.wood(CHIPPED_JUNGLE_WOOD);
        ChippedAcacia.wood(CHIPPED_ACACIA_WOOD);
        ChippedCrimson.wood(CHIPPED_CRIMSON_HYPHAE);
        ChippedWarped.wood(CHIPPED_WARPED_HYPHAE);
        ChippedMangrove.wood(CHIPPED_MANGROVE_WOOD);
        ChippedBamboo.wood(CHIPPED_BAMBOO_WOOD);
        ChippedStrippedBamboo.wood(CHIPPED_STRIPPED_BAMBOO_WOOD);
        ChippedCherry.wood(CHIPPED_CHERRY_WOOD);
        //(Stripped_chipped)
        StrippedChippedOak.wood(STRIPPED_CHIPPED_OAK_WOOD);
        StrippedChippedBirch.wood(STRIPPED_CHIPPED_BIRCH_WOOD);
        StrippedChippedSpruce.wood(STRIPPED_CHIPPED_SPRUCE_WOOD);
        StrippedChippedDarkOak.wood(STRIPPED_CHIPPED_DARK_OAK_WOOD);
        StrippedChippedJungle.wood(STRIPPED_CHIPPED_JUNGLE_WOOD);
        StrippedChippedAcacia.wood(STRIPPED_CHIPPED_ACACIA_WOOD);
        StrippedChippedCrimson.wood(STRIPPED_CHIPPED_CRIMSON_HYPHAE);
        StrippedChippedWarped.wood(STRIPPED_CHIPPED_WARPED_HYPHAE);
        StrippedChippedMangrove.wood(STRIPPED_CHIPPED_MANGROVE_WOOD);
        StrippedChippedCherry.wood(STRIPPED_CHIPPED_CHERRY_WOOD);

        //Beam
        BeamOak.wood(OAK_BEAM);
        BeamBirch.wood(BIRCH_BEAM);
        BeamSpruce.wood(SPRUCE_BEAM);
        BeamDarkOak.wood(DARK_OAK_BEAM);
        BeamJungle.wood(JUNGLE_BEAM);
        BeamAcacia.wood(ACACIA_BEAM);
        BeamCrimson.wood(CRIMSON_BEAM);
        BeamWarped.wood(WARPED_BEAM);
        BeamMangrove.wood(MANGROVE_BEAM);
        BeamBamboo.wood(BAMBOO_BEAM);
        BeamCherry.wood(CHERRY_BEAM);

        //Slabs
        VerticalOak.slab(VERTICAL_OAK_SLAB);
        VerticalBirch.slab(VERTICAL_BIRCH_SLAB);
        VerticalSpruce.slab(VERTICAL_SPRUCE_SLAB);
        VerticalDarkOak.slab(VERTICAL_DARK_OAK_SLAB);
        VerticalJungle.slab(VERTICAL_JUNGLE_SLAB);
        VerticalAcacia.slab(VERTICAL_ACACIA_SLAB);
        VerticalCrimson.slab(VERTICAL_CRIMSON_SLAB);
        VerticalWarped.slab(VERTICAL_WARPED_SLAB);
        VerticalMangrove.slab(VERTICAL_MANGROVE_SLAB);
        VerticalBamboo.slab(VERTICAL_BAMBOO_SLAB);
        VerticalCherry.slab(VERTICAL_CHERRY_SLAB);

        MosaicOak.slab(OAK_MOSAIC_SLABS);
        MosaicBirch.slab(BIRCH_MOSAIC_SLABS);
        MosaicSpruce.slab(SPRUCE_MOSAIC_SLABS);
        MosaicDarkOak.slab(DARK_OAK_MOSAIC_SLABS);
        MosaicJungle.slab(JUNGLE_MOSAIC_SLABS);
        MosaicAcacia.slab(ACACIA_MOSAIC_SLABS);
        MosaicCrimson.slab(CRIMSON_MOSAIC_SLABS);
        MosaicWarped.slab(WARPED_MOSAIC_SLABS);
        MosaicMangrove.slab(MANGROVE_MOSAIC_SLABS);
        MosaicCherry.slab(CHERRY_MOSAIC_SLABS);

        ChippedPlankOak.slab(CHIPPED_OAK_SLAB);
        ChippedPlankBirch.slab(CHIPPED_BIRCH_SLAB);
        ChippedPlankSpruce.slab(CHIPPED_SPRUCE_SLAB);
        ChippedPlankDarkOak.slab(CHIPPED_DARK_OAK_SLAB);
        ChippedPlankJungle.slab(CHIPPED_JUNGLE_SLAB);
        ChippedPlankAcacia.slab(CHIPPED_ACACIA_SLAB);
        ChippedPlankCrimson.slab(CHIPPED_CRIMSON_SLAB);
        ChippedPlankWarped.slab(CHIPPED_WARPED_SLAB);
        ChippedPlankMangrove.slab(CHIPPED_MANGROVE_SLAB);
        ChippedPlankBamboo.slab(CHIPPED_BAMBOO_SLAB);
        ChippedPlankCherry.slab(CHIPPED_CHERRY_SLAB);

        TilesOak.slab(OAK_TILES_SLABS);
        TilesBirch.slab(BIRCH_TILES_SLABS);
        TilesSpruce.slab(SPRUCE_TILES_SLABS);
        TilesDarkOak.slab(DARK_OAK_TILES_SLABS);
        TilesJungle.slab(JUNGLE_TILES_SLABS);
        TilesAcacia.slab(ACACIA_TILES_SLABS);
        TilesCrimson.slab(CRIMSON_TILES_SLABS);
        TilesWarped.slab(WARPED_TILES_SLABS);
        TilesMangrove.slab(MANGROVE_TILES_SLABS);
        TilesBamboo.slab(BAMBOO_TILES_SLABS);
        TilesCherry.slab(CHERRY_TILES_SLABS);

        BoardsOak.slab(OAK_BOARDS_SLABS);
        BoardsBirch.slab(BIRCH_BOARDS_SLABS);
        BoardsSpruce.slab(SPRUCE_BOARDS_SLABS);
        BoardsDarkOak.slab(DARK_OAK_BOARDS_SLABS);
        BoardsJungle.slab(JUNGLE_BOARDS_SLABS);
        BoardsAcacia.slab(ACACIA_BOARDS_SLABS);
        BoardsCrimson.slab(CRIMSON_BOARDS_SLABS);
        BoardsWarped.slab(WARPED_BOARDS_SLABS);
        BoardsMangrove.slab(MANGROVE_BOARDS_SLABS);
        BoardsBamboo.slab(BAMBOO_BOARDS_SLABS);
        BoardsCherry.slab(CHERRY_BOARDS_SLABS);

        GlazedOak.slab(GLAZED_OAK_SLABS);
        GlazedBirch.slab(GLAZED_BIRCH_SLABS);
        GlazedSpruce.slab(GLAZED_SPRUCE_SLABS);
        GlazedDarkOak.slab(GLAZED_DARK_OAK_SLABS);
        GlazedJungle.slab(GLAZED_JUNGLE_SLABS);
        GlazedAcacia.slab(GLAZED_ACACIA_SLABS);
        GlazedCrimson.slab(GLAZED_CRIMSON_SLABS);
        GlazedWarped.slab(GLAZED_WARPED_SLABS);
        GlazedMangrove.slab(GLAZED_MANGROVE_SLABS);
        GlazedBamboo.slab(GLAZED_BAMBOO_SLABS);
        GlazedCherry.slab(GLAZED_CHERRY_SLABS);

        //Stairs
        VerticalOak.stairs(VERTICAL_OAK_STAIR);
        VerticalBirch.stairs(VERTICAL_BIRCH_STAIR);
        VerticalSpruce.stairs(VERTICAL_SPRUCE_STAIR);
        VerticalDarkOak.stairs(VERTICAL_DARK_OAK_STAIR);
        VerticalJungle.stairs(VERTICAL_JUNGLE_STAIR);
        VerticalAcacia.stairs(VERTICAL_ACACIA_STAIR);
        VerticalCrimson.stairs(VERTICAL_CRIMSON_STAIR);
        VerticalWarped.stairs(VERTICAL_WARPED_STAIR);
        VerticalMangrove.stairs(VERTICAL_MANGROVE_STAIR);
        VerticalBamboo.stairs(VERTICAL_BAMBOO_STAIR);
        VerticalCherry.stairs(VERTICAL_CHERRY_STAIR);

        MosaicOak.stairs(OAK_MOSAIC_STAIRS);
        MosaicBirch.stairs(BIRCH_MOSAIC_STAIRS);
        MosaicSpruce.stairs(SPRUCE_MOSAIC_STAIRS);
        MosaicDarkOak.stairs(DARK_OAK_MOSAIC_STAIRS);
        MosaicJungle.stairs(JUNGLE_MOSAIC_STAIRS);
        MosaicAcacia.stairs(ACACIA_MOSAIC_STAIRS);
        MosaicCrimson.stairs(CRIMSON_MOSAIC_STAIRS);
        MosaicWarped.stairs(WARPED_MOSAIC_STAIRS);
        MosaicMangrove.stairs(MANGROVE_MOSAIC_STAIRS);
        MosaicCherry.stairs(CHERRY_MOSAIC_STAIRS);

        ChippedPlankBirch.stairs(CHIPPED_BIRCH_STAIR);
        ChippedPlankSpruce.stairs(CHIPPED_SPRUCE_STAIR);
        ChippedPlankDarkOak.stairs(CHIPPED_DARK_OAK_STAIR);
        ChippedPlankJungle.stairs(CHIPPED_JUNGLE_STAIR);
        ChippedPlankAcacia.stairs(CHIPPED_ACACIA_STAIR);
        ChippedPlankCrimson.stairs(CHIPPED_CRIMSON_STAIR);
        ChippedPlankWarped.stairs(CHIPPED_WARPED_STAIR);
        ChippedPlankMangrove.stairs(CHIPPED_MANGROVE_STAIR);
        ChippedPlankBamboo.stairs(CHIPPED_BAMBOO_STAIR);
        ChippedPlankCherry.stairs(CHIPPED_CHERRY_STAIR);

        TilesOak.stairs(OAK_TILES_STAIRS);
        TilesBirch.stairs(BIRCH_TILES_STAIRS);
        TilesSpruce.stairs(SPRUCE_TILES_STAIRS);
        TilesDarkOak.stairs(DARK_OAK_TILES_STAIRS);
        TilesJungle.stairs(JUNGLE_TILES_STAIRS);
        TilesAcacia.stairs(ACACIA_TILES_STAIRS);
        TilesCrimson.stairs(CRIMSON_TILES_STAIRS);
        TilesWarped.stairs(WARPED_TILES_STAIRS);
        TilesMangrove.stairs(MANGROVE_TILES_STAIRS);
        TilesBamboo.stairs(BAMBOO_TILES_STAIRS);
        TilesCherry.stairs(CHERRY_TILES_STAIRS);

        BoardsOak.stairs(OAK_BOARDS_STAIRS);
        BoardsBirch.stairs(BIRCH_BOARDS_STAIRS);
        BoardsSpruce.stairs(SPRUCE_BOARDS_STAIRS);
        BoardsDarkOak.stairs(DARK_OAK_BOARDS_STAIRS);
        BoardsJungle.stairs(JUNGLE_BOARDS_STAIRS);
        BoardsAcacia.stairs(ACACIA_BOARDS_STAIRS);
        BoardsCrimson.stairs(CRIMSON_BOARDS_STAIRS);
        BoardsWarped.stairs(WARPED_BOARDS_STAIRS);
        BoardsMangrove.stairs(MANGROVE_BOARDS_STAIRS);
        BoardsBamboo.stairs(BAMBOO_BOARDS_STAIRS);
        BoardsCherry.stairs(CHERRY_BOARDS_STAIRS);

        GlazedOak.stairs(GLAZED_OAK_STAIRS);
        GlazedBirch.stairs(GLAZED_BIRCH_STAIRS);
        GlazedSpruce.stairs(GLAZED_SPRUCE_STAIRS);
        GlazedDarkOak.stairs(GLAZED_DARK_OAK_STAIRS);
        GlazedJungle.stairs(GLAZED_JUNGLE_STAIRS);
        GlazedAcacia.stairs(GLAZED_ACACIA_STAIRS);
        GlazedCrimson.stairs(GLAZED_CRIMSON_STAIRS);
        GlazedWarped.stairs(GLAZED_WARPED_STAIRS);
        GlazedMangrove.stairs(GLAZED_MANGROVE_STAIRS);
        GlazedBamboo.stairs(GLAZED_BAMBOO_STAIRS);
        GlazedCherry.stairs(GLAZED_CHERRY_STAIRS);

        //Blocks
        // (Flipped Planks)
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_BIRCH_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_SPRUCE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_DARK_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_JUNGLE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_ACACIA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_CRIMSON_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_WARPED_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_MANGROVE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_BAMBOO_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_CHERRY_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_BIRCH_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_SPRUCE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_DARK_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_JUNGLE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_ACACIA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_CRIMSON_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_WARPED_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_MANGROVE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_BAMBOO_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_CHERRY_PLANKS);

        //(Carved wood)
        blockStateModelGenerator.registerSimpleCubeAll(OAK_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(BIRCH_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(SPRUCE_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(DARK_OAK_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(JUNGLE_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(ACACIA_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(CRIMSON_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(WARPED_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(MANGROVE_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(BAMBOO_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(CHERRY_CARVED);

        //(Carpented Wood)
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_OAK);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_BIRCH);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_SPRUCE);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_DARK_OAK);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_JUNGLE);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_ACACIA);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_CRIMSON);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_WARPED);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_MANGROVE);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_BAMBOO);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_CHERRY);

        //(Storage Blocks)
        blockStateModelGenerator.registerSimpleCubeAll(BLOCK_OF_STICKS);
        blockStateModelGenerator.registerSimpleCubeAll(BLOCK_OF_CHARCOAL);
        blockStateModelGenerator.registerFlowerbed(AZALEA_FLOWERS);

        //Door
        blockStateModelGenerator.registerDoor(CHARRED_OAK_DOOR);
        blockStateModelGenerator.registerDoor(CHARRED_BIRCH_DOOR);
        blockStateModelGenerator.registerDoor(CHARRED_SPRUCE_DOOR);
        blockStateModelGenerator.registerDoor(CHARRED_DARK_OAK_DOOR);
        blockStateModelGenerator.registerDoor(CHARRED_JUNGLE_DOOR);
        blockStateModelGenerator.registerDoor(CHARRED_ACACIA_DOOR);
        blockStateModelGenerator.registerDoor(CHARRED_MANGROVE_DOOR);
        blockStateModelGenerator.registerDoor(CHARRED_BAMBOO_DOOR);
        blockStateModelGenerator.registerDoor(CHARRED_CHERRY_DOOR);
        blockStateModelGenerator.registerDoor(CHARRED_CACTUS_DOOR);

        //Trapdoor
        blockStateModelGenerator.registerTrapdoor(CHARRED_OAK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CHARRED_BIRCH_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CHARRED_SPRUCE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CHARRED_DARK_OAK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CHARRED_JUNGLE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CHARRED_ACACIA_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CHARRED_MANGROVE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CHARRED_BAMBOO_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CHARRED_CHERRY_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CHARRED_CACTUS_TRAPDOOR);

        //Panes
        blockStateModelGenerator.registerGlassPane(OAK_FRAME, OAK_LINTELS);
        blockStateModelGenerator.registerGlassPane(BIRCH_FRAME, BIRCH_LINTELS);
        blockStateModelGenerator.registerGlassPane(SPRUCE_FRAME, SPRUCE_LINTELS);
        blockStateModelGenerator.registerGlassPane(DARK_OAK_FRAME, DARK_OAK_LINTELS);
        blockStateModelGenerator.registerGlassPane(JUNGLE_FRAME, JUNGLE_LINTELS);
        blockStateModelGenerator.registerGlassPane(ACACIA_FRAME, ACACIA_LINTELS);
        blockStateModelGenerator.registerGlassPane(CRIMSON_FRAME, CRIMSON_LINTELS);
        blockStateModelGenerator.registerGlassPane(WARPED_FRAME, WARPED_LINTELS);
        blockStateModelGenerator.registerGlassPane(MANGROVE_FRAME, MANGROVE_LINTELS);
        blockStateModelGenerator.registerGlassPane(BAMBOO_FRAME, BAMBOO_LINTELS);
        blockStateModelGenerator.registerGlassPane(CHERRY_FRAME, CHERRY_LINTELS);
        blockStateModelGenerator.registerGlassPane(CACTUS_FRAME, CACTUS_LINTELS);


        /*
        *Barricades
        */

        blockStateModelGenerator.registerGlassPane(OAK_PLANKS, OAK_BARRICADES);


        //(Woodsets: Cactus)
        Cactus.log(CACTUS_BUNDLE);
        BeamCactus.wood(CACTUS_BEAM);
        StrippedCactus.log(STRIPPED_CACTUS);
        EngravedCactus.log(ENGRAVED_CACTUS);
        ChippedCactus.log(CHIPPED_CACTUS);
        PlankPillarCactus.log(CACTUS_PLANK_PILLARS);
        VerticalPlankPillarCactus.log(VERTICAL_CACTUS_PLANK_PILLARS);
        ChippedCactus.wood(CHIPPED_CACTUS_CROWN);
        EngravedCactus.wood(ENGRAVED_CACTUS_CROWN);
        ChippedPlankCactus.slab(CHIPPED_CACTUS_SLAB);
        cactusTexturePool.slab(CACTUS_SLAB);
        cactusVerticalTexturePool.slab(VERTICAL_CACTUS_SLAB);
        cactusMosaicTexturePool.slab(CACTUS_MOSAIC_SLABS);
        cactusTexturePool.stairs(CACTUS_STAIRS);
        cactusVerticalTexturePool.stairs(VERTICAL_CACTUS_STAIR);
        cactusMosaicTexturePool.stairs(CACTUS_MOSAIC_STAIRS);
        cactusTexturePool.fence(CACTUS_FENCE);
        cactusTexturePool.fenceGate(CACTUS_FENCE_GATE);
        cactusTexturePool.button(CACTUS_BUTTON);
        BoardsCactus.stairs(CACTUS_BOARDS_STAIRS);
        GlazedCactus.stairs(GLAZED_CACTUS_STAIRS);
        cactusTexturePool.pressurePlate(CACTUS_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(CACTUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(CACTUS_TRAPDOOR);
        TilesCactus.slab(CACTUS_TILES_SLABS);
        BoardsCactus.slab(CACTUS_BOARDS_SLABS);
        GlazedCactus.slab(GLAZED_CACTUS_SLABS);
        TilesCactus.stairs(CACTUS_TILES_STAIRS);
        StrippedChippedCactus.wood(STRIPPED_CHIPPED_CACTUS_CROWN);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_CACTUS_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(FLIPPED_VERTICAL_CACTUS_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(CACTUS_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_CACTUS);

        //(Woodsets: Azalea)
        Azalea.log(AZALEA_LOG);
        BloomingAzalea.log(BLOOMING_AZALEA_LOG);
        StrippedAzalea.log(STRIPPED_AZALEA);
        BloomingStrippedAzalea.log(BLOOMING_STRIPPED_AZALEA);
        EngravedAzalea.log(ENGRAVED_AZALEA);
        EngravedAzalea.wood(ENGRAVED_AZALEA_WOOD);
        ChippedAzalea.log(CHIPPED_AZALEA);
        ChippedAzalea.wood(CHIPPED_AZALEA_WOOD);
        Azalea.wood(AZALEA_WOOD);
        BloomingAzalea.wood(BLOOMING_AZALEA_WOOD);
        StrippedAzalea.wood(STRIPPED_AZALEA_WOOD);
        BloomingStrippedAzalea.wood(BLOOMING_STRIPPED_AZALEA_WOOD);
        AzaleaPlanks.slab(AZALEA_SLAB);
        AzaleaPlanks.stairs(AZALEA_STAIRS);
        AzaleaPlanks.fence(AZALEA_FENCE);
        AzaleaPlanks.fenceGate(AZALEA_FENCE_GATE);
        AzaleaPlanks.pressurePlate(AZALEA_PRESSURE_PLATE);
        AzaleaPlanks.button(AZALEA_BUTTON);
        BloomingAzaleaPlanks.slab(BLOOMING_AZALEA_SLAB);
        BloomingAzaleaPlanks.stairs(BLOOMING_AZALEA_STAIRS);
        VerticalAzalea.slab(VERTICAL_AZALEA_SLAB);
        VerticalBloomingAzalea.slab(VERTICAL_BLOOMING_AZALEA_SLAB);
        MosaicAzalea.slab(AZALEA_MOSAIC_SLABS);
        MosaicBloomingAzalea.slab(BLOOMING_AZALEA_MOSAIC_SLABS);
        VerticalAzalea.stairs(VERTICAL_AZALEA_STAIR);
        VerticalBloomingAzalea.stairs(VERTICAL_BLOOMING_AZALEA_STAIR);
        MosaicAzalea.stairs(AZALEA_MOSAIC_STAIRS);
        MosaicBloomingAzalea.stairs(BLOOMING_AZALEA_MOSAIC_STAIRS);
        blockStateModelGenerator.registerDoor(AZALEA_DOOR);
        blockStateModelGenerator.registerDoor(BLOOMING_AZALEA_DOOR);
        blockStateModelGenerator.registerTrapdoor(AZALEA_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(BLOOMING_AZALEA_TRAPDOOR);
        StrippedChippedAzalea.log(STRIPPED_CHIPPED_AZALEA);
        StrippedChippedAzalea.wood(STRIPPED_CHIPPED_AZALEA_WOOD);
        ChippedPlankAzalea.slab(CHIPPED_AZALEA_SLAB);
        ChippedPlankAzalea.stairs(CHIPPED_AZALEA_STAIR);
        ChippedPlankBloomingAzalea.slab(CHIPPED_BLOOMING_AZALEA_SLAB);
        ChippedPlankBloomingAzalea.stairs(CHIPPED_BLOOMING_AZALEA_STAIR);
        BloomingEngravedAzalea.log(ENGRAVED_BLOOMING_AZALEA);
        BloomingEngravedAzalea.wood(ENGRAVED_BLOOMING_AZALEA_WOOD);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ACORN, Models.GENERATED);
        itemModelGenerator.register(POPPED_ACORN, Models.GENERATED);
        itemModelGenerator.register(POPACORN_BOWL, Models.GENERATED);
        itemModelGenerator.register(POPACORN_BOWL_HALF, Models.GENERATED);
        itemModelGenerator.register(POPACORN_BOWL_QUATER, Models.GENERATED);
    }
}
