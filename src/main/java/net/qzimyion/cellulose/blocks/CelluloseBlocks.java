package net.qzimyion.cellulose.blocks;

import com.terraformersmc.terraform.wood.block.BareSmallLogBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.customBlocks.*;
import net.qzimyion.cellulose.blocks.customBlocks.ChisledBookshelvesStuff.*;
import net.qzimyion.cellulose.blocks.customBlocks.PannelBlocks.ShojiBlocks.ShojiBlocks;
import net.qzimyion.cellulose.blocks.customBlocks.PaperBlocks.PaperBlock;
import net.qzimyion.cellulose.blocks.customBlocks.PaperBlocks.SoakedPaperBlock;
import net.qzimyion.cellulose.worldgen.trees.saplingGenerators.PineSaplingGenerator;

import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.MapColor.*;

public class CelluloseBlocks
{
    //This section adds Vertical Planks
    public static final Block VERTICAL_OAK_PLANKS = registerBlock("vertical_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANKS = registerBlock("vertical_birch_planks", new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANKS = registerBlock("vertical_spruce_planks", new Block(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANKS = registerBlock("vertical_dark_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANKS = registerBlock("vertical_jungle_planks", new Block(FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANKS = registerBlock("vertical_acacia_planks", new Block(FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block VERTICAL_MANGROVE_PLANKS = registerBlock("vertical_mangrove_planks", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANKS = registerBlock("vertical_bamboo_planks", new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANKS = registerBlock("vertical_cherry_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANKS = registerBlock("vertical_crimson_planks", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS).burnable()));
    public static final Block VERTICAL_WARPED_PLANKS = registerBlock("vertical_warped_planks", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS).burnable()));
    public static final Block VERTICAL_CACTUS_PLANKS = registerBlock("vertical_cactus_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_AZALEA_PLANKS = registerBlock("vertical_azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block VERTICAL_BLOOMING_AZALEA_PLANKS = registerBlock("vertical_blooming_azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block VERTICAL_PINE_PLANKS = registerBlock("vertical_cedar_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS).burnable()));


    //This section adds Mosaic Blocks
    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic", new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_MOSAIC = registerBlock("cactus_mosaic", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block AZALEA_MOSAIC = registerBlock("azalea_mosaic", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block BLOOMING_AZALEA_MOSAIC = registerBlock("blooming_azalea_mosaic", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));


    //This section adds Lintel blocks
    public static final Block OAK_LINTELS = registerBlock("oak_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block BIRCH_LINTELS = registerBlock("birch_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block SPRUCE_LINTELS = registerBlock("spruce_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block DARK_OAK_LINTELS = registerBlock("dark_oak_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block JUNGLE_LINTELS = registerBlock("jungle_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block ACACIA_LINTELS = registerBlock("acacia_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block CRIMSON_LINTELS = registerBlock("crimson_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block WARPED_LINTELS = registerBlock("warped_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block MANGROVE_LINTELS = registerBlock("mangrove_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block BAMBOO_LINTELS = registerBlock("bamboo_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block CHERRY_LINTELS = registerBlock("cherry_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block CACTUS_LINTELS = registerBlock("cactus_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block AZALEA_LINTELS = registerBlock("azalea_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block BLOOMING_AZALEA_LINTELS = registerBlock("blooming_azalea_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));

    //Frames
    public static final Block OAK_FRAME = registerBlock("oak_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block BIRCH_FRAME = registerBlock("birch_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block SPRUCE_FRAME = registerBlock("spruce_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block DARK_OAK_FRAME = registerBlock("dark_oak_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block JUNGLE_FRAME = registerBlock("jungle_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block ACACIA_FRAME = registerBlock("acacia_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block CRIMSON_FRAME = registerBlock("crimson_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).sounds(BlockSoundGroup.NETHER_WOOD).nonOpaque().strength(1f,1f).burnable()));
    public static final Block WARPED_FRAME = registerBlock("warped_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).sounds(BlockSoundGroup.NETHER_WOOD).nonOpaque().strength(1f,1f).burnable()));
    public static final Block MANGROVE_FRAME = registerBlock("mangrove_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block BAMBOO_FRAME = registerBlock("bamboo_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block CHERRY_FRAME = registerBlock("cherry_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block CACTUS_FRAME = registerBlock("cactus_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block AZALEA_FRAME = registerBlock("azalea_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));
    public static final Block BLOOMING_AZALEA_FRAME = registerBlock("blooming_azalea_frame", new WaterloggableSolidBlocks(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).burnable()));


    //This section adds engraved logs and wood (Idea by Amaro from C&C project and Textures by Raze#3510 on Discord)
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
    public static final Block ENGRAVED_BAMBOO = registerBlock("engraved_bamboo", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_BAMBOO_BLOCK)));
    public static final Block ENGRAVED_BAMBOO_BLOCK = registerBlock("engraved_bamboo_block",new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_BAMBOO_BLOCK)));
    public static final Block ENGRAVED_CHERRY = registerBlock("engraved_cherry_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG)));
    public static final Block ENGRAVED_CHERRY_WOOD = registerBlock("engraved_cherry_wood",new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_WOOD)));
    public static final Block ENGRAVED_CACTUS = registerBlock("engraved_cactus", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block ENGRAVED_CACTUS_CROWN = registerBlock("engraved_cactus_crown", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block ENGRAVED_AZALEA = registerBlock("engraved_azalea_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG)));
    public static final Block ENGRAVED_AZALEA_WOOD = registerBlock("engraved_azalea_wood",new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_WOOD)));
    public static final Block ENGRAVED_BLOOMING_AZALEA = registerBlock("engraved_blooming_azalea_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG)));
    public static final Block ENGRAVED_BLOOMING_AZALEA_WOOD = registerBlock("engraved_blooming_azalea_wood",new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_WOOD)));


    //This section adds Chipped wood
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
    public static final Block CHIPPED_BAMBOO_BLOCK = registerBlock("chipped_bamboo_block", new PillarBlock(FabricBlockSettings.copyOf(BAMBOO_BLOCK)));
    public static final Block CHIPPED_BAMBOO_WOOD = registerBlock("chipped_bamboo_wood", new PillarBlock(FabricBlockSettings.copyOf(BAMBOO_BLOCK)));
    public static final Block CHIPPED_STRIPPED_BAMBOO_BLOCK = registerBlock("chipped_stripped_bamboo_block", new PillarBlock(FabricBlockSettings.copyOf(BAMBOO_BLOCK)));
    public static final Block CHIPPED_CHERRY = registerBlock("chipped_cherry_log", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_LOG)));
    public static final Block CHIPPED_CHERRY_WOOD = registerBlock("chipped__wood", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_WOOD)));
    public static final Block CHIPPED_CACTUS = registerBlock("chipped_cactus_log", new CactusPillar(FabricBlockSettings.copyOf(CHERRY_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block CHIPPED_CACTUS_CROWN = registerBlock("chipped_cactus_crown", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_WOOD).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block CHIPPED_AZALEA = registerBlock("chipped_azalea_log", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_LOG)));
    public static final Block CHIPPED_AZALEA_WOOD = registerBlock("chipped_azalea_wood", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_WOOD)));

    public static final Block STRIPPED_CHIPPED_OAK = registerBlock("stripped_chipped_oak_log", new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block STRIPPED_CHIPPED_OAK_WOOD = registerBlock("stripped_chipped_oak_wood", new PillarBlock(FabricBlockSettings.copyOf(OAK_WOOD)));
    public static final Block STRIPPED_CHIPPED_BIRCH = registerBlock("stripped_chipped_birch_log", new PillarBlock(FabricBlockSettings.copyOf(BIRCH_LOG)));
    public static final Block STRIPPED_CHIPPED_BIRCH_WOOD = registerBlock("stripped_chipped_birch_wood", new PillarBlock(FabricBlockSettings.copyOf(BIRCH_WOOD)));
    public static final Block STRIPPED_CHIPPED_SPRUCE = registerBlock("stripped_chipped_spruce_log", new PillarBlock(FabricBlockSettings.copyOf(SPRUCE_LOG)));
    public static final Block STRIPPED_CHIPPED_SPRUCE_WOOD = registerBlock("stripped_chipped_spruce_wood", new PillarBlock(FabricBlockSettings.copyOf(SPRUCE_WOOD)));
    public static final Block STRIPPED_CHIPPED_DARK_OAK = registerBlock("stripped_chipped_dark_oak_log", new PillarBlock(FabricBlockSettings.copyOf(DARK_OAK_LOG)));
    public static final Block STRIPPED_CHIPPED_DARK_OAK_WOOD = registerBlock("stripped_chipped_dark_oak_wood", new PillarBlock(FabricBlockSettings.copyOf(DARK_OAK_WOOD)));
    public static final Block STRIPPED_CHIPPED_JUNGLE = registerBlock("stripped_chipped_jungle_log", new PillarBlock(FabricBlockSettings.copyOf(JUNGLE_LOG)));
    public static final Block STRIPPED_CHIPPED_JUNGLE_WOOD = registerBlock("stripped_chipped_jungle_wood", new PillarBlock(FabricBlockSettings.copyOf(JUNGLE_WOOD)));
    public static final Block STRIPPED_CHIPPED_ACACIA = registerBlock("stripped_chipped_acacia_log", new PillarBlock(FabricBlockSettings.copyOf(ACACIA_LOG)));
    public static final Block STRIPPED_CHIPPED_ACACIA_WOOD = registerBlock("stripped_chipped_acacia_wood", new PillarBlock(FabricBlockSettings.copyOf(ACACIA_WOOD)));
    public static final Block STRIPPED_CHIPPED_CRIMSON = registerBlock("stripped_chipped_crimson_log", new PillarBlock(FabricBlockSettings.copyOf(CRIMSON_STEM)));
    public static final Block STRIPPED_CHIPPED_CRIMSON_HYPHAE = registerBlock("stripped_chipped_crimson_hyphae", new PillarBlock(FabricBlockSettings.copyOf(CRIMSON_HYPHAE)));
    public static final Block STRIPPED_CHIPPED_WARPED = registerBlock("stripped_chipped_warped_log", new PillarBlock(FabricBlockSettings.copyOf(WARPED_STEM)));
    public static final Block STRIPPED_CHIPPED_WARPED_HYPHAE = registerBlock("stripped_chipped_warped_hyphae", new PillarBlock(FabricBlockSettings.copyOf(WARPED_HYPHAE)));
    public static final Block STRIPPED_CHIPPED_MANGROVE = registerBlock("stripped_chipped_mangrove_log", new PillarBlock(FabricBlockSettings.copyOf(MANGROVE_LOG)));
    public static final Block STRIPPED_CHIPPED_MANGROVE_WOOD = registerBlock("stripped_chipped_mangrove_wood", new PillarBlock(FabricBlockSettings.copyOf(MANGROVE_WOOD)));
    public static final Block STRIPPED_CHIPPED_CHERRY = registerBlock("stripped_chipped_cherry_log", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_LOG)));
    public static final Block STRIPPED_CHIPPED_CHERRY_WOOD = registerBlock("stripped_chipped__wood", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_WOOD)));
    public static final Block STRIPPED_CHIPPED_CACTUS = registerBlock("stripped_chipped_cactus_log", new CactusPillar(FabricBlockSettings.copyOf(CHERRY_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block STRIPPED_CHIPPED_CACTUS_CROWN = registerBlock("stripped_chipped_cactus_crown", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_WOOD).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block STRIPPED_CHIPPED_AZALEA = registerBlock("stripped_chipped_azalea_log", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_LOG)));
    public static final Block STRIPPED_CHIPPED_AZALEA_WOOD = registerBlock("stripped_chipped_azalea_wood", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_WOOD)));

    /// This section adds bookshelf variants
    //Normal shelves
    //Oak bookshelf is a vanilla thing
    public static final Block BIRCH_BOOKSHELF = registerBlock("birch_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CACTUS_BOOKSHELF = registerBlock("cactus_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_BOOKSHELF = registerBlock("azalea_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BLOOMING_AZALEA_BOOKSHELF = registerBlock("blooming_azalea_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));

    //Empty shelves
    public static final Block EMPTY_OAK_BOOKSHELF = registerBlock("empty_oak_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block EMPTY_BIRCH_BOOKSHELF = registerBlock("empty_birch_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block EMPTY_SPRUCE_BOOKSHELF = registerBlock("empty_spruce_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block EMPTY_DARK_OAK_BOOKSHELF = registerBlock("empty_dark_oak_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block EMPTY_JUNGLE_BOOKSHELF = registerBlock("empty_jungle_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block EMPTY_ACACIA_BOOKSHELF = registerBlock("empty_acacia_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block EMPTY_CRIMSON_BOOKSHELF = registerBlock("empty_crimson_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block EMPTY_WARPED_BOOKSHELF = registerBlock("empty_warped_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block EMPTY_MANGROVE_BOOKSHELF = registerBlock("empty_mangrove_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block EMPTY_BAMBOO_BOOKSHELF = registerBlock("empty_bamboo_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block EMPTY_CHERRY_BOOKSHELF = registerBlock("empty_cherry_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block EMPTY_CACTUS_BOOKSHELF = registerBlock("empty_cactus_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block EMPTY_AZALEA_BOOKSHELF = registerBlock("empty_azalea_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block EMPTY_BLOOMING_AZALEA_BOOKSHELF = registerBlock("empty_blooming_azalea_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));

    //Abandoned shelves
    public static final Block ABANDONED_OAK_BOOKSHELF = registerBlock("abandoned_oak_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block ABANDONED_BIRCH_BOOKSHELF = registerBlock("abandoned_birch_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block ABANDONED_SPRUCE_BOOKSHELF = registerBlock("abandoned_spruce_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block ABANDONED_DARK_OAK_BOOKSHELF = registerBlock("abandoned_dark_oak_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block ABANDONED_JUNGLE_BOOKSHELF = registerBlock("abandoned_jungle_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block ABANDONED_ACACIA_BOOKSHELF = registerBlock("abandoned_acacia_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block ABANDONED_CRIMSON_BOOKSHELF = registerBlock("abandoned_crimson_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block ABANDONED_WARPED_BOOKSHELF = registerBlock("abandoned_warped_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block ABANDONED_MANGROVE_BOOKSHELF = registerBlock("abandoned_mangrove_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block ABANDONED_BAMBOO_BOOKSHELF = registerBlock("abandoned_bamboo_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block ABANDONED_CHERRY_BOOKSHELF = registerBlock("abandoned_cherry_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block ABANDONED_CACTUS_BOOKSHELF = registerBlock("abandoned_cactus_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block ABANDONED_AZALEA_BOOKSHELF = registerBlock("abandoned_azalea_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BLOOMING_ABANDONED_AZALEA_BOOKSHELF = registerBlock("blooming_abandoned_azalea_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));

    //Cobwebbed versions
    //Cobwebbed empty shelves
    public static final Block COBWEBBED_EMPTY_OAK_BOOKSHELF = registerBlock("cobwebbed_empty_oak_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_EMPTY_BIRCH_BOOKSHELF = registerBlock("cobwebbed_empty_birch_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_EMPTY_SPRUCE_BOOKSHELF = registerBlock("cobwebbed_empty_spruce_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_EMPTY_DARK_OAK_BOOKSHELF = registerBlock("cobwebbed_empty_dark_oak_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_EMPTY_JUNGLE_BOOKSHELF = registerBlock("cobwebbed_empty_jungle_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_EMPTY_ACACIA_BOOKSHELF = registerBlock("cobwebbed_empty_acacia_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_EMPTY_CRIMSON_BOOKSHELF = registerBlock("cobwebbed_empty_crimson_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block COBWEBBED_EMPTY_WARPED_BOOKSHELF = registerBlock("cobwebbed_empty_warped_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block COBWEBBED_EMPTY_MANGROVE_BOOKSHELF = registerBlock("cobwebbed_empty_mangrove_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_EMPTY_BAMBOO_BOOKSHELF = registerBlock("cobwebbed_empty_bamboo_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block COBWEBBED_EMPTY_CHERRY_BOOKSHELF = registerBlock("cobwebbed_empty_cherry_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block COBWEBBED_EMPTY_CACTUS_BOOKSHELF = registerBlock("cobwebbed_empty_cactus_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block COBWEBBED_EMPTY_AZALEA_BOOKSHELF = registerBlock("cobwebbed_empty_azalea_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BLOOMING_COBWEBBED_EMPTY_AZALEA_BOOKSHELF = registerBlock("blooming_cobwebbed_empty_azalea_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));

    //Cobwebbed normal shelves
    public static final Block COBWEBBED_OAK_BOOKSHELF = registerBlock("cobwebbed_oak_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_BIRCH_BOOKSHELF = registerBlock("cobwebbed_birch_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_SPRUCE_BOOKSHELF = registerBlock("cobwebbed_spruce_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_DARK_OAK_BOOKSHELF = registerBlock("cobwebbed_dark_oak_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_JUNGLE_BOOKSHELF = registerBlock("cobwebbed_jungle_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_ACACIA_BOOKSHELF = registerBlock("cobwebbed_acacia_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_CRIMSON_BOOKSHELF = registerBlock("cobwebbed_crimson_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block COBWEBBED_WARPED_BOOKSHELF = registerBlock("cobwebbed_warped_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block COBWEBBED_MANGROVE_BOOKSHELF = registerBlock("cobwebbed_mangrove_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF)));
    public static final Block COBWEBBED_BAMBOO_BOOKSHELF = registerBlock("cobwebbed_bamboo_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block COBWEBBED_CHERRY_BOOKSHELF = registerBlock("cobwebbed_cherry_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block COBWEBBED_CACTUS_BOOKSHELF = registerBlock("cobwebbed_cactus_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block COBWEBBED_AZALEA_BOOKSHELF = registerBlock("cobwebbed_azalea_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BLOOMING_COBWEBBED_AZALEA_BOOKSHELF = registerBlock("blooming_cobwebbed_azalea_bookshelf", new Block(FabricBlockSettings.copyOf(BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));

    //Panels (Version 1.1)

    //Chiseled Shonji (Version 1.1)

    //Shonji Blocks
    public static final Block OAK_SHOJI = registerBlock("oak_shoji", new ShojiBlocks(FabricBlockSettings.create().solid().strength(2.0f, 1.0f).sounds(BlockSoundGroup.SCAFFOLDING)));
    public static final Block BIRCH_SHOJI = registerBlock("birch_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI)));
    public static final Block SPRUCE_SHOJI = registerBlock("spruce_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI)));
    public static final Block DARK_OAK_SHOJI = registerBlock("dark_oak_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI)));
    public static final Block JUNGLE_SHOJI = registerBlock("jungle_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI)));
    public static final Block ACACIA_SHOJI = registerBlock("acacia_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI)));
    public static final Block CRIMSON_SHOJI = registerBlock("crimson_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_SHOJI = registerBlock("warped_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block MANGROVE_SHOJI = registerBlock("mangrove_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI)));
    public static final Block BAMBOO_SHOJI = registerBlock("bamboo_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_SHOJI = registerBlock("cherry_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CACTUS_SHOJI = registerBlock("cactus_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI)));
    public static final Block AZALEA_SHOJI = registerBlock("azalea_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI)));
    public static final Block BLOOMING_AZALEA_SHOJI = registerBlock("blooming_azalea_shoji", new ShojiBlocks(FabricBlockSettings.copyOf(OAK_SHOJI)));

    //Torch lamp (Version 1.1)

    //This section adds Plank pillar
    public static final Block OAK_PLANK_PILLARS = registerBlock("oak_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_PLANK_PILLARS = registerBlock("birch_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_PLANK_PILLARS = registerBlock("spruce_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_PLANK_PILLARS = registerBlock("dark_oak_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_PLANK_PILLARS = registerBlock("jungle_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_PLANK_PILLARS = registerBlock("acacia_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_PLANK_PILLARS = registerBlock("crimson_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_PLANK_PILLARS = registerBlock("warped_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block MANGROVE_PLANK_PILLARS = registerBlock("mangrove_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BAMBOO_PLANK_PILLARS = registerBlock("bamboo_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_PLANK_PILLARS = registerBlock("cherry_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CACTUS_PLANK_PILLARS = registerBlock("cactus_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_PLANK_PILLARS = registerBlock("azalea_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BLOOMING_AZALEA_PLANK_PILLARS = registerBlock("blooming_azalea_plank_pillar", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block OAK_PLANK_BOX = registerBlock("oak_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_PLANK_BOX = registerBlock("birch_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_PLANK_BOX = registerBlock("spruce_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_PLANK_BOX = registerBlock("dark_oak_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_PLANK_BOX = registerBlock("jungle_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_PLANK_BOX = registerBlock("acacia_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_PLANK_BOX = registerBlock("crimson_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_PLANK_BOX = registerBlock("warped_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block MANGROVE_PLANK_BOX = registerBlock("mangrove_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BAMBOO_PLANK_BOX = registerBlock("bamboo_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_PLANK_BOX = registerBlock("cherry_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CACTUS_PLANK_BOX = registerBlock("cactus_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_PLANK_BOX = registerBlock("azalea_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BLOOMING_AZALEA_PLANK_BOX = registerBlock("blooming_azalea_plank_box", new PillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));


    //This section adds Log mosaics
    public static final Block OAK_LOG_MOSAIC = registerBlock("oak_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_LOG_MOSAIC = registerBlock("birch_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_LOG_MOSAIC = registerBlock("spruce_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_LOG_MOSAIC = registerBlock("dark_oak_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_LOG_MOSAIC = registerBlock("jungle_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_LOG_MOSAIC = registerBlock("acacia_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_LOG_MOSAIC = registerBlock("crimson_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_LOG_MOSAIC = registerBlock("warped_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block MANGROVE_LOG_MOSAIC = registerBlock("mangrove_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BAMBOO_LOG_MOSAIC = registerBlock("bamboo_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHERRY_LOG_MOSAIC = registerBlock("cherry_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_LOG_MOSAIC = registerBlock("cactus_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_LOG_MOSAIC = registerBlock("azalea_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block BLOOMING_AZALEA_LOG_MOSAIC = registerBlock("blooming_azalea_log_mosaic", new OrientablePillarBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));

    //This section adds chipped Planks
    public static final Block CHIPPED_OAK_PLANKS = registerBlock("chipped_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_BIRCH_PLANKS = registerBlock("chipped_birch_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_SPRUCE_PLANKS = registerBlock("chipped_spruce_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_DARK_OAK_PLANKS = registerBlock("chipped_dark_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_JUNGLE_PLANKS = registerBlock("chipped_jungle_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_ACACIA_PLANKS = registerBlock("chipped_acacia_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_CRIMSON_PLANKS = registerBlock("chipped_crimson_planks", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block CHIPPED_WARPED_PLANKS = registerBlock("chipped_warped_planks", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block CHIPPED_MANGROVE_PLANKS = registerBlock("chipped_mangrove_planks", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block CHIPPED_BAMBOO_PLANKS = registerBlock("chipped_bamboo_planks", new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHIPPED_CHERRY_PLANKS = registerBlock("chipped_cherry_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CHIPPED_CACTUS_PLANKS = registerBlock("chipped_cactus_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block CHIPPED_AZALEA_PLANKS = registerBlock("chipped_azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CHIPPED_BLOOMING_AZALEA_PLANKS = registerBlock("chipped_blooming_azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));

    //This section adds chipped vertical Planks
    public static final Block CHIPPED_VERTICAL_OAK_PLANKS = registerBlock("chipped_vertical_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_VERTICAL_BIRCH_PLANKS = registerBlock("chipped_vertical_birch_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_VERTICAL_SPRUCE_PLANKS = registerBlock("chipped_vertical_spruce_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_VERTICAL_DARK_OAK_PLANKS = registerBlock("chipped_vertical_dark_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_VERTICAL_JUNGLE_PLANKS = registerBlock("chipped_vertical_jungle_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_VERTICAL_ACACIA_PLANKS = registerBlock("chipped_vertical_acacia_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHIPPED_VERTICAL_CRIMSON_PLANKS = registerBlock("chipped_vertical_crimson_planks", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block CHIPPED_VERTICAL_WARPED_PLANKS = registerBlock("chipped_vertical_warped_planks", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block CHIPPED_VERTICAL_MANGROVE_PLANKS = registerBlock("chipped_vertical_mangrove_planks", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block CHIPPED_VERTICAL_BAMBOO_PLANKS = registerBlock("chipped_vertical_bamboo_planks", new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHIPPED_VERTICAL_CHERRY_PLANKS = registerBlock("chipped_vertical_cherry_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CHIPPED_VERTICAL_CACTUS_PLANKS = registerBlock("chipped_vertical_cactus_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block CHIPPED_VERTICAL_AZALEA_PLANKS = registerBlock("chipped_vertical_azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CHIPPED_VERTICAL_BLOOMING_AZALEA_PLANKS = registerBlock("chipped_vertical_blooming_azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));

    //This section adds wooden Tiles(Wide planks)
    public static final Block OAK_TILES = registerBlock("oak_tiles", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_TILES = registerBlock("birch_tiles", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_TILES = registerBlock("spruce_tiles", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_TILES = registerBlock("dark_oak_tiles", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_TILES = registerBlock("jungle_tiles", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_TILES = registerBlock("acacia_tiles", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_TILES = registerBlock("crimson_tiles", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_TILES = registerBlock("warped_tiles", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_TILES = registerBlock("mangrove_tiles", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block BAMBOO_TILES = registerBlock("bamboo_tiles", new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHERRY_TILES = registerBlock("cherry_tiles", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_TILES = registerBlock("cactus_tiles", new Block(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_TILES = registerBlock("azalea_tiles", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block BLOOMING_AZALEA_TILES = registerBlock("blooming_azalea_tiles", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));


    //This section adds wooden Timbers (Large Bricks)
    public static final Block OAK_TIMBERS = registerBlock("oak_timbers", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_TIMBERS = registerBlock("birch_timbers", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_TIMBERS = registerBlock("spruce_timbers", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_TIMBERS = registerBlock("dark_oak_timbers", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_TIMBERS = registerBlock("jungle_timbers", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_TIMBERS = registerBlock("acacia_timbers", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_TIMBERS = registerBlock("crimson_timbers", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_TIMBERS = registerBlock("warped_timbers", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_TIMBERS = registerBlock("mangrove_timbers", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block BAMBOO_TIMBERS = registerBlock("bamboo_timbers", new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHERRY_TIMBERS = registerBlock("cherry_timbers", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_TIMBERS = registerBlock("cactus_timbers", new Block(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_TIMBERS = registerBlock("azalea_timbers", new Block(FabricBlockSettings.copyOf(CHERRY_TIMBERS)));
    public static final Block BLOOMING_AZALEA_TIMBERS = registerBlock("blooming_azalea_timbers", new Block(FabricBlockSettings.copyOf(CHERRY_TIMBERS)));

    //This section adds Glazed Wood (Polished Stone)
    public static final Block OAK_GLAZED = registerBlock("glazed_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_GLAZED = registerBlock("glazed_birch", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_GLAZED = registerBlock("glazed_spruce", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_GLAZED = registerBlock("glazed_dark_oak", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_GLAZED = registerBlock("glazed_jungle", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_GLAZED = registerBlock("glazed_acacia", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_GLAZED = registerBlock("glazed_crimson", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_GLAZED = registerBlock("glazed_warped", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_GLAZED = registerBlock("glazed_mangrove", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block BAMBOO_GLAZED = registerBlock("glazed_bamboo", new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHERRY_GLAZED = registerBlock("glazed_cherry", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_GLAZED = registerBlock("glazed_cactus", new Block(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_GLAZED = registerBlock("glazed_azalea", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block BLOOMING_AZALEA_GLAZED = registerBlock("glazed_blooming_azalea", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));

    //This section adds Chiseled Planks (Chiseled Stone)
    public static final Block CHISELED_OAK = registerBlock("chiseled_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHISELED_BIRCH = registerBlock("chiseled_birch_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHISELED_SPRUCE = registerBlock("chiseled_spruce_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHISELED_DARK_OAK = registerBlock("chiseled_dark_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHISELED_JUNGLE = registerBlock("chiseled_jungle_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHISELED_ACACIA = registerBlock("chiseled_acacia_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CHISELED_CRIMSON = registerBlock("chiseled_crimson_planks", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block CHISELED_WARPED = registerBlock("chiseled_warped_planks", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block CHISELED_MANGROVE = registerBlock("chiseled_mangrove_planks", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block CHISELED_BAMBOO = registerBlock("chiseled_bamboo_planks", new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHISELED_CHERRY = registerBlock("chiseled_cherry_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CHISELED_CACTUS = registerBlock("chiseled_cactus_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block CHISELED_AZALEA = registerBlock("chiseled_azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CHISELED_BLOOMING_AZALEA = registerBlock("chiseled_blooming_azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));

    //This section adds Plank Pavements (Glazed Terracotta)
    public static final Block OAK_PLANK_PAVEMENT = registerBlock("oak_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_PLANK_PAVEMENT = registerBlock("birch_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_PLANK_PAVEMENT = registerBlock("spruce_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_PLANK_PAVEMENT = registerBlock("dark_oak_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_PLANK_PAVEMENT = registerBlock("jungle_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_PLANK_PAVEMENT = registerBlock("acacia_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_PLANK_PAVEMENT = registerBlock("crimson_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_PLANK_PAVEMENT = registerBlock("warped_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block MANGROVE_PLANK_PAVEMENT = registerBlock("mangrove_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BAMBOO_PLANK_PAVEMENT = registerBlock("bamboo_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_PLANK_PAVEMENT = registerBlock("cherry_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CACTUS_PLANK_PAVEMENT = registerBlock("cactus_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_PLANK_PAVEMENT = registerBlock("azalea_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(CHERRY_PLANK_PAVEMENT)));
    public static final Block BLOOMING_AZALEA_PLANK_PAVEMENT = registerBlock("blooming_azalea_plank_pavement", new GlazedTerracottaBlock(FabricBlockSettings.copyOf(CHERRY_PLANK_PAVEMENT)));

    //Sliced log

    public static final Block SLICED_OAK_LOG = registerBlock("oak_sliced_log", new SlicedLogBlock(FabricBlockSettings.create().strength(2.0f).sounds(BlockSoundGroup.WOOD).mapColor(OAK_TAN).burnable()));
    public static final Block SLICED_BIRCH_LOG = registerBlock("sliced_birch_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_OAK_LOG)));
    public static final Block SLICED_SPRUCE_LOG = registerBlock("sliced_spruce_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_OAK_LOG)));
    public static final Block SLICED_DARK_OAK_LOG = registerBlock("sliced_dark_oak_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_OAK_LOG)));
    public static final Block SLICED_JUNGLE_LOG = registerBlock("sliced_jungle_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_OAK_LOG)));
    public static final Block SLICED_ACACIA_LOG = registerBlock("sliced_acacia_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_OAK_LOG)));
    public static final Block SLICED_CRIMSON_LOG = registerBlock("sliced_crimson_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_OAK_LOG).sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block SLICED_WARPED_LOG = registerBlock("sliced_warped_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_CRIMSON_LOG)));
    public static final Block SLICED_MANGROVE_LOG = registerBlock("sliced_mangrove_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_OAK_LOG)));
    public static final Block SLICED_CHERRY_LOG = registerBlock("sliced_cherry_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_OAK_LOG)));
    public static final Block SLICED_CACTUS_LOG = registerBlock("sliced_cactus_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_OAK_LOG).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block SLICED_AZALEA_LOG = registerBlock("sliced_azalea_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_OAK_LOG).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));
    public static final Block SLICED_BLOOMING_AZALEA_LOG = registerBlock("sliced_blooming_azalea_log", new SlicedLogBlock(FabricBlockSettings.copyOf(SLICED_AZALEA_LOG).burnable()));



    //Post Block
    public static final Block OAK_POST = registerBlock("oak_post", new BareSmallLogBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_POST = registerBlock("birch_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_POST = registerBlock("spruce_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_POST = registerBlock("dark_oak_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_POST = registerBlock("jungle_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_POST = registerBlock("acacia_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_POST = registerBlock("crimson_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_POST = registerBlock("warped_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block MANGROVE_POST = registerBlock("mangrove_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BAMBOO_POST = registerBlock("bamboo_post", new PostBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHERRY_POST = registerBlock("cherry_post", new PostBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_POST = registerBlock("cactus_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_POST = registerBlock("azalea_post", new PostBlock(FabricBlockSettings.copyOf(CHERRY_POST)));
    public static final Block BLOOMING_AZALEA_POST = registerBlock("blooming_azalea_post", new PostBlock(FabricBlockSettings.copyOf(AZALEA_POST)));

    public static final Block STRIPPED_OAK_POST = registerBlock("stripped_oak_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block STRIPPED_BIRCH_POST = registerBlock("stripped_birch_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block STRIPPED_SPRUCE_POST = registerBlock("stripped_spruce_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block STRIPPED_DARK_OAK_POST = registerBlock("stripped_dark_oak_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block STRIPPED_JUNGLE_POST = registerBlock("stripped_jungle_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block STRIPPED_ACACIA_POST = registerBlock("stripped_acacia_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block STRIPPED_CRIMSON_POST = registerBlock("stripped_crimson_post", new PostBlock(FabricBlockSettings.copyOf(CRIMSON_POST)));
    public static final Block STRIPPED_WARPED_POST = registerBlock("stripped_warped_post", new PostBlock(FabricBlockSettings.copyOf(WARPED_POST)));
    public static final Block STRIPPED_MANGROVE_POST = registerBlock("stripped_mangrove_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block STRIPPED_BAMBOO_POST = registerBlock("stripped_bamboo_post", new PostBlock(FabricBlockSettings.copyOf(BAMBOO_POST)));
    public static final Block STRIPPED_CHERRY_POST = registerBlock("stripped_cherry_post", new PostBlock(FabricBlockSettings.copyOf(CHERRY_POST)));
    public static final Block STRIPPED_CACTUS_POST = registerBlock("stripped_cactus_post", new PostBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block STRIPPED_AZALEA_POST = registerBlock("stripped_azalea_post", new PostBlock(FabricBlockSettings.copyOf(CHERRY_POST).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block STRIPPED_BLOOMING_AZALEA_POST = registerBlock("stripped_blooming_azalea_post", new PostBlock(FabricBlockSettings.copyOf(OAK_POST).sounds(BlockSoundGroup.CHERRY_WOOD)));

    /* (will be added in the next update)
    //This section adds Plaster Blocks
    public static final Block PLASTER_BLOCK = registerBlock("plaster_block", new Block(FabricBlockSettings.copyOf(PACKED_MUD).burnable().instrument(Instrument.DIDGERIDOO)));
     */

    //This section adds Compressed Blocks
    public static final Block PAPER_BLOCK = registerBlock("paper_block", new PaperBlock(FabricBlockSettings.copyOf(MOSS_BLOCK).burnable().mapColor(DyeColor.GRAY)));
    public static final Block SOAKED_PAPER_BLOCK = registerBlock("soaked_paper_block", new SoakedPaperBlock(FabricBlockSettings.copyOf(MOSS_BLOCK).burnable().mapColor(DyeColor.GRAY)));
    //Coloured Paper blocks (NEXT VERSION)

    //Chiseled bookshelf variants
    public static final Block BIRCH_CHISELED_BOOKSHELF = registerBlock("birch_chiseled_bookshelf", new VerticalSlotChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF)));
    public static final Block SPRUCE_CHISELED_BOOKSHELF = registerBlock("spruce_chiseled_bookshelf", new ChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF)));
    public static final Block DARK_OAK_CHISELED_BOOKSHELF = registerBlock("dark_oak_chiseled_bookshelf", new FourSlotChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF)));
    public static final Block JUNGLE_CHISELED_BOOKSHELF = registerBlock("jungle_chiseled_bookshelf", new FiveSlotChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF)));
    public static final Block ACACIA_CHISELED_BOOKSHELF = registerBlock("acacia_chiseled_bookshelf", new VerticalSlotChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF)));
    public static final Block CRIMSON_CHISELED_BOOKSHELF = registerBlock("crimson_chiseled_bookshelf", new NineSlotChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_CHISELED_BOOKSHELF = registerBlock("warped_chiseled_bookshelf", new WarpedChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block MANGROVE_CHISELED_BOOKSHELF = registerBlock("mangrove_chiseled_bookshelf", new FourSlotChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF)));
    public static final Block BAMBOO_CHISELED_BOOKSHELF = registerBlock("bamboo_chiseled_bookshelf", new BambooChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_CHISELED_BOOKSHELF = registerBlock("cherry_chiseled_bookshelf", new CherryChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CACTUS_CHISELED_BOOKSHELF = registerBlock("cactus_chiseled_bookshelf", new CactusChiseledBookshelfBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_CHISELED_BOOKSHELF = registerBlock("azalea_chiseled_bookshelf", new AzaleaChiseledBookshelf(FabricBlockSettings.copyOf(CHERRY_CHISELED_BOOKSHELF)));
    public static final Block BLOOMING_AZALEA_CHISELED_BOOKSHELF = registerBlock("blooming_azalea_chiseled_bookshelf", new AzaleaChiseledBookshelf(FabricBlockSettings.copyOf(CHERRY_CHISELED_BOOKSHELF)));
    public static final Block PINE_CHISELED_BOOKSHELF = registerBlock("cedar_chiseled_bookshelf", new FlippedFiveSlotChiseledBookshelf(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD)));


    //Hollow Logs
    public static final Block HOLLOW_OAK_LOG = registerBlock("hollow_oak_log", new HollowLogBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block HOLLOW_BIRCH_LOG = registerBlock("hollow_birch_log", new HollowLogBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block HOLLOW_SPRUCE_LOG = registerBlock("hollow_spruce_log", new HollowLogBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block HOLLOW_DARK_OAK_LOG = registerBlock("hollow_dark_aok_log", new HollowLogBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block HOLLOW_JUNGLE_LOG = registerBlock("hollow_jungle_log", new HollowLogBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block HOLLOW_ACACIA_LOG = registerBlock("hollow_acacia_log", new HollowLogBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block HOLLOW_CRIMSON_LOG = registerBlock("hollow_crimson_log", new HollowLogBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block HOLLOW_WARPED_LOG = registerBlock("hollow_warped_log", new HollowLogBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block HOLLOW_MANGROVE_LOG = registerBlock("hollow_mangrove_log", new HollowLogBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block HOLLOW_CHERRY_LOG = registerBlock("hollow_cherry_log", new HollowLogBlock(FabricBlockSettings.copyOf(CHERRY_LOG)));
    public static final Block HOLLOW_AZALEA_LOG = registerBlock("hollow_azalea_log", new HollowLogBlock(FabricBlockSettings.copyOf(CHERRY_LOG)));
    public static final Block HOLLOW_PINE_LOG = registerBlock("hollow_cedar_log", new HollowLogBlock(FabricBlockSettings.copyOf(OAK_LOG)));

    // Sawmill Block //
    public static final Block SAWMILL = registerBlock("sawmill", new SawmillBlock(AbstractBlock.Settings.create().burnable().nonOpaque().strength(2.5f,2.5f).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).mapColor(BROWN)));

    //Shutter blocks
    public static final Block OAK_SHUTTER = registerBlock("oak_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block BIRCH_SHUTTER = registerBlock("birch_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER), BlockSetType.BIRCH));
    public static final Block SPRUCE_SHUTTER = registerBlock("spruce_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER), BlockSetType.SPRUCE));
    public static final Block DARK_OAK_SHUTTER = registerBlock("dark_oak_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER), BlockSetType.DARK_OAK));
    public static final Block JUNGLE_SHUTTER = registerBlock("jungle_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER), BlockSetType.JUNGLE));
    public static final Block ACACIA_SHUTTER = registerBlock("acacia_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER), BlockSetType.ACACIA));
    public static final Block CRIMSON_SHUTTER = registerBlock("crimson_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER), BlockSetType.CRIMSON));
    public static final Block WARPED_SHUTTER = registerBlock("warped_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER), BlockSetType.WARPED));
    public static final Block MANGROVE_SHUTTER = registerBlock("mangrove_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER), BlockSetType.MANGROVE));
    public static final Block BAMBOO_SHUTTER = registerBlock("bamboo_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER), BlockSetType.BAMBOO));
    public static final Block CHERRY_SHUTTER = registerBlock("cherry_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER), BlockSetType.CHERRY));
    public static final Block CACTUS_SHUTTER = registerBlock("cactus_shutter", new ShutterBlock(FabricBlockSettings.copyOf(OAK_SHUTTER).sounds(BlockSoundGroup.NETHER_WART), BlockSetType.CHERRY));
    public static final Block AZALEA_SHUTTER = registerBlock("azalea_shutter", new ShutterBlock(FabricBlockSettings.copyOf(CHERRY_SHUTTER), BlockSetType.CHERRY));
    public static final Block BLOOMING_AZALEA_SHUTTER = registerBlock("blooming_azalea_shutter", new ShutterBlock(FabricBlockSettings.copyOf(CHERRY_SHUTTER), BlockSetType.CHERRY));

    //Charpente
    public static final Block OAK_CHARPENTE = registerBlock("oak_charpente", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_CHARPENTE = registerBlock("birch_charpente", new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block SPRUCE_CHARPENTE = registerBlock("spruce_charpente", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_CHARPENTE = registerBlock("dark_oak_charpente", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_CHARPENTE = registerBlock("jungle_charpente", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_CHARPENTE = registerBlock("acacia_charpente", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_CHARPENTE = registerBlock("crimson_charpente", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_CHARPENTE = registerBlock("warped_charpente", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_CHARPENTE = registerBlock("mangrove_charpente", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block CHERRY_CHARPENTE = registerBlock("cherry_charpente", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_CHARPENTE = registerBlock("cactus_charpente", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block AZALEA_CHARPENTE = registerBlock("azalea_charpente", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block BLOOMING_AZALEA_CHARPENTE = registerBlock("blooming_azalea_charpente", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));

    //Floorboard
    public static final Block OAK_FLOORBOARD = registerBlock("oak_floorboard", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_FLOORBOARD = registerBlock("birch_floorboard", new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block SPRUCE_FLOORBOARD = registerBlock("spruce_floorboard", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_FLOORBOARD = registerBlock("dark_oak_floorboard", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_FLOORBOARD = registerBlock("jungle_floorboard", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_FLOORBOARD = registerBlock("acacia_floorboard", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_FLOORBOARD = registerBlock("crimson_floorboard", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_FLOORBOARD = registerBlock("warped_floorboard", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_FLOORBOARD = registerBlock("mangrove_floorboard", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block CHERRY_FLOORBOARD = registerBlock("cherry_floorboard", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_FLOORBOARD = registerBlock("cactus_floorboard", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block AZALEA_FLOORBOARD = registerBlock("azalea_floorboard", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block BLOOMING_AZALEA_FLOORBOARD = registerBlock("blooming_azalea_floorboard", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));

    //Woven planks
    public static final Block WOVEN_OAK_PLANKS = registerBlock("woven_oak_floorboard", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block WOVEN_BIRCH_PLANKS = registerBlock("woven_birch_floorboard", new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block WOVEN_SPRUCE_PLANKS = registerBlock("woven_spruce_floorboard", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block WOVEN_DARK_OAK_PLANKS = registerBlock("woven_dark_oak_floorboard", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block WOVEN_JUNGLE_PLANKS = registerBlock("woven_jungle_floorboard", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block WOVEN_ACACIA_PLANKS = registerBlock("woven_acacia_floorboard", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block WOVEN_CRIMSON_PLANKS = registerBlock("woven_crimson_floorboard", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WOVEN_WARPED_PLANKS = registerBlock("woven_warped_floorboard", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block WOVEN_MANGROVE_PLANKS = registerBlock("woven_mangrove_floorboard", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block WOVEN_CHERRY_PLANKS = registerBlock("woven_cherry_floorboard", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block WOVEN_CACTUS_PLANKS = registerBlock("woven_cactus_floorboard", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block WOVEN_AZALEA_PLANKS = registerBlock("woven_azalea_floorboard", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block WOVEN_BLOOMING_AZALEA_PLANKS = registerBlock("woven_blooming_azalea_floorboard", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));

    //Sandy Planks
    public static final Block SANDY_OAK_PLANKS = registerBlock("sandy_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SANDY_BIRCH_PLANKS = registerBlock("sandy_birch_planks", new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block SANDY_SPRUCE_PLANKS = registerBlock("sandy_spruce_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SANDY_DARK_OAK_PLANKS = registerBlock("sandy_dark_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SANDY_JUNGLE_PLANKS = registerBlock("sandy_jungle_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SANDY_ACACIA_PLANKS = registerBlock("sandy_acacia_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SANDY_CRIMSON_PLANKS = registerBlock("sandy_crimson_planks", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block SANDY_WARPED_PLANKS = registerBlock("sandy_warped_planks", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block SANDY_MANGROVE_PLANKS = registerBlock("sandy_mangrove_planks", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block SANDY_CHERRY_PLANKS = registerBlock("sandy_cherry_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block SANDY_CACTUS_PLANKS = registerBlock("sandy_cactus_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block SANDY_AZALEA_PLANKS = registerBlock("sandy_azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block SANDY_BLOOMING_AZALEA_PLANKS = registerBlock("sandy_blooming_azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));

    //BIGboo
    public static final Block OMEGA_BAMBOO = registerBlock("omega_bamboo", new PillarBlock(FabricBlockSettings.copyOf(BAMBOO_BLOCK)));
    public static final Block STRIPPED_OMEGA_BAMBOO = registerBlock("stripped_omega_bamboo", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_BAMBOO_BLOCK)));
    public static final Block OMEGA_BAMBOO_LEAVES = registerBlock("omega_bamboo_leaves", new BambooLeafBlock(FabricBlockSettings.copyOf(OAK_LEAVES)));
    public static final Block OMEGA_CROWN_BAMBOO_LEAVES = registerBlock("omega_crown_bamboo_leaves", new BambooLeafBlock(FabricBlockSettings.copyOf(OAK_LEAVES)));

    //This section adds stairs
    /*Vertical plank stairs*/
    public static final Block VERTICAL_OAK_STAIR = registerBlock("vertical_oak_stairs", new StairsBlock(VERTICAL_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_BIRCH_STAIR = registerBlock("vertical_birch_stairs", new StairsBlock(VERTICAL_BIRCH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block VERTICAL_SPRUCE_STAIR = registerBlock("vertical_spruce_stairs", new StairsBlock(VERTICAL_SPRUCE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_STAIR = registerBlock("vertical_dark_oak_stairs", new StairsBlock(VERTICAL_DARK_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block VERTICAL_JUNGLE_STAIR = registerBlock("vertical_jungle_stairs", new StairsBlock(VERTICAL_JUNGLE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block VERTICAL_ACACIA_STAIR = registerBlock("vertical_acacia_stairs", new StairsBlock(VERTICAL_ACACIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block VERTICAL_CRIMSON_STAIR = registerBlock("vertical_crimson_stairs", new StairsBlock(VERTICAL_CRIMSON_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CRIMSON_PLANKS).burnable()));
    public static final Block VERTICAL_WARPED_STAIR = registerBlock("vertical_warped_stairs", new StairsBlock(VERTICAL_WARPED_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(WARPED_PLANKS).burnable()));
    public static final Block VERTICAL_MANGROVE_STAIR = registerBlock("vertical_mangrove_stairs", new StairsBlock(VERTICAL_MANGROVE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block VERTICAL_BAMBOO_STAIR = registerBlock("vertical_bamboo_stairs", new StairsBlock(VERTICAL_BAMBOO_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block VERTICAL_CHERRY_STAIR = registerBlock("vertical_cherry_stairs", new StairsBlock(VERTICAL_CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_CACTUS_STAIR = registerBlock("vertical_cactus_stairs", new StairsBlock(VERTICAL_CACTUS_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_AZALEA_STAIR = registerBlock("vertical_azalea_stairs", new StairsBlock(VERTICAL_AZALEA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block VERTICAL_BLOOMING_AZALEA_STAIR = registerBlock("vertical_azalea_blooming_stairs", new StairsBlock(VERTICAL_AZALEA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block VERTICAL_PINE_STAIR = registerBlock("vertical_cedar_stairs", new StairsBlock(VERTICAL_PINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(OAK_PLANKS).burnable()));


    /* Mosaic stairs*/
    public static final Block OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs", new StairsBlock(OAK_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs", new StairsBlock(BIRCH_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs", new StairsBlock(SPRUCE_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs", new StairsBlock(JUNGLE_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs", new StairsBlock(DARK_OAK_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs", new StairsBlock(ACACIA_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs", new StairsBlock(CRIMSON_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs", new StairsBlock(WARPED_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs", new StairsBlock(MANGROVE_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs", new StairsBlock(CHERRY_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_MOSAIC_STAIRS = registerBlock("cactus_mosaic_stairs", new StairsBlock(CACTUS_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block AZALEA_MOSAIC_STAIRS = registerBlock("azalea_mosaic_stairs", new StairsBlock(AZALEA_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block BLOOMING_AZALEA_MOSAIC_STAIRS = registerBlock("blooming_azalea_mosaic_stairs", new StairsBlock(BLOOMING_AZALEA_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));


    /*Chipped Plank Stairs*/
    public static final Block CHIPPED_OAK_STAIRS = registerBlock("chipped_oak_stairs", new StairsBlock(CHIPPED_OAK_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_BIRCH_STAIRS = registerBlock("chipped_birch_stairs", new StairsBlock(CHIPPED_BIRCH_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_SPRUCE_STAIRS = registerBlock("chipped_spruce_stairs", new StairsBlock(CHIPPED_SPRUCE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_DARK_OAK_STAIRS = registerBlock("chipped_dark_oak_stairs", new StairsBlock(CHIPPED_DARK_OAK_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_JUNGLE_STAIRS = registerBlock("chipped_jungle_stairs", new StairsBlock(CHIPPED_JUNGLE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_ACACIA_STAIRS = registerBlock("chipped_acacia_stairs", new StairsBlock(CHIPPED_ACACIA_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_CRIMSON_STAIRS = registerBlock("chipped_crimson_stairs", new StairsBlock(CHIPPED_CRIMSON_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(CRIMSON_STAIRS)));
    public static final Block CHIPPED_WARPED_STAIRS = registerBlock("chipped_warped_stairs", new StairsBlock(CHIPPED_WARPED_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(WARPED_STAIRS)));
    public static final Block CHIPPED_MANGROVE_STAIRS = registerBlock("chipped_mangrove_stairs", new StairsBlock(CHIPPED_MANGROVE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(MANGROVE_STAIRS)));
    public static final Block CHIPPED_BAMBOO_STAIRS = registerBlock("chipped_bamboo_stairs", new StairsBlock(CHIPPED_BAMBOO_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(BAMBOO_STAIRS)));
    public static final Block CHIPPED_CHERRY_STAIRS = registerBlock("chipped_cherry_stairs", new StairsBlock(CHIPPED_CHERRY_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_STAIRS)));
    public static final Block CHIPPED_CACTUS_STAIRS = registerBlock("chipped_cactus_stairs", new StairsBlock(CHIPPED_CACTUS_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_STAIRS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block CHIPPED_AZALEA_STAIRS = registerBlock("chipped_azalea_stairs", new StairsBlock(CHIPPED_CACTUS_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_STAIRS)));
    public static final Block CHIPPED_BLOOMING_AZALEA_STAIRS = registerBlock("chipped_blooming_azalea_stairs", new StairsBlock(CHIPPED_CACTUS_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_STAIRS)));

    /*Chipped Vertical Plank Stairs*/
    public static final Block CHIPPED_VERTICAL_OAK_STAIRS = registerBlock("chipped_vertical_oak_stairs", new Block(FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_VERTICAL_BIRCH_STAIRS = registerBlock("chipped_vertical_birch_stairs", new Block(FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_VERTICAL_SPRUCE_STAIRS = registerBlock("chipped_vertical_spruce_stairs", new Block(FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_VERTICAL_DARK_OAK_STAIRS = registerBlock("chipped_vertical_dark_oak_stairs", new Block(FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_VERTICAL_JUNGLE_STAIRS = registerBlock("chipped_vertical_jungle_stairs", new Block(FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_VERTICAL_ACACIA_STAIRS = registerBlock("chipped_vertical_acacia_stairs", new Block(FabricBlockSettings.copyOf(OAK_STAIRS)));
    public static final Block CHIPPED_VERTICAL_CRIMSON_STAIRS = registerBlock("chipped_vertical_crimson_stairs", new Block(FabricBlockSettings.copyOf(CRIMSON_STAIRS)));
    public static final Block CHIPPED_VERTICAL_WARPED_STAIRS = registerBlock("chipped_vertical_warped_stairs", new Block(FabricBlockSettings.copyOf(WARPED_STAIRS)));
    public static final Block CHIPPED_VERTICAL_MANGROVE_STAIRS = registerBlock("chipped_vertical_mangrove_stairs", new Block(FabricBlockSettings.copyOf(MANGROVE_STAIRS)));
    public static final Block CHIPPED_VERTICAL_BAMBOO_STAIRS = registerBlock("chipped_vertical_bamboo_stairs", new Block(FabricBlockSettings.copyOf(BAMBOO_STAIRS)));
    public static final Block CHIPPED_VERTICAL_CHERRY_STAIRS = registerBlock("chipped_vertical_cherry_stairs", new Block(FabricBlockSettings.copyOf(CHERRY_STAIRS)));
    public static final Block CHIPPED_VERTICAL_CACTUS_STAIRS = registerBlock("chipped_vertical_cactus_stairs", new Block(FabricBlockSettings.copyOf(CHERRY_STAIRS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block CHIPPED_VERTICAL_AZALEA_STAIRS = registerBlock("chipped_vertical_azalea_stairs", new Block(FabricBlockSettings.copyOf(CHERRY_STAIRS)));
    public static final Block CHIPPED_VERTICAL_BLOOMING_AZALEA_STAIRS = registerBlock("chipped_vertical_blooming_azalea_stairs", new Block(FabricBlockSettings.copyOf(CHERRY_STAIRS)));


    /*Board Stairs*/
    public static final Block OAK_TIMBERS_STAIRS = registerBlock("oak_timbers_stairs", new StairsBlock(OAK_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_TIMBERS_STAIRS = registerBlock("birch_timbers_stairs", new StairsBlock(BIRCH_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_TIMBERS_STAIRS = registerBlock("spruce_timbers_stairs", new StairsBlock(SPRUCE_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_TIMBERS_STAIRS = registerBlock("dark_oak_timbers_stairs", new StairsBlock(DARK_OAK_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_TIMBERS_STAIRS= registerBlock("jungle_timbers_stairs", new StairsBlock(JUNGLE_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_TIMBERS_STAIRS = registerBlock("acacia_timbers_stairs", new StairsBlock(ACACIA_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_TIMBERS_STAIRS = registerBlock("crimson_timbers_stairs", new StairsBlock(CRIMSON_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_TIMBERS_STAIRS = registerBlock("warped_timbers_stairs", new StairsBlock(WARPED_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_TIMBERS_STAIRS = registerBlock("mangrove_timbers_stairs", new StairsBlock(MANGROVE_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block BAMBOO_TIMBERS_STAIRS = registerBlock("bamboo_timbers_stairs", new StairsBlock(BAMBOO_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHERRY_TIMBERS_STAIRS = registerBlock("cherry_timbers_stairs", new StairsBlock(CHERRY_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_TIMBERS_STAIRS = registerBlock("cactus_timbers_stairs", new StairsBlock(CACTUS_TIMBERS.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));

    /*Tile Stairs*/
    public static final Block OAK_TILES_STAIRS = registerBlock("oak_tiles_stairs", new StairsBlock(OAK_TILES.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_TILES_STAIRS = registerBlock("birch_tiles_stairs", new StairsBlock(BIRCH_TILES.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_TILES_STAIRS = registerBlock("spruce_tiles_stairs", new StairsBlock(SPRUCE_TILES.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_TILES_STAIRS = registerBlock("dark_oak_tiles_stairs", new StairsBlock(DARK_OAK_TILES.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_TILES_STAIRS= registerBlock("jungle_tiles_stairs", new StairsBlock(JUNGLE_TILES.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_TILES_STAIRS = registerBlock("acacia_tiles_stairs", new StairsBlock(ACACIA_TILES.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_TILES_STAIRS = registerBlock("crimson_tiles_stairs", new StairsBlock(CRIMSON_TILES.getDefaultState(),FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_TILES_STAIRS = registerBlock("warped_tiles_stairs", new StairsBlock(WARPED_TILES.getDefaultState(),FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_TILES_STAIRS = registerBlock("mangrove_tiles_stairs", new StairsBlock(MANGROVE_TILES.getDefaultState(),FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block BAMBOO_TILES_STAIRS = registerBlock("bamboo_tiles_stairs", new StairsBlock(BAMBOO_TILES.getDefaultState(),FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHERRY_TILES_STAIRS = registerBlock("cherry_tiles_stairs", new StairsBlock(CHERRY_TILES.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_TILES_STAIRS = registerBlock("cactus_tiles_stairs", new StairsBlock(CACTUS_TILES.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_TILES_STAIRS = registerBlock("azalea_tiles_stairs", new StairsBlock(AZALEA_TILES.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block BLOOMING_AZALEA_TILES_STAIRS = registerBlock("blooming_azalea_tiles_stairs", new StairsBlock(BLOOMING_AZALEA_TILES.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_PLANKS)));


    /*Glazed Stairs*/
    public static final Block GLAZED_OAK_STAIRS = registerBlock("glazed_oak_stairs", new StairsBlock(OAK_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_BIRCH_STAIRS = registerBlock("glazed_birch_stairs", new StairsBlock(BIRCH_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_SPRUCE_STAIRS = registerBlock("glazed_spruce_stairs", new StairsBlock(SPRUCE_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_DARK_OAK_STAIRS = registerBlock("glazed_dark_oak_stairs", new StairsBlock(DARK_OAK_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_JUNGLE_STAIRS = registerBlock("glazed_jungle_stairs", new StairsBlock(JUNGLE_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_ACACIA_STAIRS = registerBlock("glazed_acacia_stairs", new StairsBlock(ACACIA_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_CRIMSON_STAIRS = registerBlock("glazed_crimson_stairs", new StairsBlock(CRIMSON_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block GLAZED_WARPED_STAIRS = registerBlock("glazed_warped_stairs", new StairsBlock(WARPED_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block GLAZED_MANGROVE_STAIRS = registerBlock("glazed_mangrove_stairs", new StairsBlock(MANGROVE_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block GLAZED_BAMBOO_STAIRS = registerBlock("glazed_bamboo_stairs", new StairsBlock(BAMBOO_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block GLAZED_CHERRY_STAIRS = registerBlock("glazed_cherry_stairs", new StairsBlock(CHERRY_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block GLAZED_CACTUS_STAIRS = registerBlock("glazed_cactus_stairs", new StairsBlock(CACTUS_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block GLAZED_AZALEA_STAIRS = registerBlock("glazed_azalea_stairs", new StairsBlock(AZALEA_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block GLAZED_BLOOMING_AZALEA_STAIRS = registerBlock("glazed_blooming_azalea_stairs", new StairsBlock(BLOOMING_AZALEA_GLAZED.getDefaultState(),FabricBlockSettings.copyOf(CHERRY_PLANKS)));

    //This section adds slabs
    /*Vertical plank slabs*/
    public static final Block VERTICAL_OAK_SLAB = registerBlock("vertical_oak_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_BIRCH_SLAB = registerBlock("vertical_birch_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_SPRUCE_SLAB = registerBlock("vertical_spruce_slab", new SlabBlock(FabricBlockSettings.copyOf(SPRUCE_SLAB)));
    public static final Block VERTICAL_JUNGLE_SLAB = registerBlock("vertical_jungle_slab", new SlabBlock(FabricBlockSettings.copyOf(JUNGLE_SLAB)));
    public static final Block VERTICAL_DARK_OAK_SLAB = registerBlock("vertical_dark_oak_slab", new SlabBlock(FabricBlockSettings.copyOf(DARK_OAK_SLAB)));
    public static final Block VERTICAL_ACACIA_SLAB = registerBlock("vertical_acacia_slab", new SlabBlock(FabricBlockSettings.copyOf(ACACIA_SLAB)));
    public static final Block VERTICAL_CRIMSON_SLAB = registerBlock("vertical_crimson_slab", new SlabBlock(FabricBlockSettings.copyOf(CRIMSON_SLAB)));
    public static final Block VERTICAL_WARPED_SLAB = registerBlock("vertical_warped_slab", new SlabBlock(FabricBlockSettings.copyOf(WARPED_SLAB)));
    public static final Block VERTICAL_MANGROVE_SLAB = registerBlock("vertical_mangrove_slab", new SlabBlock(FabricBlockSettings.copyOf(MANGROVE_SLAB)));
    public static final Block VERTICAL_BAMBOO_SLAB = registerBlock("vertical_bamboo_slab", new SlabBlock(FabricBlockSettings.copyOf(BAMBOO_SLAB)));
    public static final Block VERTICAL_CHERRY_SLAB = registerBlock("vertical_cherry_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));
    public static final Block VERTICAL_CACTUS_SLAB = registerBlock("vertical_cactus_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_AZALEA_SLAB = registerBlock("vertical_azalea_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block VERTICAL_BLOOMING_AZALEA_SLAB = registerBlock("vertical_blooming_azalea_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block VERTICAL_PINE_SLAB = registerBlock("vertical_cedar_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS).burnable()));


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
    public static final Block AZALEA_MOSAIC_SLABS = registerBlock("azalea_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));
    public static final Block BLOOMING_AZALEA_MOSAIC_SLABS = registerBlock("blooming_azalea_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).burnable()));


    /*Chipped Planks Slabs*/
    public static final Block CHIPPED_OAK_SLAB = registerBlock("chipped_oak_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_BIRCH_SLAB = registerBlock("chipped_birch_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_SPRUCE_SLAB = registerBlock("chipped_spruce_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_DARK_OAK_SLAB = registerBlock("chipped_dark_oak_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_JUNGLE_SLAB = registerBlock("chipped_jungle_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_ACACIA_SLAB = registerBlock("chipped_acacia_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_CRIMSON_SLAB = registerBlock("chipped_crimson_slab", new SlabBlock(FabricBlockSettings.copyOf(CRIMSON_SLAB)));
    public static final Block CHIPPED_WARPED_SLAB = registerBlock("chipped_warped_slab", new SlabBlock(FabricBlockSettings.copyOf(WARPED_SLAB)));
    public static final Block CHIPPED_MANGROVE_SLAB = registerBlock("chipped_mangrove_slab", new SlabBlock(FabricBlockSettings.copyOf(MANGROVE_SLAB)));
    public static final Block CHIPPED_BAMBOO_SLAB = registerBlock("chipped_bamboo_slab", new SlabBlock(FabricBlockSettings.copyOf(BAMBOO_SLAB)));
    public static final Block CHIPPED_CHERRY_SLAB = registerBlock("chipped_cherry_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));
    public static final Block CHIPPED_CACTUS_SLAB = registerBlock("chipped_cactus_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block CHIPPED_AZALEA_SLAB = registerBlock("chipped_azalea_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));
    public static final Block CHIPPED_BLOOMING_AZALEA_SLAB = registerBlock("chipped_blooming_azalea_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));

    /*Chipped Vertical Plank Slabs*/
    public static final Block CHIPPED_VERTICAL_OAK_SLAB = registerBlock("chipped_vertical_oak_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_VERTICAL_BIRCH_SLAB = registerBlock("chipped_vertical_birch_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_VERTICAL_SPRUCE_SLAB = registerBlock("chipped_vertical_spruce_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_VERTICAL_DARK_OAK_SLAB = registerBlock("chipped_vertical_dark_oak_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_VERTICAL_JUNGLE_SLAB = registerBlock("chipped_vertical_jungle_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_VERTICAL_ACACIA_SLAB = registerBlock("chipped_vertical_acacia_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block CHIPPED_VERTICAL_CRIMSON_SLAB = registerBlock("chipped_vertical_crimson_slab", new SlabBlock(FabricBlockSettings.copyOf(CRIMSON_SLAB)));
    public static final Block CHIPPED_VERTICAL_WARPED_SLAB = registerBlock("chipped_vertical_warped_slab", new SlabBlock(FabricBlockSettings.copyOf(WARPED_SLAB)));
    public static final Block CHIPPED_VERTICAL_MANGROVE_SLAB = registerBlock("chipped_vertical_mangrove_slab", new SlabBlock(FabricBlockSettings.copyOf(MANGROVE_SLAB)));
    public static final Block CHIPPED_VERTICAL_BAMBOO_SLAB = registerBlock("chipped_vertical_bamboo_slab", new SlabBlock(FabricBlockSettings.copyOf(BAMBOO_SLAB)));
    public static final Block CHIPPED_VERTICAL_CHERRY_SLAB = registerBlock("chipped_vertical_cherry_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));
    public static final Block CHIPPED_VERTICAL_CACTUS_SLAB = registerBlock("chipped_vertical_cactus_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block CHIPPED_VERTICAL_AZALEA_SLAB = registerBlock("chipped_vertical_azalea_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));
    public static final Block CHIPPED_VERTICAL_BLOOMING_AZALEA_SLAB = registerBlock("chipped_vertical_blooming_azalea", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));


    /*Board Slabs*/
    public static final Block OAK_TIMBERS_SLABS = registerBlock("oak_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_TIMBERS_SLABS = registerBlock("birch_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_TIMBERS_SLABS = registerBlock("spruce_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_TIMBERS_SLABS = registerBlock("dark_oak_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_TIMBERS_SLABS = registerBlock("jungle_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_TIMBERS_SLABS = registerBlock("acacia_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_TIMBERS_SLABS = registerBlock("crimson_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_TIMBERS_SLABS = registerBlock("warped_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_TIMBERS_SLABS = registerBlock("mangrove_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block BAMBOO_TIMBERS_SLABS = registerBlock("bamboo_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHERRY_TIMBERS_SLABS = registerBlock("cherry_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_TIMBERS_SLABS = registerBlock("cactus_timbers_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));

    /*Glazed Slabs*/
    public static final Block GLAZED_OAK_SLABS = registerBlock("glazed_oak_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_BIRCH_SLABS = registerBlock("glazed_birch_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_SPRUCE_SLABS = registerBlock("glazed_spruce_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_DARK_OAK_SLABS = registerBlock("glazed_dark_oak_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_JUNGLE_SLABS = registerBlock("glazed_jungle_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_ACACIA_SLABS = registerBlock("glazed_acacia_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block GLAZED_CRIMSON_SLABS = registerBlock("glazed_crimson_slab", new SlabBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block GLAZED_WARPED_SLABS = registerBlock("glazed_warped_slab", new SlabBlock(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block GLAZED_MANGROVE_SLABS = registerBlock("glazed_mangrove_slab", new SlabBlock(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block GLAZED_BAMBOO_SLABS = registerBlock("glazed_bamboo_slab", new SlabBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block GLAZED_CHERRY_SLABS = registerBlock("glazed_cherry_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block GLAZED_CACTUS_SLABS = registerBlock("glazed_cactus_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block GLAZED_AZALEA_SLABS = registerBlock("glazed_azalea_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block GLAZED_BLOOMING_AZALEA_SLABS = registerBlock("glazed_blooming_azalea_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));

    /*Tile Slabs*/
    public static final Block OAK_TILES_SLABS = registerBlock("oak_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block BIRCH_TILES_SLABS = registerBlock("birch_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_TILES_SLABS = registerBlock("spruce_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DARK_OAK_TILES_SLABS = registerBlock("dark_oak_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block JUNGLE_TILES_SLABS = registerBlock("jungle_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block ACACIA_TILES_SLABS = registerBlock("acacia_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block CRIMSON_TILES_SLABS = registerBlock("crimson_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_TILES_SLABS = registerBlock("warped_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block MANGROVE_TILES_SLABS = registerBlock("mangrove_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block BAMBOO_TILES_SLABS = registerBlock("bamboo_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CHERRY_TILES_SLABS = registerBlock("cherry_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_TILES_SLABS = registerBlock("cactus_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block AZALEA_TILES_SLABS = registerBlock("azalea_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block BLOOMING_AZALEA_TILES_SLABS = registerBlock("blooming_azalea_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));


    public static final Block AZALEA_FLOWERS = registerBlock("azalea_flowers", new GlowLichenBlock(FabricBlockSettings.copyOf(PINK_PETALS).burnable()));

    //Leaf bed(Next version)
    public static final Block OAK_LEAF = registerBlock("oak_leaf", new LeafBedBlock(FabricBlockSettings.copyOf(PINK_PETALS).sounds(BlockSoundGroup.GRASS).noCollision()));

    /*
    *Wood sets
    **/

    //Cactus Woodset

    public static final Block CACTUS_BUNDLE = registerBlock("cactus_bundle", new PillarBlock(FabricBlockSettings.create().burnable().mapColor(DARK_GREEN).nonOpaque().sounds(BlockSoundGroup.NETHER_WART).strength(0.5f)));
    public static final Block CACTUS_CROWN = registerBlock("cactus_crown", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_LOG).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block STRIPPED_CACTUS = registerBlock("stripped_cactus", new CactusPillar(FabricBlockSettings.copyOf(CHERRY_PLANKS).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block STRIPPED_CACTUS_BUNDLE = registerBlock("stripped_cactus_crown", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block STRIPPED_CACTUS_BUNDLE_CROWN = registerBlock("stripped_cactus_bundle_crown", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_SLAB = registerBlock("cactus_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));
    public static final Block CACTUS_STAIRS = registerBlock("cactus_stairs", new StairsBlock(CACTUS_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_FENCE = registerBlock("cactus_fence", new FenceBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block CACTUS_FENCE_GATE = registerBlock("cactus_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS), WoodType.CHERRY));
    public static final Block CACTUS_BUTTON = registerBlock("cactus_button", new ButtonBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS), BlockSetType.CHERRY, 5, true));
    public static final Block CACTUS_PRESSURE_PLATE = registerBlock("cactus_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(CHERRY_PLANKS), BlockSetType.CHERRY));
    public static final Block CACTUS_DOOR = registerBlock("cactus_door", new DoorBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).nonOpaque(), BlockSetType.CHERRY));

    //Overworld Shroom woodset (In version 1.1)
    /*Brown*/

    /*Red*/

    //Azalea Woodset

    public static final Block AZALEA_LOG = registerBlock("azalea_log", new PillarBlock(FabricBlockSettings.create().burnable().mapColor(PALE_PURPLE).nonOpaque().sounds(BlockSoundGroup.CHERRY_WOOD).strength(0.5f)));
    public static final Block AZALEA_WOOD = registerBlock("azalea_wood", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_LOG)));
    public static final Block BLOOMING_AZALEA_LOG = registerBlock("blooming_azalea_log", new PillarBlock(FabricBlockSettings.create().burnable().mapColor(PALE_PURPLE).nonOpaque().sounds(BlockSoundGroup.CHERRY_WOOD).strength(0.5f)));
    public static final Block BLOOMING_AZALEA_WOOD = registerBlock("blooming_azalea_wood", new PillarBlock(FabricBlockSettings.copyOf(CHERRY_LOG)));
    public static final Block BLOOMING_STRIPPED_AZALEA_LOG = registerBlock("stripped_blooming_azalea_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG)));
    public static final Block BLOOMING_STRIPPED_AZALEA_WOOD = registerBlock("blooming_blooming_stripped_azalea_wood", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_CHERRY_LOG)));
    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block AZALEA_SLAB = registerBlock("azalea_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));
    public static final Block AZALEA_STAIRS = registerBlock("azalea_stairs", new StairsBlock(AZALEA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block BLOOMING_AZALEA_PLANKS = registerBlock("blooming_azalea_planks", new Block(FabricBlockSettings.copyOf(AZALEA_PLANKS)));
    public static final Block BLOOMING_AZALEA_SLAB = registerBlock("blooming_azalea_slab", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_SLAB)));
    public static final Block BLOOMING_AZALEA_STAIRS = registerBlock("blooming_azalea_stairs", new StairsBlock(AZALEA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block AZALEA_FENCE = registerBlock("azalea_fence", new FenceBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block AZALEA_FENCE_GATE = registerBlock("azalea_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS), WoodType.CHERRY));
    public static final Block AZALEA_BUTTON = registerBlock("azalea_button", new ButtonBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS), BlockSetType.CHERRY, 5, true));
    public static final Block AZALEA_PRESSURE_PLATE = registerBlock("azalea_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(CHERRY_PLANKS), BlockSetType.CHERRY));
    public static final Block AZALEA_DOOR = registerBlock("azalea_door", new DoorBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).nonOpaque(), BlockSetType.CHERRY));
    public static final Block AZALEA_TRAPDOOR = registerBlock("azalea_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).nonOpaque(), BlockSetType.CHERRY));
    public static final Block BLOOMING_AZALEA_DOOR = registerBlock("blooming_azalea_door", new DoorBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).nonOpaque(), BlockSetType.CHERRY));
    public static final Block BLOOMING_AZALEA_TRAPDOOR = registerBlock("blooming_azalea_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS).nonOpaque(), BlockSetType.CHERRY));

    //Pine woodset
    public static final Block PINE_SAPLING = registerBlock("pine_sapling", new SaplingBlock(new PineSaplingGenerator(), FabricBlockSettings.copyOf(OAK_SAPLING)));
    public static final Block PINE_LEAVES = registerBlock("pine_leaves", new LeavesBlock(FabricBlockSettings.copyOf(OAK_LEAVES)));
    public static final Block PINE_LOG = registerBlock("pine_log", new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG)));

    public static final Block PINE_WOOD = registerBlock("pine_wood", new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG)));
    public static final Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood", new PillarBlock(FabricBlockSettings.copyOf(STRIPPED_OAK_LOG)));
    public static final Block PINE_PLANKS = registerBlock("pine_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block PINE_SLAB = registerBlock("pine_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_SLAB)));
    public static final Block PINE_STAIRS = registerBlock("pine_stairs", new StairsBlock(PINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(OAK_LEAVES)));
    public static final Block PINE_FENCE = registerBlock("pine_fence", new FenceBlock(FabricBlockSettings.copyOf(OAK_FENCE)));
    public static final Block PINE_FENCE_GATE = registerBlock("pine_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(OAK_FENCE_GATE), WoodType.OAK));
    public static final Block PINE_BUTTON = registerBlock("pine_button", new ButtonBlock(FabricBlockSettings.copyOf(OAK_BUTTON), BlockSetType.OAK, 5, true));
    public static final Block PINE_PRESSURE_PLATE = registerBlock("pine_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PINE_DOOR = registerBlock("pine_door", new DoorBlock(FabricBlockSettings.copyOf(OAK_DOOR), BlockSetType.OAK));
    public static final Block PINE_TRAPDOOR = registerBlock("pine_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(OAK_TRAPDOOR), BlockSetType.OAK));

    ///Misc
    public static final Block POTION_RACK = registerBlock("potion_rack", new PotionRackBlock(FabricBlockSettings.copyOf(CHISELED_BOOKSHELF)));

    private static Block registerBlock(String name, Block block){
        registeringBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Cellulose.MOD_ID, name), block);
    }

//    private static Block registerBlockWithoutBlockItem(String name, Block block){
//        return Registry.register(Registries.BLOCK, new Identifier(Cellulose.MOD_ID, name), block);
//    }

    private static void registeringBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(Cellulose.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerCelluloseBlocks()
    {
        Cellulose.LOGGER.info("Registering mod blocks");
    }
}
