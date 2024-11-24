package net.qzimyion.cellulose.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.state.BlockState;
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

    @Inject(at = @At("TAIL"), method = "canSurvive", cancellable = true)
    public void canPlaceAt(BlockState state, LevelReader world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if(world.getBlockState(pos.below()).is(CelluloseBlocks.STRIPPED_CACTUS) && !world.getBlockState(pos.above()).liquid()) cir.setReturnValue(true);
    }
}
