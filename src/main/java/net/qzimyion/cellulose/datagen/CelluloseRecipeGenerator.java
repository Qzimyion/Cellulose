package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.registry.CelluloseTags;

import java.util.function.Consumer;

import static net.minecraft.item.Items.*;
import static net.minecraft.registry.tag.ItemTags.*;
import static net.qzimyion.cellulose.registry.CelluloseBlocks.*;

public class CelluloseRecipeGenerator extends FabricRecipeProvider {
    public CelluloseRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter)
    {
        /*Crafting table recipes*/
        //This section adds vertical plank recipes (BLOCK)

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_OAK_PLANKS, 3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_OAK_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_BIRCH_PLANKS, 3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', BIRCH_PLANKS).criterion(FabricRecipeProvider.hasItem(BIRCH_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BIRCH_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_SPRUCE_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', SPRUCE_PLANKS).criterion(FabricRecipeProvider.hasItem(SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_SPRUCE_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_DARK_OAK_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', DARK_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_DARK_OAK_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_JUNGLE_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', JUNGLE_PLANKS).criterion(FabricRecipeProvider.hasItem(JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_JUNGLE_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_ACACIA_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', ACACIA_PLANKS).criterion(FabricRecipeProvider.hasItem(ACACIA_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_ACACIA_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_CRIMSON_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', CRIMSON_PLANKS).criterion(FabricRecipeProvider.hasItem(CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CRIMSON_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_WARPED_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', WARPED_PLANKS).criterion(FabricRecipeProvider.hasItem(WARPED_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_WARPED_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_MANGROVE_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', MANGROVE_PLANKS).criterion(FabricRecipeProvider.hasItem(MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_MANGROVE_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_BAMBOO_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', BAMBOO_PLANKS).criterion(FabricRecipeProvider.hasItem(BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromTag(BAMBOO_BLOCKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BAMBOO_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_CHERRY_PLANKS,3)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .input('#', CHERRY_PLANKS).criterion(FabricRecipeProvider.hasItem(CHERRY_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:planks").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CHERRY_PLANKS)));

        //This section adds vertical plank recipes (SLAB)

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_BIRCH_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_BIRCH_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BIRCH_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BIRCH_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_SPRUCE_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_SPRUCE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_SPRUCE_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_DARK_OAK_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_DARK_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_OAK_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_JUNGLE_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_JUNGLE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_JUNGLE_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_ACACIA_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_ACACIA_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_ACACIA_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_ACACIA_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_CRIMSON_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_CRIMSON_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CRIMSON_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_WARPED_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_WARPED_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_WARPED_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_WARPED_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_MANGROVE_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_MANGROVE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_MANGROVE_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_BAMBOO_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_BAMBOO_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromTag(BAMBOO_BLOCKS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BAMBOO_PLANKS_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_CHERRY_PLANKS_SLABS, 6).pattern("###")
                .input('#', VERTICAL_CHERRY_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CHERRY_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CHERRY_PLANKS_SLABS)));

        //This section adds vertical plank recipes (STAIRS)

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_BIRCH_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_BIRCH_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BIRCH_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BIRCH_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_OAK_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_OAK_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_SPRUCE_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_SPRUCE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_SPRUCE_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_DARK_OAK_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_DARK_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_DARK_OAK_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_JUNGLE_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_JUNGLE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_JUNGLE_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_ACACIA_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_ACACIA_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_ACACIA_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_ACACIA_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_CRIMSON_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_CRIMSON_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CRIMSON_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_WARPED_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_WARPED_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_WARPED_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_WARPED_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_MANGROVE_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_MANGROVE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_MANGROVE_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_BAMBOO_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_BAMBOO_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BAMBOO_PLANKS_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VERTICAL_CHERRY_PLANKS_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_CHERRY_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CHERRY_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CHERRY_PLANKS_STAIRS)));


        // This section adds wooden mosaics recipes (Block)


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OAK_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', OAK_SLAB).criterion(FabricRecipeProvider.hasItem(OAK_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(OAK_MOSAIC)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BIRCH_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', BIRCH_SLAB).criterion(FabricRecipeProvider.hasItem(BIRCH_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(BIRCH_MOSAIC)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, SPRUCE_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', SPRUCE_SLAB).criterion(FabricRecipeProvider.hasItem(SPRUCE_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SPRUCE_MOSAIC)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DARK_OAK_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', DARK_OAK_SLAB).criterion(FabricRecipeProvider.hasItem(DARK_OAK_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(DARK_OAK_MOSAIC)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, JUNGLE_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', JUNGLE_SLAB).criterion(FabricRecipeProvider.hasItem(JUNGLE_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(JUNGLE_MOSAIC)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ACACIA_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', ACACIA_SLAB).criterion(FabricRecipeProvider.hasItem(ACACIA_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ACACIA_MOSAIC)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', CRIMSON_SLAB).criterion(FabricRecipeProvider.hasItem(CRIMSON_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CRIMSON_MOSAIC)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', WARPED_SLAB).criterion(FabricRecipeProvider.hasItem(WARPED_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(WARPED_MOSAIC)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MANGROVE_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', MANGROVE_SLAB).criterion(FabricRecipeProvider.hasItem(MANGROVE_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MANGROVE_MOSAIC)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CHERRY_MOSAIC, 2)
                .pattern("#")
                .pattern("#").input('#', CHERRY_SLAB).criterion(FabricRecipeProvider.hasItem(CHERRY_SLAB), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:wooden_mosaics").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHERRY_MOSAIC)));

        //This section adds mosaic recipes (SLAB)

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BIRCH_MOSAIC_SLABS, 6).pattern("###")
                .input('#', BIRCH_MOSAIC).criterion(FabricRecipeProvider.hasItem(BIRCH_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(BIRCH_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, SPRUCE_MOSAIC_SLABS, 6).pattern("###")
                .input('#', SPRUCE_MOSAIC).criterion(FabricRecipeProvider.hasItem(SPRUCE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SPRUCE_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DARK_OAK_MOSAIC_SLABS, 6).pattern("###")
                .input('#', DARK_OAK_MOSAIC).criterion(FabricRecipeProvider.hasItem(DARK_OAK_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(OAK_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, JUNGLE_MOSAIC_SLABS, 6).pattern("###")
                .input('#', JUNGLE_MOSAIC).criterion(FabricRecipeProvider.hasItem(JUNGLE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(JUNGLE_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ACACIA_MOSAIC_SLABS, 6).pattern("###")
                .input('#', ACACIA_MOSAIC).criterion(FabricRecipeProvider.hasItem(ACACIA_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ACACIA_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSAIC_SLABS, 6).pattern("###")
                .input('#', CRIMSON_MOSAIC).criterion(FabricRecipeProvider.hasItem(CRIMSON_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CRIMSON_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSAIC_SLABS, 6).pattern("###")
                .input('#', WARPED_MOSAIC).criterion(FabricRecipeProvider.hasItem(WARPED_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(WARPED_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MANGROVE_MOSAIC_SLABS, 6).pattern("###")
                .input('#', MANGROVE_MOSAIC).criterion(FabricRecipeProvider.hasItem(MANGROVE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MANGROVE_MOSAIC_SLABS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CHERRY_MOSAIC_SLABS, 6).pattern("###")
                .input('#', CHERRY_MOSAIC).criterion(FabricRecipeProvider.hasItem(CHERRY_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_SLABS))
                .group("minecraft:wooden_slabs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHERRY_MOSAIC_SLABS)));

        //This section adds mosaic recipes (STAIRS)
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BIRCH_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', BIRCH_MOSAIC).criterion(FabricRecipeProvider.hasItem(BIRCH_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(BIRCH_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OAK_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', OAK_MOSAIC).criterion(FabricRecipeProvider.hasItem(OAK_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(OAK_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, SPRUCE_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', SPRUCE_MOSAIC).criterion(FabricRecipeProvider.hasItem(SPRUCE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SPRUCE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DARK_OAK_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', DARK_OAK_MOSAIC).criterion(FabricRecipeProvider.hasItem(DARK_OAK_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(DARK_OAK_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, JUNGLE_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', JUNGLE_MOSAIC).criterion(FabricRecipeProvider.hasItem(JUNGLE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(JUNGLE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ACACIA_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ACACIA_MOSAIC).criterion(FabricRecipeProvider.hasItem(ACACIA_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ACACIA_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CRIMSON_MOSAIC).criterion(FabricRecipeProvider.hasItem(CRIMSON_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CRIMSON_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', WARPED_MOSAIC).criterion(FabricRecipeProvider.hasItem(WARPED_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(WARPED_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MANGROVE_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', MANGROVE_MOSAIC).criterion(FabricRecipeProvider.hasItem(MANGROVE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MANGROVE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CHERRY_MOSAIC_STAIRS, 8)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CHERRY_MOSAIC).criterion(FabricRecipeProvider.hasItem(CHERRY_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHERRY_MOSAIC_STAIRS)));

        //Sawmill recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, SAWMILL, 1)
                .pattern(" # ")
                .pattern("AAA").input('#', IRON_INGOT).input('A', PLANKS).criterion(FabricRecipeProvider.hasItem(IRON_INGOT), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SAWMILL)));

        //Frame recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OAK_FRAME, 5)
                .pattern("#A#")
                .pattern("A#A")
                .pattern("#A#")
                .input('#', OAK_PLANKS).input('A', STICK).criterion(FabricRecipeProvider.hasItem(OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:s").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(OAK_FRAME)));

        //Cactus woodset
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, CACTUS_BUNDLE, 5)
                .pattern("   ")
                .pattern("## ")
                .pattern("## ")
                .input('#', CACTUS).criterion(FabricRecipeProvider.hasItem(CACTUS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:cactus_wood").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_BUNDLE)));

    }
}
