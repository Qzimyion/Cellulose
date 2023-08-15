package net.qzimyion.cellulose.recipe;


import com.google.gson.JsonObject;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.world.World;
import net.qzimyion.cellulose.registry.CelluloseBlocks;

public class SawmillingRecipe implements Recipe<SimpleInventory> {
    private final Ingredient inputA;
    private final Ingredient inputB;
    private final ItemStack output;
    private final Identifier id;

    private final String string;

    public SawmillingRecipe(Identifier id, String string, ItemStack output, Ingredient inputA, Ingredient inputB) {
        this.id = id;
        this.string = string;
        this.output = output;
        this.inputA = inputA;
        this.inputB = inputB;
    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        return inputA.test(inventory.getStack(0)) && inputB.test(inventory.getStack(1));
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
        return output;
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
        return output.copy();
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
        public SawmillingRecipe read(Identifier id, JsonObject json) {
            String string = JsonHelper.getString(json, "group", "");
            Ingredient inputA;
            if (JsonHelper.hasArray(json, "inputA")) {
                inputA = Ingredient.fromJson(JsonHelper.getArray(json, "inputA"));
            } else {
                inputA = Ingredient.fromJson(JsonHelper.getObject(json, "inputA"));
            }

            Ingredient inputB;
            if (JsonHelper.hasArray(json, "inputB")) {
                inputB = Ingredient.fromJson(JsonHelper.getArray(json, "inputB"));
            } else {
                inputB = Ingredient.fromJson(JsonHelper.getObject(json, "inputB"));
            }

            String string2 = JsonHelper.getString(json, "result");
            int i = JsonHelper.getInt(json, "count");
            ItemStack itemStack = new ItemStack((ItemConvertible) Registries.ITEM.get(new Identifier(string2)), i);

            return new SawmillingRecipe(id, string, itemStack, inputA, inputB);
        }

        @Override
        public SawmillingRecipe read(Identifier id, PacketByteBuf buf) {

            String string = buf.readString();
            Ingredient inputA = Ingredient.fromPacket(buf);
            Ingredient inputB = Ingredient.fromPacket(buf);
            ItemStack result = buf.readItemStack();
            return new SawmillingRecipe(id, string, result, inputA, inputB);
        }

        @Override
        public void write(PacketByteBuf buf, SawmillingRecipe recipe) {

            recipe.inputA.write(buf);
            recipe.inputB.write(buf);
            buf.writeItemStack(recipe.output);
        }
    }
}