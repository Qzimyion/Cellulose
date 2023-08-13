package net.qzimyion.cellulose.recipe;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.qzimyion.cellulose.registry.CelluloseBlocks;

public class SawmillingRecipe implements Recipe<SimpleInventory> {
    private final Ingredient inputA;
    private final Ingredient inputB;
    private final ItemStack outputStack;
    private final Identifier id;

    public SawmillingRecipe(Identifier id, ItemStack outputStack, Ingredient inputA, Ingredient inputB) {
        this.id = id;
        this.outputStack = outputStack;
        this.inputA = inputA;
        this.inputB = inputB;
    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if(inventory.size() < 2) return false;
        return inputA.test(inventory.getStack(0)) && inputB.test(inventory.getStack(1));
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
        return outputStack;
    }

    public ItemStack createIcon() {
        return new ItemStack(CelluloseBlocks.SAWMILL);
    }
    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return outputStack.copy();
    }

    @Override
    public Identifier getId() {
        return id;
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
        public Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "sawmill";
    }

    class SawmillRecipeJsonFormat {
        JsonObject inputA;
        JsonObject inputB;
        String outputItem;
        int outputAmount;
    }

    public static class Serializer implements RecipeSerializer<SawmillingRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "sawmill";

        @Override
        public SawmillingRecipe read(Identifier id, JsonObject json) {
            SawmillRecipeJsonFormat recipeJsonFormat = new Gson().fromJson(json, SawmillRecipeJsonFormat.class);

            Ingredient inputA = Ingredient.fromJson(recipeJsonFormat.inputA);
            Ingredient inputB = Ingredient.fromJson(recipeJsonFormat.inputB);

            Item outputItem = Registries.ITEM.getOrEmpty(new Identifier(recipeJsonFormat.outputItem)).get();
            ItemStack output = new ItemStack(outputItem, recipeJsonFormat.outputAmount);

            return new SawmillingRecipe(id, output, inputA, inputB);
        }

        @Override
        public SawmillingRecipe read(Identifier id, PacketByteBuf buf) {

            Ingredient inputA = Ingredient.fromPacket(buf);
            Ingredient inputB = Ingredient.fromPacket(buf);
            ItemStack outputItem = buf.readItemStack();
            return new SawmillingRecipe(id, outputItem, inputA, inputB);
        }

        @Override
        public void write(PacketByteBuf buf, SawmillingRecipe recipe) {

            recipe.inputA.write(buf);
            recipe.inputB.write(buf);
            buf.writeItemStack(recipe.outputStack);
        }
    }
}