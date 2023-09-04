package net.qzimyion.cellulose.recipe;

import com.google.gson.JsonObject;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.world.World;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

public class SawmillingRecipe extends CuttingRecipe {
    public SawmillingRecipe(Identifier id, String group, Ingredient input, ItemStack output) {
        super(new Type(), new Serializer(), id, group, input, output);
    }

    public boolean matches(Inventory inventory, World world) {
        return this.input.test(inventory.getStack(0));
    }

    public ItemStack createIcon() {
        return new ItemStack(CelluloseBlocks.SAWMILL);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
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
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "sawmilling";

        @Override
        public SawmillingRecipe read(Identifier id, JsonObject json) {
            String string = JsonHelper.getString(json, "group", "");
            Ingredient ingredient;
            if (JsonHelper.hasArray(json, "ingredient")) {
                ingredient = Ingredient.fromJson(JsonHelper.getArray(json, "ingredient"));
            } else {
                ingredient = Ingredient.fromJson(JsonHelper.getObject(json, "ingredient"));
            }

            String string2 = JsonHelper.getString(json, "result");
            int i = JsonHelper.getInt(json, "count");
            ItemStack itemStack = new ItemStack(Registries.ITEM.get(new Identifier(string2)), i);
            return new SawmillingRecipe(id, string, ingredient, itemStack);
        }

        @Override
        public SawmillingRecipe read(Identifier id, PacketByteBuf buf) {
            String string = buf.readString();
            Ingredient ingredient = Ingredient.fromPacket(buf);
            ItemStack itemStack = buf.readItemStack();
            return new SawmillingRecipe(id, string, ingredient, itemStack);
        }

        @Override
        public void write(PacketByteBuf buf, SawmillingRecipe recipe) {
            buf.writeString(recipe.group);
            recipe.input.write(buf);
            buf.writeItemStack(recipe.output);
        }
    }

}