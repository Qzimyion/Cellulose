package net.qzimyion.cellulose.mixin;


import com.google.common.collect.ImmutableMap;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.qzimyion.cellulose.registry.CelluloseBlocks;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;


import java.util.Map;
import java.util.Optional;

@Debug(export = true)
@Mixin(PickaxeItem.class)
public class PickaxeMixin extends MiningToolItem {
    public PickaxeMixin(float attackDamage, float attackSpeed, ToolMaterial material, Item.Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.PICKAXE_MINEABLE, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context){
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState blockState = world.getBlockState(blockPos);
        Optional<BlockState> optional = this.getChippedState(blockState);
        Optional<BlockState> optional1 = Optional.empty();
        PlayerEntity playerEntity = context.getPlayer();
        ItemStack itemStack = context.getStack();
        if (optional.isPresent()){
            world.playSound(playerEntity, blockPos, SoundEvents.ENTITY_PAINTING_BREAK, SoundCategory.BLOCKS, 1.0f, 1.0f);
            optional1 = optional;
        }
        if (optional1.isPresent()) {
            if (playerEntity instanceof ServerPlayerEntity) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) playerEntity, blockPos, itemStack);
            }
            world.setBlockState(blockPos, optional1.get(), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, optional1.get()));
            if (playerEntity != null) {
                itemStack.damage(1, playerEntity, player -> player.sendToolBreakStatus(context.getHand()));
            }
            return ActionResult.success(world.isClient);
        }
        return super.useOnBlock(context);
    }

    @Unique
    private Optional<BlockState> getChippedState(BlockState state) {
        return Optional.ofNullable(CHIPPED_BLOCKS.get(state.getBlock())).map(block -> block.getDefaultState().with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)));
    }

    @Unique
    private static final Map<Block, Block> CHIPPED_BLOCKS = new ImmutableMap.Builder<Block, Block>()
            .put(Blocks.OAK_WOOD, CelluloseBlocks.CHIPPED_OAK_WOOD).put(Blocks.OAK_LOG, CelluloseBlocks.CHIPPED_OAK)
            .build();
}
