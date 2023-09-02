package net.qzimyion.cellulose.signs;

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

import static net.qzimyion.cellulose.Cellulose.MOD_ID;

@SuppressWarnings("noinspection UnstableApiUsage")
public class CelluloseSigns {

    public static final Identifier CACTUS_SIGN_TEXTURE_ID = new Identifier(MOD_ID, "entity/signs/cactus");
    public static final Identifier CACTUS_HANGING_SIGN_TEXTURE_ID = new Identifier(MOD_ID, "entity/signs/hanging/cactus");
    public static final Identifier CACTUS_HANGING_SIGN_GUI_TEXTURE_ID = new Identifier(MOD_ID, "textures/gui/hanging_signs/cactus");
    public static final Identifier CACTUS_SIGN_ID = new Identifier(MOD_ID, "cactus_sign");
    public static final Identifier CACTUS_WALL_SIGN_ID = new Identifier(MOD_ID, "cactus_wall_sign");
    public static final Identifier CACTUS_HANGING_SIGN_ID = new Identifier(MOD_ID, "cactus_hanging_sign");
    public static final Identifier CACTUS_WALL_HANGING_SIGN_ID = new Identifier(MOD_ID, "cactus_wall_hanging_sign");

    public static void registerSigns() {

        Block sign = new TerraformSignBlock(CACTUS_SIGN_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).sounds(BlockSoundGroup.WOOL));
        Block wallSign = new TerraformWallSignBlock(CACTUS_SIGN_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).sounds(BlockSoundGroup.WOOL));

        Block hangingSign = new TerraformHangingSignBlock(CACTUS_HANGING_SIGN_TEXTURE_ID, CACTUS_HANGING_SIGN_GUI_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).sounds(BlockSoundGroup.WOOL));
        Block wallHangingSign = new TerraformWallHangingSignBlock(CACTUS_HANGING_SIGN_TEXTURE_ID, CACTUS_HANGING_SIGN_GUI_TEXTURE_ID, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).sounds(BlockSoundGroup.SCULK_SENSOR));

        Item signItem = new SignItem(new Item.Settings().maxCount(16), sign, wallSign);
        Item hangingSignItem = new HangingSignItem(hangingSign, wallHangingSign, new Item.Settings().maxCount(16));

        Registry.register(Registries.BLOCK, CACTUS_SIGN_ID, sign);
        Registry.register(Registries.BLOCK, CACTUS_WALL_SIGN_ID, wallSign);
        Registry.register(Registries.BLOCK, CACTUS_HANGING_SIGN_ID, hangingSign);
        Registry.register(Registries.BLOCK, CACTUS_WALL_HANGING_SIGN_ID, wallHangingSign);

        Registry.register(Registries.ITEM, CACTUS_SIGN_ID, signItem);
        Registry.register(Registries.ITEM, CACTUS_HANGING_SIGN_ID, hangingSignItem);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->
                entries.addAfter(Items.CHERRY_HANGING_SIGN, signItem, hangingSignItem));
    }
}
