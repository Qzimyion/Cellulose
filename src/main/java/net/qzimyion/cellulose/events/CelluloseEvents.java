package net.qzimyion.cellulose.events;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.util.CelluloseTags;

import java.util.HashMap;

import static net.minecraft.block.Blocks.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

public class CelluloseEvents {
    public static final HashMap<Block, Block> LOG_CHIPPING = new HashMap<>();
    public static final HashMap<Block, Block> LOG_SLAB_STRIPPING = new HashMap<>();
    public static final HashMap<Block, Block> LOG_STAIR_STRIPPING = new HashMap<>();
    public static final HashMap<Block, Block> PLANK_CHIPPING = new HashMap<>();
    public static final HashMap<Block, Block> SLAB_CHIPPING = new HashMap<>();
    public static final HashMap<Block, Block> STAIR_CHIPPING = new HashMap<>();
    public static final HashMap<Block, Block> PLANK_REPAIR = new HashMap<>();
    public static final HashMap<Block, Block> SLAB_REPAIR = new HashMap<>();
    public static final HashMap<Block, Block> STAIR_REPAIR = new HashMap<>();

    //Wood Charring
    public static final HashMap<Block, Block> LOG_CHARRING = new HashMap<>();
    public static final HashMap<Block, Block> PLANK_CHARRING = new HashMap<>();
    public static final HashMap<Block, Block> SLAB_CHARRING = new HashMap<>();
    public static final HashMap<Block, Block> STAIR_CHARRING = new HashMap<>();
    public static final HashMap<Block, Block> FENCE_CHARRING = new HashMap<>();
    public static final HashMap<Block, Block> FENCE_GATE_CHARRING = new HashMap<>();
    public static final HashMap<Block, Block> DOOR_CHARRING = new HashMap<>();
    public static final HashMap<Block, Block> TRAPDOOR_CHARRING = new HashMap<>();
    public static final HashMap<Block, Block> SIGN_CHARRING = new HashMap<>();
    public static final HashMap<Entity, Entity> BOAT_CHARRING = new HashMap<>();

    static {
        //Log Chipping
        LOG_CHIPPING.put(OAK_LOG, CHIPPED_OAK);
        LOG_CHIPPING.put(BIRCH_LOG, CHIPPED_BIRCH);
        LOG_CHIPPING.put(SPRUCE_LOG, CHIPPED_SPRUCE);
        LOG_CHIPPING.put(DARK_OAK_LOG, CHIPPED_DARK_OAK);
        LOG_CHIPPING.put(JUNGLE_LOG, CHIPPED_JUNGLE);
        LOG_CHIPPING.put(ACACIA_LOG, CHIPPED_ACACIA);
        LOG_CHIPPING.put(CRIMSON_STEM, CHIPPED_CRIMSON);
        LOG_CHIPPING.put(WARPED_STEM, CHIPPED_WARPED);
        LOG_CHIPPING.put(MANGROVE_LOG, CHIPPED_MANGROVE);
        LOG_CHIPPING.put(BAMBOO_BLOCK, CHIPPED_BAMBOO_BLOCK);
        LOG_CHIPPING.put(STRIPPED_BAMBOO_BLOCK, CHIPPED_STRIPPED_BAMBOO_BLOCK);
        LOG_CHIPPING.put(CHERRY_LOG, CHIPPED_CHERRY);
        LOG_CHIPPING.put(CACTUS_BUNDLE, CHIPPED_CACTUS);
        LOG_CHIPPING.put(OAK_WOOD, CHIPPED_OAK_WOOD);
        LOG_CHIPPING.put(BIRCH_WOOD, CHIPPED_BIRCH_WOOD);
        LOG_CHIPPING.put(SPRUCE_WOOD, CHIPPED_SPRUCE_WOOD);
        LOG_CHIPPING.put(DARK_OAK_WOOD, CHIPPED_DARK_OAK_WOOD);
        LOG_CHIPPING.put(JUNGLE_WOOD, CHIPPED_JUNGLE_WOOD);
        LOG_CHIPPING.put(ACACIA_WOOD, CHIPPED_ACACIA_WOOD);
        LOG_CHIPPING.put(CRIMSON_HYPHAE, CHIPPED_CRIMSON_HYPHAE);
        LOG_CHIPPING.put(WARPED_HYPHAE, CHIPPED_WARPED_HYPHAE);
        LOG_CHIPPING.put(MANGROVE_WOOD, CHIPPED_MANGROVE_WOOD);
        LOG_CHIPPING.put(CHERRY_WOOD, CHIPPED_CHERRY_WOOD);
        LOG_CHIPPING.put(CACTUS_CROWN, CHIPPED_CACTUS_CROWN);
        //Log Slab Stripping
        LOG_SLAB_STRIPPING.put(OAK_LOG_SLABS, STRIPPED_OAK_LOG_SLABS);
        LOG_SLAB_STRIPPING.put(OAK_WOOD_SLABS, STRIPPED_OAK_WOOD_SLABS);
        //Log Stair Stripping
        LOG_STAIR_STRIPPING.put(OAK_LOG_STAIRS, STRIPPED_OAK_LOG_STAIRS);
        LOG_STAIR_STRIPPING.put(OAK_WOOD_STAIRS, STRIPPED_OAK_WOOD_STAIRS);
        //Plank Chipping
        PLANK_CHIPPING.put(WARPED_PLANKS, CHIPPED_WARPED_PLANKS);
        PLANK_CHIPPING.put(CRIMSON_PLANKS, CHIPPED_CRIMSON_PLANKS);
        //Slab Chipping
        SLAB_CHIPPING.put(WARPED_SLAB, CHIPPED_WARPED_SLAB);
        SLAB_CHIPPING.put(CRIMSON_SLAB, CHIPPED_CRIMSON_SLAB);
        //Stair Chipping
        STAIR_CHIPPING.put(WARPED_STAIRS, CHIPPED_WARPED_STAIR);
        STAIR_CHIPPING.put(CRIMSON_STAIRS, CHIPPED_CRIMSON_STAIR);
        //Plank Repairing
        PLANK_REPAIR.put(CHIPPED_WARPED_PLANKS, WARPED_PLANKS);
        PLANK_REPAIR.put(CHIPPED_CRIMSON_PLANKS, CRIMSON_PLANKS);
        //Slab Repairing
        SLAB_REPAIR.put(CHIPPED_WARPED_SLAB, WARPED_SLAB);
        SLAB_REPAIR.put(CHIPPED_CRIMSON_SLAB, CRIMSON_SLAB);
        //Stair Repairing
        STAIR_REPAIR.put(CHIPPED_WARPED_STAIR, WARPED_STAIRS);
        STAIR_REPAIR.put(CHIPPED_CRIMSON_STAIR, CRIMSON_STAIRS);
    }

