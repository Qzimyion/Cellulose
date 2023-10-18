package net.qzimyion.cellulose.blocks.custom_blocks.CauldronStuff;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.qzimyion.cellulose.util.CelluloseCauldronBehavior;

@SuppressWarnings("deprecation")
public class PaperMeshCauldronBlock extends AbstractCauldronBlock {
    public static final IntProperty LEVEL = Properties.LEVEL_3;
    public PaperMeshCauldronBlock(Settings settings) {
        super(settings, CelluloseCauldronBehavior.PAPER_MESH_CAULDRON_BEHAVIOR);
    }
    public boolean isFull(BlockState state) {
        return state.get(LEVEL) == 3;
    }
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.fullCube();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LEVEL);
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(Blocks.CAULDRON);
    }
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return 4;
    }
}
