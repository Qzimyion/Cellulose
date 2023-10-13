package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.util.CelluloseTags;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.ItemTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.boats.CelluloseBoats.*;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

@SuppressWarnings("noinspection deprecation")
public class CelluloseItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public CelluloseItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {


        TagKey<Item> LOG_SLABS = TagKey.of(RegistryKeys.ITEM, new Identifier(Cellulose.MOD_ID, "log_slabs"));
        TagKey<Item> LOG_STAIRS = TagKey.of(RegistryKeys.ITEM, new Identifier(Cellulose.MOD_ID, "log_stairs"));


        ///Vanilla Tags

        getOrCreateTagBuilder(PLANKS)
                .add(Item.fromBlock(BLOOMING_AZALEA_PLANKS))
                .add(Item.fromBlock(AZALEA_PLANKS))
                .add(Item.fromBlock(CACTUS_PLANKS))
                .add(Item.fromBlock(VERTICAL_OAK_PLANKS))
                .add(Item.fromBlock(VERTICAL_BIRCH_PLANKS))
                .add(Item.fromBlock(VERTICAL_SPRUCE_PLANKS))
                .add(Item.fromBlock(VERTICAL_DARK_OAK_PLANKS))
                .add(Item.fromBlock(VERTICAL_JUNGLE_PLANKS))
                .add(Item.fromBlock(VERTICAL_ACACIA_PLANKS))
                .add(Item.fromBlock(VERTICAL_CRIMSON_PLANKS))
                .add(Item.fromBlock(VERTICAL_WARPED_PLANKS))
                .add(Item.fromBlock(VERTICAL_MANGROVE_PLANKS))
                .add(Item.fromBlock(VERTICAL_BAMBOO_PLANKS))
                .add(Item.fromBlock(VERTICAL_CHERRY_PLANKS))
                .add(Item.fromBlock(VERTICAL_CACTUS_PLANKS))
                .add(Item.fromBlock(VERTICAL_AZALEA_PLANKS))
                .add(Item.fromBlock(VERTICAL_BLOOMING_AZALEA_PLANKS));

        getOrCreateTagBuilder(WOODEN_SLABS)
                .add(Item.fromBlock(BLOOMING_AZALEA_SLAB))
                .add(Item.fromBlock(AZALEA_SLAB))
                .add(Item.fromBlock(CACTUS_SLAB))
                .add(Item.fromBlock(VERTICAL_OAK_SLAB))
                .add(Item.fromBlock(VERTICAL_BIRCH_SLAB))
                .add(Item.fromBlock(VERTICAL_SPRUCE_SLAB))
                .add(Item.fromBlock(VERTICAL_DARK_OAK_SLAB))
                .add(Item.fromBlock(VERTICAL_JUNGLE_SLAB))
                .add(Item.fromBlock(VERTICAL_ACACIA_SLAB))
                .add(Item.fromBlock(VERTICAL_CRIMSON_SLAB))
                .add(Item.fromBlock(VERTICAL_WARPED_SLAB))
                .add(Item.fromBlock(VERTICAL_MANGROVE_SLAB))
                .add(Item.fromBlock(VERTICAL_BAMBOO_SLAB))
                .add(Item.fromBlock(VERTICAL_CHERRY_SLAB))
                .add(Item.fromBlock(VERTICAL_CACTUS_SLAB))
                .add(Item.fromBlock(VERTICAL_AZALEA_SLAB))
                .add(Item.fromBlock(VERTICAL_BLOOMING_AZALEA_SLAB));

