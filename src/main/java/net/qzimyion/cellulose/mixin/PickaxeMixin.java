package net.qzimyion.cellulose.mixin;


import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.PickaxeItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.qzimyion.cellulose.registry.CelluloseBlocks;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

import java.util.Map;

@Debug(export = true)
@Mixin(PickaxeItem.class)
public class PickaxeMixin extends Item {
    @Unique
    private static final Map<Block, BlockState> CHIPPED_BLOCKS = Maps.newHashMap(new ImmutableMap.Builder<Block, BlockState>()
            .put(Blocks.OAK_WOOD, CelluloseBlocks.CHIPPED_OAK_WOOD.getDefaultState()).put(Blocks.OAK_LOG, CelluloseBlocks.CHIPPED_OAK.getDefaultState())
            .build());

    public PickaxeMixin(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState blockState = world.getBlockState(blockPos);
        if (context.getSide() != Direction.DOWN) {
            PlayerEntity playerEntity = context.getPlayer();
            BlockState blockState2 = CHIPPED_BLOCKS.get(blockState.getBlock());
            BlockState blockState3 = null;
            if (blockState2 != null && world.getBlockState(blockPos.up()).isAir()) {
                world.playSound(playerEntity, blockPos, SoundEvents.ENTITY_PAINTING_BREAK, SoundCategory.BLOCKS, 1.0f, 1.0f);
                blockState3 = blockState2;
            }
            if (blockState3 != null) {
                if (!world.isClient) {
                    world.setBlockState(blockPos, blockState3, Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
                    world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, blockState3));
                    if (playerEntity != null) {
                        context.getStack().damage(1, playerEntity, p -> p.sendToolBreakStatus(context.getHand()));
                    }
                }
                return ActionResult.success(world.isClient);
            }
            return ActionResult.PASS;
        }
        return ActionResult.PASS;
    }
}