package net.qzimyion.cellulose.blocks.custom_blocks.paper_blocks;

import net.minecraft.block.*;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class PaperBlock extends FallingBlock {

    public PaperBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        if (PaperBlock.shouldBreak(world, pos, currentStateInPos)) {

            ParticleUtil.spawnParticle(world, pos, new BlockStateParticleEffect(ParticleTypes.BLOCK, world.getBlockState(pos)), UniformIntProvider.create(3,5));
            dropStack(world, pos, new ItemStack(Items.PAPER));
            world.breakBlock(pos, false);
        }
    }

    private static boolean shouldBreak(BlockView world, BlockPos pos, BlockState state) {
        return PaperBlock.breaksIn(state) || PaperBlock.breaksOnAnySide(world, pos);
    }

    private static boolean breaksOnAnySide(BlockView world, BlockPos pos) {
        boolean bl = false;
        BlockPos.Mutable mutable = pos.mutableCopy();
        for (Direction direction : Direction.values()) {
            BlockState blockState = world.getBlockState(mutable);
            if (direction == Direction.DOWN && !PaperBlock.breaksIn(blockState)) continue;
            mutable.set(pos, direction);
            blockState = world.getBlockState(mutable);
            if (!PaperBlock.breaksIn(blockState) || blockState.isSideSolidFullSquare(world, pos, direction.getOpposite())) continue;
            bl = true;
            break;
        }
        return bl;
    }
    private static boolean breaksIn(BlockState state) {
        return state.getFluidState().isIn(FluidTags.WATER);
    }
}