        getOrCreateTagBuilder(WOODEN_STAIRS)
                .add(Item.fromBlock(BLOOMING_AZALEA_STAIRS))
                .add(Item.fromBlock(AZALEA_STAIRS))
                .add(Item.fromBlock(CACTUS_STAIRS))
                .add(Item.fromBlock(VERTICAL_OAK_STAIR))
                .add(Item.fromBlock(VERTICAL_BIRCH_STAIR))
                .add(Item.fromBlock(VERTICAL_SPRUCE_STAIR))
                .add(Item.fromBlock(VERTICAL_DARK_OAK_STAIR))
                .add(Item.fromBlock(VERTICAL_JUNGLE_STAIR))
                .add(Item.fromBlock(VERTICAL_ACACIA_STAIR))
                .add(Item.fromBlock(VERTICAL_CRIMSON_STAIR))
                .add(Item.fromBlock(VERTICAL_WARPED_STAIR))
                .add(Item.fromBlock(VERTICAL_MANGROVE_STAIR))
                .add(Item.fromBlock(VERTICAL_BAMBOO_STAIR))
                .add(Item.fromBlock(VERTICAL_CHERRY_STAIR))
                .add(Item.fromBlock(VERTICAL_CACTUS_STAIR))
                .add(Item.fromBlock(VERTICAL_AZALEA_STAIR))
                .add(Item.fromBlock(VERTICAL_BLOOMING_AZALEA_STAIR));

        getOrCreateTagBuilder(WOODEN_FENCES)
                .add(Item.fromBlock(AZALEA_FENCE))
                .add(Item.fromBlock(CACTUS_FENCE));

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(Item.fromBlock(AZALEA_FENCE_GATE))
                .add(Item.fromBlock(CACTUS_FENCE_GATE));

        getOrCreateTagBuilder(WOODEN_BUTTONS)
                .add(Item.fromBlock(AZALEA_BUTTON))
                .add(Item.fromBlock(CACTUS_BUTTON));

        getOrCreateTagBuilder(WOODEN_PRESSURE_PLATES)
                .add(Item.fromBlock(AZALEA_PRESSURE_PLATE))
                .add(Item.fromBlock(CACTUS_PRESSURE_PLATE));

        getOrCreateTagBuilder(WOODEN_DOORS)
                .add(Item.fromBlock(BLOOMING_AZALEA_DOOR))
                .add(Item.fromBlock(AZALEA_DOOR))
                .add(Item.fromBlock(CACTUS_DOOR));

        getOrCreateTagBuilder(WOODEN_TRAPDOORS)
                .add(Item.fromBlock(BLOOMING_AZALEA_TRAPDOOR))
                .add(Item.fromBlock(AZALEA_TRAPDOOR))
                .add(Item.fromBlock(CACTUS_TRAPDOOR));

        //Logs
        getOrCreateTagBuilder(OAK_LOGS)
                .add(Item.fromBlock(ENGRAVED_OAK))
                .add(Item.fromBlock(ENGRAVED_OAK_WOOD))
                .add(Item.fromBlock(CHIPPED_OAK))
                .add(Item.fromBlock(CHIPPED_OAK_WOOD));

        getOrCreateTagBuilder(BIRCH_LOGS)
                .add(Item.fromBlock(ENGRAVED_BIRCH))
                .add(Item.fromBlock(ENGRAVED_BIRCH_WOOD))
                .add(Item.fromBlock(CHIPPED_BIRCH))
                .add(Item.fromBlock(CHIPPED_BIRCH_WOOD));

        getOrCreateTagBuilder(SPRUCE_LOGS)
                .add(Item.fromBlock(ENGRAVED_SPRUCE))
                .add(Item.fromBlock(ENGRAVED_SPRUCE_WOOD))
                .add(Item.fromBlock(CHIPPED_SPRUCE))
                .add(Item.fromBlock(CHIPPED_SPRUCE_WOOD));

        getOrCreateTagBuilder(DARK_OAK_LOGS)
                .add(Item.fromBlock(ENGRAVED_DARK_OAK))
                .add(Item.fromBlock(ENGRAVED_DARK_OAK_WOOD))
                .add(Item.fromBlock(CHIPPED_DARK_OAK))
                .add(Item.fromBlock(CHIPPED_DARK_OAK_WOOD));

        getOrCreateTagBuilder(ACACIA_LOGS)
                .add(Item.fromBlock(ENGRAVED_ACACIA))
                .add(Item.fromBlock(ENGRAVED_ACACIA_WOOD))
                .add(Item.fromBlock(CHIPPED_OAK))
                .add(Item.fromBlock(CHIPPED_OAK_WOOD));

