package net.qzimyion.cellulose.signs;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;

import static net.qzimyion.cellulose.Cellulose.MOD_ID;

@SuppressWarnings("noinspection UnstableApiUsage")
public class CelluloseSigns {

    public static final ResourceLocation CACTUS_SIGN_TEXTURE_ID = new ResourceLocation(MOD_ID, "entity/signs/cactus");
    public static final ResourceLocation CACTUS_HANGING_SIGN_TEXTURE_ID = new ResourceLocation(MOD_ID, "entity/signs/hanging/cactus");
    public static final ResourceLocation CACTUS_HANGING_SIGN_GUI_TEXTURE_ID = new ResourceLocation(MOD_ID, "textures/gui/hanging_signs/cactus");
    public static final ResourceLocation CACTUS_SIGN_ID = new ResourceLocation(MOD_ID, "cactus_sign");
    public static final ResourceLocation CACTUS_WALL_SIGN_ID = new ResourceLocation(MOD_ID, "cactus_wall_sign");
    public static final ResourceLocation CACTUS_HANGING_SIGN_ID = new ResourceLocation(MOD_ID, "cactus_hanging_sign");
    public static final ResourceLocation CACTUS_WALL_HANGING_SIGN_ID = new ResourceLocation(MOD_ID, "cactus_wall_hanging_sign");

    public static void registerSigns() {

        Block sign = new TerraformSignBlock(CACTUS_SIGN_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).sound(SoundType.WOOL));
        Block wallSign = new TerraformWallSignBlock(CACTUS_SIGN_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).sound(SoundType.WOOL));

        Block hangingSign = new TerraformHangingSignBlock(CACTUS_HANGING_SIGN_TEXTURE_ID, CACTUS_HANGING_SIGN_GUI_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).sound(SoundType.WOOL));
        Block wallHangingSign = new TerraformWallHangingSignBlock(CACTUS_HANGING_SIGN_TEXTURE_ID, CACTUS_HANGING_SIGN_GUI_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).sound(SoundType.SCULK_SENSOR));

        Item signItem = new SignItem(new Item.Properties().stacksTo(16), sign, wallSign);
        Item hangingSignItem = new HangingSignItem(hangingSign, wallHangingSign, new Item.Properties().stacksTo(16));

        Registry.register(BuiltInRegistries.BLOCK, CACTUS_SIGN_ID, sign);
        Registry.register(BuiltInRegistries.BLOCK, CACTUS_WALL_SIGN_ID, wallSign);
        Registry.register(BuiltInRegistries.BLOCK, CACTUS_HANGING_SIGN_ID, hangingSign);
        Registry.register(BuiltInRegistries.BLOCK, CACTUS_WALL_HANGING_SIGN_ID, wallHangingSign);

        Registry.register(BuiltInRegistries.ITEM, CACTUS_SIGN_ID, signItem);
        Registry.register(BuiltInRegistries.ITEM, CACTUS_HANGING_SIGN_ID, hangingSignItem);


        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries ->
                entries.addAfter(Items.BAMBOO_HANGING_SIGN, signItem, hangingSignItem));
    }
}
