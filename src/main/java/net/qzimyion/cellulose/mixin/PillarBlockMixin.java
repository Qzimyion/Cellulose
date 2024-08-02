package net.qzimyion.cellulose.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;

@SuppressWarnings("deprecation")
@Mixin(PillarBlock.class)
public class PillarBlockMixin extends Block {

    //Test

    public PillarBlockMixin(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (state.isOf(Blocks.OAK_LOG)){
            if (world.getBlockState(pos.up()).isOf(Blocks.CLAY) || world.getBlockState(pos.up()).isOf(Blocks.MUD)
                    && world.getBlockState(pos.down()).isOf(Blocks.RAW_IRON_BLOCK)){
                world.setBlockState(pos, Blocks.PURPUR_PILLAR.getDefaultState());
            }
        }
    }
}
