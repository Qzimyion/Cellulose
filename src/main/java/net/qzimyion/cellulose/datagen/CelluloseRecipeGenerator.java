package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

import static net.minecraft.item.Items.*;
import static net.minecraft.recipe.book.RecipeCategory.*;
import static net.minecraft.registry.tag.ItemTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

public class CelluloseRecipeGenerator extends FabricRecipeProvider {
    public CelluloseRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter)
    {
        /*Crafting table recipes*/
        //This section adds vertical plank recipes (BLOCK)

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_OAK_PLANKS, 3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_OAK_PLANKS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_BIRCH_PLANKS, 3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', BIRCH_PLANKS).criterion(FabricRecipeProvider.hasItem(BIRCH_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BIRCH_PLANKS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_SPRUCE_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', SPRUCE_PLANKS).criterion(FabricRecipeProvider.hasItem(SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_SPRUCE_PLANKS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_DARK_OAK_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', DARK_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_DARK_OAK_PLANKS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_JUNGLE_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', JUNGLE_PLANKS).criterion(FabricRecipeProvider.hasItem(JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_JUNGLE_PLANKS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_ACACIA_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', ACACIA_PLANKS).criterion(FabricRecipeProvider.hasItem(ACACIA_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_ACACIA_PLANKS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_CRIMSON_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', CRIMSON_PLANKS).criterion(FabricRecipeProvider.hasItem(CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CRIMSON_PLANKS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_WARPED_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', WARPED_PLANKS).criterion(FabricRecipeProvider.hasItem(WARPED_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_WARPED_PLANKS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_MANGROVE_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', MANGROVE_PLANKS).criterion(FabricRecipeProvider.hasItem(MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_MANGROVE_PLANKS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_BAMBOO_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', BAMBOO_PLANKS).criterion(FabricRecipeProvider.hasItem(BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromTag(BAMBOO_BLOCKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BAMBOO_PLANKS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_CHERRY_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', CHERRY_PLANKS).criterion(FabricRecipeProvider.hasItem(CHERRY_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CHERRY_PLANKS)));

        //This section adds vertical plank recipes (SLAB)

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_BIRCH_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_BIRCH_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BIRCH_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BIRCH_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_SPRUCE_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_SPRUCE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_SPRUCE_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_DARK_OAK_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_DARK_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_OAK_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_JUNGLE_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_JUNGLE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_JUNGLE_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_ACACIA_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_ACACIA_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_ACACIA_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_ACACIA_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_CRIMSON_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_CRIMSON_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CRIMSON_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_WARPED_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_WARPED_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_WARPED_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_WARPED_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_MANGROVE_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_MANGROVE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_MANGROVE_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_BAMBOO_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_BAMBOO_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromTag(BAMBOO_BLOCKS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BAMBOO_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_CHERRY_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_CHERRY_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CHERRY_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CHERRY_PLANKS_SLABS)));

        //This section adds vertical plank recipes (STAIRS)

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_BIRCH_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_BIRCH_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BIRCH_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BIRCH_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_OAK_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_OAK_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_SPRUCE_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_SPRUCE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_SPRUCE_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_DARK_OAK_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_DARK_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_DARK_OAK_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_JUNGLE_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_JUNGLE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_JUNGLE_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_ACACIA_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_ACACIA_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_ACACIA_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_ACACIA_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_CRIMSON_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_CRIMSON_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CRIMSON_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_WARPED_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_WARPED_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_WARPED_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_WARPED_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_MANGROVE_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_MANGROVE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_MANGROVE_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_BAMBOO_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_BAMBOO_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BAMBOO_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_CHERRY_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_CHERRY_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CHERRY_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CHERRY_PLANKS_STAIRS)));


        // This section adds wooden mosaics recipes (Block)


        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, OAK_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', OAK_SLAB).criterion(FabricRecipeProvider.hasItem(OAK_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(OAK_MOSAIC)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, BIRCH_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', BIRCH_SLAB).criterion(FabricRecipeProvider.hasItem(BIRCH_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(BIRCH_MOSAIC)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, SPRUCE_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', SPRUCE_SLAB).criterion(FabricRecipeProvider.hasItem(SPRUCE_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SPRUCE_MOSAIC)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, DARK_OAK_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', DARK_OAK_SLAB).criterion(FabricRecipeProvider.hasItem(DARK_OAK_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(DARK_OAK_MOSAIC)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, JUNGLE_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', JUNGLE_SLAB).criterion(FabricRecipeProvider.hasItem(JUNGLE_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(JUNGLE_MOSAIC)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, ACACIA_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', ACACIA_SLAB).criterion(FabricRecipeProvider.hasItem(ACACIA_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ACACIA_MOSAIC)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CRIMSON_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', CRIMSON_SLAB).criterion(FabricRecipeProvider.hasItem(CRIMSON_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CRIMSON_MOSAIC)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, WARPED_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', WARPED_SLAB).criterion(FabricRecipeProvider.hasItem(WARPED_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(WARPED_MOSAIC)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, MANGROVE_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', MANGROVE_SLAB).criterion(FabricRecipeProvider.hasItem(MANGROVE_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MANGROVE_MOSAIC)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHERRY_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', CHERRY_SLAB).criterion(FabricRecipeProvider.hasItem(CHERRY_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHERRY_MOSAIC)));

        //This section adds mosaic recipes (SLAB)

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, BIRCH_MOSAIC_SLABS, 6).pattern("###")
                .input('#', BIRCH_MOSAIC).criterion(FabricRecipeProvider.hasItem(BIRCH_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(BIRCH_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, SPRUCE_MOSAIC_SLABS, 6).pattern("###")
                .input('#', SPRUCE_MOSAIC).criterion(FabricRecipeProvider.hasItem(SPRUCE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SPRUCE_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, DARK_OAK_MOSAIC_SLABS, 6).pattern("###")
                .input('#', DARK_OAK_MOSAIC).criterion(FabricRecipeProvider.hasItem(DARK_OAK_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(OAK_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, JUNGLE_MOSAIC_SLABS, 6).pattern("###")
                .input('#', JUNGLE_MOSAIC).criterion(FabricRecipeProvider.hasItem(JUNGLE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(JUNGLE_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, ACACIA_MOSAIC_SLABS, 6).pattern("###")
                .input('#', ACACIA_MOSAIC).criterion(FabricRecipeProvider.hasItem(ACACIA_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ACACIA_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CRIMSON_MOSAIC_SLABS, 6).pattern("###")
                .input('#', CRIMSON_MOSAIC).criterion(FabricRecipeProvider.hasItem(CRIMSON_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CRIMSON_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, WARPED_MOSAIC_SLABS, 6).pattern("###")
                .input('#', WARPED_MOSAIC).criterion(FabricRecipeProvider.hasItem(WARPED_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(WARPED_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, MANGROVE_MOSAIC_SLABS, 6).pattern("###")
                .input('#', MANGROVE_MOSAIC).criterion(FabricRecipeProvider.hasItem(MANGROVE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MANGROVE_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHERRY_MOSAIC_SLABS, 6).pattern("###")
                .input('#', CHERRY_MOSAIC).criterion(FabricRecipeProvider.hasItem(CHERRY_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHERRY_MOSAIC_SLABS)));

        //This section adds mosaic recipes (STAIRS)
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, BIRCH_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', BIRCH_MOSAIC).criterion(FabricRecipeProvider.hasItem(BIRCH_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(BIRCH_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, OAK_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', OAK_MOSAIC).criterion(FabricRecipeProvider.hasItem(OAK_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(OAK_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, SPRUCE_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', SPRUCE_MOSAIC).criterion(FabricRecipeProvider.hasItem(SPRUCE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SPRUCE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, DARK_OAK_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', DARK_OAK_MOSAIC).criterion(FabricRecipeProvider.hasItem(DARK_OAK_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(DARK_OAK_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, JUNGLE_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', JUNGLE_MOSAIC).criterion(FabricRecipeProvider.hasItem(JUNGLE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(JUNGLE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, ACACIA_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ACACIA_MOSAIC).criterion(FabricRecipeProvider.hasItem(ACACIA_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ACACIA_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CRIMSON_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CRIMSON_MOSAIC).criterion(FabricRecipeProvider.hasItem(CRIMSON_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CRIMSON_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, WARPED_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', WARPED_MOSAIC).criterion(FabricRecipeProvider.hasItem(WARPED_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(WARPED_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, MANGROVE_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', MANGROVE_MOSAIC).criterion(FabricRecipeProvider.hasItem(MANGROVE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MANGROVE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHERRY_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CHERRY_MOSAIC).criterion(FabricRecipeProvider.hasItem(CHERRY_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHERRY_MOSAIC_STAIRS)));

        //Sawmill recipe
        ShapedRecipeJsonBuilder.create(DECORATIONS, SAWMILL, 1)
                .pattern(" # ")
                .pattern("AAA").input('#', IRON_INGOT).input('A', PLANKS).criterion(FabricRecipeProvider.hasItem(IRON_INGOT), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SAWMILL)));

        //Frame recipes
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, OAK_FRAME, 5)
                .pattern("#A#")
                .pattern("A#A")
                .pattern("#A#")
                .input('#', OAK_PLANKS).input('A', STICK).criterion(FabricRecipeProvider.hasItem(OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:s").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(OAK_FRAME)));

        //Cactus woodset
        ShapedRecipeJsonBuilder.create(DECORATIONS, CACTUS_BUNDLE, 5)
                .pattern("   ")
                .pattern("## ")
                .pattern("## ")
                .input('#', CACTUS).criterion(FabricRecipeProvider.hasItem(CACTUS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:cactus_wood").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_BUNDLE)));
        offerPlanksRecipe(exporter, CACTUS_PLANKS, CACTUS_BUNDLE, 4);
        offerPlanksRecipe(exporter, CACTUS_PLANKS, CACTUS_CROWN, 4);
        offerPlanksRecipe(exporter, CACTUS_PLANKS, STRIPPED_CACTUS, 4);
        offerPlanksRecipe(exporter, CACTUS_PLANKS, STRIPPED_CACTUS_CROWN, 4);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, CACTUS_SLABS, CACTUS_PLANKS);
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_STAIRS)));
        offerBarkBlockRecipe(exporter, CACTUS_CROWN, CACTUS_BUNDLE);
        offerBarkBlockRecipe(exporter, STRIPPED_CACTUS_CROWN, CACTUS_BUNDLE);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS, CACTUS_MOSAIC, CACTUS_SLABS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, CACTUS_MOSAIC_SLABS, CACTUS_MOSAIC);
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CACTUS_MOSAIC).criterion(FabricRecipeProvider.hasItem(CACTUS_MOSAIC), FabricRecipeProvider.conditionsFromItem(CACTUS_MOSAIC))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_MOSAIC_STAIRS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, CACTUS_BUTTON, 2)
                .input(CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_BUTTONS))
                .group("minecraft:wooden_buttons").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_BUTTON)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_PRESSURE_PLATE, 2)
                .pattern("   ")
                .pattern("   ")
                .pattern("## ")
                .input('#', CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_PRESSURE_PLATES))
                .group("minecraft:wooden_pressure_plates").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_TRAPDOOR, 2)
                .pattern("   ")
                .pattern("   ")
                .pattern("## ")
                .input('#', CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_TRAPDOORS))
                .group("minecraft:wooden_trapdoors").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_DOOR, 2)
                .pattern("## ")
                .pattern("## ")
                .pattern("## ")
                .input('#', CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_DOORS))
                .group("minecraft:wooden_doors").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_DOOR)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_PRESSURE_PLATE, 2)
                .pattern("   ")
                .pattern("#A#")
                .pattern("#A#")
                .input('#', CACTUS_PLANKS).input('A', STICK).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_FENCES))
                .group("minecraft:wooden_fences").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_FENCE)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_PRESSURE_PLATE, 2)
                .pattern("   ")
                .pattern("A#A")
                .pattern("A#A")
                .input('#', CACTUS_PLANKS).input('A', STICK).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_FENCES))
                .group("minecraft:wooden_fences").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_FENCE_GATE)));


        //ChippedWoodset
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHIPPED_OAK, 2)
                .pattern("   ")
                .pattern("#  ")
                .pattern("#  ")
                .input('#', OAK_LOG).criterion(FabricRecipeProvider.hasItem(OAK_LOG), FabricRecipeProvider.conditionsFromTag(OAK_LOGS))
                .group("cellulose:chipped_logs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHIPPED_OAK)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHIPPED_BIRCH, 2)
                .pattern("   ")
                .pattern("#  ")
                .pattern("#  ")
                .input('#', BIRCH_LOG).criterion(FabricRecipeProvider.hasItem(BIRCH_LOG), FabricRecipeProvider.conditionsFromTag(OAK_LOGS))
                .group("cellulose:chipped_logs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHIPPED_BIRCH)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHIPPED_SPRUCE, 2)
                .pattern("   ")
                .pattern("#  ")
                .pattern("#  ")
                .input('#', SPRUCE_LOG).criterion(FabricRecipeProvider.hasItem(SPRUCE_LOG), FabricRecipeProvider.conditionsFromTag(SPRUCE_LOGS))
                .group("cellulose:chipped_logs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHIPPED_SPRUCE)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHIPPED_DARK_OAK, 2)
                .pattern("   ")
                .pattern("#  ")
                .pattern("#  ")
                .input('#', DARK_OAK_LOG).criterion(FabricRecipeProvider.hasItem(DARK_OAK_LOG), FabricRecipeProvider.conditionsFromTag(DARK_OAK_LOGS))
                .group("cellulose:chipped_logs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHIPPED_DARK_OAK)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHIPPED_JUNGLE, 2)
                .pattern("   ")
                .pattern("#  ")
                .pattern("#  ")
                .input('#', JUNGLE_LOG).criterion(FabricRecipeProvider.hasItem(JUNGLE_LOG), FabricRecipeProvider.conditionsFromTag(JUNGLE_LOGS))
                .group("cellulose:chipped_logs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHIPPED_JUNGLE)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHIPPED_ACACIA, 2)
                .pattern("   ")
                .pattern("#  ")
                .pattern("#  ")
                .input('#', ACACIA_LOG).criterion(FabricRecipeProvider.hasItem(ACACIA_LOG), FabricRecipeProvider.conditionsFromTag(ACACIA_LOGS))
                .group("cellulose:chipped_logs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHIPPED_ACACIA)));

        //Log slabs and stairs
        offerSlabRecipe(exporter, BUILDING_BLOCKS, OAK_LOG_SLABS, OAK_LOG);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, STRIPPED_OAK_LOG_SLABS, STRIPPED_OAK_LOG);

    }

    private void offerPlanksRecipe(Consumer<RecipeJsonProvider> exporter, Block cactusPlanks, Block cactusBundle, int count)
    {

    }
}
