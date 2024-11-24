package net.qzimyion.cellulose.blocks.customBlocks.ChisledBookshelvesStuff;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.qzimyion.cellulose.blocks.ModBlockProperties;
import net.qzimyion.cellulose.entity.BlockEntity.CustomBookshelves.BambooChiseledBookshelfBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

@SuppressWarnings("deprecation")
public class BambooChiseledBookshelfBlock extends BaseEntityBlock {
    public static final IntegerProperty BOOKS_STORED = ModBlockProperties.BOOKS_STORED;
    public static final IntegerProperty LAST_INTERACTION_BOOK_SLOT = ModBlockProperties.LAST_INTERACTION_BOOK_SLOT;
    public BambooChiseledBookshelfBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(BOOKS_STORED, 0).setValue(HorizontalDirectionalBlock.FACING, Direction.NORTH).setValue(LAST_INTERACTION_BOOK_SLOT, 0));
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BambooChiseledBookshelfBlockEntity(pos, state);
    }
    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (!(blockEntity instanceof BambooChiseledBookshelfBlockEntity)){
            return InteractionResult.PASS;
        }
        Optional<Vec2> optional = getHitPos(hit, state.getValue(HorizontalDirectionalBlock.FACING));
        if (optional.isEmpty()) {
            return InteractionResult.PASS;
        }
        if (world.isClientSide){
            return InteractionResult.SUCCESS;
        }
        ItemStack itemStack = player.getItemInHand(hand);
        return itemStack.is(ItemTags.BOOKSHELF_BOOKS) ? tryAddBook(state, world, pos, player, (BambooChiseledBookshelfBlockEntity) blockEntity, itemStack) : tryRemoveBook(state, world, pos, player, (BambooChiseledBookshelfBlockEntity) blockEntity);
    }

    private static InteractionResult tryRemoveBook(BlockState state, Level world, BlockPos pos, Player player, BambooChiseledBookshelfBlockEntity blockEntity) {
        if (!blockEntity.isEmpty()) {
            ItemStack itemStack = blockEntity.getLastBook();

            int i = blockEntity.getBookCount();
            world.setBlock(pos, state.setValue(BOOKS_STORED, i).setValue(LAST_INTERACTION_BOOK_SLOT, i + 1), Block.UPDATE_ALL);
            SoundEvent soundEvent = itemStack.is(Items.ENCHANTED_BOOK) ? SoundEvents.CHISELED_BOOKSHELF_PICKUP_ENCHANTED : SoundEvents.CHISELED_BOOKSHELF_PICKUP;
            world.playSound(null, pos, soundEvent, SoundSource.BLOCKS, 1.0f, 1.0f);
            world.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            if (!player.getInventory().add(itemStack)) {
                player.drop(itemStack, false);
            }
        }
        return InteractionResult.CONSUME;
    }

    private static InteractionResult tryAddBook(BlockState state, Level world, BlockPos pos, Player player, BambooChiseledBookshelfBlockEntity blockEntity, ItemStack stack) {
        if (!blockEntity.isFull()) {
            blockEntity.addBook(stack.split(1));
            SoundEvent soundEvent = stack.is(Items.ENCHANTED_BOOK) ? SoundEvents.CHISELED_BOOKSHELF_INSERT_ENCHANTED : SoundEvents.CHISELED_BOOKSHELF_INSERT;
            if (player.isCreative()) {
                stack.grow(1);
            }
            int i = blockEntity.getBookCount();
            world.playSound(null, pos, soundEvent, SoundSource.BLOCKS, 1.0f, 1.0f);
            world.setBlock(pos, state.setValue(BOOKS_STORED, i).setValue(LAST_INTERACTION_BOOK_SLOT, i), Block.UPDATE_ALL);
            world.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
        }
        return InteractionResult.CONSUME;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BOOKS_STORED).add(LAST_INTERACTION_BOOK_SLOT).add(HorizontalDirectionalBlock.FACING);
    }

    @Override
    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean moved){
        if (state.is(newState.getBlock())) {
            return;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof BambooChiseledBookshelfBlockEntity bambooChiseledBookshelfBlockEntity){
            ItemStack itemStack = bambooChiseledBookshelfBlockEntity.getLastBook();
            while (!itemStack.isEmpty()){
                Containers.dropItemStack(world, pos.getX(), pos.getY(), pos.getZ(), itemStack);
                itemStack = bambooChiseledBookshelfBlockEntity.getLastBook();
            }
            world.updateNeighbourForOutputSignal(pos, this);
        }
        super.onRemove(state, world, pos, newState, moved);
    }

    public static Optional<Vec2> getHitPos(BlockHitResult hit, Direction facing) {
        Direction direction = hit.getDirection();
        if (facing != direction) {
            return Optional.empty();
        }
        BlockPos blockPos = hit.getBlockPos().relative(direction);
        Vec3 vec3d = hit.getLocation().subtract(blockPos.getX(), blockPos.getY(), blockPos.getZ());
        double x = vec3d.x();
        double y = vec3d.y();
        double z = vec3d.z();
        return switch (direction) {
            case NORTH -> Optional.of(new Vec2((float)(1 - x), (float)y));
            case SOUTH -> Optional.of(new Vec2((float)x, (float)y));
            case WEST -> Optional.of(new Vec2((float)z, (float)y));
            case EAST -> Optional.of(new Vec2((float)(1 - z), (float)y));
            case DOWN, UP -> Optional.empty();
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    @Override
    public int getAnalogOutputSignal(BlockState state, Level world, BlockPos pos) {
        return state.getValue(LAST_INTERACTION_BOOK_SLOT);
    }
}
