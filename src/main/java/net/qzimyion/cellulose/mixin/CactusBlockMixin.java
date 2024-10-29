package net.qzimyion.cellulose.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.CactusBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Debug(export = true)
@SuppressWarnings("deprecation")
@Mixin(CactusBlock.class)
public class CactusBlockMixin {

    @Inject(at = @At("TAIL"), method = "canPlaceAt", cancellable = true)
    public void canPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if(world.getBlockState(pos.down()).isOf(CelluloseBlocks.STRIPPED_CACTUS) && !world.getBlockState(pos.up()).isLiquid()) cir.setReturnValue(true);
    }
}
