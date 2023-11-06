package net.qzimyion.cellulose.blocks.customBlocks.celluloseLeaves.PaloVerde;

import net.minecraft.block.BlockState;
import net.minecraft.block.CherryLeavesBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.qzimyion.cellulose.blocks.ModBlockProperties;

@SuppressWarnings("deprecation")
public class FloweringPaloVerdeLeafBlock extends LeavesBlock {
    public FloweringPaloVerdeLeafBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!(entity instanceof LivingEntity) || entity.getBlockStateAtPos().isOf(this) && !ModBlockProperties.ImmuneToSpikyStuff((LivingEntity)entity)) {
            entity.slowMovement(state, new Vec3d(0.9f, 1.5, 0.9f));
        }
        super.onEntityCollision(state, world, pos, entity);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) != 0) {
            return;
        }
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (CherryLeavesBlock.isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
            return;
        }
        ParticleUtil.spawnParticle(world, pos, random, ParticleTypes.CHERRY_LEAVES);
    }
}
