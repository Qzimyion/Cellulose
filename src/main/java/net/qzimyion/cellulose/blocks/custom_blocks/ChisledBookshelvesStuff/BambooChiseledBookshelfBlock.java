package net.qzimyion.cellulose.blocks.custom_blocks.ChisledBookshelvesStuff;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.qzimyion.cellulose.blocks.ModBlockProperties;
import net.qzimyion.cellulose.entity.BlockEntity.CustomBookshelves.BambooChiseledBookshelfBlockEntity;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class BambooChiseledBookshelfBlock extends BlockWithEntity {
    public static final IntProperty BOOKS_STORED = ModBlockProperties.BOOKS_STORED;
    public static final IntProperty LAST_INTERACTION_BOOK_SLOT = ModBlockProperties.LAST_INTERACTION_BOOK_SLOT;
    public BambooChiseledBookshelfBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(BOOKS_STORED, 0).with(HorizontalFacingBlock.FACING, Direction.NORTH).with(LAST_INTERACTION_BOOK_SLOT, 0));
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BambooChiseledBookshelfBlockEntity(pos, state);
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (!(blockEntity instanceof BambooChiseledBookshelfBlockEntity)){
            return ActionResult.PASS;

        }
        if (world.isClient){
            return ActionResult.SUCCESS;
        }
        ItemStack itemStack = player.getStackInHand(hand);
        return itemStack.isIn(ItemTags.BOOKSHELF_BOOKS) ? tryAddBook(state, world, pos, player, (BambooChiseledBookshelfBlockEntity) blockEntity, itemStack) : tryRemoveBook(state, world, pos, player, (BambooChiseledBookshelfBlockEntity) blockEntity);
    }

    private static ActionResult tryRemoveBook(BlockState state, World world, BlockPos pos, PlayerEntity player, BambooChiseledBookshelfBlockEntity blockEntity) {
        if (!blockEntity.isEmpty()) {
            ItemStack itemStack = blockEntity.getLastBook();
            world.playSound(null, pos, SoundEvents.BLOCK_WOOD_PLACE, SoundCategory.BLOCKS, 1.0f, 1.0f);
            int i = blockEntity.getBookCount();
            world.setBlockState(pos, state.with(BOOKS_STORED, i).with(LAST_INTERACTION_BOOK_SLOT, i + 1), Block.NOTIFY_ALL);
            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            if (!player.getInventory().insertStack(itemStack)) {
                player.dropItem(itemStack, false);
            }
        }
        return ActionResult.CONSUME;
    }

    private static ActionResult tryAddBook(BlockState state, World world, BlockPos pos, PlayerEntity player, BambooChiseledBookshelfBlockEntity blockEntity, ItemStack stack) {
        if (!blockEntity.isFull()) {
            blockEntity.addBook(stack.split(1));
            world.playSound(null, pos, SoundEvents.BLOCK_WOOD_PLACE, SoundCategory.BLOCKS, 1.0f, 1.0f);
            if (player.isCreative()) {
                stack.increment(1);
            }
            int i = blockEntity.getBookCount();
            world.setBlockState(pos, state.with(BOOKS_STORED, i).with(LAST_INTERACTION_BOOK_SLOT, i), Block.NOTIFY_ALL);
            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
        }
        return ActionResult.CONSUME;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(BOOKS_STORED).add(LAST_INTERACTION_BOOK_SLOT).add(HorizontalFacingBlock.FACING);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved){
        if (state.isOf(newState.getBlock())) {
            return;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof BambooChiseledBookshelfBlockEntity bambooChiseledBookshelfBlockEntity){
            ItemStack itemStack = bambooChiseledBookshelfBlockEntity.getLastBook();
            while (!itemStack.isEmpty()){
                ItemScatterer.spawn(world, pos.getX(), pos.getY(), pos.getZ(), itemStack);
                itemStack = bambooChiseledBookshelfBlockEntity.getLastBook();
            }
            world.updateComparators(pos, this);
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(HorizontalFacingBlock.FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return state.get(LAST_INTERACTION_BOOK_SLOT);
    }
}