        getOrCreateTagBuilder(JUNGLE_LOGS)
                .add(Item.fromBlock(ENGRAVED_JUNGLE))
                .add(Item.fromBlock(ENGRAVED_JUNGLE_WOOD))
                .add(Item.fromBlock(CHIPPED_JUNGLE))
                .add(Item.fromBlock(CHIPPED_JUNGLE_WOOD));

        getOrCreateTagBuilder(CRIMSON_STEMS)
                .add(Item.fromBlock(ENGRAVED_CRIMSON))
                .add(Item.fromBlock(ENGRAVED_CRIMSON_HYPHAE))
                .add(Item.fromBlock(CHIPPED_CRIMSON))
                .add(Item.fromBlock(CHIPPED_CRIMSON_HYPHAE));

        getOrCreateTagBuilder(WARPED_STEMS)
                .add(Item.fromBlock(ENGRAVED_WARPED))
                .add(Item.fromBlock(ENGRAVED_WARPED_HYPHAE))
                .add(Item.fromBlock(CHIPPED_WARPED))
                .add(Item.fromBlock(CHIPPED_WARPED_HYPHAE));

        getOrCreateTagBuilder(MANGROVE_LOGS)
                .add(Item.fromBlock(ENGRAVED_MANGROVE))
                .add(Item.fromBlock(ENGRAVED_MANGROVE_WOOD))
                .add(Item.fromBlock(CHIPPED_MANGROVE))
                .add(Item.fromBlock(CHIPPED_MANGROVE_WOOD));

        getOrCreateTagBuilder(CHERRY_LOGS)
                .add(Item.fromBlock(ENGRAVED_CHERRY))
                .add(Item.fromBlock(ENGRAVED_CHERRY_WOOD))
                .add(Item.fromBlock(CHIPPED_CHERRY))
                .add(Item.fromBlock(CHIPPED_CHERRY_WOOD));

        getOrCreateTagBuilder(LOGS)
                .forceAddTag(LOGS_THAT_BURN)
                .forceAddTag(CRIMSON_STEMS)
                .forceAddTag(WARPED_STEMS)
                .forceAddTag(CelluloseTags.Items.CACTUS_LOGS);

        getOrCreateTagBuilder(LOGS_THAT_BURN)
                .forceAddTag(OAK_LOGS)
                .forceAddTag(BIRCH_LOGS)
                .forceAddTag(SPRUCE_LOGS)
                .forceAddTag(DARK_OAK_LOGS)
                .forceAddTag(JUNGLE_LOGS)
                .forceAddTag(ACACIA_LOGS)
                .forceAddTag(MANGROVE_LOGS)
                .forceAddTag(CHERRY_LOGS)
                .forceAddTag(CelluloseTags.Items.AZALEA_LOGS);

        getOrCreateTagBuilder(BOATS)
                .add(CACTUS_BOAT_ID)
                .add(AZALEA_BOAT_ID)
                .add(BLOOMING_AZALEA_BOAT_ID)
        ;

        getOrCreateTagBuilder(CHEST_BOATS)
                .add(CACTUS_CHEST_BOAT_ID)
                .add(AZALEA_CHEST_BOAT_ID)
                .add(BLOOMING_AZALEA_CHEST_BOAT_ID)
                ;

        ///Modded Tags

        getOrCreateTagBuilder(CelluloseTags.Items.WOODEN_MOSAICS)
                .add(Item.fromBlock(OAK_MOSAIC))
                .add(Item.fromBlock(BIRCH_MOSAIC))
                .add(Item.fromBlock(SPRUCE_MOSAIC))
                .add(Item.fromBlock(DARK_OAK_MOSAIC))
                .add(Item.fromBlock(JUNGLE_MOSAIC))
                .add(Item.fromBlock(ACACIA_MOSAIC))
                .add(Item.fromBlock(CRIMSON_MOSAIC))
                .add(Item.fromBlock(WARPED_MOSAIC))
                .add(Item.fromBlock(MANGROVE_MOSAIC))
                .add(Items.BAMBOO_MOSAIC)
                .add(Item.fromBlock(CHERRY_MOSAIC))
                .add(Item.fromBlock(CACTUS_MOSAIC))
                .add(Item.fromBlock(AZALEA_MOSAIC))
                .add(Item.fromBlock(BLOOMING_AZALEA_MOSAIC));

