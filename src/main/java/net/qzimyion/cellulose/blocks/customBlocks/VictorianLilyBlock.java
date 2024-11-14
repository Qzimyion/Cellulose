package net.qzimyion.cellulose.blocks.customBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.LilyPadBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.util.VLBlock;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

@SuppressWarnings("deprecation")
public class VictorianLilyBlock extends LilyPadBlock {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final EnumProperty<VLBlock> VL_BLOCK_ENUM_PROPERTY = EnumProperty.of("side", VLBlock.class);

    public VictorianLilyBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(VL_BLOCK_ENUM_PROPERTY, FACING);
    }


    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return validConnections(state, world, pos);
    }

    private BlockState validConnections(BlockState state, WorldAccess world, BlockPos pos){
        Direction facing = state.get(FACING);
        BlockState N = world.getBlockState(pos.north());
        BlockState S = world.getBlockState(pos.south());
        BlockState E = world.getBlockState(pos.east());
        BlockState W = world.getBlockState(pos.west());

        boolean c1 = N.getBlock() instanceof VictorianLilyBlock && N.get(FACING)==facing;
        boolean c2 = S.getBlock() instanceof VictorianLilyBlock && S.get(FACING)==facing;
        boolean c3 = E.getBlock() instanceof VictorianLilyBlock && E.get(FACING)==facing;
        boolean c4 = W.getBlock() instanceof VictorianLilyBlock && W.get(FACING)==facing;
        VLBlock lilyShape;
        if (c1 && c3){
            lilyShape = VLBlock.N_EAST;
        } else if (c1 && c4) {
            lilyShape = VLBlock.N_WEST;
        } else if (c2 && c3) {
            lilyShape = VLBlock.S_EAST;
        } else {
            lilyShape = VLBlock.S_WEST;
        }
        return state.with(VL_BLOCK_ENUM_PROPERTY, lilyShape);
    }


    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return Objects.requireNonNull(super.getPlacementState(ctx)).with(VL_BLOCK_ENUM_PROPERTY, ctx.getHorizontalPlayerFacing().getAxis() == Direction.Axis.X ? VLBlock.X : VLBlock.Z)
                .with(FACING, );
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }
}
