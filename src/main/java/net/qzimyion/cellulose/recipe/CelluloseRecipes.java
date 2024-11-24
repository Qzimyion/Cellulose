package net.qzimyion.cellulose.recipe;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseRecipes {

    public static void registerRecipes() {
        Cellulose.LOGGER.info("Registering Recipe Types");

        Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, new ResourceLocation(Cellulose.MOD_ID, SawmillingRecipe.Serializer.ID),
                SawmillingRecipe.Serializer.INSTANCE);
        Registry.register(BuiltInRegistries.RECIPE_TYPE, new ResourceLocation(Cellulose.MOD_ID, SawmillingRecipe.Type.ID),
                SawmillingRecipe.Type.INSTANCE);
    }
}