        getOrCreateTagBuilder(CelluloseTags.Items.WOODEN_MOSAICS_SLABS)
                .add(Item.fromBlock(OAK_MOSAIC_SLABS))
                .add(Item.fromBlock(BIRCH_MOSAIC_SLABS))
                .add(Item.fromBlock(SPRUCE_MOSAIC_SLABS))
                .add(Item.fromBlock(DARK_OAK_MOSAIC_SLABS))
                .add(Item.fromBlock(JUNGLE_MOSAIC_SLABS))
                .add(Item.fromBlock(ACACIA_MOSAIC_SLABS))
                .add(Item.fromBlock(CRIMSON_MOSAIC_SLABS))
                .add(Item.fromBlock(WARPED_MOSAIC_SLABS))
                .add(Item.fromBlock(MANGROVE_MOSAIC_SLABS))
                .add(Items.BAMBOO_MOSAIC_SLAB)
                .add(Item.fromBlock(CHERRY_MOSAIC_SLABS))
                .add(Item.fromBlock(CACTUS_MOSAIC_SLABS))
                .add(Item.fromBlock(AZALEA_MOSAIC_SLABS))
                .add(Item.fromBlock(BLOOMING_AZALEA_MOSAIC_SLABS));

        getOrCreateTagBuilder(CelluloseTags.Items.WOODEN_MOSAICS_STAIRS)
                .add(Item.fromBlock(OAK_MOSAIC_STAIRS))
                .add(Item.fromBlock(BIRCH_MOSAIC_STAIRS))
                .add(Item.fromBlock(SPRUCE_MOSAIC_STAIRS))
                .add(Item.fromBlock(DARK_OAK_MOSAIC_STAIRS))
                .add(Item.fromBlock(JUNGLE_MOSAIC_STAIRS))
                .add(Item.fromBlock(ACACIA_MOSAIC_STAIRS))
                .add(Item.fromBlock(CRIMSON_MOSAIC_STAIRS))
                .add(Item.fromBlock(WARPED_MOSAIC_STAIRS))
                .add(Item.fromBlock(MANGROVE_MOSAIC_STAIRS))
                .add(Items.BAMBOO_MOSAIC_STAIRS)
                .add(Item.fromBlock(CHERRY_MOSAIC_STAIRS))
                .add(Item.fromBlock(CACTUS_MOSAIC_STAIRS))
                .add(Item.fromBlock(AZALEA_MOSAIC_STAIRS))
                .add(Item.fromBlock(BLOOMING_AZALEA_MOSAIC_STAIRS));

        //Food
        getOrCreateTagBuilder(CelluloseTags.Items.ACORNS)
                .add(ACORN);

        //Flowering
        getOrCreateTagBuilder(CelluloseTags.Items.AZALEA_FLOWER)
                .add(Item.fromBlock(AZALEA_FLOWERS));

        //Woodsets
        getOrCreateTagBuilder(CelluloseTags.Items.CACTUS_LOGS)
                .add(Item.fromBlock(CACTUS_CROWN))
                .add(Item.fromBlock(STRIPPED_CACTUS))
                .add(Item.fromBlock(STRIPPED_CACTUS_CROWN))
                .add(Item.fromBlock(ENGRAVED_CACTUS))
                .add(Item.fromBlock(ENGRAVED_CACTUS_CROWN))
                .add(Item.fromBlock(CHIPPED_CACTUS))
                .add(Item.fromBlock(CHIPPED_CACTUS_CROWN));

        getOrCreateTagBuilder(CelluloseTags.Items.AZALEA_LOGS)
                .add(Item.fromBlock(AZALEA_LOG))
                .add(Item.fromBlock(AZALEA_WOOD))
                .add(Item.fromBlock(STRIPPED_AZALEA_LOG))
                .add(Item.fromBlock(STRIPPED_AZALEA_WOOD))
                .add(Item.fromBlock(ENGRAVED_AZALEA))
                .add(Item.fromBlock(ENGRAVED_AZALEA_WOOD))
                .add(Item.fromBlock(CHIPPED_AZALEA))
                .add(Item.fromBlock(CHIPPED_AZALEA_WOOD));

