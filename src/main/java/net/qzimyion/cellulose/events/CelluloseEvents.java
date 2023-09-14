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
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.items.CelluloseItems;
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
    public static final HashMap<Block, Block> FLOWERING = new HashMap<>();
    public static final HashMap<Block, Block> DEFLOWER = new HashMap<>();

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
        LOG_CHIPPING.put(AZALEA_LOG, CHIPPED_AZALEA);
        LOG_CHIPPING.put(AZALEA_WOOD, CHIPPED_AZALEA_WOOD);
        //Log Slab Stripping
        LOG_SLAB_STRIPPING.put(OAK_LOG_SLABS, STRIPPED_OAK_LOG_SLABS);
        LOG_SLAB_STRIPPING.put(OAK_WOOD_SLABS, STRIPPED_OAK_WOOD_SLABS);
        //Log Stair Stripping
        LOG_STAIR_STRIPPING.put(OAK_LOG_STAIRS, STRIPPED_OAK_LOG_STAIRS);
        LOG_STAIR_STRIPPING.put(OAK_WOOD_STAIRS, STRIPPED_OAK_WOOD_STAIRS);
        //Plank Chipping
        PLANK_CHIPPING.put(OAK_PLANKS, CHIPPED_OAK_PLANKS);
        PLANK_CHIPPING.put(BIRCH_PLANKS, CHIPPED_BIRCH_PLANKS);
        PLANK_CHIPPING.put(SPRUCE_PLANKS, CHIPPED_SPRUCE_PLANKS);
        PLANK_CHIPPING.put(DARK_OAK_PLANKS, CHIPPED_DARK_OAK_PLANKS);
        PLANK_CHIPPING.put(JUNGLE_PLANKS, CHIPPED_JUNGLE_PLANKS);
        PLANK_CHIPPING.put(ACACIA_PLANKS, CHIPPED_ACACIA_PLANKS);
        PLANK_CHIPPING.put(WARPED_PLANKS, CHIPPED_WARPED_PLANKS);
        PLANK_CHIPPING.put(CRIMSON_PLANKS, CHIPPED_CRIMSON_PLANKS);
        PLANK_CHIPPING.put(MANGROVE_PLANKS, CHIPPED_MANGROVE_PLANKS);
        PLANK_CHIPPING.put(BAMBOO_PLANKS, CHIPPED_BAMBOO_PLANKS);
        PLANK_CHIPPING.put(CHERRY_PLANKS, CHIPPED_CHERRY_PLANKS);
        PLANK_CHIPPING.put(CACTUS_PLANKS, CHIPPED_CACTUS_PLANKS);
        PLANK_CHIPPING.put(AZALEA_PLANKS, CHIPPED_AZALEA_PLANKS);
        PLANK_CHIPPING.put(BLOOMING_AZALEA_PLANKS, CHIPPED_BLOOMING_AZALEA_PLANKS);
        //Slab Chipping
        SLAB_CHIPPING.put(OAK_SLAB, CHIPPED_OAK_SLAB);
        SLAB_CHIPPING.put(BIRCH_SLAB, CHIPPED_BIRCH_SLAB);
        SLAB_CHIPPING.put(SPRUCE_SLAB, CHIPPED_SPRUCE_SLAB);
        SLAB_CHIPPING.put(DARK_OAK_SLAB, CHIPPED_DARK_OAK_SLAB);
        SLAB_CHIPPING.put(JUNGLE_SLAB, CHIPPED_JUNGLE_SLAB);
        SLAB_CHIPPING.put(ACACIA_SLAB, CHIPPED_ACACIA_SLAB);
        SLAB_CHIPPING.put(WARPED_SLAB, CHIPPED_WARPED_SLAB);
        SLAB_CHIPPING.put(CRIMSON_SLAB, CHIPPED_CRIMSON_SLAB);
        SLAB_CHIPPING.put(MANGROVE_SLAB, CHIPPED_MANGROVE_SLAB);
        SLAB_CHIPPING.put(BAMBOO_SLAB, CHIPPED_BAMBOO_SLAB);
        SLAB_CHIPPING.put(CHERRY_SLAB, CHIPPED_CHERRY_SLAB);
        SLAB_CHIPPING.put(CACTUS_SLAB, CHIPPED_CACTUS_SLAB);
        SLAB_CHIPPING.put(AZALEA_SLAB, CHIPPED_AZALEA_SLAB);
        SLAB_CHIPPING.put(BLOOMING_AZALEA_SLAB, CHIPPED_BLOOMING_AZALEA_SLAB);
        //Stair Chipping
        STAIR_CHIPPING.put(OAK_STAIRS, CHIPPED_OAK_STAIR);
        STAIR_CHIPPING.put(BIRCH_STAIRS, CHIPPED_BIRCH_STAIR);
        STAIR_CHIPPING.put(SPRUCE_STAIRS, CHIPPED_SPRUCE_STAIR);
        STAIR_CHIPPING.put(DARK_OAK_STAIRS, CHIPPED_DARK_OAK_STAIR);
        STAIR_CHIPPING.put(JUNGLE_STAIRS, CHIPPED_JUNGLE_STAIR);
        STAIR_CHIPPING.put(ACACIA_STAIRS, CHIPPED_ACACIA_STAIR);
        STAIR_CHIPPING.put(WARPED_STAIRS, CHIPPED_WARPED_STAIR);
        STAIR_CHIPPING.put(CRIMSON_STAIRS, CHIPPED_CRIMSON_STAIR);
        STAIR_CHIPPING.put(MANGROVE_STAIRS, CHIPPED_MANGROVE_STAIR);
        STAIR_CHIPPING.put(BAMBOO_STAIRS, CHIPPED_BAMBOO_STAIR);
        STAIR_CHIPPING.put(CHERRY_STAIRS, CHIPPED_CHERRY_STAIR);
        STAIR_CHIPPING.put(CACTUS_STAIRS, CHIPPED_CACTUS_STAIR);
        STAIR_CHIPPING.put(AZALEA_STAIRS, CHIPPED_AZALEA_STAIR);
        STAIR_CHIPPING.put(BLOOMING_AZALEA_STAIRS, CHIPPED_BLOOMING_AZALEA_STAIR);
        //Plank Repairing
        PLANK_REPAIR.put(CHIPPED_WARPED_PLANKS, WARPED_PLANKS);
        PLANK_REPAIR.put(CHIPPED_CRIMSON_PLANKS, CRIMSON_PLANKS);
        //Slab Repairing
        SLAB_REPAIR.put(CHIPPED_WARPED_SLAB, WARPED_SLAB);
        SLAB_REPAIR.put(CHIPPED_CRIMSON_SLAB, CRIMSON_SLAB);
        //Stair Repairing
        STAIR_REPAIR.put(CHIPPED_WARPED_STAIR, WARPED_STAIRS);
        STAIR_REPAIR.put(CHIPPED_CRIMSON_STAIR, CRIMSON_STAIRS);
        //Deflower
        DEFLOWER.put(FLOWERING_AZALEA, AZALEA);
        DEFLOWER.put(POTTED_FLOWERING_AZALEA_BUSH, POTTED_AZALEA_BUSH);
        DEFLOWER.put(FLOWERING_AZALEA_LEAVES, AZALEA_LEAVES);
        DEFLOWER.put(BLOOMING_AZALEA_PLANKS, AZALEA_PLANKS);
        DEFLOWER.put(BLOOMING_AZALEA_SLAB, AZALEA_SLAB);
        DEFLOWER.put(BLOOMING_AZALEA_STAIRS, AZALEA_STAIRS);
        DEFLOWER.put(CHIPPED_BLOOMING_AZALEA_PLANKS, CHIPPED_AZALEA_PLANKS);
        DEFLOWER.put(CHIPPED_BLOOMING_AZALEA_SLAB, CHIPPED_AZALEA_SLAB);
        DEFLOWER.put(CHIPPED_BLOOMING_AZALEA_STAIR, CHIPPED_AZALEA_STAIR);
        DEFLOWER.put(VERTICAL_BLOOMING_AZALEA_PLANKS, VERTICAL_AZALEA_PLANKS);
        DEFLOWER.put(VERTICAL_BLOOMING_AZALEA_SLAB,VERTICAL_AZALEA_SLAB);
        DEFLOWER.put(VERTICAL_BLOOMING_AZALEA_STAIR, VERTICAL_AZALEA_STAIR);
        DEFLOWER.put(BLOOMING_AZALEA_MOSAIC, AZALEA_MOSAIC);
        DEFLOWER.put(BLOOMING_AZALEA_MOSAIC_SLABS, AZALEA_MOSAIC_SLABS);
        DEFLOWER.put(BLOOMING_AZALEA_MOSAIC_STAIRS, AZALEA_MOSAIC_STAIRS);
        DEFLOWER.put(BLOOMING_AZALEA_LOG, AZALEA_LOG);
        DEFLOWER.put(BLOOMING_AZALEA_WOOD, AZALEA_WOOD);
        DEFLOWER.put(BLOOMING_STRIPPED_AZALEA, STRIPPED_AZALEA);
        DEFLOWER.put(BLOOMING_STRIPPED_AZALEA_WOOD, STRIPPED_AZALEA_WOOD);
        DEFLOWER.put(ENGRAVED_BLOOMING_AZALEA, ENGRAVED_AZALEA);
        DEFLOWER.put(ENGRAVED_BLOOMING_AZALEA_WOOD, ENGRAVED_AZALEA_WOOD);

        //Flowering
        FLOWERING.put(AZALEA, FLOWERING_AZALEA);
        FLOWERING.put(POTTED_AZALEA_BUSH, POTTED_FLOWERING_AZALEA_BUSH);
        FLOWERING.put(AZALEA_LEAVES, FLOWERING_AZALEA_LEAVES);
        FLOWERING.put(AZALEA_PLANKS, BLOOMING_AZALEA_PLANKS);
        FLOWERING.put(AZALEA_SLAB, BLOOMING_AZALEA_SLAB);
        FLOWERING.put(AZALEA_STAIRS, BLOOMING_AZALEA_STAIRS);
        FLOWERING.put(CHIPPED_AZALEA_PLANKS, CHIPPED_BLOOMING_AZALEA_PLANKS);
        FLOWERING.put(CHIPPED_AZALEA_SLAB, CHIPPED_BLOOMING_AZALEA_SLAB);
        FLOWERING.put(CHIPPED_AZALEA_STAIR, CHIPPED_BLOOMING_AZALEA_STAIR);
        FLOWERING.put(VERTICAL_AZALEA_PLANKS, VERTICAL_BLOOMING_AZALEA_PLANKS);
        FLOWERING.put(VERTICAL_AZALEA_SLAB, VERTICAL_BLOOMING_AZALEA_SLAB);
        FLOWERING.put(VERTICAL_AZALEA_STAIR, VERTICAL_BLOOMING_AZALEA_STAIR);
        FLOWERING.put(AZALEA_MOSAIC, BLOOMING_AZALEA_MOSAIC);
        FLOWERING.put(AZALEA_MOSAIC_SLABS, BLOOMING_AZALEA_MOSAIC_SLABS);
        FLOWERING.put(AZALEA_MOSAIC_STAIRS, BLOOMING_AZALEA_MOSAIC_STAIRS);
        FLOWERING.put(AZALEA_LOG, BLOOMING_AZALEA_LOG);
        FLOWERING.put(AZALEA_WOOD, BLOOMING_AZALEA_WOOD);
        FLOWERING.put(STRIPPED_AZALEA, BLOOMING_STRIPPED_AZALEA);
        FLOWERING.put(STRIPPED_AZALEA_WOOD, BLOOMING_STRIPPED_AZALEA_WOOD);
        FLOWERING.put(ENGRAVED_AZALEA, ENGRAVED_BLOOMING_AZALEA);
        FLOWERING.put(ENGRAVED_AZALEA_WOOD, ENGRAVED_BLOOMING_AZALEA_WOOD);
    }

    public static void registerEvents(){
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {

            BlockPos targetPos = hitResult.getBlockPos();
            BlockState targetBlock = world.getBlockState(targetPos);
            BlockPos Pos = hitResult.getBlockPos();
            BlockPos fixedPos = targetPos.offset(hitResult.getSide());
            BlockState State = world.getBlockState(Pos);
            ItemStack heldItem = player.getStackInHand(hand);

            //Log Chipping
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(CelluloseTags.Blocks.CHIPPABLE_LOGS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_WOOD_HIT, SoundCategory.BLOCKS, 1.0f, 1.0f);
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(Pos, LOG_CHIPPING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Plank Chipping
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(BlockTags.PLANKS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_SCAFFOLDING_BREAK, SoundCategory.BLOCKS, 1.0f, 1.0f);
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(Pos, PLANK_CHIPPING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Slab Chipping
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(BlockTags.WOODEN_SLABS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_SCAFFOLDING_BREAK, SoundCategory.BLOCKS, 1.0f, 1.0f);
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(Pos, SLAB_CHIPPING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            //Stair Chipping
            if (heldItem.getItem() instanceof PickaxeItem && State.isIn(BlockTags.WOODEN_STAIRS)) {
                world.playSound(player, Pos, SoundEvents.BLOCK_SCAFFOLDING_BREAK, SoundCategory.BLOCKS, 1.0f, 1.0f);
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

            //Deflower
            if (heldItem.getItem()==Items.SHEARS && targetBlock.isIn(CelluloseTags.Blocks.DEFLOWER)) {
                Block.dropStack(world, fixedPos, new ItemStack(AZALEA_FLOWERS));
                world.playSound(player, targetPos, SoundEvents.ENTITY_SHEEP_SHEAR, SoundCategory.BLOCKS, 1.0f, 1.0f);
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, targetPos, heldItem);
                    if (!player.isCreative()) heldItem.damage(1, player, null);
                    world.setBlockState(targetPos,  DEFLOWER.get(targetBlock.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }

            //Flowering
            if (heldItem.isIn(CelluloseTags.Items.AZALEA_FLOWER) && targetBlock.isIn(CelluloseTags.Blocks.FLOWERABLE)){
                world.playSound(player, Pos, SoundEvents.ITEM_CROP_PLANT, SoundCategory.BLOCKS, 1.0f, 1.0f);
                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) heldItem.decrement(1);
                    world.setBlockState(Pos,  FLOWERING.get(targetBlock.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }
            return ActionResult.PASS;
        });

        Cellulose.LOGGER.info("Registering Mod Events");
    }
}
