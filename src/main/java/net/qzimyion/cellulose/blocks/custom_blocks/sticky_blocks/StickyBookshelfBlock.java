package net.qzimyion.cellulose.blocks.custom_blocks.sticky_blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@SuppressWarnings("ALL")
public class StickyBookshelfBlock extends Block {
    public StickyBookshelfBlock(Settings settings) {
        super(settings);
    }

    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
            entity.slowMovement(state, new Vec3d(0.9,1.5,0.9));
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.slowMovement(state, new Vec3d(0.9,1.5,0.9));
    }

}
