package net.qzimyion.cellulose.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseBlocks
{
    //This section adds blocks
    public static final Block VERTICAL_OAK_PLANKS = registerBlock("vertical_oak_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANKS = registerBlock("vertical_birch_planks", new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));
    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic", new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANKS = registerBlock("vertical_spruce_planks", new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANKS = registerBlock("vertical_dark_oak_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANKS = registerBlock("vertical_jungle_planks", new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));
    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANKS = registerBlock("vertical_acacia_planks", new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));
    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_MANGROVE_PLANKS = registerBlock("vertical_mangrove_planks", new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));
    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic", new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANKS = registerBlock("vertical_bamboo_planks", new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANKS = registerBlock("vertical_cherry_planks", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANKS = registerBlock("vertical_crimson_planks", new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).burnable()));
    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic", new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block VERTICAL_WARPED_PLANKS = registerBlock("vertical_warped_planks", new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).burnable()));
    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic", new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));

    //For Frame and Lintel blocks
    public static final Block OAK_FRAME = registerBlock("oak_frame", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block OAK_LINTELS = registerBlock("oak_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).nonOpaque().burnable()));
    public static final Block BIRCH_FRAME = registerBlock("birch_frame", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block BIRCH_LINTELS = registerBlock("birch_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).nonOpaque().burnable()));
    public static final Block SPRUCE_FRAME = registerBlock("spruce_frame", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(1f,1f).burnable()));
    public static final Block SPRUCE_LINTELS = registerBlock("spruce_lintels", new PaneBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SCAFFOLDING).nonOpaque().strength(0.3f,0.3f).nonOpaque().burnable()));



    //This section adds stairs
    /*Vertical plank stairs*/
    public static final Block VERTICAL_OAK_PLANKS_STAIRS = registerBlock("vertical_oak_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANKS_STAIRS = registerBlock("vertical_birch_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_BIRCH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANKS_STAIRS = registerBlock("vertical_spruce_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_SPRUCE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANKS_STAIRS = registerBlock("vertical_dark_oak_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_DARK_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANKS_STAIRS = registerBlock("vertical_jungle_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_JUNGLE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANKS_STAIRS = registerBlock("vertical_acacia_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_ACACIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANKS_STAIRS = registerBlock("vertical_crimson_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_CRIMSON_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).burnable()));
    public static final Block VERTICAL_WARPED_PLANKS_STAIRS = registerBlock("vertical_warped_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_WARPED_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).burnable()));
    public static final Block VERTICAL_MANGROVE_PLANKS_STAIRS = registerBlock("vertical_mangrove_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_MANGROVE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANKS_STAIRS = registerBlock("vertical_bamboo_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_BAMBOO_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANKS_STAIRS = registerBlock("vertical_cherry_planks_stairs", new StairsBlock(CelluloseBlocks.VERTICAL_CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));

    /* Mosaic stairs*/
    public static final Block OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs", new StairsBlock(CelluloseBlocks.OAK_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs", new StairsBlock(CelluloseBlocks.BIRCH_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));
    public static final Block SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs", new StairsBlock(CelluloseBlocks.SPRUCE_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs", new StairsBlock(CelluloseBlocks.JUNGLE_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));
    public static final Block DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs", new StairsBlock(CelluloseBlocks.DARK_OAK_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));
    public static final Block ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs", new StairsBlock(CelluloseBlocks.ACACIA_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));
    public static final Block CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs", new StairsBlock(CelluloseBlocks.CRIMSON_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs", new StairsBlock(CelluloseBlocks.WARPED_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static final Block MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs", new StairsBlock(CelluloseBlocks.MANGROVE_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs", new StairsBlock(CelluloseBlocks.CHERRY_MOSAIC.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));


    //This section adds slabs
    /*Vertical plank slabs*/
    public static final Block VERTICAL_OAK_PLANKS_SLABS = registerBlock("vertical_oak_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANKS_SLABS = registerBlock("vertical_birch_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANKS_SLABS = registerBlock("vertical_spruce_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB)));
    public static final Block VERTICAL_JUNGLE_PLANKS_SLABS = registerBlock("vertical_jungle_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB)));
    public static final Block VERTICAL_DARK_OAK_PLANKS_SLABS = registerBlock("vertical_dark_oak_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_SLAB)));
    public static final Block VERTICAL_ACACIA_PLANKS_SLABS = registerBlock("vertical_acacia_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_SLAB)));
    public static final Block VERTICAL_CRIMSON_PLANKS_SLABS = registerBlock("vertical_crimson_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_SLAB)));
    public static final Block VERTICAL_WARPED_PLANKS_SLABS = registerBlock("vertical_warped_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_SLAB)));
    public static final Block VERTICAL_MANGROVE_PLANKS_SLABS = registerBlock("vertical_mangrove_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_SLAB)));
    public static final Block VERTICAL_BAMBOO_PLANKS_SLABS = registerBlock("vertical_bamboo_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_SLAB)));
    public static final Block VERTICAL_CHERRY_PLANKS_SLABS = registerBlock("vertical_cherry_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));

    /* Mosaic slabs*/
    public static final Block OAK_MOSAIC_SLABS = registerBlock("oak_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_MOSAIC_SLABS = registerBlock("birch_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));
    public static final Block SPRUCE_MOSAIC_SLABS = registerBlock("spruce_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block JUNGLE_MOSAIC_SLABS = registerBlock("jungle_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));
    public static final Block DARK_OAK_MOSAIC_SLABS = registerBlock("dark_oak_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));
    public static final Block ACACIA_MOSAIC_SLABS = registerBlock("acacia_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));
    public static final Block CRIMSON_MOSAIC_SLABS = registerBlock("crimson_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_MOSAIC_SLABS = registerBlock("warped_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static final Block MANGROVE_MOSAIC_SLABS = registerBlock("mangrove_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_MOSAIC_SLABS = registerBlock("cherry_mosaic_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));


    // Sawmill Block //

    public static final Block SAWMILL = registerBlock("sawmill", new SawmillBlock(AbstractBlock.Settings.create().burnable().nonOpaque().strength(2.5f,2.5f).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).mapColor(MapColor.BROWN)));

    // Engraved logs (Idea by Amaro from C&C project and Textures by Raze#3510 on Discord)

    public static final Block ENGRAVED_OAK = registerBlock("engraved_oak_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_OAK_WOOD = registerBlock("engraved_oak_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_BIRCH = registerBlock("engraved_birch_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_BIRCH_WOOD = registerBlock("engraved_birch_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_SPRUCE = registerBlock("engraved_spruce_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_SPRUCE_WOOD = registerBlock("engraved_spruce_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_DARK_OAK = registerBlock("engraved_dark_oak_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_DARK_OAK_WOOD = registerBlock("engraved_dark_oak_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_JUNGLE = registerBlock("engraved_jungle_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_JUNGLE_WOOD = registerBlock("engraved_jungle_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_ACACIA = registerBlock("engraved_acacia_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block ENGRAVED_ACACIA_WOOD = registerBlock("engraved_acacia_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ENGRAVED_CRIMSON = registerBlock("engraved_crimson_stem", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM)));
    public static final Block ENGRAVED_CRIMSON_HYPHAE = registerBlock("engraved_crimson_hyphae", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block ENGRAVED_WARPED = registerBlock("engraved_warped_stem", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM)));
    public static final Block ENGRAVED_WARPED_HYPHAE = registerBlock("engraved_warped_hyphae", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static final Block ENGRAVED_MANGROVE = registerBlock("engraved_mangrove_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_MANGROVE_LOG)));
    public static final Block ENGRAVED_MANGROVE_WOOD = registerBlock("engraved_mangrove_wood",new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_MANGROVE_WOOD)));
    public static final Block ENGRAVED_CHERRY = registerBlock("engraved_cherry_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block ENGRAVED_CHERRY_WOOD = registerBlock("engraved_cherry_wood",new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));

    //Chipped wood

    public static final Block CHIPPED_OAK = registerBlock("chipped_oak_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block CHIPPED_OAK_WOOD = registerBlock("chipped_oak_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));


    private static Block registerBlock(String name, Block block){
        registeringBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Cellulose.MOD_ID, name), block);
    }

    private static BlockItem registeringBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Cellulose.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerCelluloseBlocks()
    {
        Cellulose.LOGGER.info("Registering mod blocks for " + Cellulose.MOD_ID);
    }
}
