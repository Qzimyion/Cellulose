package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.qzimyion.cellulose.Cellulose;

import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.data.models.BlockModelGenerators.createSimpleBlock;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

public class CelluloseModelProvider extends FabricModelProvider {
    public CelluloseModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    //Custom blockstates
    public final void registerSingleton(BlockModelGenerators blockStateModelGenerator, Block block, ResourceLocation modelIdentifier) {
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, modelIdentifier));
    }

    public static void registerBookshelf(Block bookshelf, Block plank, BlockModelGenerators blockStateModelGenerator) {
        TextureMapping textureMap = TextureMapping.column(TextureMapping.getBlockTexture(bookshelf), TextureMapping.getBlockTexture(plank));
        ResourceLocation identifier = ModelTemplates.CUBE_COLUMN.create(bookshelf, textureMap, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(bookshelf, identifier));
    }

    public static void registerPesudoPillarBlocks(Block side, BlockModelGenerators blockStateModelGenerator){
        TextureMapping textureMap = TextureMapping.column(TextureMapping.getBlockTexture(side), TextureMapping.getBlockTexture(side,"_top"));
        ResourceLocation identifier = ModelTemplates.CUBE_COLUMN.create(side, textureMap, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(side, identifier));
    }

    //Thanks to Leafenzo for helping me out on this
    public final void registerHollowLog(BlockModelGenerators blockStateModelGenerator, Block block) {
        ResourceLocation identifier = new ResourceLocation(Cellulose.MOD_ID, "block/hollow_log");
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createAxisAlignedPillarBlock(block, identifier));
    }

    public final void registerLogPosts(BlockModelGenerators blockStateModelGenerator, Block block) {
        ResourceLocation identifier = new ResourceLocation(Cellulose.MOD_ID, "block/post_block");
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createAxisAlignedPillarBlock(block, identifier));
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        
        //Texturepool (Block)
        BlockModelGenerators.BlockFamilyProvider cactusTexturePool = blockStateModelGenerator.family(CACTUS_PLANKS);
        BlockModelGenerators.BlockFamilyProvider cactusVerticalTexturePool = blockStateModelGenerator.family(VERTICAL_CACTUS_PLANKS);

        BlockModelGenerators.BlockFamilyProvider VerticalOak = blockStateModelGenerator.family(VERTICAL_OAK_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalBirch = blockStateModelGenerator.family(VERTICAL_BIRCH_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalSpruce = blockStateModelGenerator.family(VERTICAL_SPRUCE_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalDarkOak = blockStateModelGenerator.family(VERTICAL_DARK_OAK_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalJungle = blockStateModelGenerator.family(VERTICAL_JUNGLE_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalAcacia = blockStateModelGenerator.family(VERTICAL_ACACIA_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalCrimson = blockStateModelGenerator.family(VERTICAL_CRIMSON_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalWarped = blockStateModelGenerator.family(VERTICAL_WARPED_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalMangrove = blockStateModelGenerator.family(VERTICAL_MANGROVE_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalBamboo = blockStateModelGenerator.family(VERTICAL_BAMBOO_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalCherry = blockStateModelGenerator.family(VERTICAL_CHERRY_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalAzalea = blockStateModelGenerator.family(VERTICAL_AZALEA_PLANKS);
        BlockModelGenerators.BlockFamilyProvider VerticalBloomingAzalea = blockStateModelGenerator.family(VERTICAL_BLOOMING_AZALEA_PLANKS);

        BlockModelGenerators.BlockFamilyProvider MosaicOak = blockStateModelGenerator.family(OAK_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicBirch = blockStateModelGenerator.family(BIRCH_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicSpruce = blockStateModelGenerator.family(SPRUCE_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicDarkOak = blockStateModelGenerator.family(DARK_OAK_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicJungle = blockStateModelGenerator.family(JUNGLE_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicAcacia = blockStateModelGenerator.family(ACACIA_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicCrimson = blockStateModelGenerator.family(CRIMSON_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicWarped = blockStateModelGenerator.family(WARPED_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicMangrove = blockStateModelGenerator.family(MANGROVE_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicCherry = blockStateModelGenerator.family(CHERRY_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider cactusMosaicTexturePool = blockStateModelGenerator.family(CACTUS_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicAzalea = blockStateModelGenerator.family(AZALEA_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider MosaicBloomingAzalea = blockStateModelGenerator.family(BLOOMING_AZALEA_MOSAIC);

        BlockModelGenerators.BlockFamilyProvider ChippedPlankOak = blockStateModelGenerator.family(CHIPPED_OAK_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankBirch = blockStateModelGenerator.family(CHIPPED_BIRCH_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankSpruce = blockStateModelGenerator.family(CHIPPED_SPRUCE_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankDarkOak = blockStateModelGenerator.family(CHIPPED_DARK_OAK_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankJungle = blockStateModelGenerator.family(CHIPPED_JUNGLE_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankAcacia = blockStateModelGenerator.family(CHIPPED_ACACIA_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankCrimson = blockStateModelGenerator.family(CHIPPED_CRIMSON_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankWarped = blockStateModelGenerator.family(CHIPPED_WARPED_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankMangrove = blockStateModelGenerator.family(CHIPPED_MANGROVE_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankBamboo = blockStateModelGenerator.family(CHIPPED_BAMBOO_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankCherry = blockStateModelGenerator.family(CHIPPED_CHERRY_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankCactus = blockStateModelGenerator.family(CHIPPED_CACTUS_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankAzalea = blockStateModelGenerator.family(CHIPPED_AZALEA_PLANKS);
        BlockModelGenerators.BlockFamilyProvider ChippedPlankBloomingAzalea = blockStateModelGenerator.family(CHIPPED_BLOOMING_AZALEA_PLANKS);

        BlockModelGenerators.BlockFamilyProvider TilesOak = blockStateModelGenerator.family(OAK_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesBirch = blockStateModelGenerator.family(BIRCH_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesSpruce = blockStateModelGenerator.family(SPRUCE_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesDarkOak = blockStateModelGenerator.family(DARK_OAK_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesJungle = blockStateModelGenerator.family(JUNGLE_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesAcacia = blockStateModelGenerator.family(ACACIA_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesCrimson = blockStateModelGenerator.family(CRIMSON_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesWarped = blockStateModelGenerator.family(WARPED_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesMangrove = blockStateModelGenerator.family(MANGROVE_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesBamboo = blockStateModelGenerator.family(BAMBOO_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesCherry = blockStateModelGenerator.family(CHERRY_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesCactus = blockStateModelGenerator.family(CACTUS_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesAzalea = blockStateModelGenerator.family(AZALEA_TILES);
        BlockModelGenerators.BlockFamilyProvider TilesBloomingAzalea = blockStateModelGenerator.family(BLOOMING_AZALEA_TILES);


        BlockModelGenerators.BlockFamilyProvider BoardsOak = blockStateModelGenerator.family(OAK_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsBirch = blockStateModelGenerator.family(BIRCH_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsSpruce = blockStateModelGenerator.family(SPRUCE_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsDarkOak = blockStateModelGenerator.family(DARK_OAK_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsJungle = blockStateModelGenerator.family(JUNGLE_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsAcacia = blockStateModelGenerator.family(ACACIA_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsCrimson = blockStateModelGenerator.family(CRIMSON_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsWarped = blockStateModelGenerator.family(WARPED_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsMangrove = blockStateModelGenerator.family(MANGROVE_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsBamboo = blockStateModelGenerator.family(BAMBOO_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsCherry = blockStateModelGenerator.family(CHERRY_TIMBERS);
        BlockModelGenerators.BlockFamilyProvider BoardsCactus = blockStateModelGenerator.family(CACTUS_TIMBERS);

        BlockModelGenerators.BlockFamilyProvider GlazedOak = blockStateModelGenerator.family(OAK_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedBirch = blockStateModelGenerator.family(BIRCH_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedSpruce = blockStateModelGenerator.family(SPRUCE_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedDarkOak = blockStateModelGenerator.family(DARK_OAK_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedJungle = blockStateModelGenerator.family(JUNGLE_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedAcacia = blockStateModelGenerator.family(ACACIA_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedCrimson = blockStateModelGenerator.family(CRIMSON_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedWarped = blockStateModelGenerator.family(WARPED_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedMangrove = blockStateModelGenerator.family(MANGROVE_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedBamboo = blockStateModelGenerator.family(BAMBOO_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedCherry = blockStateModelGenerator.family(CHERRY_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedCactus = blockStateModelGenerator.family(CACTUS_GLAZED);
        BlockModelGenerators.BlockFamilyProvider GlazedAzalea = blockStateModelGenerator.family(AZALEA_GLAZED);

        //Texturepool (PillarBlocks)
        BlockModelGenerators.WoodProvider ChippedOak = blockStateModelGenerator.woodProvider(CHIPPED_OAK);
        BlockModelGenerators.WoodProvider ChippedBirch = blockStateModelGenerator.woodProvider(CHIPPED_BIRCH);
        BlockModelGenerators.WoodProvider ChippedSpruce = blockStateModelGenerator.woodProvider(CHIPPED_SPRUCE);
        BlockModelGenerators.WoodProvider ChippedDarkOak = blockStateModelGenerator.woodProvider(CHIPPED_DARK_OAK);
        BlockModelGenerators.WoodProvider ChippedJungle = blockStateModelGenerator.woodProvider(CHIPPED_JUNGLE);
        BlockModelGenerators.WoodProvider ChippedAcacia = blockStateModelGenerator.woodProvider(CHIPPED_ACACIA);
        BlockModelGenerators.WoodProvider ChippedCrimson = blockStateModelGenerator.woodProvider(CHIPPED_CRIMSON);
        BlockModelGenerators.WoodProvider ChippedWarped = blockStateModelGenerator.woodProvider(CHIPPED_WARPED);
        BlockModelGenerators.WoodProvider ChippedMangrove = blockStateModelGenerator.woodProvider(CHIPPED_MANGROVE);
        BlockModelGenerators.WoodProvider ChippedBamboo = blockStateModelGenerator.woodProvider(CHIPPED_BAMBOO_BLOCK);
        BlockModelGenerators.WoodProvider ChippedStrippedBamboo = blockStateModelGenerator.woodProvider(CHIPPED_STRIPPED_BAMBOO_BLOCK);
        BlockModelGenerators.WoodProvider ChippedCherry = blockStateModelGenerator.woodProvider(CHIPPED_CHERRY);
        BlockModelGenerators.WoodProvider ChippedAzalea = blockStateModelGenerator.woodProvider(CHIPPED_AZALEA);

        BlockModelGenerators.WoodProvider StrippedChippedOak = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_OAK);
        BlockModelGenerators.WoodProvider StrippedChippedBirch = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_BIRCH);
        BlockModelGenerators.WoodProvider StrippedChippedSpruce = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_SPRUCE);
        BlockModelGenerators.WoodProvider StrippedChippedDarkOak = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_DARK_OAK);
        BlockModelGenerators.WoodProvider StrippedChippedJungle = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_JUNGLE);
        BlockModelGenerators.WoodProvider StrippedChippedAcacia = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_ACACIA);
        BlockModelGenerators.WoodProvider StrippedChippedCrimson = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_CRIMSON);
        BlockModelGenerators.WoodProvider StrippedChippedWarped = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_WARPED);
        BlockModelGenerators.WoodProvider StrippedChippedMangrove = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_MANGROVE);
        BlockModelGenerators.WoodProvider StrippedChippedCherry = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_CHERRY);
        BlockModelGenerators.WoodProvider StrippedChippedAzalea = blockStateModelGenerator.woodProvider(STRIPPED_CHIPPED_AZALEA);


        BlockModelGenerators.WoodProvider EngravedOak = blockStateModelGenerator.woodProvider(ENGRAVED_OAK);
        BlockModelGenerators.WoodProvider EngravedBirch = blockStateModelGenerator.woodProvider(ENGRAVED_BIRCH);
        BlockModelGenerators.WoodProvider EngravedSpruce = blockStateModelGenerator.woodProvider(ENGRAVED_SPRUCE);
        BlockModelGenerators.WoodProvider EngravedDarkOak = blockStateModelGenerator.woodProvider(ENGRAVED_DARK_OAK);
        BlockModelGenerators.WoodProvider EngravedJungle = blockStateModelGenerator.woodProvider(ENGRAVED_JUNGLE);
        BlockModelGenerators.WoodProvider EngravedAcacia = blockStateModelGenerator.woodProvider(ENGRAVED_ACACIA);
        BlockModelGenerators.WoodProvider EngravedCrimson = blockStateModelGenerator.woodProvider(ENGRAVED_CRIMSON);
        BlockModelGenerators.WoodProvider EngravedWarped = blockStateModelGenerator.woodProvider(ENGRAVED_WARPED);
        BlockModelGenerators.WoodProvider EngravedMangrove = blockStateModelGenerator.woodProvider(ENGRAVED_MANGROVE);
        BlockModelGenerators.WoodProvider EngravedBamboo = blockStateModelGenerator.woodProvider(ENGRAVED_BAMBOO);
        BlockModelGenerators.WoodProvider EngravedCherry = blockStateModelGenerator.woodProvider(ENGRAVED_CHERRY);
        BlockModelGenerators.WoodProvider EngravedCactus = blockStateModelGenerator.woodProvider(ENGRAVED_CACTUS);
        BlockModelGenerators.WoodProvider EngravedAzalea = blockStateModelGenerator.woodProvider(ENGRAVED_AZALEA);

        BlockModelGenerators.WoodProvider PlankPillarOak = blockStateModelGenerator.woodProvider(OAK_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarBirch = blockStateModelGenerator.woodProvider(BIRCH_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarSpruce = blockStateModelGenerator.woodProvider(SPRUCE_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarDarkOak = blockStateModelGenerator.woodProvider(DARK_OAK_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarJungle = blockStateModelGenerator.woodProvider(JUNGLE_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarAcacia = blockStateModelGenerator.woodProvider(ACACIA_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarCrimson = blockStateModelGenerator.woodProvider(CRIMSON_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarWarped = blockStateModelGenerator.woodProvider(WARPED_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarMangrove = blockStateModelGenerator.woodProvider(MANGROVE_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarBamboo = blockStateModelGenerator.woodProvider(BAMBOO_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarCherry = blockStateModelGenerator.woodProvider(CHERRY_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarCactus = blockStateModelGenerator.woodProvider(CACTUS_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarAzalea = blockStateModelGenerator.woodProvider(AZALEA_PLANK_PILLARS);
        BlockModelGenerators.WoodProvider PlankPillarBloomingAzalea = blockStateModelGenerator.woodProvider(BLOOMING_AZALEA_PLANK_PILLARS);

        /*
        BlockStateModelGenerator.LogTexturePool BeamOak = blockStateModelGenerator.registerLog(OAK_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamBirch = blockStateModelGenerator.registerLog(BIRCH_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamSpruce = blockStateModelGenerator.registerLog(SPRUCE_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamDarkOak = blockStateModelGenerator.registerLog(DARK_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamJungle = blockStateModelGenerator.registerLog(JUNGLE_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamAcacia = blockStateModelGenerator.registerLog(ACACIA_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamCrimson = blockStateModelGenerator.registerLog(CRIMSON_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamWarped = blockStateModelGenerator.registerLog(WARPED_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamMangrove = blockStateModelGenerator.registerLog(MANGROVE_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamBamboo = blockStateModelGenerator.registerLog(BAMBOO_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamCherry = blockStateModelGenerator.registerLog(CHERRY_LOG_MOSAIC);
        BlockStateModelGenerator.LogTexturePool BeamCactus = blockStateModelGenerator.registerLog(CACTUS_LOG_MOSAIC);
         */

        /*
        Woodsets
         */

        //Cactus Wood
        BlockModelGenerators.WoodProvider Cactus = blockStateModelGenerator.woodProvider(CACTUS_BUNDLE);

        //Azalea Wood
        BlockModelGenerators.WoodProvider Azalea = blockStateModelGenerator.woodProvider(AZALEA_LOG);
        BlockModelGenerators.WoodProvider StrippedAzalea = blockStateModelGenerator.woodProvider(STRIPPED_AZALEA_LOG);
        BlockModelGenerators.WoodProvider BloomingAzalea = blockStateModelGenerator.woodProvider(BLOOMING_AZALEA_LOG);
        BlockModelGenerators.WoodProvider BloomingEngravedAzalea = blockStateModelGenerator.woodProvider(ENGRAVED_BLOOMING_AZALEA);
        BlockModelGenerators.WoodProvider BloomingStrippedAzalea = blockStateModelGenerator.woodProvider(BLOOMING_STRIPPED_AZALEA_LOG);
        BlockModelGenerators.BlockFamilyProvider AzaleaPlanks = blockStateModelGenerator.family(AZALEA_PLANKS);
        BlockModelGenerators.BlockFamilyProvider BloomingAzaleaPlanks = blockStateModelGenerator.family(BLOOMING_AZALEA_PLANKS);

        /*
        Misc stuff
         */


        //Red Mushroom wood

        //Brown Mushroom wood

        /*
        Actual additions:-
         */


        //(Engraved)
        EngravedOak.logWithHorizontal(ENGRAVED_OAK).wood(ENGRAVED_OAK_WOOD);
        EngravedBirch.logWithHorizontal(ENGRAVED_BIRCH).wood(ENGRAVED_BIRCH_WOOD);
        EngravedSpruce.logWithHorizontal(ENGRAVED_SPRUCE).wood(ENGRAVED_SPRUCE_WOOD);
        EngravedDarkOak.logWithHorizontal(ENGRAVED_DARK_OAK).wood(ENGRAVED_DARK_OAK_WOOD);
        EngravedJungle.logWithHorizontal(ENGRAVED_JUNGLE).wood(ENGRAVED_JUNGLE_WOOD);
        EngravedAcacia.logWithHorizontal(ENGRAVED_ACACIA).wood(ENGRAVED_ACACIA_WOOD);
        EngravedCrimson.logWithHorizontal(ENGRAVED_CRIMSON).wood(ENGRAVED_CRIMSON_HYPHAE);
        EngravedWarped.logWithHorizontal(ENGRAVED_WARPED).wood(ENGRAVED_WARPED_HYPHAE);
        EngravedMangrove.logWithHorizontal(ENGRAVED_MANGROVE).wood(ENGRAVED_MANGROVE_WOOD);
        EngravedBamboo.logWithHorizontal(ENGRAVED_BAMBOO).wood(ENGRAVED_BAMBOO_BLOCK);
        EngravedCherry.logWithHorizontal(ENGRAVED_CHERRY).wood(ENGRAVED_CHERRY_WOOD);
        //(Chipped)
        ChippedOak.logWithHorizontal(CHIPPED_OAK).wood(CHIPPED_OAK_WOOD);
        ChippedBirch.logWithHorizontal(CHIPPED_BIRCH).wood(CHIPPED_BIRCH_WOOD);
        ChippedSpruce.logWithHorizontal(CHIPPED_SPRUCE).wood(CHIPPED_SPRUCE_WOOD);
        ChippedDarkOak.logWithHorizontal(CHIPPED_DARK_OAK).wood(CHIPPED_DARK_OAK_WOOD);
        ChippedJungle.logWithHorizontal(CHIPPED_JUNGLE).wood(CHIPPED_JUNGLE_WOOD);
        ChippedAcacia.logWithHorizontal(CHIPPED_ACACIA).wood(CHIPPED_ACACIA_WOOD);
        ChippedCrimson.logWithHorizontal(CHIPPED_CRIMSON).wood(CHIPPED_CRIMSON_HYPHAE);
        ChippedWarped.logWithHorizontal(CHIPPED_WARPED).wood(CHIPPED_WARPED_HYPHAE);
        ChippedMangrove.logWithHorizontal(CHIPPED_MANGROVE).wood(CHIPPED_MANGROVE_WOOD);
        ChippedBamboo.logWithHorizontal(CHIPPED_BAMBOO_BLOCK);
        ChippedStrippedBamboo.logWithHorizontal(CHIPPED_STRIPPED_BAMBOO_BLOCK);
        ChippedCherry.logWithHorizontal(CHIPPED_CHERRY).wood(CHIPPED_CHERRY_WOOD);
        //(Stripped_Chipped)
        StrippedChippedOak.logWithHorizontal(STRIPPED_CHIPPED_OAK).wood(STRIPPED_CHIPPED_OAK_WOOD);
        StrippedChippedBirch.logWithHorizontal(STRIPPED_CHIPPED_BIRCH).wood(STRIPPED_CHIPPED_BIRCH_WOOD);
        StrippedChippedSpruce.logWithHorizontal(STRIPPED_CHIPPED_SPRUCE).wood(STRIPPED_CHIPPED_SPRUCE_WOOD);
        StrippedChippedDarkOak.logWithHorizontal(STRIPPED_CHIPPED_DARK_OAK).wood(STRIPPED_CHIPPED_DARK_OAK_WOOD);
        StrippedChippedJungle.logWithHorizontal(STRIPPED_CHIPPED_JUNGLE).wood(STRIPPED_CHIPPED_JUNGLE_WOOD);
        StrippedChippedAcacia.logWithHorizontal(STRIPPED_CHIPPED_ACACIA).wood(STRIPPED_CHIPPED_ACACIA_WOOD);
        StrippedChippedCrimson.logWithHorizontal(STRIPPED_CHIPPED_CRIMSON).wood(STRIPPED_CHIPPED_CRIMSON_HYPHAE);
        StrippedChippedWarped.logWithHorizontal(STRIPPED_CHIPPED_WARPED).wood(STRIPPED_CHIPPED_WARPED_HYPHAE);
        StrippedChippedMangrove.logWithHorizontal(STRIPPED_CHIPPED_MANGROVE).wood(STRIPPED_CHIPPED_MANGROVE_WOOD);
        StrippedChippedCherry.logWithHorizontal(STRIPPED_CHIPPED_CHERRY).wood(STRIPPED_CHIPPED_CHERRY_WOOD);
        //Plank pillars
        PlankPillarOak.logWithHorizontal(OAK_PLANK_PILLARS).wood(OAK_PLANK_BOX);
        PlankPillarBirch.logWithHorizontal(BIRCH_PLANK_PILLARS).wood(BIRCH_PLANK_BOX);
        PlankPillarSpruce.logWithHorizontal(SPRUCE_PLANK_PILLARS).wood(SPRUCE_PLANK_BOX);
        PlankPillarDarkOak.logWithHorizontal(DARK_OAK_PLANK_PILLARS).wood(DARK_OAK_PLANK_BOX);
        PlankPillarJungle.logWithHorizontal(JUNGLE_PLANK_PILLARS).wood(JUNGLE_PLANK_BOX);
        PlankPillarAcacia.logWithHorizontal(ACACIA_PLANK_PILLARS).wood(ACACIA_PLANK_BOX);
        PlankPillarCrimson.logWithHorizontal(CRIMSON_PLANK_PILLARS).wood(CRIMSON_PLANK_BOX);
        PlankPillarWarped.logWithHorizontal(WARPED_PLANK_PILLARS).wood(WARPED_PLANK_BOX);
        PlankPillarMangrove.logWithHorizontal(MANGROVE_PLANK_PILLARS).wood(MANGROVE_PLANK_BOX);
        PlankPillarBamboo.logWithHorizontal(BAMBOO_PLANK_PILLARS).wood(BAMBOO_PLANK_BOX);
        PlankPillarCherry.logWithHorizontal(CHERRY_PLANK_PILLARS).wood(CHERRY_PLANK_BOX);

        //Beam


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

        ChippedPlankOak.slab(CHIPPED_OAK_SLAB).stairs(CHIPPED_OAK_STAIRS);
        ChippedPlankBirch.slab(CHIPPED_BIRCH_SLAB).stairs(CHIPPED_BIRCH_STAIRS);
        ChippedPlankSpruce.slab(CHIPPED_SPRUCE_SLAB).stairs(CHIPPED_SPRUCE_STAIRS);
        ChippedPlankDarkOak.slab(CHIPPED_DARK_OAK_SLAB).stairs(CHIPPED_DARK_OAK_STAIRS);
        ChippedPlankJungle.slab(CHIPPED_JUNGLE_SLAB).stairs(CHIPPED_JUNGLE_STAIRS);
        ChippedPlankAcacia.slab(CHIPPED_ACACIA_SLAB).stairs(CHIPPED_ACACIA_STAIRS);
        ChippedPlankCrimson.slab(CHIPPED_CRIMSON_SLAB).stairs(CHIPPED_CRIMSON_STAIRS);
        ChippedPlankWarped.slab(CHIPPED_WARPED_SLAB).stairs(CHIPPED_WARPED_STAIRS);
        ChippedPlankMangrove.slab(CHIPPED_MANGROVE_SLAB).stairs(CHIPPED_MANGROVE_STAIRS);
        ChippedPlankBamboo.slab(CHIPPED_BAMBOO_SLAB).stairs(CHIPPED_BAMBOO_STAIRS);
        ChippedPlankCherry.slab(CHIPPED_CHERRY_SLAB).stairs(CHIPPED_CHERRY_STAIRS);

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
        blockStateModelGenerator.createTrivialCube(CHISELED_OAK);
        blockStateModelGenerator.createTrivialCube(CHISELED_BIRCH);
        blockStateModelGenerator.createTrivialCube(CHISELED_SPRUCE);
        blockStateModelGenerator.createTrivialCube(CHISELED_DARK_OAK);
        blockStateModelGenerator.createTrivialCube(CHISELED_JUNGLE);
        blockStateModelGenerator.createTrivialCube(CHISELED_ACACIA);
        blockStateModelGenerator.createTrivialCube(CHISELED_CRIMSON);
        blockStateModelGenerator.createTrivialCube(CHISELED_WARPED);
        blockStateModelGenerator.createTrivialCube(CHISELED_MANGROVE);
        blockStateModelGenerator.createTrivialCube(CHISELED_BAMBOO);
        blockStateModelGenerator.createTrivialCube(CHISELED_CHERRY);

        //(Storage Blocks)

        blockStateModelGenerator.createMultiface(AZALEA_FLOWERS);

        //Panes
        blockStateModelGenerator.createGlassBlocks(OAK_FRAME, OAK_LINTELS);
        blockStateModelGenerator.createGlassBlocks(BIRCH_FRAME, BIRCH_LINTELS);
        blockStateModelGenerator.createGlassBlocks(SPRUCE_FRAME, SPRUCE_LINTELS);
        blockStateModelGenerator.createGlassBlocks(DARK_OAK_FRAME, DARK_OAK_LINTELS);
        blockStateModelGenerator.createGlassBlocks(JUNGLE_FRAME, JUNGLE_LINTELS);
        blockStateModelGenerator.createGlassBlocks(ACACIA_FRAME, ACACIA_LINTELS);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_FRAME, CRIMSON_LINTELS);
        blockStateModelGenerator.createGlassBlocks(WARPED_FRAME, WARPED_LINTELS);
        blockStateModelGenerator.createGlassBlocks(MANGROVE_FRAME, MANGROVE_LINTELS);
        blockStateModelGenerator.createGlassBlocks(BAMBOO_FRAME, BAMBOO_LINTELS);
        blockStateModelGenerator.createGlassBlocks(CHERRY_FRAME, CHERRY_LINTELS);
        blockStateModelGenerator.createGlassBlocks(CACTUS_FRAME, CACTUS_LINTELS);
        blockStateModelGenerator.createGlassBlocks(AZALEA_FRAME, AZALEA_LINTELS);
        blockStateModelGenerator.createGlassBlocks(BLOOMING_AZALEA_FRAME, BLOOMING_AZALEA_LINTELS);


        /*
        *Barricades
        */

        //Other stuff

        //(Woodsets: Cactus)
        ///Logs stuff
        Cactus.logWithHorizontal(CACTUS_BUNDLE).wood(CACTUS_CROWN);
        EngravedCactus.logWithHorizontal(ENGRAVED_CACTUS).wood(ENGRAVED_CACTUS_CROWN);
        PlankPillarCactus.logWithHorizontal(CACTUS_PLANK_PILLARS).wood(CACTUS_PLANK_BOX);
        ///Redstone component
        blockStateModelGenerator.createDoor(CACTUS_DOOR);
        blockStateModelGenerator.createTrapdoor(CACTUS_TRAPDOOR);
        blockStateModelGenerator.createTrivialCube(CHISELED_CACTUS);
        ///Plank related
        cactusTexturePool.slab(CACTUS_SLAB).stairs(CACTUS_STAIRS).fence(CACTUS_FENCE).fenceGate(CACTUS_FENCE_GATE).button(CACTUS_BUTTON).pressurePlate(CACTUS_PRESSURE_PLATE);
        cactusVerticalTexturePool.slab(VERTICAL_CACTUS_SLAB).stairs(VERTICAL_CACTUS_STAIR);
        cactusMosaicTexturePool.slab(CACTUS_MOSAIC_SLABS).stairs(CACTUS_MOSAIC_STAIRS);
        ChippedPlankCactus.slab(CHIPPED_CACTUS_SLAB).stairs(CHIPPED_CACTUS_STAIRS);
        TilesCactus.slab(CACTUS_TILES_SLABS).stairs(CACTUS_TILES_STAIRS);
        BoardsCactus.slab(CACTUS_TIMBERS_SLABS).stairs(CACTUS_TIMBERS_STAIRS);
        GlazedCactus.slab(GLAZED_CACTUS_SLABS).stairs(GLAZED_CACTUS_STAIRS);


        //(Woodsets: Azalea)
        ///Logs stuff
        Azalea.logWithHorizontal(AZALEA_LOG);
        BloomingAzalea.logWithHorizontal(BLOOMING_AZALEA_LOG);
        StrippedAzalea.logWithHorizontal(STRIPPED_AZALEA_LOG);
        BloomingStrippedAzalea.logWithHorizontal(BLOOMING_STRIPPED_AZALEA_LOG);
        EngravedAzalea.logWithHorizontal(ENGRAVED_AZALEA);
        EngravedAzalea.wood(ENGRAVED_AZALEA_WOOD);
        ChippedAzalea.logWithHorizontal(CHIPPED_AZALEA);
        ChippedAzalea.wood(CHIPPED_AZALEA_WOOD);
        Azalea.wood(AZALEA_WOOD);
        BloomingAzalea.wood(BLOOMING_AZALEA_WOOD);
        StrippedAzalea.wood(STRIPPED_AZALEA_WOOD);
        BloomingStrippedAzalea.wood(BLOOMING_STRIPPED_AZALEA_WOOD);
        ///Redstone component
        ///Plank related
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
        blockStateModelGenerator.createDoor(AZALEA_DOOR);
        blockStateModelGenerator.createDoor(BLOOMING_AZALEA_DOOR);
        blockStateModelGenerator.createTrapdoor(AZALEA_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(BLOOMING_AZALEA_TRAPDOOR);
        StrippedChippedAzalea.logWithHorizontal(STRIPPED_CHIPPED_AZALEA);
        StrippedChippedAzalea.wood(STRIPPED_CHIPPED_AZALEA_WOOD);
        ChippedPlankAzalea.slab(CHIPPED_AZALEA_SLAB);
        ChippedPlankAzalea.stairs(CHIPPED_AZALEA_STAIRS);
        ChippedPlankBloomingAzalea.slab(CHIPPED_BLOOMING_AZALEA_SLAB);
        ChippedPlankBloomingAzalea.stairs(CHIPPED_BLOOMING_AZALEA_STAIRS);
        BloomingEngravedAzalea.logWithHorizontal(ENGRAVED_BLOOMING_AZALEA);
        BloomingEngravedAzalea.wood(ENGRAVED_BLOOMING_AZALEA_WOOD);
        TilesAzalea.slab(AZALEA_TILES_SLABS);
        TilesAzalea.stairs(AZALEA_TILES_STAIRS);
        TilesBloomingAzalea.slab(BLOOMING_AZALEA_TILES_SLABS);
        TilesBloomingAzalea.stairs(BLOOMING_AZALEA_TILES_STAIRS);
        blockStateModelGenerator.createTrivialCube(CHISELED_AZALEA);
        blockStateModelGenerator.createTrivialCube(CHISELED_BLOOMING_AZALEA);
        PlankPillarAzalea.logWithHorizontal(AZALEA_PLANK_PILLARS).wood(AZALEA_PLANK_BOX);
        PlankPillarBloomingAzalea.logWithHorizontal(BLOOMING_AZALEA_PLANK_PILLARS).wood(BLOOMING_AZALEA_PLANK_BOX);
        GlazedAzalea.slab(GLAZED_AZALEA_SLABS).stairs(GLAZED_AZALEA_STAIRS);

        //Bookshelf
        registerBookshelf(BIRCH_BOOKSHELF, BIRCH_PLANKS, blockStateModelGenerator);
        registerBookshelf(SPRUCE_BOOKSHELF, SPRUCE_PLANKS, blockStateModelGenerator);
        registerBookshelf(DARK_OAK_BOOKSHELF, DARK_OAK_PLANKS, blockStateModelGenerator);
        registerBookshelf(JUNGLE_BOOKSHELF, JUNGLE_PLANKS, blockStateModelGenerator);
        registerBookshelf(ACACIA_BOOKSHELF, ACACIA_PLANKS, blockStateModelGenerator);
        registerBookshelf(CRIMSON_BOOKSHELF, CRIMSON_PLANKS, blockStateModelGenerator);
        registerBookshelf(WARPED_BOOKSHELF, WARPED_PLANKS, blockStateModelGenerator);
        registerBookshelf(MANGROVE_BOOKSHELF, MANGROVE_PLANKS, blockStateModelGenerator);
        registerBookshelf(BAMBOO_BOOKSHELF, BAMBOO_PLANKS, blockStateModelGenerator);
        registerBookshelf(CHERRY_BOOKSHELF, CHERRY_PLANKS, blockStateModelGenerator);
        registerBookshelf(CACTUS_BOOKSHELF, CACTUS_PLANKS, blockStateModelGenerator);
        registerBookshelf(AZALEA_BOOKSHELF, AZALEA_PLANKS, blockStateModelGenerator);

        registerBookshelf(EMPTY_BIRCH_BOOKSHELF, BIRCH_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_SPRUCE_BOOKSHELF, SPRUCE_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_DARK_OAK_BOOKSHELF, DARK_OAK_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_JUNGLE_BOOKSHELF, JUNGLE_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_ACACIA_BOOKSHELF, ACACIA_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_CRIMSON_BOOKSHELF, CRIMSON_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_WARPED_BOOKSHELF, WARPED_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_MANGROVE_BOOKSHELF, MANGROVE_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_BAMBOO_BOOKSHELF, BAMBOO_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_CHERRY_BOOKSHELF, CHERRY_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_CACTUS_BOOKSHELF, CACTUS_PLANKS, blockStateModelGenerator);
        registerBookshelf(EMPTY_AZALEA_BOOKSHELF, AZALEA_PLANKS, blockStateModelGenerator);

        registerBookshelf(ABANDONED_OAK_BOOKSHELF, OAK_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_BIRCH_BOOKSHELF, BIRCH_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_SPRUCE_BOOKSHELF, SPRUCE_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_DARK_OAK_BOOKSHELF, DARK_OAK_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_JUNGLE_BOOKSHELF, JUNGLE_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_ACACIA_BOOKSHELF, ACACIA_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_CRIMSON_BOOKSHELF, CRIMSON_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_WARPED_BOOKSHELF, WARPED_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_MANGROVE_BOOKSHELF, MANGROVE_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_BAMBOO_BOOKSHELF, BAMBOO_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_CHERRY_BOOKSHELF, CHERRY_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_CACTUS_BOOKSHELF, CACTUS_PLANKS, blockStateModelGenerator);
        registerBookshelf(ABANDONED_AZALEA_BOOKSHELF, AZALEA_PLANKS, blockStateModelGenerator);

        registerBookshelf(COBWEBBED_OAK_BOOKSHELF, OAK_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_BIRCH_BOOKSHELF, BIRCH_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_SPRUCE_BOOKSHELF, SPRUCE_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_DARK_OAK_BOOKSHELF, DARK_OAK_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_JUNGLE_BOOKSHELF, JUNGLE_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_ACACIA_BOOKSHELF, ACACIA_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_CRIMSON_BOOKSHELF, CRIMSON_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_WARPED_BOOKSHELF, WARPED_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_MANGROVE_BOOKSHELF, MANGROVE_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_BAMBOO_BOOKSHELF, BAMBOO_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_CHERRY_BOOKSHELF, CHERRY_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_CACTUS_BOOKSHELF, CACTUS_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_AZALEA_BOOKSHELF, AZALEA_PLANKS, blockStateModelGenerator);

        registerBookshelf(COBWEBBED_EMPTY_OAK_BOOKSHELF, OAK_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_BIRCH_BOOKSHELF, BIRCH_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_SPRUCE_BOOKSHELF, SPRUCE_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_DARK_OAK_BOOKSHELF, DARK_OAK_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_JUNGLE_BOOKSHELF, JUNGLE_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_ACACIA_BOOKSHELF, ACACIA_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_CRIMSON_BOOKSHELF, CRIMSON_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_WARPED_BOOKSHELF, WARPED_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_MANGROVE_BOOKSHELF, MANGROVE_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_BAMBOO_BOOKSHELF, BAMBOO_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_CHERRY_BOOKSHELF, CHERRY_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_CACTUS_BOOKSHELF, CACTUS_PLANKS, blockStateModelGenerator);
        registerBookshelf(COBWEBBED_EMPTY_AZALEA_BOOKSHELF, AZALEA_PLANKS, blockStateModelGenerator);

        //Misc
        blockStateModelGenerator.createNonTemplateModelBlock(PAPER_BLOCK);
        blockStateModelGenerator.createNonTemplateModelBlock(SOAKED_PAPER_BLOCK);
        blockStateModelGenerator.createNonTemplateModelBlock(STRIPPED_CACTUS);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        //Sawdust
        itemModelGenerator.generateFlatItem(OAK_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BIRCH_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(SPRUCE_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DARK_OAK_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(JUNGLE_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ACACIA_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CRIMSON_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(WARPED_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MANGROVE_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BAMBOO_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CHERRY_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CACTUS_BARK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AZALEA_BARK, ModelTemplates.FLAT_ITEM);

        //Misc
    }
}
