package net.qzimyion.cellulose.blocks.signs;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseSigns {

    /*
    Note: If you want to copy this code for your project please remember to add Terraform Wood API
    to your Build.Gradlew file first otherwise it won't work.
    */

    protected static final Identifier CACTUS_SIGN_TEXTURE_ID = new Identifier(Cellulose.MOD_ID, "entity/signs/cactus");
    protected static final Identifier CACTUS_HANGING_SIGN_TEXTURE_ID = new Identifier(Cellulose.MOD_ID, "entity/signs/hanging/cactus");
    protected static final Identifier CACTUS_HANGING_SIGN_GUI_TEXTURE_ID = new Identifier(Cellulose.MOD_ID, "textures/gui/hanging_signs/cactus");
    private static final Identifier CACTUS_CUSTOM_SIGN_ID = new Identifier(Cellulose.MOD_ID, "cactus_sign");
    private static final Identifier CACTUS_CUSTOM_WALL_SIGN_ID = new Identifier(Cellulose.MOD_ID, "cactus_wall_sign");
    private static final Identifier CACTUS_CUSTOM_HANGING_SIGN_ID = new Identifier(Cellulose.MOD_ID, "cactus_hanging_sign");
    private static final Identifier CACTUS_CUSTOM_WALL_HANGING_SIGN_ID = new Identifier(Cellulose.MOD_ID, "cactus_wall_hanging_sign");

    public static void RegisterSigns() {
        Block sign = new TerraformSignBlock(CACTUS_SIGN_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).sounds(BlockSoundGroup.CHERRY_WOOD));
        Block wallSign = new TerraformWallSignBlock(CACTUS_SIGN_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).sounds(BlockSoundGroup.CHERRY_WOOD));

        Block hangingSign = new TerraformHangingSignBlock(CACTUS_HANGING_SIGN_TEXTURE_ID, CACTUS_HANGING_SIGN_GUI_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN).sounds(BlockSoundGroup.CHERRY_WOOD));
        Block wallHangingSign = new TerraformWallHangingSignBlock(CACTUS_HANGING_SIGN_TEXTURE_ID, CACTUS_HANGING_SIGN_GUI_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).sounds(BlockSoundGroup.CHERRY_WOOD));

        Item signItem = new SignItem(new Item.Settings().maxCount(16), sign, wallSign);
        Item hangingSignItem = new HangingSignItem(hangingSign, wallHangingSign, new Item.Settings().maxCount(16));

        Registry.register(Registries.BLOCK, CACTUS_CUSTOM_SIGN_ID, sign);
        Registry.register(Registries.BLOCK, CACTUS_CUSTOM_WALL_SIGN_ID, wallSign);
        Registry.register(Registries.BLOCK, CACTUS_CUSTOM_HANGING_SIGN_ID, hangingSign);
        Registry.register(Registries.BLOCK, CACTUS_CUSTOM_WALL_HANGING_SIGN_ID, wallHangingSign);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.CHERRY_HANGING_SIGN, signItem, hangingSignItem);
        });
    }
}
