package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

import static net.minecraft.block.Blocks.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

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

        BlockStateModelGenerator.BlockTexturePool CharredPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(CHARRED_PLANKS);
        BlockStateModelGenerator.BlockTexturePool CharredBambooPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(CHARRED_BAMBOO_PLANKS);

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
        BlockStateModelGenerator.LogTexturePool ChippedCherry = blockStateModelGenerator.registerLog(CHIPPED_CHERRY);
        BlockStateModelGenerator.LogTexturePool ChippedCactus = blockStateModelGenerator.registerLog(CHIPPED_CACTUS);

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

        //Cactus
        BlockStateModelGenerator.LogTexturePool Cactus = blockStateModelGenerator.registerLog(CACTUS_BUNDLE);
        BlockStateModelGenerator.LogTexturePool StrippedCactus = blockStateModelGenerator.registerLog(STRIPPED_CACTUS);
        //Charred
        BlockStateModelGenerator.LogTexturePool CharredOakLog = blockStateModelGenerator.registerLog(CHARRED_OAK_LOG);
        BlockStateModelGenerator.LogTexturePool CharredBirchLog = blockStateModelGenerator.registerLog(CHARRED_BIRCH_LOG);
        BlockStateModelGenerator.LogTexturePool CharredJungleLog = blockStateModelGenerator.registerLog(CHARRED_JUNGLE_LOG);
        BlockStateModelGenerator.LogTexturePool CharredMangroveLog = blockStateModelGenerator.registerLog(CHARRED_MANGROVE_LOG);
        BlockStateModelGenerator.LogTexturePool CharredBambooBlock = blockStateModelGenerator.registerLog(CHARRED_BAMBOO);
        BlockStateModelGenerator.LogTexturePool CharredCherryLog = blockStateModelGenerator.registerLog(CHARRED_CHERRY_LOG);
        BlockStateModelGenerator.LogTexturePool CharredCactusLog = blockStateModelGenerator.registerLog(CHARRED_CACTUS_BUNDLE);

        BlockStateModelGenerator.LogTexturePool CharredStrippedOakLog = blockStateModelGenerator.registerLog(STRIPPED_CHARRED_OAK_LOG);
        BlockStateModelGenerator.LogTexturePool CharredStrippedJungleLog = blockStateModelGenerator.registerLog(STRIPPED_CHARRED_JUNGLE_LOG);
        BlockStateModelGenerator.LogTexturePool CharredStrippedCactusLog = blockStateModelGenerator.registerLog(STRIPPED_CHARRED_CACTUS);
        //Azalea

        //Red Shroom

        //Brown Shroom

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
        EngravedCactus.log(ENGRAVED_CACTUS);
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
        ChippedCherry.log(CHIPPED_CHERRY);
        ChippedCactus.log(CHIPPED_CACTUS);
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
        PlankPillarCactus.log(CACTUS_PLANK_PILLARS);
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
        VerticalPlankPillarCactus.log(VERTICAL_CACTUS_PLANK_PILLARS);
        //(Woodsets: Cactus)
        Cactus.log(CACTUS_BUNDLE);
        StrippedCactus.log(STRIPPED_CACTUS);
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
        EngravedCactus.wood(ENGRAVED_CACTUS_CROWN);
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
        ChippedCherry.wood(CHIPPED_CHERRY_WOOD);
        ChippedCactus.wood(CHIPPED_CACTUS_CROWN);
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
        BeamCactus.wood(CACTUS_BEAM);
        //(Woodsets: Cactus)
        Cactus.wood(CACTUS_CROWN);
        StrippedCactus.wood(STRIPPED_CACTUS_CROWN);



        //Slabs
        VerticalOak.slab(VERTICAL_OAK_PLANKS_SLABS);
        VerticalBirch.slab(VERTICAL_BIRCH_PLANKS_SLABS);
        VerticalSpruce.slab(VERTICAL_SPRUCE_PLANKS_SLABS);
        VerticalDarkOak.slab(VERTICAL_DARK_OAK_PLANKS_SLABS);
        VerticalJungle.slab(VERTICAL_JUNGLE_PLANKS_SLABS);
        VerticalAcacia.slab(VERTICAL_ACACIA_PLANKS_SLABS);
        VerticalCrimson.slab(VERTICAL_CRIMSON_PLANKS_SLABS);
        VerticalWarped.slab(VERTICAL_WARPED_PLANKS_SLABS);
        VerticalMangrove.slab(VERTICAL_MANGROVE_PLANKS_SLABS);
        VerticalBamboo.slab(VERTICAL_BAMBOO_PLANKS_SLABS);
        VerticalCherry.slab(VERTICAL_CHERRY_PLANKS_SLABS);

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

        ChippedPlankOak.slab(CHIPPED_OAK_PLANKS_SLABS);
        ChippedPlankBirch.slab(CHIPPED_BIRCH_PLANKS_SLABS);
        ChippedPlankSpruce.slab(CHIPPED_SPRUCE_PLANKS_SLABS);
        ChippedPlankDarkOak.slab(CHIPPED_DARK_OAK_PLANKS_SLABS);
        ChippedPlankJungle.slab(CHIPPED_JUNGLE_PLANKS_SLABS);
        ChippedPlankAcacia.slab(CHIPPED_ACACIA_PLANKS_SLABS);
        ChippedPlankCrimson.slab(CHIPPED_CRIMSON_PLANKS_SLABS);
        ChippedPlankWarped.slab(CHIPPED_WARPED_PLANKS_SLABS);
        ChippedPlankMangrove.slab(CHIPPED_MANGROVE_PLANKS_SLABS);
        ChippedPlankBamboo.slab(CHIPPED_BAMBOO_PLANKS_SLABS);
        ChippedPlankCherry.slab(CHIPPED_CHERRY_PLANKS_SLABS);
        ChippedPlankCactus.slab(CHIPPED_CACTUS_PLANKS_SLABS);

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
        TilesCactus.slab(CACTUS_TILES_SLABS);

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
        BoardsCactus.slab(CACTUS_BOARDS_SLABS);

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
        GlazedCactus.slab(GLAZED_CACTUS_SLABS);

        cactusTexturePool.slab(CACTUS_SLABS);
        cactusVerticalTexturePool.slab(VERTICAL_CACTUS_PLANKS_SLABS);
        cactusMosaicTexturePool.slab(CACTUS_MOSAIC_SLABS);



        //Stairs
        VerticalOak.stairs(VERTICAL_OAK_PLANKS_STAIRS);
        VerticalBirch.stairs(VERTICAL_BIRCH_PLANKS_STAIRS);
        VerticalSpruce.stairs(VERTICAL_SPRUCE_PLANKS_STAIRS);
        VerticalDarkOak.stairs(VERTICAL_DARK_OAK_PLANKS_STAIRS);
        VerticalJungle.stairs(VERTICAL_JUNGLE_PLANKS_STAIRS);
        VerticalAcacia.stairs(VERTICAL_ACACIA_PLANKS_STAIRS);
        VerticalCrimson.stairs(VERTICAL_CRIMSON_PLANKS_STAIRS);
        VerticalWarped.stairs(VERTICAL_WARPED_PLANKS_STAIRS);
        VerticalMangrove.stairs(VERTICAL_MANGROVE_PLANKS_STAIRS);
        VerticalBamboo.stairs(VERTICAL_BAMBOO_PLANKS_STAIRS);
        VerticalCherry.stairs(VERTICAL_CHERRY_PLANKS_STAIRS);

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

        ChippedPlankBirch.stairs(CHIPPED_BIRCH_PLANKS_STAIRS);
        ChippedPlankSpruce.stairs(CHIPPED_SPRUCE_PLANKS_STAIRS);
        ChippedPlankDarkOak.stairs(CHIPPED_DARK_OAK_PLANKS_STAIRS);
        ChippedPlankJungle.stairs(CHIPPED_JUNGLE_PLANKS_STAIRS);
        ChippedPlankAcacia.stairs(CHIPPED_ACACIA_PLANKS_STAIRS);
        ChippedPlankCrimson.stairs(CHIPPED_CRIMSON_PLANKS_STAIRS);
        ChippedPlankWarped.stairs(CHIPPED_WARPED_PLANKS_STAIRS);
        ChippedPlankMangrove.stairs(CHIPPED_MANGROVE_PLANKS_STAIRS);
        ChippedPlankBamboo.stairs(CHIPPED_BAMBOO_PLANKS_STAIRS);
        ChippedPlankCherry.stairs(CHIPPED_CHERRY_PLANKS_STAIRS);

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
        TilesCactus.stairs(CACTUS_TILES_STAIRS);

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
        BoardsCactus.stairs(CACTUS_BOARDS_STAIRS);

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
        GlazedCactus.stairs(GLAZED_CACTUS_STAIRS);

        cactusTexturePool.stairs(CACTUS_STAIRS);
        cactusVerticalTexturePool.stairs(VERTICAL_CACTUS_PLANKS_STAIRS);
        cactusMosaicTexturePool.stairs(CACTUS_MOSAIC_STAIRS);

        //Fence and Fence-Gates
        cactusTexturePool.fence(CACTUS_FENCE);
        cactusTexturePool.fenceGate(CACTUS_FENCE_GATE);

        //Button
        cactusTexturePool.button(CACTUS_BUTTON);

        //P.Plate
        cactusTexturePool.pressurePlate(CACTUS_PRESSURE_PLATE);

        //Blocks
        //(Plank Pavement)
        blockStateModelGenerator.registerSimpleCubeAll(OAK_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(BIRCH_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(SPRUCE_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(DARK_OAK_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(JUNGLE_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(ACACIA_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(CRIMSON_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(WARPED_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(MANGROVE_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(BAMBOO_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(CHERRY_PLANK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(CACTUS_PLANK_PAVEMENT);
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
        blockStateModelGenerator.registerSimpleCubeAll(CACTUS_CARVED);
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
        blockStateModelGenerator.registerSimpleCubeAll(CARPENTED_CACTUS);
        //(Storage Blocks)
        blockStateModelGenerator.registerSimpleCubeAll(BLOCK_OF_STICKS);
        blockStateModelGenerator.registerSimpleCubeAll(BLOCK_OF_CHARCOAL);

        //Door
        blockStateModelGenerator.registerDoor(CACTUS_DOOR);
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
        blockStateModelGenerator.registerTrapdoor(CACTUS_TRAPDOOR);
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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {

    }
}