    public static void registerEvents(){
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {

            BlockPos Pos = hitResult.getBlockPos();
            BlockState State = world.getBlockState(Pos);
            ItemStack heldItem = player.getStackInHand(hand);

            //Log Chipping
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(BlockTags.LOGS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_WOOD_HIT, SoundCategory.BLOCKS, 1.0f, 1.0f);
                ParticleUtil.spawnParticle(world, Pos, new BlockStateParticleEffect(ParticleTypes.BLOCK, State), UniformIntProvider.create(3, 5));
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(Pos, LOG_CHIPPING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(BlockTags.BAMBOO_BLOCKS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_BAMBOO_HIT, SoundCategory.BLOCKS, 1.0f, 1.0f);
                ParticleUtil.spawnParticle(world, Pos, new BlockStateParticleEffect(ParticleTypes.BLOCK, State), UniformIntProvider.create(3, 5));
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(Pos, LOG_CHIPPING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Slab Stripping
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(BlockTags.PLANKS)) {
                world.playSound(player, Pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(Pos, LOG_SLAB_STRIPPING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Stair Stripping
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(BlockTags.PLANKS)) {
                world.playSound(player, Pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(Pos, LOG_STAIR_STRIPPING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Plank Chipping
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(BlockTags.PLANKS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_WOOD_HIT, SoundCategory.BLOCKS, 1.0f, 1.0f);
                ParticleUtil.spawnParticle(world, Pos, new BlockStateParticleEffect(ParticleTypes.BLOCK, State), UniformIntProvider.create(3, 5));
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(Pos, PLANK_CHIPPING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Slab Chipping
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(BlockTags.WOODEN_SLABS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_WOOD_HIT, SoundCategory.BLOCKS, 1.0f, 1.0f);
                ParticleUtil.spawnParticle(world, Pos, new BlockStateParticleEffect(ParticleTypes.BLOCK, State), UniformIntProvider.create(3, 5));
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(Pos, SLAB_CHIPPING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Stair Chipping
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(BlockTags.WOODEN_STAIRS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_WOOD_HIT, SoundCategory.BLOCKS, 1.0f, 1.0f);
                ParticleUtil.spawnParticle(world, Pos, new BlockStateParticleEffect(ParticleTypes.BLOCK, State), UniformIntProvider.create(3, 5));
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(Pos, STAIR_CHIPPING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Plank Repairing
            if (heldItem.getItem()==Items.STICK && State.isIn(CelluloseTags.Blocks.CHIPPED_PLANKS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_SCAFFOLDING_BREAK, SoundCategory.BLOCKS, 1.0f, 1.0f);
                ParticleUtil.spawnParticle(world, Pos, new BlockStateParticleEffect(ParticleTypes.BLOCK, State), UniformIntProvider.create(3, 5));
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.decrement(1);
                    world.setBlockState(Pos, PLANK_REPAIR.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Slab Repairing
            if (heldItem.getItem()==Items.STICK && State.isIn(CelluloseTags.Blocks.CHIPPED_PLANKS_SLAB)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_SCAFFOLDING_BREAK, SoundCategory.BLOCKS, 1.0f, 1.0f);
                ParticleUtil.spawnParticle(world, Pos, new BlockStateParticleEffect(ParticleTypes.BLOCK, State), UniformIntProvider.create(3, 5));
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.decrement(1);
                    world.setBlockState(Pos, SLAB_REPAIR.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Stair Repairing
            if (heldItem.getItem()==Items.STICK && State.isIn(CelluloseTags.Blocks.CHIPPED_PLANKS_STAIRS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_SCAFFOLDING_BREAK, SoundCategory.BLOCKS, 1.0f, 1.0f);
                ParticleUtil.spawnParticle(world, Pos, new BlockStateParticleEffect(ParticleTypes.BLOCK, State), UniformIntProvider.create(3, 5));
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.decrement(1);
                    world.setBlockState(Pos, STAIR_REPAIR.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            return ActionResult.PASS;
        });

        Cellulose.LOGGER.info("Registering Mod Events ");
    }
}
