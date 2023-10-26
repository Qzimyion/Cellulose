package net.qzimyion.cellulose.blocks.custom_blocks.celluloseLeaves.PaloVerde;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.qzimyion.cellulose.blocks.ModBlockProperties;

@SuppressWarnings("deprecation")
public class PaloVerdeLeafBlock extends LeavesBlock {
    public PaloVerdeLeafBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!(entity instanceof LivingEntity) || entity.getBlockStateAtPos().isOf(this) && !ModBlockProperties.ImmuneToSpikyStuff((LivingEntity)entity)) {
            entity.damage(world.getDamageSources().cactus(), 1.0f);
        }
        super.onEntityCollision(state, world, pos, entity);
    }
}