        getOrCreateTagBuilder(CelluloseTags.Items.PAVEMENTS)
                .add(Item.fromBlock(OAK_PLANK_PAVEMENT))
                .add(Item.fromBlock(BIRCH_PLANK_PAVEMENT))
                .add(Item.fromBlock(SPRUCE_PLANK_PAVEMENT))
                .add(Item.fromBlock(DARK_OAK_PLANK_PAVEMENT))
                .add(Item.fromBlock(JUNGLE_PLANK_PAVEMENT))
                .add(Item.fromBlock(ACACIA_PLANK_PAVEMENT))
                .add(Item.fromBlock(CRIMSON_PLANK_PAVEMENT))
                .add(Item.fromBlock(WARPED_PLANK_PAVEMENT))
                .add(Item.fromBlock(MANGROVE_PLANK_PAVEMENT))
                .add(Item.fromBlock(BAMBOO_PLANK_PAVEMENT))
                .add(Item.fromBlock(CHERRY_PLANK_PAVEMENT))
                .add(Item.fromBlock(CACTUS_PLANK_PAVEMENT))
                .add(Item.fromBlock(AZALEA_PLANK_PAVEMENT))
                .add(Item.fromBlock(BLOOMING_AZALEA_PLANK_PAVEMENT))
        ;

        getOrCreateTagBuilder(CelluloseTags.Items.WOODEN_FRAMES)
                .add(Item.fromBlock(OAK_FRAME))
                .add(Item.fromBlock(BIRCH_FRAME))
                .add(Item.fromBlock(SPRUCE_FRAME))
                .add(Item.fromBlock(DARK_OAK_FRAME))
                .add(Item.fromBlock(JUNGLE_FRAME))
                .add(Item.fromBlock(ACACIA_FRAME))
                .add(Item.fromBlock(CRIMSON_FRAME))
                .add(Item.fromBlock(WARPED_FRAME))
                .add(Item.fromBlock(MANGROVE_FRAME))
                .add(Item.fromBlock(BAMBOO_FRAME))
                .add(Item.fromBlock(CHERRY_FRAME))
                .add(Item.fromBlock(CACTUS_FRAME))
                .add(Item.fromBlock(AZALEA_FRAME))
                .add(Item.fromBlock(BLOOMING_AZALEA_FRAME))
        ;


        getOrCreateTagBuilder(CelluloseTags.Items.LINTELS)
                .add(Item.fromBlock(OAK_LINTELS))
                .add(Item.fromBlock(BIRCH_LINTELS))
                .add(Item.fromBlock(SPRUCE_LINTELS))
                .add(Item.fromBlock(DARK_OAK_LINTELS))
                .add(Item.fromBlock(JUNGLE_LINTELS))
                .add(Item.fromBlock(ACACIA_LINTELS))
                .add(Item.fromBlock(CRIMSON_LINTELS))
                .add(Item.fromBlock(WARPED_LINTELS))
                .add(Item.fromBlock(MANGROVE_LINTELS))
                .add(Item.fromBlock(BAMBOO_LINTELS))
                .add(Item.fromBlock(CHERRY_LINTELS))
                .add(Item.fromBlock(CACTUS_LINTELS))
                .add(Item.fromBlock(AZALEA_LINTELS))
                .add(Item.fromBlock(BLOOMING_AZALEA_LINTELS))
        ;

        //Barks
        getOrCreateTagBuilder(CelluloseTags.Items.SAWDUST)
                .add(OAK_SAWDUST)
                .add(BIRCH_SAWDUST)
                .add(SPRUCE_SAWDUST)
                .add(DARK_OAK_SAWDUST)
                .add(JUNGLE_SAWDUST)
                .add(ACACIA_SAWDUST)
                .add(CRIMSON_SAWDUST)
                .add(WARPED_SAWDUST)
                .add(MANGROVE_SAWDUST)
                .add(BAMBOO_SAWDUST)
                .add(CHERRY_SAWDUST)
                .add(AZALEA_SAWDUST)
                ;

