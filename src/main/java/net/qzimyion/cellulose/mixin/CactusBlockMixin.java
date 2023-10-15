package net.qzimyion.cellulose.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CactusBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@SuppressWarnings("deprecation")
@Mixin(CactusBlock.class)
public class CactusBlockMixin {
    @Inject(at = @At("TAIL"), method = "canPlaceAt", cancellable = true)
    public void canPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        BlockState blockState2 = world.getBlockState(pos.down());
        cir.setReturnValue((blockState2.isOf(Blocks.CACTUS) || blockState2.isIn(BlockTags.SAND) || (blockState2.isOf(CelluloseBlocks.STRIPPED_CACTUS))) && !world.getBlockState(pos.up()).isLiquid());
    }
}
