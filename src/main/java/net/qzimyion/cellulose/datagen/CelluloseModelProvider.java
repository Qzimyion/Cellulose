package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

public class CelluloseModelProvider extends FabricModelProvider {
    public CelluloseModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    //Custom models


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
        BlockStateModelGenerator.BlockTexturePool TilesAzalea = blockStateModelGenerator.registerCubeAllModelTexturePool(AZALEA_TILES);
        BlockStateModelGenerator.BlockTexturePool TilesBloomingAzalea = blockStateModelGenerator.registerCubeAllModelTexturePool(BLOOMING_AZALEA_TILES);


        BlockStateModelGenerator.BlockTexturePool BoardsOak = blockStateModelGenerator.registerCubeAllModelTexturePool(OAK_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsBirch = blockStateModelGenerator.registerCubeAllModelTexturePool(BIRCH_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsSpruce = blockStateModelGenerator.registerCubeAllModelTexturePool(SPRUCE_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsDarkOak = blockStateModelGenerator.registerCubeAllModelTexturePool(DARK_OAK_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsJungle = blockStateModelGenerator.registerCubeAllModelTexturePool(JUNGLE_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsAcacia = blockStateModelGenerator.registerCubeAllModelTexturePool(ACACIA_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsCrimson = blockStateModelGenerator.registerCubeAllModelTexturePool(CRIMSON_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsWarped = blockStateModelGenerator.registerCubeAllModelTexturePool(WARPED_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsMangrove = blockStateModelGenerator.registerCubeAllModelTexturePool(MANGROVE_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsBamboo = blockStateModelGenerator.registerCubeAllModelTexturePool(BAMBOO_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsCherry = blockStateModelGenerator.registerCubeAllModelTexturePool(CHERRY_TIMBERS);
        BlockStateModelGenerator.BlockTexturePool BoardsCactus = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_TIMBERS);

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
        BlockStateModelGenerator.BlockTexturePool GlazedAzalea = blockStateModelGenerator.registerCubeAllModelTexturePool(AZALEA_GLAZED);

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
        BlockStateModelGenerator.LogTexturePool EngravedBamboo = blockStateModelGenerator.registerLog(ENGRAVED_BAMBOO);
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
        BlockStateModelGenerator.LogTexturePool PlankPillarAzalea = blockStateModelGenerator.registerLog(AZALEA_PLANK_PILLARS);
        BlockStateModelGenerator.LogTexturePool PlankPillarBloomingAzalea = blockStateModelGenerator.registerLog(BLOOMING_AZALEA_PLANK_PILLARS);


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

        //Azalea Wood
        BlockStateModelGenerator.LogTexturePool Azalea = blockStateModelGenerator.registerLog(AZALEA_LOG);
        BlockStateModelGenerator.LogTexturePool StrippedAzalea = blockStateModelGenerator.registerLog(STRIPPED_AZALEA_LOG);
        BlockStateModelGenerator.LogTexturePool BloomingAzalea = blockStateModelGenerator.registerLog(BLOOMING_AZALEA_LOG);
        BlockStateModelGenerator.LogTexturePool BloomingEngravedAzalea = blockStateModelGenerator.registerLog(ENGRAVED_BLOOMING_AZALEA);
        BlockStateModelGenerator.LogTexturePool BloomingStrippedAzalea = blockStateModelGenerator.registerLog(BLOOMING_STRIPPED_AZALEA);
        BlockStateModelGenerator.BlockTexturePool AzaleaPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(AZALEA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool BloomingAzaleaPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(BLOOMING_AZALEA_PLANKS);

        /*
        Misc stuff
         */


        //Red Mushroom wood

        //Brown Mushroom wood

        /*
        Actual additions:-
         */


        //(Engraved)
        EngravedOak.log(ENGRAVED_OAK).wood(ENGRAVED_OAK_WOOD);
        EngravedBirch.log(ENGRAVED_BIRCH).wood(ENGRAVED_BIRCH_WOOD);
        EngravedSpruce.log(ENGRAVED_SPRUCE).wood(ENGRAVED_SPRUCE_WOOD);
        EngravedDarkOak.log(ENGRAVED_DARK_OAK).wood(ENGRAVED_DARK_OAK_WOOD);
        EngravedJungle.log(ENGRAVED_JUNGLE).wood(ENGRAVED_JUNGLE_WOOD);
        EngravedAcacia.log(ENGRAVED_ACACIA).wood(ENGRAVED_ACACIA_WOOD);
        EngravedCrimson.log(ENGRAVED_CRIMSON).wood(ENGRAVED_CRIMSON_HYPHAE);
        EngravedWarped.log(ENGRAVED_WARPED).wood(ENGRAVED_WARPED_HYPHAE);
        EngravedMangrove.log(ENGRAVED_MANGROVE).wood(ENGRAVED_MANGROVE_WOOD);
        EngravedBamboo.log(ENGRAVED_BAMBOO).wood(ENGRAVED_BAMBOO_BLOCK);
        EngravedCherry.log(ENGRAVED_CHERRY).wood(ENGRAVED_CHERRY_WOOD);
        //(Chipped)
        ChippedOak.log(CHIPPED_OAK).wood(CHIPPED_OAK_WOOD);
        ChippedBirch.log(CHIPPED_BIRCH).wood(CHIPPED_BIRCH_WOOD);
        ChippedSpruce.log(CHIPPED_SPRUCE).wood(CHIPPED_SPRUCE_WOOD);
        ChippedDarkOak.log(CHIPPED_DARK_OAK).wood(CHIPPED_DARK_OAK_WOOD);
        ChippedJungle.log(CHIPPED_JUNGLE).wood(CHIPPED_JUNGLE_WOOD);
        ChippedAcacia.log(CHIPPED_ACACIA).wood(CHIPPED_ACACIA_WOOD);
        ChippedCrimson.log(CHIPPED_CRIMSON).wood(CHIPPED_CRIMSON_HYPHAE);
        ChippedWarped.log(CHIPPED_WARPED).wood(CHIPPED_WARPED_HYPHAE);
        ChippedMangrove.log(CHIPPED_MANGROVE).wood(CHIPPED_MANGROVE_WOOD);
        ChippedBamboo.log(CHIPPED_BAMBOO_BLOCK);
        ChippedStrippedBamboo.log(CHIPPED_STRIPPED_BAMBOO_BLOCK);
        ChippedCherry.log(CHIPPED_CHERRY).wood(CHIPPED_CHERRY_WOOD);
        //(Stripped_Chipped)
        StrippedChippedOak.log(STRIPPED_CHIPPED_OAK).wood(STRIPPED_CHIPPED_OAK_WOOD);
        StrippedChippedBirch.log(STRIPPED_CHIPPED_BIRCH).wood(STRIPPED_CHIPPED_BIRCH_WOOD);
        StrippedChippedSpruce.log(STRIPPED_CHIPPED_SPRUCE).wood(STRIPPED_CHIPPED_SPRUCE_WOOD);
        StrippedChippedDarkOak.log(STRIPPED_CHIPPED_DARK_OAK).wood(STRIPPED_CHIPPED_DARK_OAK_WOOD);
        StrippedChippedJungle.log(STRIPPED_CHIPPED_JUNGLE).wood(STRIPPED_CHIPPED_JUNGLE_WOOD);
        StrippedChippedAcacia.log(STRIPPED_CHIPPED_ACACIA).wood(STRIPPED_CHIPPED_ACACIA_WOOD);
        StrippedChippedCrimson.log(STRIPPED_CHIPPED_CRIMSON).wood(STRIPPED_CHIPPED_CRIMSON_HYPHAE);
        StrippedChippedWarped.log(STRIPPED_CHIPPED_WARPED).wood(STRIPPED_CHIPPED_WARPED_HYPHAE);
        StrippedChippedMangrove.log(STRIPPED_CHIPPED_MANGROVE).wood(STRIPPED_CHIPPED_MANGROVE_WOOD);
        StrippedChippedCherry.log(STRIPPED_CHIPPED_CHERRY).wood(STRIPPED_CHIPPED_CHERRY_WOOD);
        //Plank pillars
        PlankPillarOak.log(OAK_PLANK_PILLARS).wood(OAK_PLANK_BOX);
        PlankPillarBirch.log(BIRCH_PLANK_PILLARS).wood(BIRCH_PLANK_BOX);
        PlankPillarSpruce.log(SPRUCE_PLANK_PILLARS).wood(SPRUCE_PLANK_BOX);
        PlankPillarDarkOak.log(DARK_OAK_PLANK_PILLARS).wood(DARK_OAK_PLANK_BOX);
        PlankPillarJungle.log(JUNGLE_PLANK_PILLARS).wood(JUNGLE_PLANK_BOX);
        PlankPillarAcacia.log(ACACIA_PLANK_PILLARS).wood(ACACIA_PLANK_BOX);
        PlankPillarCrimson.log(CRIMSON_PLANK_PILLARS).wood(CRIMSON_PLANK_BOX);
        PlankPillarWarped.log(WARPED_PLANK_PILLARS).wood(WARPED_PLANK_BOX);
        PlankPillarMangrove.log(MANGROVE_PLANK_PILLARS).wood(MANGROVE_PLANK_BOX);
        PlankPillarBamboo.log(BAMBOO_PLANK_PILLARS).wood(BAMBOO_PLANK_BOX);
        PlankPillarCherry.log(CHERRY_PLANK_PILLARS).wood(CHERRY_PLANK_BOX);

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
        VerticalOak.slab(VERTICAL_OAK_SLAB).stairs(VERTICAL_OAK_STAIR);
        VerticalBirch.slab(VERTICAL_BIRCH_SLAB).stairs(VERTICAL_BIRCH_STAIR);
        VerticalSpruce.slab(VERTICAL_SPRUCE_SLAB).stairs(VERTICAL_SPRUCE_STAIR);
        VerticalDarkOak.slab(VERTICAL_DARK_OAK_SLAB).stairs(VERTICAL_DARK_OAK_STAIR);
        VerticalJungle.slab(VERTICAL_JUNGLE_SLAB).stairs(VERTICAL_JUNGLE_STAIR);
        VerticalAcacia.slab(VERTICAL_ACACIA_SLAB).stairs(VERTICAL_ACACIA_STAIR);
        VerticalCrimson.slab(VERTICAL_CRIMSON_SLAB).stairs(VERTICAL_CRIMSON_STAIR);
        VerticalWarped.slab(VERTICAL_WARPED_SLAB).stairs(VERTICAL_WARPED_STAIR);
        VerticalMangrove.slab(VERTICAL_MANGROVE_SLAB).stairs(VERTICAL_MANGROVE_STAIR);
        VerticalBamboo.slab(VERTICAL_BAMBOO_SLAB).stairs(VERTICAL_BAMBOO_STAIR);
        VerticalCherry.slab(VERTICAL_CHERRY_SLAB).stairs(VERTICAL_CHERRY_STAIR);

        MosaicOak.slab(OAK_MOSAIC_SLABS).stairs(OAK_MOSAIC_STAIRS);
        MosaicBirch.slab(BIRCH_MOSAIC_SLABS).stairs(BIRCH_MOSAIC_STAIRS);
        MosaicSpruce.slab(SPRUCE_MOSAIC_SLABS).stairs(SPRUCE_MOSAIC_STAIRS);
        MosaicDarkOak.slab(DARK_OAK_MOSAIC_SLABS).stairs(DARK_OAK_MOSAIC_STAIRS);
        MosaicJungle.slab(JUNGLE_MOSAIC_SLABS).stairs(JUNGLE_MOSAIC_STAIRS);
        MosaicAcacia.slab(ACACIA_MOSAIC_SLABS).stairs(ACACIA_MOSAIC_STAIRS);
        MosaicCrimson.slab(CRIMSON_MOSAIC_SLABS).stairs(CRIMSON_MOSAIC_STAIRS);
        MosaicWarped.slab(WARPED_MOSAIC_SLABS).stairs(WARPED_MOSAIC_STAIRS);
        MosaicMangrove.slab(MANGROVE_MOSAIC_SLABS).stairs(MANGROVE_MOSAIC_STAIRS);
        MosaicCherry.slab(CHERRY_MOSAIC_SLABS).stairs(CHERRY_MOSAIC_STAIRS);

        ChippedPlankOak.slab(CHIPPED_OAK_SLAB).stairs(CHIPPED_OAK_STAIR);
        ChippedPlankBirch.slab(CHIPPED_BIRCH_SLAB).stairs(CHIPPED_BIRCH_STAIR);
        ChippedPlankSpruce.slab(CHIPPED_SPRUCE_SLAB).stairs(CHIPPED_SPRUCE_STAIR);
        ChippedPlankDarkOak.slab(CHIPPED_DARK_OAK_SLAB).stairs(CHIPPED_DARK_OAK_STAIR);
        ChippedPlankJungle.slab(CHIPPED_JUNGLE_SLAB).stairs(CHIPPED_JUNGLE_STAIR);
        ChippedPlankAcacia.slab(CHIPPED_ACACIA_SLAB).stairs(CHIPPED_ACACIA_STAIR);
        ChippedPlankCrimson.slab(CHIPPED_CRIMSON_SLAB).stairs(CHIPPED_CRIMSON_STAIR);
        ChippedPlankWarped.slab(CHIPPED_WARPED_SLAB).stairs(CHIPPED_WARPED_STAIR);
        ChippedPlankMangrove.slab(CHIPPED_MANGROVE_SLAB).stairs(CHIPPED_MANGROVE_STAIR);
        ChippedPlankBamboo.slab(CHIPPED_BAMBOO_SLAB).stairs(CHIPPED_BAMBOO_STAIR);
        ChippedPlankCherry.slab(CHIPPED_CHERRY_SLAB).stairs(CHIPPED_CHERRY_STAIR);

        TilesOak.slab(OAK_TILES_SLABS).stairs(OAK_TILES_STAIRS);
        TilesBirch.slab(BIRCH_TILES_SLABS).stairs(BIRCH_TILES_STAIRS);
        TilesSpruce.slab(SPRUCE_TILES_SLABS).stairs(SPRUCE_TILES_STAIRS);
        TilesDarkOak.slab(DARK_OAK_TILES_SLABS).stairs(DARK_OAK_TILES_STAIRS);
        TilesJungle.slab(JUNGLE_TILES_SLABS).stairs(JUNGLE_TILES_STAIRS);
        TilesAcacia.slab(ACACIA_TILES_SLABS).stairs(ACACIA_TILES_STAIRS);
        TilesCrimson.slab(CRIMSON_TILES_SLABS).stairs(CRIMSON_TILES_STAIRS);
        TilesWarped.slab(WARPED_TILES_SLABS).stairs(WARPED_TILES_STAIRS);
        TilesMangrove.slab(MANGROVE_TILES_SLABS).stairs(MANGROVE_TILES_STAIRS);
        TilesBamboo.slab(BAMBOO_TILES_SLABS).stairs(BAMBOO_TILES_STAIRS);
        TilesCherry.slab(CHERRY_TILES_SLABS).stairs(CHERRY_TILES_STAIRS);

        BoardsOak.slab(OAK_TIMBERS_SLABS).stairs(OAK_TIMBERS_STAIRS);
        BoardsBirch.slab(BIRCH_TIMBERS_SLABS).stairs(BIRCH_TIMBERS_STAIRS);
        BoardsSpruce.slab(SPRUCE_TIMBERS_SLABS).stairs(SPRUCE_TIMBERS_STAIRS);
        BoardsDarkOak.slab(DARK_OAK_TIMBERS_SLABS).stairs(DARK_OAK_TIMBERS_STAIRS);
        BoardsJungle.slab(JUNGLE_TIMBERS_SLABS).stairs(JUNGLE_TIMBERS_STAIRS);
        BoardsAcacia.slab(ACACIA_TIMBERS_SLABS).stairs(ACACIA_TIMBERS_STAIRS);
        BoardsCrimson.slab(CRIMSON_TIMBERS_SLABS).stairs(CRIMSON_TIMBERS_STAIRS);
        BoardsWarped.slab(WARPED_TIMBERS_SLABS).stairs(WARPED_TIMBERS_STAIRS);
        BoardsMangrove.slab(MANGROVE_TIMBERS_SLABS).stairs(MANGROVE_TIMBERS_STAIRS);
        BoardsBamboo.slab(BAMBOO_TIMBERS_SLABS).stairs(BAMBOO_TIMBERS_STAIRS);
        BoardsCherry.slab(CHERRY_TIMBERS_SLABS).stairs(CHERRY_TIMBERS_STAIRS);

        GlazedOak.slab(GLAZED_OAK_SLABS).stairs(GLAZED_OAK_STAIRS);
        GlazedBirch.slab(GLAZED_BIRCH_SLABS).stairs(GLAZED_BIRCH_STAIRS);
        GlazedSpruce.slab(GLAZED_SPRUCE_SLABS).stairs(GLAZED_SPRUCE_STAIRS);
        GlazedDarkOak.slab(GLAZED_DARK_OAK_SLABS).stairs(GLAZED_DARK_OAK_STAIRS);
        GlazedJungle.slab(GLAZED_JUNGLE_SLABS).stairs(GLAZED_JUNGLE_STAIRS);
        GlazedAcacia.slab(GLAZED_ACACIA_SLABS).stairs(GLAZED_ACACIA_STAIRS);
        GlazedCrimson.slab(GLAZED_CRIMSON_SLABS).stairs(GLAZED_CRIMSON_STAIRS);
        GlazedWarped.slab(GLAZED_WARPED_SLABS).stairs(GLAZED_WARPED_STAIRS);
        GlazedMangrove.slab(GLAZED_MANGROVE_SLABS).stairs(GLAZED_MANGROVE_STAIRS);
        GlazedBamboo.slab(GLAZED_BAMBOO_SLABS).stairs(GLAZED_BAMBOO_STAIRS);
        GlazedCherry.slab(GLAZED_CHERRY_SLABS).stairs(GLAZED_CHERRY_STAIRS);

        //(Chiseled planks)
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_OAK);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_BIRCH);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_SPRUCE);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_DARK_OAK);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_JUNGLE);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_ACACIA);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_CRIMSON);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_WARPED);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_MANGROVE);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_BAMBOO);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_CHERRY);

        //(Storage Blocks)
        blockStateModelGenerator.registerSimpleCubeAll(BLOCK_OF_STICKS);
        blockStateModelGenerator.registerSimpleCubeAll(BLOCK_OF_CHARCOAL);
        blockStateModelGenerator.registerWallPlant(AZALEA_FLOWERS);

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
        blockStateModelGenerator.registerGlassPane(AZALEA_FRAME, AZALEA_LINTELS);
        blockStateModelGenerator.registerGlassPane(BLOOMING_AZALEA_FRAME, BLOOMING_AZALEA_LINTELS);


        /*
        *Barricades
        */

        //Other stuff

        //(Woodsets: Cactus)
        ///Logs stuff
        Cactus.log(CACTUS_BUNDLE).wood(CACTUS_CROWN);
        EngravedCactus.log(ENGRAVED_CACTUS).wood(ENGRAVED_CACTUS_CROWN);
        PlankPillarCactus.log(CACTUS_PLANK_PILLARS).wood(CACTUS_PLANK_BOX);
        BeamCactus.log(CACTUS_BEAM);
        ///Redstone component
        blockStateModelGenerator.registerDoor(CACTUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(CACTUS_TRAPDOOR);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_CACTUS);
        ///Plank related
        cactusTexturePool.slab(CACTUS_SLAB).stairs(CACTUS_STAIRS).fence(CACTUS_FENCE).fenceGate(CACTUS_FENCE_GATE).button(CACTUS_BUTTON).pressurePlate(CACTUS_PRESSURE_PLATE);
        cactusVerticalTexturePool.slab(VERTICAL_CACTUS_SLAB).stairs(VERTICAL_CACTUS_STAIR);
        cactusMosaicTexturePool.slab(CACTUS_MOSAIC_SLABS).stairs(CACTUS_MOSAIC_STAIRS);
        ChippedPlankCactus.slab(CHIPPED_CACTUS_SLAB).stairs(CHIPPED_CACTUS_STAIR);
        TilesCactus.slab(CACTUS_TILES_SLABS).stairs(CACTUS_TILES_STAIRS);
        BoardsCactus.slab(CACTUS_TIMBERS_SLABS).stairs(CACTUS_TIMBERS_STAIRS);
        GlazedCactus.slab(GLAZED_CACTUS_SLABS).stairs(GLAZED_CACTUS_STAIRS);

        //(Woodsets: Azalea)
        ///Logs stuff
        ///Redstone component
        ///Plank related
        Azalea.log(AZALEA_LOG);
        BloomingAzalea.log(BLOOMING_AZALEA_LOG);
        StrippedAzalea.log(STRIPPED_AZALEA_LOG);
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
        TilesAzalea.slab(AZALEA_TILES_SLABS);
        TilesAzalea.stairs(AZALEA_TILES_STAIRS);
        TilesBloomingAzalea.slab(BLOOMING_AZALEA_TILES_SLABS);
        TilesBloomingAzalea.stairs(BLOOMING_AZALEA_TILES_STAIRS);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_AZALEA);
        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_BLOOMING_AZALEA);
        PlankPillarAzalea.log(AZALEA_PLANK_PILLARS).wood(AZALEA_PLANK_BOX);
        PlankPillarBloomingAzalea.log(BLOOMING_AZALEA_PLANK_PILLARS).wood(BLOOMING_AZALEA_PLANK_BOX);
        GlazedAzalea.slab(GLAZED_AZALEA_SLABS).stairs(GLAZED_AZALEA_STAIRS);

        ///Misc
        blockStateModelGenerator.registerSimpleState(EMPTY_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_BIRCH_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_SPRUCE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_JUNGLE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_ACACIA_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_CRIMSON_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_WARPED_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_MANGROVE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_BAMBOO_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_CHERRY_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_CACTUS_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(EMPTY_AZALEA_BOOKSHELF);

        blockStateModelGenerator.registerSimpleState(ABANDONED_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_BIRCH_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_SPRUCE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_JUNGLE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_ACACIA_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_CRIMSON_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_WARPED_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_MANGROVE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_BAMBOO_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_CHERRY_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_CACTUS_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(ABANDONED_AZALEA_BOOKSHELF);

        blockStateModelGenerator.registerSimpleState(COBWEBBED_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_BIRCH_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_SPRUCE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_JUNGLE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_ACACIA_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_CRIMSON_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_WARPED_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_MANGROVE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_BAMBOO_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_CHERRY_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_CACTUS_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_AZALEA_BOOKSHELF);

        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_BIRCH_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_SPRUCE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_JUNGLE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_ACACIA_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_CRIMSON_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_WARPED_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_MANGROVE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_BAMBOO_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_CHERRY_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_CACTUS_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(COBWEBBED_EMPTY_AZALEA_BOOKSHELF);

        blockStateModelGenerator.registerSimpleState(PAPER_BLOCK);
        blockStateModelGenerator.registerSimpleState(SOAKED_PAPER_BLOCK);
        blockStateModelGenerator.registerSimpleState(STRIPPED_CACTUS);

        blockStateModelGenerator.registerSimpleState(DISSOLVED_BAMBOO_CAULDRON_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(PAPER_MESH_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ACORN, Models.GENERATED);
        itemModelGenerator.register(POPPED_ACORN, Models.GENERATED);
        itemModelGenerator.register(POPACORN_BOWL, Models.GENERATED);
        itemModelGenerator.register(POPACORN_BOWL_HALF, Models.GENERATED);
        itemModelGenerator.register(POPACORN_BOWL_QUATER, Models.GENERATED);

        //barks
        itemModelGenerator.register(OAK_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(BIRCH_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(SPRUCE_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(DARK_OAK_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(JUNGLE_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(ACACIA_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(CRIMSON_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(WARPED_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(MANGROVE_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(BAMBOO_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(CHERRY_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(CACTUS_SAWDUST, Models.GENERATED);
        itemModelGenerator.register(AZALEA_SAWDUST, Models.GENERATED);

        //Misc
        itemModelGenerator.register(PAPER_MESH_BUCKET, Models.GENERATED);
    }
}
