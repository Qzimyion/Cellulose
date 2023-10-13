package net.qzimyion.cellulose.blocks.custom_blocks.SawdustStuff;

import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SawdustBlock extends FallingBlock {
    public SawdustBlock(Settings settings) {
        super(settings);
    }

    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity){
        if (world.getFluidState(pos.down()).isOf(Fluids.WATER)){
            world.breakBlock(pos, true);
        }
        if (world.getFluidState(pos.down()).isOf(Fluids.LAVA)){
            world.breakBlock(pos, true);
        }
    }
}
