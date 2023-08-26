package net.qzimyion.cellulose.blocks;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.impl.TerraformBoatTypeImpl;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

import static net.minecraft.block.Blocks.*;

public class CelluloseBlocks
{
    //This section adds Vertical Planks
    public static final Block VERTICAL_OAK_PLANKS = registerBlock("vertical_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANKS = registerBlock("vertical_birch_planks", new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic", new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANKS = registerBlock("vertical_spruce_planks", new Block(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANKS = registerBlock("vertical_dark_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANKS = registerBlock("vertical_jungle_planks", new Block(FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANKS = registerBlock("vertical_acacia_planks", new Block(FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_MANGROVE_PLANKS = registerBlock("vertical_mangrove_planks", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANKS = registerBlock("vertical_bamboo_planks", new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANKS = registerBlock("vertical_cherry_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANKS = registerBlock("vertical_crimson_planks", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS).burnable()));
    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block VERTICAL_WARPED_PLANKS = registerBlock("vertical_warped_planks", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS).burnable()));
    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block VERTICAL_CACTUS_PLANKS = registerBlock("vertical_cactus_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_MOSAIC = registerBlock("cactus_mosaic", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));

    //For Frame and Lintel blocks
    public static final Block OAK_FRAME = registerBlock("oak_frame", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block OAK_LINTELS = registerBlock("oak_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block BIRCH_FRAME = registerBlock("birch_frame", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block BIRCH_LINTELS = registerBlock("birch_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block SPRUCE_FRAME = registerBlock("spruce_frame", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block SPRUCE_LINTELS = registerBlock("spruce_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));



    //This section adds stairs
    /*Vertical plank stairs*/
    public static final Block VERTICAL_OAK_PLANKS_STAIRS = registerBlock("vertical_oak_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANKS_STAIRS = registerBlock("vertical_birch_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_BIRCH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANKS_STAIRS = registerBlock("vertical_spruce_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_SPRUCE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANKS_STAIRS = registerBlock("vertical_dark_oak_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_DARK_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANKS_STAIRS = registerBlock("vertical_jungle_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_JUNGLE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANKS_STAIRS = registerBlock("vertical_acacia_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_ACACIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANKS_STAIRS = registerBlock("vertical_crimson_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_CRIMSON_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CRIMSON_PLANKS).burnable()));
    public static final Block VERTICAL_WARPED_PLANKS_STAIRS = registerBlock("vertical_warped_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_WARPED_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(WARPED_PLANKS).burnable()));
    public static final Block VERTICAL_MANGROVE_PLANKS_STAIRS = registerBlock("vertical_mangrove_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_MANGROVE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANKS_STAIRS = registerBlock("vertical_bamboo_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_BAMBOO_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANKS_STAIRS = registerBlock("vertical_cherry_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_CACTUS_PLANKS_STAIRS = registerBlock("vertical_cactus_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_CACTUS_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));

    /* Mosaic stairs*/
    public static final Block OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs", new StairsBlock(CelluloseBlocks.OAK_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs", new StairsBlock(CelluloseBlocks.BIRCH_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs", new StairsBlock(CelluloseBlocks.SPRUCE_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs", new StairsBlock(CelluloseBlocks.JUNGLE_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs", new StairsBlock(CelluloseBlocks.DARK_OAK_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs", new StairsBlock(CelluloseBlocks.ACACIA_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs", new StairsBlock(CelluloseBlocks.CRIMSON_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs", new StairsBlock(CelluloseBlocks.WARPED_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs", new StairsBlock(CelluloseBlocks.MANGROVE_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs", new StairsBlock(CelluloseBlocks.CHERRY_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_MOSAIC_STAIRS = registerBlock("cactus_mosaic_stairs", new StairsBlock(CelluloseBlocks.CACTUS_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));


    //This section adds slabs
    /*Vertical plank slabs*/
    public static final Block VERTICAL_OAK_PLANKS_SLABS = registerBlock("vertical_oak_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANKS_SLABS = registerBlock("vertical_birch_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANKS_SLABS = registerBlock("vertical_spruce_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(SPRUCE_SLAB)));
    public static final Block VERTICAL_JUNGLE_PLANKS_SLABS = registerBlock("vertical_jungle_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(JUNGLE_SLAB)));
    public static final Block VERTICAL_DARK_OAK_PLANKS_SLABS = registerBlock("vertical_dark_oak_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(DARK_OAK_SLAB)));
    public static final Block VERTICAL_ACACIA_PLANKS_SLABS = registerBlock("vertical_acacia_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(ACACIA_SLAB)));
    public static final Block VERTICAL_CRIMSON_PLANKS_SLABS = registerBlock("vertical_crimson_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(CRIMSON_SLAB)));
    public static final Block VERTICAL_WARPED_PLANKS_SLABS = registerBlock("vertical_warped_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(WARPED_SLAB)));
    public static final Block VERTICAL_MANGROVE_PLANKS_SLABS = registerBlock("vertical_mangrove_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(MANGROVE_SLAB)));
    public static final Block VERTICAL_BAMBOO_PLANKS_SLABS = registerBlock("vertical_bamboo_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(BAMBOO_SLAB)));
    public static final Block VERTICAL_CHERRY_PLANKS_SLABS = registerBlock("vertical_cherry_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));
    public static final Block VERTICAL_CACTUS_PLANKS_SLABS = registerBlock("vertical_cactus_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));

    /* Mosaic slabs*/
    public static final Block OAK_MOSAIC_SLABS = registerBlock("oak_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_MOSAIC_SLABS = registerBlock("birch_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block SPRUCE_MOSAIC_SLABS = registerBlock("spruce_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block JUNGLE_MOSAIC_SLABS = registerBlock("jungle_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block DARK_OAK_MOSAIC_SLABS = registerBlock("dark_oak_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block ACACIA_MOSAIC_SLABS = registerBlock("acacia_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block CRIMSON_MOSAIC_SLABS = registerBlock("crimson_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_MOSAIC_SLABS = registerBlock("warped_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_MOSAIC_SLABS = registerBlock("mangrove_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block CHERRY_MOSAIC_SLABS = registerBlock("cherry_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_MOSAIC_SLABS = registerBlock("cactus_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));


    // Sawmill Block //

    public static final Block SAWMILL = registerBlock("sawmill", new SawmillBlock(AbstractBlock.Settings.create().burnable().nonOpaque().strength(2.5f,2.5f).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).mapColor(MapColor.BROWN)));

    // Engraved log (Idea by Amaro from C&C project and Textures by Raze#3510 on Discord)

    public static final Block ENGRAVED_OAK = registerBlock("engraved_oak_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_OAK_WOOD = registerBlock("engraved_oak_wood", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_BIRCH = registerBlock("engraved_birch_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_BIRCH_WOOD = registerBlock("engraved_birch_wood", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_SPRUCE = registerBlock("engraved_spruce_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_SPRUCE_WOOD = registerBlock("engraved_spruce_wood", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_DARK_OAK = registerBlock("engraved_dark_oak_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_DARK_OAK_WOOD = registerBlock("engraved_dark_oak_wood", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_JUNGLE = registerBlock("engraved_jungle_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_JUNGLE_WOOD = registerBlock("engraved_jungle_wood", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_ACACIA = registerBlock("engraved_acacia_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_ACACIA_WOOD = registerBlock("engraved_acacia_wood", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_CRIMSON = registerBlock("engraved_crimson_stem", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CRIMSON_STEM)));
    public static final Block ENGRAVED_CRIMSON_HYPHAE = registerBlock("engraved_crimson_hyphae", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CRIMSON_HYPHAE)));
    public static final Block ENGRAVED_WARPED = registerBlock("engraved_warped_stem", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_WARPED_STEM)));
    public static final Block ENGRAVED_WARPED_HYPHAE = registerBlock("engraved_warped_hyphae", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_WARPED_HYPHAE)));
    public static final Block ENGRAVED_MANGROVE = registerBlock("engraved_mangrove_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_MANGROVE_LOG)));
    public static final Block ENGRAVED_MANGROVE_WOOD = registerBlock("engraved_mangrove_wood",new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_MANGROVE_WOOD)));
    public static final Block ENGRAVED_CHERRY = registerBlock("engraved_cherry_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG)));
    public static final Block ENGRAVED_CHERRY_WOOD = registerBlock("engraved_cherry_wood",new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_WOOD)));
    public static final Block ENGRAVED_CACTUS = registerBlock("engraved_cactus", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG)));
    public static final Block ENGRAVED_CACTUS_CROWN = registerBlock("engraved_cactus_crown", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG)));

    //Chipped wood

    public static final Block CHIPPED_OAK = registerBlock("chipped_oak_log", new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block CHIPPED_OAK_WOOD = registerBlock("chipped_oak_wood", new PillarBlock(FabricBlockSettings.copyOf(OAK_WOOD)));
    public static final Block CHIPPED_BIRCH = registerBlock("chipped_birch_log", new PillarBlock(FabricBlockSettings.copyOf(BIRCH_LOG)));
    public static final Block CHIPPED_BIRCH_WOOD = registerBlock("chipped_birch_wood", new PillarBlock(FabricBlockSettings.copyOf(BIRCH_WOOD)));
    public static final Block CHIPPED_SPRUCE = registerBlock("chipped_spruce_log", new PillarBlock(FabricBlockSettings.copyOf(SPRUCE_LOG)));
    public static final Block CHIPPED_SPRUCE_WOOD = registerBlock("chipped_spruce_wood", new PillarBlock(FabricBlockSettings.copyOf(SPRUCE_WOOD)));
    public static final Block CHIPPED_DARK_OAK = registerBlock("chipped_dark_oak_log", new PillarBlock(FabricBlockSettings.copyOf(DARK_OAK_LOG)));
    public static final Block CHIPPED_DARK_OAK_WOOD = registerBlock("chipped_dark_oak_wood", new PillarBlock(FabricBlockSettings.copyOf(DARK_OAK_WOOD)));
    public static final Block CHIPPED_JUNGLE = registerBlock("chipped_jungle_log", new PillarBlock(FabricBlockSettings.copyOf(JUNGLE_LOG)));
    public static final Block CHIPPED_JUNGLE_WOOD = registerBlock("chipped_jungle_wood", new PillarBlock(FabricBlockSettings.copyOf(JUNGLE_WOOD)));
    public static final Block CHIPPED_ACACIA = registerBlock("chipped_acacia_log", new PillarBlock(FabricBlockSettings.copyOf(ACACIA_LOG)));
    public static final Block CHIPPED_ACACIA_WOOD = registerBlock("chipped_acacia_wood", new PillarBlock(FabricBlockSettings.copyOf(ACACIA_WOOD)));
    public static final Block CHIPPED_CRIMSON = registerBlock("chipped_crimson_log", new PillarBlock(FabricBlockSettings.copyOf(CRIMSON_STEM)));
    public static final Block CHIPPED_CRIMSON_HYPHAE = registerBlock("chipped_crimson_hyphae", new PillarBlock(FabricBlockSettings.copyOf(CRIMSON_HYPHAE)));
    public static final Block CHIPPED_WARPED = registerBlock("chipped_warped_log", new PillarBlock(FabricBlockSettings.copyOf(WARPED_STEM)));
    public static final Block CHIPPED_WARPED_HYPHAE = registerBlock("chipped_warped_hyphae", new PillarBlock(FabricBlockSettings.copyOf(WARPED_HYPHAE)));
    public static final Block CHIPPED_MANGROVE = registerBlock("chipped_mangrove_log", new PillarBlock(FabricBlockSettings.copyOf(MANGROVE_LOG)));
    public static final Block CHIPPED_MANGROVE_WOOD = registerBlock("chipped_mangrove_wood", new PillarBlock(FabricBlockSettings.copyOf(MANGROVE_WOOD)));
    public static final Block CHIPPED_BAMBOO = registerBlock("chipped_bamboo_log", new PillarBlock(FabricBlockSettings.copyOf(BAMBOO_BLOCK)));
    public static final Block CHIPPED_BAMBOO_WOOD = registerBlock("chipped_bamboo_wood", new PillarBlock(FabricBlockSettings.copyOf(BAMBOO_BLOCK)));
    public static final Block CHIPPED_CHERRY = registerBlock("chipped_cherry_log", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_LOG)));
    public static final Block CHIPPED_CHERRY_WOOD = registerBlock("chipped__wood", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_WOOD)));
    public static final Block CHIPPED_CACTUS = registerBlock("chipped_cactus_log", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_LOG).sounds(BlockSoundGroup.WOOL)));
    public static final Block CHIPPED_CACTUS_WOOD = registerBlock("chipped_cactus_wood", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_WOOD).sounds(BlockSoundGroup.WOOL)));

    //Barricades
    public static final Block OAK_BARRICADES = registerBlock("oak_barricade", new WallBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_BARRICADES = registerBlock("birch_barricade", new WallBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_BARRICADES = registerBlock("spruce_barricade", new WallBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_BARRICADES = registerBlock("dark_oak_barricade", new WallBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_BARRICADES = registerBlock("jungle_oak_barricade", new WallBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_BARRICADES = registerBlock("acacia_barricade", new WallBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));

    //Carpented wood
    public static final Block OAK_CARPENTED_BLOCK = registerBlock("carpented_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_CARPENTED_BLOCK = registerBlock("carpented_birch", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_CARPENTED_BLOCK = registerBlock("carpented_spruce", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_CARPENTED_BLOCK = registerBlock("carpented_dark_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_CARPENTED_BLOCK = registerBlock("carpented_jungle_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_CARPENTED_BLOCK = registerBlock("carpented_acacia", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));

    //Plank pillars
    public static final Block OAK_PLANK_PILLARS = registerBlock("oak_plank_pillars", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_PLANK_PILLARS = registerBlock("birch_plank_pillars", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_PLANK_PILLARS = registerBlock("spruce_plank_pillars", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_PLANK_PILLARS = registerBlock("dark_oak_plank_pillars", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_PLANK_PILLARS = registerBlock("jungle_oak_plank_pillars", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_PLANK_PILLARS = registerBlock("acacia_plank_pillars", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));

    //Plank beams
    public static final Block OAK_PLANK_BEAM = registerBlock("oak_plank_beam", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_PLANK_BEAM = registerBlock("birch_plank_beam", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_PLANK_BEAM = registerBlock("spruce_plank_beam", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_PLANK_BEAM = registerBlock("dark_oak_plank_beam", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_PLANK_BEAM = registerBlock("jungle_oak_plank_beam", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_PLANK_BEAM = registerBlock("acacia_plank_beam", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));

    //Log Beams
    public static final Block OAK_LOG_BEAM = registerBlock("oak_plank_log", new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block BIRCH_LOG_BEAM = registerBlock("birch_plank_log", new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block SPRUCE_LOG_BEAM = registerBlock("spruce_plank_log", new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block DARK_OAK_LOG_BEAM = registerBlock("dark_oak_plank_log", new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block JUNGLE_LOG_BEAM = registerBlock("jungle_oak_plank_log", new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block ACACIA_LOG_BEAM = registerBlock("acacia_plank_log", new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG)));

    //Glazed Wood
    public static final Block OAK_GLAZED = registerBlock("glazed_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_GLAZED = registerBlock("glazed_birch", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_GLAZED = registerBlock("glazed_spruce", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_GLAZED = registerBlock("glazed_dark_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_GLAZED = registerBlock("glazed_jungle_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_GLAZED = registerBlock("glazed_acacia", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));

    //Carved wood
    public static final Block OAK_CARVED = registerBlock("carved_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_CARVED = registerBlock("carved_birch", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_CARVED = registerBlock("carved_spruce", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_CARVED = registerBlock("carved_dark_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_CARVED = registerBlock("carved_jungle_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_CARVED = registerBlock("carved_acacia", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));

    //Log slabs and stairs
    /*Non-Stripped*/
    public static final Block OAK_LOG_SLABS = registerBlock("oak_log_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block OAK_LOG_STAIRS = registerBlock("oak_log_stairs", new StairsBlock(OAK_LOG.getDefaultState(), FabricBlockSettings.copyOf(OAK_SLAB)));

    /*Stripped*/
    public static final Block STRIPPED_OAK_LOG_SLABS = registerBlock("stripped_oak_log_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block STRIPPED_OAK_LOG_STAIRS = registerBlock("stripped_oak_log_stairs", new StairsBlock(STRIPPED_OAK_LOG.getDefaultState(), FabricBlockSettings.copyOf(OAK_SLAB)));


    //Cactus Woodset
    public static final Block CACTUS_BUNDLE = registerBlock("cactus_bundle", new CactusPillar(FabricBlockSettings.create().burnable().mapColor(MapColor.DARK_GREEN).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.5f)));
    public static final Block CACTUS_CROWN = registerBlock("cactus_crown", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_LOG).sounds(BlockSoundGroup.WOOL)));
    public static final Block STRIPPED_CACTUS = registerBlock("stripped_cactus", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG).sounds(BlockSoundGroup.WOOL)));
    public static final Block STRIPPED_CACTUS_CROWN = registerBlock("stripped_cactus_crown", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG).sounds(BlockSoundGroup.WOOL)));
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_SLABS = registerBlock("cactus_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));
    public static final Block CACTUS_STAIRS = registerBlock("cactus_planks_stairs", new StairsBlock(CelluloseBlocks.CACTUS_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_FENCE = registerBlock("cactus_fence", new FenceBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_FENCE_GATE = registerBlock("cactus_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS), WoodType.CHERRY));
    public static final Block CACTUS_BUTTON = registerBlock("cactus_button", new ButtonBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS), BlockSetType.CHERRY, 5, true));
    public static final Block CACTUS_PRESSURE_PLATE = registerBlock("cactus_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(CHERRY_PLANKS), BlockSetType.CHERRY));
    public static final Block CACTUS_DOOR = registerBlock("cactus_door", new DoorBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).nonOpaque(), BlockSetType.CHERRY));
    //Overworld Shroom woodset
    /*Brown*/

    /*Red*/

    //Charred woodset
    public static final Block CHARRED_PLANKS = registerBlock("charred_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS).burnable().dropsLike(OAK_PLANKS).sounds(BlockSoundGroup.NETHERRACK).instrument(Instrument.COW_BELL)));


    private static Block registerBlock(String name, Block block){
        registeringBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Cellulose.MOD_ID, name), block);
    }

    private static void registeringBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(Cellulose.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerCelluloseBlocks()
    {
        Cellulose.LOGGER.info("Registering mod blocks for " + Cellulose.MOD_ID);
    }
}
