package net.qzimyion.cellulose.datagen;

import com.google.common.collect.Lists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.qzimyion.cellulose.items.CelluloseItems;
import net.qzimyion.cellulose.recipe.SawmillingRecipe;

import java.util.List;
import java.util.function.Consumer;

import static net.minecraft.item.Items.*;
import static net.minecraft.recipe.book.RecipeCategory.*;
import static net.minecraft.registry.tag.ItemTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

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

        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_OAK_SLAB, VERTICAL_OAK_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_BIRCH_SLAB, VERTICAL_BIRCH_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_SPRUCE_SLAB, VERTICAL_SPRUCE_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_DARK_OAK_SLAB, VERTICAL_DARK_OAK_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_JUNGLE_SLAB, VERTICAL_JUNGLE_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_ACACIA_SLAB, VERTICAL_ACACIA_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_CRIMSON_SLAB, VERTICAL_CRIMSON_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_WARPED_SLAB, VERTICAL_WARPED_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_MANGROVE_SLAB, VERTICAL_MANGROVE_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_BAMBOO_SLAB, VERTICAL_BAMBOO_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_CHERRY_SLAB, VERTICAL_CHERRY_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,VERTICAL_CACTUS_SLAB, VERTICAL_CACTUS_PLANKS);

        //This section adds vertical plank recipes (STAIRS)
        

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_BIRCH_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_BIRCH_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BIRCH_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BIRCH_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_OAK_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_OAK_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_SPRUCE_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_SPRUCE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_SPRUCE_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_DARK_OAK_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_DARK_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_DARK_OAK_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_JUNGLE_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_JUNGLE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_JUNGLE_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_ACACIA_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_ACACIA_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_ACACIA_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_ACACIA_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_CRIMSON_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_CRIMSON_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CRIMSON_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_WARPED_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_WARPED_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_WARPED_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_WARPED_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_MANGROVE_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_MANGROVE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_MANGROVE_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_BAMBOO_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_BAMBOO_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BAMBOO_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_CHERRY_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_CHERRY_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CHERRY_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CHERRY_STAIR)));


        // This section adds wooden mosaics recipes (Block)

        offerMosaicRecipe(exporter, BUILDING_BLOCKS,OAK_MOSAIC, OAK_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,BIRCH_MOSAIC, BIRCH_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,SPRUCE_MOSAIC, SPRUCE_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,DARK_OAK_MOSAIC, DARK_OAK_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,JUNGLE_MOSAIC, JUNGLE_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,ACACIA_MOSAIC, ACACIA_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,CRIMSON_MOSAIC, CRIMSON_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,WARPED_MOSAIC, WARPED_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,MANGROVE_MOSAIC, MANGROVE_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,CHERRY_MOSAIC, CHERRY_SLAB);

        //This section adds mosaic recipes (SLAB)

        offerSlabRecipe(exporter, BUILDING_BLOCKS,OAK_MOSAIC_SLABS, OAK_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,BIRCH_MOSAIC_SLABS, BIRCH_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,SPRUCE_MOSAIC_SLABS, SPRUCE_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,DARK_OAK_MOSAIC_SLABS, DARK_OAK_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,JUNGLE_MOSAIC_SLABS, JUNGLE_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,ACACIA_MOSAIC_SLABS, ACACIA_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,CRIMSON_MOSAIC_SLABS, CRIMSON_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,WARPED_MOSAIC_SLABS, WARPED_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,MANGROVE_MOSAIC_SLABS, MANGROVE_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,CHERRY_MOSAIC_SLABS, CHERRY_MOSAIC);

        //This section adds mosaic recipes (STAIRS)
        createStairsRecipe(OAK_MOSAIC_STAIRS, OAK_MOSAIC);
        createStairsRecipe(BIRCH_MOSAIC_STAIRS, BIRCH_MOSAIC);
        createStairsRecipe(SPRUCE_MOSAIC_STAIRS, SPRUCE_MOSAIC);
        createStairsRecipe(DARK_OAK_MOSAIC_STAIRS, DARK_OAK_MOSAIC);
        createStairsRecipe(JUNGLE_MOSAIC_STAIRS, JUNGLE_MOSAIC);
        createStairsRecipe(ACACIA_MOSAIC_STAIRS, ACACIA_MOSAIC);
        createStairsRecipe(CRIMSON_MOSAIC_STAIRS, CRIMSON_MOSAIC);
        createStairsRecipe(WARPED_MOSAIC_STAIRS, WARPED_MOSAIC);
        createStairsRecipe(MANGROVE_MOSAIC_STAIRS, MANGROVE_MOSAIC);
        createStairsRecipe(CHERRY_MOSAIC_STAIRS, CHERRY_MOSAIC);
        createStairsRecipe(CACTUS_MOSAIC_STAIRS, CACTUS_MOSAIC);
        createStairsRecipe(AZALEA_MOSAIC_STAIRS, AZALEA_MOSAIC);
        createStairsRecipe(BLOOMING_AZALEA_MOSAIC_STAIRS, BLOOMING_AZALEA_MOSAIC);


        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, BIRCH_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', BIRCH_MOSAIC).criterion(FabricRecipeProvider.hasItem(BIRCH_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(BIRCH_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, OAK_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', OAK_MOSAIC).criterion(FabricRecipeProvider.hasItem(OAK_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(OAK_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, SPRUCE_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', SPRUCE_MOSAIC).criterion(FabricRecipeProvider.hasItem(SPRUCE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SPRUCE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, DARK_OAK_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', DARK_OAK_MOSAIC).criterion(FabricRecipeProvider.hasItem(DARK_OAK_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(DARK_OAK_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, JUNGLE_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', JUNGLE_MOSAIC).criterion(FabricRecipeProvider.hasItem(JUNGLE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(JUNGLE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, ACACIA_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ACACIA_MOSAIC).criterion(FabricRecipeProvider.hasItem(ACACIA_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ACACIA_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CRIMSON_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CRIMSON_MOSAIC).criterion(FabricRecipeProvider.hasItem(CRIMSON_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CRIMSON_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, WARPED_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', WARPED_MOSAIC).criterion(FabricRecipeProvider.hasItem(WARPED_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(WARPED_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, MANGROVE_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', MANGROVE_MOSAIC).criterion(FabricRecipeProvider.hasItem(MANGROVE_MOSAIC), FabricRecipeProvider.conditionsFromTag(WOODEN_STAIRS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MANGROVE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHERRY_MOSAIC_STAIRS, 4)
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
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_BUNDLE, 4)
                .pattern("   ")
                .pattern("## ")
                .pattern("## ")
                .input('#', CACTUS).criterion(FabricRecipeProvider.hasItem(CACTUS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:cactus_wood").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_BUNDLE)));
        offerPlanksRecipe(CACTUS_BUNDLE);
        offerPlanksRecipe(CACTUS_CROWN);
        offerPlanksRecipe(STRIPPED_CACTUS);
        offerPlanksRecipe(STRIPPED_CACTUS_CROWN);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, CACTUS_SLAB, CACTUS_PLANKS);
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_STAIRS)));
        offerBarkBlockRecipe(exporter, CACTUS_CROWN, CACTUS_BUNDLE);
        offerBarkBlockRecipe(exporter, STRIPPED_CACTUS_CROWN, CACTUS_BUNDLE);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS, CACTUS_MOSAIC, CACTUS_SLAB);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, CACTUS_MOSAIC_SLABS, CACTUS_MOSAIC);
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_MOSAIC_STAIRS, 4)
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

        //Log slabs and stairs
        offerSlabRecipe(exporter, BUILDING_BLOCKS, OAK_LOG_SLABS, OAK_LOG);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, STRIPPED_OAK_LOG_SLABS, STRIPPED_OAK_LOG);

        //Pavements
        offerPavementRecipe(exporter, BUILDING_BLOCKS, OAK_PLANK_PAVEMENT, OAK_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, BIRCH_PLANK_PAVEMENT, BIRCH_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, SPRUCE_PLANK_PAVEMENT, SPRUCE_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, DARK_OAK_PLANK_PAVEMENT, DARK_OAK_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, JUNGLE_PLANK_PAVEMENT, JUNGLE_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, ACACIA_PLANK_PAVEMENT, ACACIA_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, CRIMSON_PLANK_PAVEMENT, CRIMSON_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, WARPED_PLANK_PAVEMENT, WARPED_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, MANGROVE_PLANK_PAVEMENT, MANGROVE_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, BAMBOO_PLANK_PAVEMENT, BAMBOO_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, CHERRY_PLANK_PAVEMENT, CHERRY_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, CACTUS_PLANK_PAVEMENT, CACTUS_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, AZALEA_PLANK_PAVEMENT, AZALEA_PLANKS);
        offerPavementRecipe(exporter, BUILDING_BLOCKS, BLOOMING_AZALEA_PLANK_PAVEMENT, BLOOMING_AZALEA_PLANKS);

        ///Cooking

        offerFoodCookingRecipe(exporter,"smelting", RecipeSerializer.SMELTING, 300, CelluloseItems.ACORN, CelluloseItems.POPPED_ACORN, 0.1f);
        offerFoodCookingRecipe(exporter,"smoking", RecipeSerializer.SMOKING, 150, CelluloseItems.ACORN, CelluloseItems.POPPED_ACORN, 0.1f);
        offerFoodCookingRecipe(exporter,"campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 400, CelluloseItems.ACORN, CelluloseItems.POPPED_ACORN, 0.1f);


        /*
         * Sawmilling recipes
         */

        //Oak
        ///Log
        offerSawmillingRecipe(exporter, OAK_WOOD, OAK_LOG);
        offerSawmillingRecipe(exporter, STRIPPED_OAK_LOG, OAK_LOG);
        offerSawmillingRecipe(exporter, STRIPPED_OAK_WOOD, OAK_LOG);
        offerSawmillingRecipe(exporter, OAK_PLANKS, OAK_LOG, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, OAK_LOG, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, OAK_LOG, 4);
        offerSawmillingRecipe(exporter, STICK, OAK_LOG, 16);
        offerSawmillingRecipe(exporter, PAINTING, OAK_LOG, 32);

        ///Wood
        offerSawmillingRecipe(exporter, OAK_PLANKS, OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, OAK_WOOD, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, STICK, OAK_WOOD, 16);
        offerSawmillingRecipe(exporter, PAINTING, OAK_WOOD, 32);

        ///Stripped Log
        offerSawmillingRecipe(exporter, OAK_PLANKS, STRIPPED_OAK_LOG, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, STRIPPED_OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, STRIPPED_OAK_LOG, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, STRIPPED_OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, STRIPPED_OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, STRIPPED_OAK_LOG, 4);
        offerSawmillingRecipe(exporter, STICK, STRIPPED_OAK_LOG, 16);
        offerSawmillingRecipe(exporter, PAINTING, STRIPPED_OAK_LOG, 32);

        ///Stripped Wood
        offerSawmillingRecipe(exporter, OAK_PLANKS, STRIPPED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, STRIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, STRIPPED_OAK_WOOD, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, STRIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, STRIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, STRIPPED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, STICK, STRIPPED_OAK_WOOD, 16);
        offerSawmillingRecipe(exporter, PAINTING, STRIPPED_OAK_WOOD, 32);

        ///Engraved Log
        offerSawmillingRecipe(exporter, OAK_PLANKS, ENGRAVED_OAK, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, ENGRAVED_OAK, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, ENGRAVED_OAK, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, ENGRAVED_OAK, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, ENGRAVED_OAK, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, ENGRAVED_OAK, 4);
        offerSawmillingRecipe(exporter, STICK, ENGRAVED_OAK, 16);
        offerSawmillingRecipe(exporter, PAINTING, ENGRAVED_OAK, 32);

        ///Engraved Wood
        offerSawmillingRecipe(exporter, OAK_PLANKS, ENGRAVED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, ENGRAVED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, ENGRAVED_OAK_WOOD, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, ENGRAVED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, ENGRAVED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, ENGRAVED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, STICK, ENGRAVED_OAK_WOOD, 16);
        offerSawmillingRecipe(exporter, PAINTING, ENGRAVED_OAK_WOOD, 32);

        ///Chipped Log
        offerSawmillingRecipe(exporter, CHIPPED_OAK_PLANKS, CHIPPED_OAK, 4);
        offerSawmillingRecipe(exporter, CHIPPED_OAK_SLAB, CHIPPED_OAK, 8);
        offerSawmillingRecipe(exporter, CHIPPED_OAK_STAIR, CHIPPED_OAK, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, CHIPPED_OAK, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, CHIPPED_OAK, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, CHIPPED_OAK, 4);
        offerSawmillingRecipe(exporter, STICK, CHIPPED_OAK, 16);
        offerSawmillingRecipe(exporter, PAINTING, CHIPPED_OAK, 32);

        ///Chipped Wood
        offerSawmillingRecipe(exporter, CHIPPED_OAK_PLANKS, CHIPPED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, CHIPPED_OAK_SLAB, CHIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, CHIPPED_OAK_STAIR, CHIPPED_OAK_WOOD, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, CHIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, CHIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, CHIPPED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, STICK, CHIPPED_OAK_WOOD, 16);
        offerSawmillingRecipe(exporter, PAINTING, CHIPPED_OAK_WOOD, 32);

        ///Planks

        ///Slabs

        ///Stairs

        ///Misc
        offerSawmillingRecipe(exporter, PAINTING, OAK_PLANKS, 8);

        //Birch

        //Spruce

        //Dark Oak

        //Jungle

        //Acacia

        //Crimson

        //Warped

        //Mangrove

        //Bamboo
        offerSawmillingRecipe(exporter, BAMBOO, BAMBOO_BLOCK, 9);

        //Cherry

        //Cactus

        //Azalea

        //Brown Mushroom

        //Red Mushroom

        //Petrified wood


        final List<ItemConvertible> PAPER_SMELTING = Util.make(Lists.newArrayList(), list -> {
            list.add(SOAKED_BLOCK_OF_PAPER);
        });

        offerSmelting(exporter, PAPER_SMELTING, MISC, BLOCK_OF_PAPER, 0.15F, 200, "misc");
    }

    private void createStairsRecipe(Block oakMosaicStairs, Block oakMosaic) {
    }

    private void offerPlanksRecipe(Block block)
    {

    }
    //Custom recipe generators
    public static void offerPavementRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(category, output, 3).input(Character.valueOf('#'), input).pattern("#  ").pattern("## ").criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }

    public static SingleItemRecipeJsonBuilder createSawmilling(Ingredient input, ItemConvertible output, int count) {
        return new SingleItemRecipeJsonBuilder(RecipeCategory.BUILDING_BLOCKS, SawmillingRecipe.Serializer.INSTANCE, input, output, count);
    }

    public static void offerSawmillingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        offerSawmillingRecipe(exporter, output, input, 1);
    }

    public static void offerSawmillingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input, int count) {
        createSawmilling(Ingredient.ofItems(input), output, count).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter, RecipeProvider.convertBetween(output, input) + "_sawmilling");
    }

}