        //Plank Tags
        getOrCreateTagBuilder(CelluloseTags.Items.OAK_PLANKS)
                .add(Items.OAK_PLANKS)
                .add(Item.fromBlock(VERTICAL_OAK_PLANKS))
                .add(Item.fromBlock(CHIPPED_OAK_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.BIRCH_PLANKS)
                .add(Items.BIRCH_PLANKS)
                .add(Item.fromBlock(VERTICAL_BIRCH_PLANKS))
                .add(Item.fromBlock(CHIPPED_BIRCH_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.SPRUCE_PLANKS)
                .add(Items.SPRUCE_PLANKS)
                .add(Item.fromBlock(VERTICAL_SPRUCE_PLANKS))
                .add(Item.fromBlock(CHIPPED_SPRUCE_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.DARK_OAK_PLANKS)
                .add(Items.DARK_OAK_PLANKS)
                .add(Item.fromBlock(VERTICAL_DARK_OAK_PLANKS))
                .add(Item.fromBlock(CHIPPED_DARK_OAK_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.JUNGLE_PLANKS)
                .add(Items.JUNGLE_PLANKS)
                .add(Item.fromBlock(VERTICAL_JUNGLE_PLANKS))
                .add(Item.fromBlock(CHIPPED_JUNGLE_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.ACACIA_PLANKS)
                .add(Items.ACACIA_PLANKS)
                .add(Item.fromBlock(VERTICAL_ACACIA_PLANKS))
                .add(Item.fromBlock(CHIPPED_ACACIA_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.CRIMSON_PLANKS)
                .add(Items.CRIMSON_PLANKS)
                .add(Item.fromBlock(VERTICAL_CRIMSON_PLANKS))
                .add(Item.fromBlock(CHIPPED_CRIMSON_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.WARPED_PLANKS)
                .add(Items.WARPED_PLANKS)
                .add(Item.fromBlock(VERTICAL_WARPED_PLANKS))
                .add(Item.fromBlock(CHIPPED_WARPED_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.MANGROVE_PLANKS)
                .add(Items.MANGROVE_PLANKS)
                .add(Item.fromBlock(VERTICAL_MANGROVE_PLANKS))
                .add(Item.fromBlock(CHIPPED_MANGROVE_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.BAMBOO_PLANKS)
                .add(Items.BAMBOO_PLANKS)
                .add(Item.fromBlock(VERTICAL_BAMBOO_PLANKS))
                .add(Item.fromBlock(CHIPPED_BAMBOO_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.CHERRY_PLANKS)
                .add(Items.CHERRY_PLANKS)
                .add(Item.fromBlock(VERTICAL_CHERRY_PLANKS))
                .add(Item.fromBlock(CHIPPED_CHERRY_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.CACTUS_PLANKS)
                .add(Item.fromBlock(CACTUS_PLANKS))
                .add(Item.fromBlock(VERTICAL_CACTUS_PLANKS))
                .add(Item.fromBlock(CHIPPED_CACTUS_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.AZALEA_PLANKS)
                .add(Item.fromBlock(AZALEA_PLANKS))
                .add(Item.fromBlock(VERTICAL_AZALEA_PLANKS))
                .add(Item.fromBlock(CHIPPED_AZALEA_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.BLOOMING_AZALEA_PLANKS)
                .add(Item.fromBlock(BLOOMING_AZALEA_PLANKS))
                .add(Item.fromBlock(VERTICAL_BLOOMING_AZALEA_PLANKS))
                .add(Item.fromBlock(CHIPPED_BLOOMING_AZALEA_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.POTION_RACK_POTIONS)
                .add(Items.GLASS_BOTTLE)
                .add(Items.POTION)
                .add(Items.SPLASH_POTION)
                .add(Items.LINGERING_POTION)
                .add(Items.HONEY_BOTTLE)
                .add(Items.EXPERIENCE_BOTTLE);

        getOrCreateTagBuilder(CelluloseTags.Items.CURING_AGENTS)
                .add(Items.RED_MUSHROOM)
                .add(Items.BROWN_MUSHROOM)
                .add(Items.CRIMSON_FUNGUS)
                .add(Items.WARPED_FUNGUS)
            ;

    }
}
