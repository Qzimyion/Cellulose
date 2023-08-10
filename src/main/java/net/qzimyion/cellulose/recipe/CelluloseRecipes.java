package net.qzimyion.cellulose.recipe;

import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseRecipes {
    public static final RecipeType<SawmillingRecipe> SAWMILLING_RECIPE = Registry.register(Registries.RECIPE_TYPE, new Identifier(Cellulose.MOD_ID, SawmillingRecipe.Type.ID),
            SawmillingRecipe.Type.INSTANCE);

    public static void registerRecipes() {
        Cellulose.LOGGER.info("Registering Recipe Types for " + Cellulose.MOD_ID);
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Cellulose.MOD_ID, SawmillingRecipe.Serializer.ID),
                SawmillingRecipe.Serializer.INSTANCE);
    }
}
