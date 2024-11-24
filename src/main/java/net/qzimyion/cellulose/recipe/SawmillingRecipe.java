package net.qzimyion.cellulose.recipe;

import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.level.Level;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

public class SawmillingRecipe extends SingleItemRecipe {
    public SawmillingRecipe(ResourceLocation id, String group, Ingredient input, ItemStack output) {
        super(new Type(), new SawmillingRecipe.Serializer(), id, group, input, output);
    }

    public boolean matches(Container inventory, Level world) {
        boolean firstMatches = this.ingredient.test(inventory.getItem(0));
        //boolean secondMatches = inventory.getItem(1).isEmpty() || this.secondIngredient.test(inventory.getItem(1));
        return this.ingredient.test(inventory.getItem(0));
    }

    public ItemStack getToastSymbol() {
        return new ItemStack(CelluloseBlocks.SAWMILL);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return SawmillingRecipe.Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<SawmillingRecipe> {
        public Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "sawmilling";
    }

    public static class Serializer implements RecipeSerializer<SawmillingRecipe> {
        public static final SawmillingRecipe.Serializer INSTANCE = new SawmillingRecipe.Serializer();
        public static final String ID = "sawmilling";

        @Override
        public SawmillingRecipe fromJson(ResourceLocation id, JsonObject json) {
            String string = GsonHelper.getAsString(json, "group", "");
            Ingredient ingredient;
            if (GsonHelper.isArrayNode(json, "ingredient")) {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonArray(json, "ingredient"));
            } else {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "ingredient"));
            }

            String string2 = GsonHelper.getAsString(json, "result");
            int i = GsonHelper.getAsInt(json, "count");
            ItemStack itemStack = new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(string2)), i);
            return new SawmillingRecipe(id, string, ingredient, itemStack);
        }

        @Override
        public SawmillingRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            String string = buf.readUtf();
            Ingredient ingredient = Ingredient.fromNetwork(buf);
            ItemStack itemStack = buf.readItem();
            return new SawmillingRecipe(id, string, ingredient, itemStack);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, SawmillingRecipe recipe) {
            buf.writeUtf(recipe.group);
            recipe.ingredient.toNetwork(buf);
            buf.writeItem(recipe.result);
        }
    }

}