package net.qzimyion.cellulose.blocks;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

public class CelluloseStrippableBlock
{
    public static void registerStrippableBlocks()
    {
        //Cactus stuff
        StrippableBlockRegistry.register(CACTUS_BUNDLE, STRIPPED_CACTUS);
        StrippableBlockRegistry.register(CACTUS_CROWN, STRIPPED_CACTUS_CROWN);
        StrippableBlockRegistry.register(STRIPPED_CACTUS, ENGRAVED_CACTUS);
        StrippableBlockRegistry.register(STRIPPED_CACTUS_CROWN, ENGRAVED_CACTUS_CROWN);
        StrippableBlockRegistry.register(CHIPPED_CACTUS_CROWN, STRIPPED_CHIPPED_CACTUS_CROWN);
        //Azalea stuff
        StrippableBlockRegistry.register(AZALEA_LOG, STRIPPED_AZALEA_LOG);
        StrippableBlockRegistry.register(AZALEA_WOOD, STRIPPED_AZALEA_WOOD);
        StrippableBlockRegistry.register(STRIPPED_AZALEA_LOG, ENGRAVED_AZALEA);
        StrippableBlockRegistry.register(STRIPPED_AZALEA_WOOD, ENGRAVED_AZALEA_WOOD);
        StrippableBlockRegistry.register(BLOOMING_AZALEA_LOG, BLOOMING_STRIPPED_AZALEA);
        StrippableBlockRegistry.register(BLOOMING_AZALEA_WOOD, BLOOMING_STRIPPED_AZALEA_WOOD);
        StrippableBlockRegistry.register(BLOOMING_STRIPPED_AZALEA, ENGRAVED_BLOOMING_AZALEA);
        StrippableBlockRegistry.register(BLOOMING_STRIPPED_AZALEA_WOOD, ENGRAVED_BLOOMING_AZALEA_WOOD);
        StrippableBlockRegistry.register(CHIPPED_AZALEA_WOOD, STRIPPED_CHIPPED_AZALEA_WOOD);
        //Chipped Stripped
        StrippableBlockRegistry.register(CHIPPED_OAK, STRIPPED_CHIPPED_OAK);
        StrippableBlockRegistry.register(CHIPPED_BIRCH, STRIPPED_CHIPPED_BIRCH);
        StrippableBlockRegistry.register(CHIPPED_SPRUCE, STRIPPED_CHIPPED_SPRUCE);
        StrippableBlockRegistry.register(CHIPPED_DARK_OAK, STRIPPED_CHIPPED_DARK_OAK);
        StrippableBlockRegistry.register(CHIPPED_JUNGLE, STRIPPED_CHIPPED_JUNGLE);
        StrippableBlockRegistry.register(CHIPPED_ACACIA, STRIPPED_CHIPPED_ACACIA);
        StrippableBlockRegistry.register(CHIPPED_CRIMSON, STRIPPED_CHIPPED_CRIMSON);
        StrippableBlockRegistry.register(CHIPPED_WARPED, STRIPPED_CHIPPED_WARPED);
        StrippableBlockRegistry.register(CHIPPED_MANGROVE, STRIPPED_CHIPPED_MANGROVE);
        StrippableBlockRegistry.register(CHIPPED_CHERRY, STRIPPED_CHIPPED_CHERRY);
        StrippableBlockRegistry.register(CHIPPED_CACTUS, STRIPPED_CHIPPED_CACTUS);
        StrippableBlockRegistry.register(CHIPPED_AZALEA, STRIPPED_CHIPPED_AZALEA);
        StrippableBlockRegistry.register(CHIPPED_OAK_WOOD, STRIPPED_CHIPPED_OAK_WOOD);
        StrippableBlockRegistry.register(CHIPPED_BIRCH_WOOD, STRIPPED_CHIPPED_BIRCH_WOOD);
        StrippableBlockRegistry.register(CHIPPED_SPRUCE_WOOD, STRIPPED_CHIPPED_SPRUCE_WOOD);
        StrippableBlockRegistry.register(CHIPPED_DARK_OAK_WOOD, STRIPPED_CHIPPED_DARK_OAK_WOOD);
        StrippableBlockRegistry.register(CHIPPED_JUNGLE_WOOD, STRIPPED_CHIPPED_JUNGLE_WOOD);
        StrippableBlockRegistry.register(CHIPPED_ACACIA_WOOD, STRIPPED_CHIPPED_ACACIA_WOOD);
        StrippableBlockRegistry.register(CHIPPED_CRIMSON_HYPHAE, STRIPPED_CHIPPED_CRIMSON_HYPHAE);
        StrippableBlockRegistry.register(CHIPPED_WARPED_HYPHAE, STRIPPED_CHIPPED_WARPED_HYPHAE);
        StrippableBlockRegistry.register(CHIPPED_MANGROVE_WOOD, STRIPPED_CHIPPED_MANGROVE_WOOD);
        StrippableBlockRegistry.register(CHIPPED_CHERRY_WOOD, STRIPPED_CHIPPED_CHERRY_WOOD);
        //Post blocks
        StrippableBlockRegistry.register(OAK_POST, STRIPPED_OAK_POST);
        StrippableBlockRegistry.register(BIRCH_POST, STRIPPED_BIRCH_POST);
        StrippableBlockRegistry.register(SPRUCE_POST, STRIPPED_SPRUCE_POST);
        StrippableBlockRegistry.register(DARK_OAK_POST, STRIPPED_DARK_OAK_POST);
        StrippableBlockRegistry.register(JUNGLE_POST, STRIPPED_JUNGLE_POST);
        StrippableBlockRegistry.register(ACACIA_POST, STRIPPED_ACACIA_POST);
        StrippableBlockRegistry.register(CRIMSON_POST, STRIPPED_CRIMSON_POST);
        StrippableBlockRegistry.register(WARPED_POST, STRIPPED_WARPED_POST);
        StrippableBlockRegistry.register(MANGROVE_POST, STRIPPED_MANGROVE_POST);
        StrippableBlockRegistry.register(BAMBOO_POST, STRIPPED_BAMBOO_POST);
        StrippableBlockRegistry.register(CHERRY_POST, STRIPPED_CHERRY_POST);
        StrippableBlockRegistry.register(CACTUS_POST, STRIPPED_CACTUS_POST);

        ///Overworld Mushroom stuff
        /*Red*/

        /*Brown*/

        ///Petrified Wood

        ///Gay™ wood
    }
}
