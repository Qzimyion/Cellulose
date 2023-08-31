package net.qzimyion.cellulose.events;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.event.GameEvent;

public class BlockChipperEvent {

    public static void BlockChipping(Block input, Block output) {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            BlockPos pos = hitResult.getBlockPos();
            BlockState state = world.getBlockState(pos);
            ItemStack stack = player.getStackInHand(hand);
            BlockState targetBlock = world.getBlockState(pos);
            if (input != null && output != null) {
                if (state.isOf(input) && stack.isIn(ItemTags.PICKAXES)) {
                    stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                    player.swingHand(hand);
                    world.setBlockState(pos, output.getStateWithProperties(state));
                    world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, output.getStateWithProperties(state)));
                    world.playSound(player, pos, SoundEvents.ENTITY_PAINTING_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    ParticleUtil.spawnParticle(world, pos, new BlockStateParticleEffect(ParticleTypes.BLOCK, targetBlock), UniformIntProvider.create(3,5));
                    return ActionResult.SUCCESS;
                }
            }
            return ActionResult.PASS;
        });
    }
}
