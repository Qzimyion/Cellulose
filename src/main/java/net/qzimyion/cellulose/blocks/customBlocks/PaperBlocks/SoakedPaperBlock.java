package net.qzimyion.cellulose.blocks.customBlocks.PaperBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.state.BlockState;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

@SuppressWarnings("deprecation")
public class SoakedPaperBlock extends Block {
    public SoakedPaperBlock(Properties settings) {
        super(settings);
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean notify) {
        if (world.dimensionType().ultraWarm()) {
            world.setBlock(pos, CelluloseBlocks.PAPER_BLOCK.defaultBlockState(), Block.UPDATE_ALL);
            world.levelEvent(LevelEvent.PARTICLES_WATER_EVAPORATING, pos, 0);
            world.playSound(null, pos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 1.0f, (1.0f + world.getRandom().nextFloat() * 0.2f) * 0.7f);
        }
    }

    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        Direction direction = Direction.getRandom(random);
        if (direction == Direction.UP) {
            return;
        }
        BlockPos blockPos = pos.relative(direction);
        BlockState blockState = world.getBlockState(blockPos);
        if (state.canOcclude() && blockState.isFaceSturdy(world, blockPos, direction.getOpposite())) {
            return;
        }
        double d = pos.getX();
        double e = pos.getY();
        double f = pos.getZ();
        if (direction == Direction.DOWN) {
            e -= 0.05;
            d += random.nextDouble();
            f += random.nextDouble();
        } else {
            e += random.nextDouble() * 0.8;
            if (direction.getAxis() == Direction.Axis.X) {
                f += random.nextDouble();
                d = direction == Direction.EAST ? d + 1.1 : d + 0.05;
            } else {
                d += random.nextDouble();
                f = direction == Direction.SOUTH ? f + 1.1 : f + 0.05;
            }
        }
        world.addParticle(ParticleTypes.DRIPPING_WATER, d, e, f, 0.0, 0.0, 0.0);
    }
}