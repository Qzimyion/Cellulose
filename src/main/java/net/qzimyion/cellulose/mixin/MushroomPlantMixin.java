package net.qzimyion.cellulose.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.FACING;

import net.minecraft.world.level.block.MushroomBlock;

@Mixin(MushroomBlock.class)
public class MushroomPlantMixin {

    //private static final VoxelShape SHAPE_NORTH = Block.createCuboidShape();
    //private static final VoxelShape SHAPE_SOUTH = Block.createCuboidShape();
    //private static final VoxelShape SHAPE_EAST = Block.createCuboidShape();
    //private static final VoxelShape SHAPE_WEST = Block.createCuboidShape();


    //Trying to replicate ladder placement behavior
//    @Unique
//    private boolean canPlaceOn(BlockView world, BlockPos pos, Direction side) {
//        BlockState blockState = world.getBlockState(pos);
//        return blockState.isIn(BlockTags.LOGS) || blockState.isSideSolidFullSquare(world, pos, side);
//    }
//
//    @Inject(at = @At("RETURN"), method = "canPlantOnTop", cancellable = true)
//    private void canPlaceAt(BlockState floor, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir){
//        BlockState state = world.getBlockState(pos);
//        Direction direction = state.get(FACING);
//        if (canPlaceOn(world, pos.offset(direction.getOpposite()), direction)) cir.setReturnValue(true);
//    }
}
