package net.qzimyion.cellulose.mixin;

import net.minecraft.block.AnvilBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.util.CelluloseTags;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashMap;

@Debug(export = true)
@Mixin(AnvilBlock.class)
public class AnvilBlockMixin {
    @Inject(method = "onLanding", at = @At("TAIL"))
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos,
                           FallingBlockEntity fallingBlockEntity, CallbackInfo CBI) {


        if (world.getBlockState(pos.down()).isOf(Blocks.BOOKSHELF)) {
            Block.dropStack(world, pos, new ItemStack(Items.BOOK, 3));
            world.setBlockState(pos.down(), CelluloseBlocks.EMPTY_OAK_BOOKSHELF.getDefaultState());
        }
        if (world.getBlockState(pos.down()).isOf(CelluloseBlocks.BIRCH_BOOKSHELF)) {
            Block.dropStack(world, pos, new ItemStack(Items.BOOK, 3));
            world.setBlockState(pos.down(), CelluloseBlocks.ABANDONED_BIRCH_BOOKSHELF.getDefaultState());
        }
    }
}
