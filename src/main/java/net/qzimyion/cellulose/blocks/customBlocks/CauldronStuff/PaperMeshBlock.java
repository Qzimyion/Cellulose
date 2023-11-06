package net.qzimyion.cellulose.blocks.customBlocks.CauldronStuff;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidDrainable;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldEvents;
import net.qzimyion.cellulose.items.CelluloseItems;

import java.util.Optional;

@SuppressWarnings("deprecation")
public class PaperMeshBlock extends Block implements FluidDrainable {
    public PaperMeshBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.slowMovement(state, new Vec3d(0.25, 0.25f, 0.25));
    }

    @Override
    public ItemStack tryDrainFluid(WorldAccess world, BlockPos pos, BlockState state){
        world.setBlockState(pos, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
        if (!world.isClient()) {
            world.syncWorldEvent(WorldEvents.BLOCK_BROKEN, pos, Block.getRawIdFromState(state));
        }
        return new ItemStack(CelluloseItems.PAPER_MESH_BUCKET);
    }

    @Override
    public Optional<SoundEvent> getBucketFillSound() {
        return Optional.of(SoundEvents.ITEM_BUCKET_FILL);
    }
}
