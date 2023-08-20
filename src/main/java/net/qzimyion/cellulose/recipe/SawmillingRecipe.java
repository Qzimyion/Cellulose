package net.qzimyion.cellulose.recipe;

import com.google.gson.JsonObject;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.world.World;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

public class SawmillingRecipe implements RecipeType, Recipe<Inventory> {

    private final Ingredient inputA;
    private final Ingredient inputB;
    private final ItemStack outputStack;
    private final Identifier id;
    private final String string;
    public SawmillingRecipe(Ingredient inputA, Ingredient inputB, ItemStack outputStack, Identifier id, String string) {
        this.inputA = inputA;
        this.inputB = inputB;
        this.outputStack = outputStack;
        this.id = id;
        this.string = string;
    }

    public boolean matches(Inventory inventory, World world) {
        return this.inputA.test(inventory.getStack(0)) && this.inputB.test(inventory.getStack(1));
    }

    @Override
    public ItemStack craft(Inventory inventory, DynamicRegistryManager registryManager) {
        return null;
    }

    @Override
    public boolean fits(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return outputStack;
    }

    public ItemStack createIcon() {
        return new ItemStack(CelluloseBlocks.SAWMILL);
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

    public static class Serializer implements RecipeSerializer<SawmillingRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "sawmill";

        @Override
        public SawmillingRecipe read(Identifier id, JsonObject json){
            String string = JsonHelper.getString(json, "group", "");
            Ingredient inputA;
            if (JsonHelper.hasArray(json, "inputA")) {
                inputA = Ingredient.fromJson(JsonHelper.getArray(json, "inputA"));
            } else {
                inputA = Ingredient.fromJson(JsonHelper.getObject(json, "inputA"));
            }

            Ingredient inputB;
            if (JsonHelper.hasArray(json, "inputA")) {
                inputB = Ingredient.fromJson(JsonHelper.getArray(json, "inputB"));
            } else {
                inputB = Ingredient.fromJson(JsonHelper.getObject(json, "inputB"));
            }

            String string2 = JsonHelper.getString(json, "result");
            int i = JsonHelper.getInt(json, "count");
            ItemStack itemStack = new ItemStack((ItemConvertible) Registries.ITEM.get(new Identifier(string2)), i);
            return new SawmillingRecipe(inputA, inputB, itemStack, id, string);
        }

        @Override
        public SawmillingRecipe read(Identifier id, PacketByteBuf buf){
            String string = buf.readString();
            Ingredient inputA = Ingredient.fromPacket(buf);
            Ingredient inputB = Ingredient.fromPacket(buf);
            ItemStack itemStack = buf.readItemStack();
            return new SawmillingRecipe(inputA, inputB, itemStack, id, string);
        }

        @Override
        public void write(PacketByteBuf buf, SawmillingRecipe recipe){
            buf.writeString(recipe.string);
            recipe.inputA.write(buf);
            recipe.inputB.write(buf);
            buf.writeItemStack(recipe.outputStack);
        }
    }
}