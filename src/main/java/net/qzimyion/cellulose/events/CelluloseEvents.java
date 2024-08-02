package net.qzimyion.cellulose.events;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.item.*;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.util.CelluloseTags;

import java.util.HashMap;
import java.util.Random;

import static net.minecraft.block.Blocks.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.boats.CelluloseBoats.*;


public class CelluloseEvents {
    public static final HashMap<Block, Block> ENGRAVING = new HashMap<>();
    public static final HashMap<Block, Block> LOG_CHIPPING = new HashMap<>();
    public static final HashMap<Block, Block> PLANK_CHIPPING = new HashMap<>();
    public static final HashMap<Block, Block> SLAB_CHIPPING = new HashMap<>();
    public static final HashMap<Block, Block> STAIR_CHIPPING = new HashMap<>();
    public static final HashMap<Block, Block> PLANK_REPAIR = new HashMap<>();
    public static final HashMap<Block, Block> SLAB_REPAIR = new HashMap<>();
    public static final HashMap<Block, Block> STAIR_REPAIR = new HashMap<>();
    public static final HashMap<Block, Block> FLOWERING = new HashMap<>();
    public static final HashMap<Identifier, Identifier> FLOWERING_ENTITY = new HashMap<>();
    public static final HashMap<Block, Block> DEFLOWER = new HashMap<>();
    public static final HashMap<Identifier, Identifier> DEFLOWER_ENTITY = new HashMap<>();
    public static final HashMap<Block, Block> BOOKSHELF_ABANDONING = new HashMap<>();
    public static final HashMap<Block, Item> BOOK_DROP = new HashMap<>();

    static {

        //Engraving
        ENGRAVING.put(STRIPPED_OAK_LOG, ENGRAVED_OAK);
        ENGRAVING.put(STRIPPED_BIRCH_LOG, ENGRAVED_BIRCH);
        ENGRAVING.put(STRIPPED_SPRUCE_LOG, ENGRAVED_SPRUCE);
        ENGRAVING.put(STRIPPED_DARK_OAK_LOG, ENGRAVED_DARK_OAK);
        ENGRAVING.put(STRIPPED_JUNGLE_LOG, ENGRAVED_JUNGLE);
        ENGRAVING.put(STRIPPED_ACACIA_LOG, ENGRAVED_ACACIA);
        ENGRAVING.put(STRIPPED_CRIMSON_STEM, ENGRAVED_CRIMSON);
        ENGRAVING.put(STRIPPED_WARPED_STEM, ENGRAVED_WARPED);
        ENGRAVING.put(STRIPPED_MANGROVE_LOG, ENGRAVED_MANGROVE);
        ENGRAVING.put(STRIPPED_BAMBOO_BLOCK, ENGRAVED_BAMBOO);
        ENGRAVING.put(STRIPPED_CHERRY_LOG, ENGRAVED_CHERRY);
        ENGRAVING.put(STRIPPED_OAK_WOOD, ENGRAVED_OAK_WOOD);
        ENGRAVING.put(STRIPPED_BIRCH_WOOD, ENGRAVED_BIRCH_WOOD);
        ENGRAVING.put(STRIPPED_SPRUCE_WOOD, ENGRAVED_SPRUCE_WOOD);
        ENGRAVING.put(STRIPPED_DARK_OAK_WOOD, ENGRAVED_DARK_OAK_WOOD);
        ENGRAVING.put(STRIPPED_JUNGLE_WOOD, ENGRAVED_JUNGLE_WOOD);
        ENGRAVING.put(STRIPPED_ACACIA_WOOD, ENGRAVED_ACACIA_WOOD);
        ENGRAVING.put(STRIPPED_CRIMSON_HYPHAE, ENGRAVED_CRIMSON_HYPHAE);
        ENGRAVING.put(STRIPPED_WARPED_HYPHAE, ENGRAVED_WARPED_HYPHAE);
        ENGRAVING.put(STRIPPED_MANGROVE_WOOD, ENGRAVED_MANGROVE_WOOD);
        ENGRAVING.put(STRIPPED_CHERRY_WOOD, ENGRAVED_CHERRY_WOOD);

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
        LOG_CHIPPING.put(STRIPPED_OAK_LOG, STRIPPED_CHIPPED_OAK);
        LOG_CHIPPING.put(STRIPPED_BIRCH_LOG, STRIPPED_CHIPPED_BIRCH);
        LOG_CHIPPING.put(STRIPPED_SPRUCE_LOG, STRIPPED_CHIPPED_SPRUCE);
        LOG_CHIPPING.put(STRIPPED_DARK_OAK_LOG, STRIPPED_CHIPPED_DARK_OAK);
        LOG_CHIPPING.put(STRIPPED_JUNGLE_LOG, STRIPPED_CHIPPED_JUNGLE);
        LOG_CHIPPING.put(STRIPPED_ACACIA_LOG, STRIPPED_CHIPPED_ACACIA);
        LOG_CHIPPING.put(STRIPPED_CRIMSON_STEM, STRIPPED_CHIPPED_CRIMSON);
        LOG_CHIPPING.put(STRIPPED_WARPED_STEM, STRIPPED_CHIPPED_WARPED);
        LOG_CHIPPING.put(STRIPPED_MANGROVE_LOG, STRIPPED_CHIPPED_MANGROVE);
        LOG_CHIPPING.put(STRIPPED_CHERRY_LOG, STRIPPED_CHIPPED_CHERRY);
        LOG_CHIPPING.put(STRIPPED_CACTUS_BUNDLE, STRIPPED_CHIPPED_CACTUS);
        LOG_CHIPPING.put(STRIPPED_OAK_WOOD, STRIPPED_CHIPPED_OAK_WOOD);
        LOG_CHIPPING.put(STRIPPED_BIRCH_WOOD, STRIPPED_CHIPPED_BIRCH_WOOD);
        LOG_CHIPPING.put(STRIPPED_SPRUCE_WOOD, STRIPPED_CHIPPED_SPRUCE_WOOD);
        LOG_CHIPPING.put(STRIPPED_DARK_OAK_WOOD, STRIPPED_CHIPPED_DARK_OAK_WOOD);
        LOG_CHIPPING.put(STRIPPED_JUNGLE_WOOD, STRIPPED_CHIPPED_JUNGLE_WOOD);
        LOG_CHIPPING.put(STRIPPED_ACACIA_WOOD, STRIPPED_CHIPPED_ACACIA_WOOD);
        LOG_CHIPPING.put(STRIPPED_CRIMSON_HYPHAE, STRIPPED_CHIPPED_CRIMSON_HYPHAE);
        LOG_CHIPPING.put(STRIPPED_WARPED_HYPHAE, STRIPPED_CHIPPED_WARPED_HYPHAE);
        LOG_CHIPPING.put(STRIPPED_MANGROVE_WOOD, STRIPPED_CHIPPED_MANGROVE_WOOD);
        LOG_CHIPPING.put(STRIPPED_CHERRY_WOOD, STRIPPED_CHIPPED_CHERRY_WOOD);
        //LOG_CHIPPING.put(STRIPPED_CACTUS_CROWN, STRIPPED_CHIPPED_CACTUS_CROWN);
        LOG_CHIPPING.put(STRIPPED_AZALEA_LOG, STRIPPED_CHIPPED_AZALEA);
        LOG_CHIPPING.put(STRIPPED_AZALEA_WOOD, STRIPPED_CHIPPED_AZALEA_WOOD);

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
        PLANK_CHIPPING.put(VERTICAL_OAK_PLANKS, CHIPPED_VERTICAL_OAK_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_BIRCH_PLANKS, CHIPPED_VERTICAL_BIRCH_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_SPRUCE_PLANKS, CHIPPED_VERTICAL_SPRUCE_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_DARK_OAK_PLANKS, CHIPPED_VERTICAL_DARK_OAK_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_JUNGLE_PLANKS, CHIPPED_VERTICAL_JUNGLE_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_ACACIA_PLANKS, CHIPPED_VERTICAL_ACACIA_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_WARPED_PLANKS, CHIPPED_VERTICAL_WARPED_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_CRIMSON_PLANKS, CHIPPED_VERTICAL_CRIMSON_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_MANGROVE_PLANKS, CHIPPED_VERTICAL_MANGROVE_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_BAMBOO_PLANKS, CHIPPED_VERTICAL_BAMBOO_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_CHERRY_PLANKS, CHIPPED_VERTICAL_CHERRY_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_CACTUS_PLANKS, CHIPPED_VERTICAL_CACTUS_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_AZALEA_PLANKS, CHIPPED_VERTICAL_AZALEA_PLANKS);
        PLANK_CHIPPING.put(VERTICAL_BLOOMING_AZALEA_PLANKS, CHIPPED_VERTICAL_BLOOMING_AZALEA_PLANKS);

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
        SLAB_CHIPPING.put(VERTICAL_OAK_SLAB, CHIPPED_VERTICAL_OAK_SLAB);
        SLAB_CHIPPING.put(VERTICAL_BIRCH_SLAB, CHIPPED_VERTICAL_BIRCH_SLAB);
        SLAB_CHIPPING.put(VERTICAL_SPRUCE_SLAB, CHIPPED_VERTICAL_SPRUCE_SLAB);
        SLAB_CHIPPING.put(VERTICAL_DARK_OAK_SLAB, CHIPPED_VERTICAL_DARK_OAK_SLAB);
        SLAB_CHIPPING.put(VERTICAL_JUNGLE_SLAB, CHIPPED_VERTICAL_JUNGLE_SLAB);
        SLAB_CHIPPING.put(VERTICAL_ACACIA_SLAB, CHIPPED_VERTICAL_ACACIA_SLAB);
        SLAB_CHIPPING.put(VERTICAL_WARPED_SLAB, CHIPPED_VERTICAL_WARPED_SLAB);
        SLAB_CHIPPING.put(VERTICAL_CRIMSON_SLAB, CHIPPED_VERTICAL_CRIMSON_SLAB);
        SLAB_CHIPPING.put(VERTICAL_MANGROVE_SLAB, CHIPPED_VERTICAL_MANGROVE_SLAB);
        SLAB_CHIPPING.put(VERTICAL_BAMBOO_SLAB, CHIPPED_VERTICAL_BAMBOO_SLAB);
        SLAB_CHIPPING.put(VERTICAL_CHERRY_SLAB, CHIPPED_VERTICAL_CHERRY_SLAB);
        SLAB_CHIPPING.put(VERTICAL_CACTUS_SLAB, CHIPPED_VERTICAL_CACTUS_SLAB);
        SLAB_CHIPPING.put(VERTICAL_AZALEA_SLAB, CHIPPED_VERTICAL_AZALEA_SLAB);
        SLAB_CHIPPING.put(VERTICAL_BLOOMING_AZALEA_SLAB, CHIPPED_VERTICAL_BLOOMING_AZALEA_SLAB);

        //Stair Chipping
        STAIR_CHIPPING.put(OAK_STAIRS, CHIPPED_OAK_STAIRS);
        STAIR_CHIPPING.put(BIRCH_STAIRS, CHIPPED_BIRCH_STAIRS);
        STAIR_CHIPPING.put(SPRUCE_STAIRS, CHIPPED_SPRUCE_STAIRS);
        STAIR_CHIPPING.put(DARK_OAK_STAIRS, CHIPPED_DARK_OAK_STAIRS);
        STAIR_CHIPPING.put(JUNGLE_STAIRS, CHIPPED_JUNGLE_STAIRS);
        STAIR_CHIPPING.put(ACACIA_STAIRS, CHIPPED_ACACIA_STAIRS);
        STAIR_CHIPPING.put(WARPED_STAIRS, CHIPPED_WARPED_STAIRS);
        STAIR_CHIPPING.put(CRIMSON_STAIRS, CHIPPED_CRIMSON_STAIRS);
        STAIR_CHIPPING.put(MANGROVE_STAIRS, CHIPPED_MANGROVE_STAIRS);
        STAIR_CHIPPING.put(BAMBOO_STAIRS, CHIPPED_BAMBOO_STAIRS);
        STAIR_CHIPPING.put(CHERRY_STAIRS, CHIPPED_CHERRY_STAIRS);
        STAIR_CHIPPING.put(CACTUS_STAIRS, CHIPPED_CACTUS_STAIRS);
        STAIR_CHIPPING.put(AZALEA_STAIRS, CHIPPED_AZALEA_STAIRS);
        STAIR_CHIPPING.put(BLOOMING_AZALEA_STAIRS, CHIPPED_BLOOMING_AZALEA_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_OAK_STAIR, CHIPPED_VERTICAL_OAK_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_BIRCH_STAIR, CHIPPED_VERTICAL_BIRCH_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_SPRUCE_STAIR, CHIPPED_VERTICAL_SPRUCE_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_DARK_OAK_STAIR, CHIPPED_VERTICAL_DARK_OAK_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_JUNGLE_STAIR, CHIPPED_VERTICAL_JUNGLE_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_ACACIA_STAIR, CHIPPED_VERTICAL_ACACIA_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_WARPED_STAIR, CHIPPED_VERTICAL_WARPED_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_CRIMSON_STAIR, CHIPPED_VERTICAL_CRIMSON_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_MANGROVE_STAIR, CHIPPED_VERTICAL_MANGROVE_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_BAMBOO_STAIR, CHIPPED_VERTICAL_BAMBOO_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_CHERRY_STAIR, CHIPPED_VERTICAL_CHERRY_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_CACTUS_STAIR, CHIPPED_VERTICAL_CACTUS_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_AZALEA_STAIR, CHIPPED_VERTICAL_AZALEA_STAIRS);
        STAIR_CHIPPING.put(VERTICAL_BLOOMING_AZALEA_STAIR, CHIPPED_VERTICAL_BLOOMING_AZALEA_STAIRS);

        //Plank Repairing
        PLANK_REPAIR.put(CHIPPED_OAK_PLANKS, OAK_PLANKS);
        PLANK_REPAIR.put(CHIPPED_BIRCH_PLANKS, BIRCH_PLANKS);
        PLANK_REPAIR.put(CHIPPED_SPRUCE_PLANKS, SPRUCE_PLANKS);
        PLANK_REPAIR.put(CHIPPED_DARK_OAK_PLANKS, DARK_OAK_PLANKS);
        PLANK_REPAIR.put(CHIPPED_JUNGLE_PLANKS, JUNGLE_PLANKS);
        PLANK_REPAIR.put(CHIPPED_ACACIA_PLANKS, ACACIA_PLANKS);
        PLANK_REPAIR.put(CHIPPED_WARPED_PLANKS, WARPED_PLANKS);
        PLANK_REPAIR.put(CHIPPED_CRIMSON_PLANKS, CRIMSON_PLANKS);
        PLANK_REPAIR.put(CHIPPED_MANGROVE_PLANKS, MANGROVE_PLANKS);
        PLANK_REPAIR.put(CHIPPED_BAMBOO_PLANKS, BAMBOO_PLANKS);
        PLANK_REPAIR.put(CHIPPED_CHERRY_PLANKS, CHERRY_PLANKS);
        PLANK_REPAIR.put(CHIPPED_CACTUS_PLANKS, CACTUS_PLANKS);
        PLANK_REPAIR.put(CHIPPED_AZALEA_PLANKS, AZALEA_PLANKS);
        PLANK_REPAIR.put(CHIPPED_BLOOMING_AZALEA_PLANKS, BLOOMING_AZALEA_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_OAK_PLANKS, VERTICAL_OAK_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_BIRCH_PLANKS, VERTICAL_BIRCH_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_SPRUCE_PLANKS, VERTICAL_SPRUCE_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_DARK_OAK_PLANKS, VERTICAL_DARK_OAK_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_JUNGLE_PLANKS, VERTICAL_JUNGLE_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_ACACIA_PLANKS, VERTICAL_ACACIA_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_WARPED_PLANKS, VERTICAL_WARPED_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_CRIMSON_PLANKS, VERTICAL_CRIMSON_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_MANGROVE_PLANKS, VERTICAL_MANGROVE_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_BAMBOO_PLANKS, VERTICAL_BAMBOO_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_CHERRY_PLANKS, VERTICAL_CHERRY_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_CACTUS_PLANKS, VERTICAL_CACTUS_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_AZALEA_PLANKS, VERTICAL_AZALEA_PLANKS);
        PLANK_REPAIR.put(CHIPPED_VERTICAL_BLOOMING_AZALEA_PLANKS, VERTICAL_BLOOMING_AZALEA_PLANKS);

        //Slab Repairing
        SLAB_REPAIR.put(CHIPPED_OAK_SLAB, OAK_SLAB);
        SLAB_REPAIR.put(CHIPPED_BIRCH_SLAB, BIRCH_SLAB);
        SLAB_REPAIR.put(CHIPPED_SPRUCE_SLAB, SPRUCE_SLAB);
        SLAB_REPAIR.put(CHIPPED_DARK_OAK_SLAB, DARK_OAK_SLAB);
        SLAB_REPAIR.put(CHIPPED_JUNGLE_SLAB, JUNGLE_SLAB);
        SLAB_REPAIR.put(CHIPPED_ACACIA_SLAB, ACACIA_SLAB);
        SLAB_REPAIR.put(CHIPPED_WARPED_SLAB, WARPED_SLAB);
        SLAB_REPAIR.put(CHIPPED_CRIMSON_SLAB, CRIMSON_SLAB);
        SLAB_REPAIR.put(CHIPPED_MANGROVE_SLAB, MANGROVE_SLAB);
        SLAB_REPAIR.put(CHIPPED_BAMBOO_SLAB, BAMBOO_SLAB);
        SLAB_REPAIR.put(CHIPPED_CHERRY_SLAB, CHERRY_SLAB);
        SLAB_REPAIR.put(CHIPPED_CACTUS_SLAB, CACTUS_SLAB);
        SLAB_REPAIR.put(CHIPPED_AZALEA_SLAB, AZALEA_SLAB);
        SLAB_REPAIR.put(CHIPPED_BLOOMING_AZALEA_SLAB, BLOOMING_AZALEA_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_OAK_SLAB, VERTICAL_OAK_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_BIRCH_SLAB, VERTICAL_BIRCH_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_SPRUCE_SLAB, VERTICAL_SPRUCE_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_DARK_OAK_SLAB, VERTICAL_DARK_OAK_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_JUNGLE_SLAB, VERTICAL_JUNGLE_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_ACACIA_SLAB, VERTICAL_ACACIA_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_WARPED_SLAB, VERTICAL_WARPED_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_CRIMSON_SLAB, VERTICAL_CRIMSON_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_MANGROVE_SLAB, VERTICAL_MANGROVE_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_BAMBOO_SLAB, VERTICAL_BAMBOO_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_CHERRY_SLAB, VERTICAL_CHERRY_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_CACTUS_SLAB, VERTICAL_CACTUS_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_AZALEA_SLAB, VERTICAL_AZALEA_SLAB);
        SLAB_REPAIR.put(CHIPPED_VERTICAL_BLOOMING_AZALEA_SLAB, VERTICAL_BLOOMING_AZALEA_SLAB);

        //Stair Repairing
        STAIR_REPAIR.put(CHIPPED_OAK_STAIRS, OAK_STAIRS);
        STAIR_REPAIR.put(CHIPPED_BIRCH_STAIRS, BIRCH_STAIRS);
        STAIR_REPAIR.put(CHIPPED_SPRUCE_STAIRS, SPRUCE_STAIRS);
        STAIR_REPAIR.put(CHIPPED_DARK_OAK_STAIRS, DARK_OAK_STAIRS);
        STAIR_REPAIR.put(CHIPPED_JUNGLE_STAIRS, JUNGLE_STAIRS);
        STAIR_REPAIR.put(CHIPPED_ACACIA_STAIRS, ACACIA_STAIRS);
        STAIR_REPAIR.put(CHIPPED_WARPED_STAIRS, WARPED_STAIRS);
        STAIR_REPAIR.put(CHIPPED_CRIMSON_STAIRS, CRIMSON_STAIRS);
        STAIR_REPAIR.put(CHIPPED_MANGROVE_STAIRS, MANGROVE_STAIRS);
        STAIR_REPAIR.put(CHIPPED_BAMBOO_STAIRS, BAMBOO_STAIRS);
        STAIR_REPAIR.put(CHIPPED_CHERRY_STAIRS, CHERRY_STAIRS);
        STAIR_REPAIR.put(CHIPPED_CACTUS_STAIRS, CACTUS_STAIRS);
        STAIR_REPAIR.put(CHIPPED_AZALEA_STAIRS, AZALEA_STAIRS);
        STAIR_REPAIR.put(CHIPPED_BLOOMING_AZALEA_STAIRS, BLOOMING_AZALEA_STAIRS);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_OAK_STAIRS, VERTICAL_OAK_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_BIRCH_STAIRS, VERTICAL_BIRCH_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_SPRUCE_STAIRS, VERTICAL_SPRUCE_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_DARK_OAK_STAIRS, VERTICAL_DARK_OAK_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_JUNGLE_STAIRS, VERTICAL_JUNGLE_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_ACACIA_STAIRS, VERTICAL_ACACIA_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_WARPED_STAIRS, VERTICAL_WARPED_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_CRIMSON_STAIRS, VERTICAL_CRIMSON_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_MANGROVE_STAIRS, VERTICAL_MANGROVE_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_BAMBOO_STAIRS, VERTICAL_BAMBOO_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_CHERRY_STAIRS, VERTICAL_CHERRY_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_CACTUS_STAIRS, VERTICAL_CACTUS_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_AZALEA_STAIRS, VERTICAL_AZALEA_STAIR);
        STAIR_REPAIR.put(CHIPPED_VERTICAL_BLOOMING_AZALEA_STAIRS, VERTICAL_BLOOMING_AZALEA_STAIR);

        //Deflower
        DEFLOWER.put(FLOWERING_AZALEA, AZALEA);
        DEFLOWER.put(POTTED_FLOWERING_AZALEA_BUSH, POTTED_AZALEA_BUSH);
        DEFLOWER.put(FLOWERING_AZALEA_LEAVES, AZALEA_LEAVES);
        DEFLOWER.put(BLOOMING_AZALEA_PLANKS, AZALEA_PLANKS);
        DEFLOWER.put(BLOOMING_AZALEA_SLAB, AZALEA_SLAB);
        DEFLOWER.put(BLOOMING_AZALEA_STAIRS, AZALEA_STAIRS);
        DEFLOWER.put(CHIPPED_BLOOMING_AZALEA_PLANKS, CHIPPED_AZALEA_PLANKS);
        DEFLOWER.put(CHIPPED_BLOOMING_AZALEA_SLAB, CHIPPED_AZALEA_SLAB);
        DEFLOWER.put(CHIPPED_BLOOMING_AZALEA_STAIRS, CHIPPED_AZALEA_STAIRS);
        DEFLOWER.put(VERTICAL_BLOOMING_AZALEA_PLANKS, VERTICAL_AZALEA_PLANKS);
        DEFLOWER.put(VERTICAL_BLOOMING_AZALEA_SLAB,VERTICAL_AZALEA_SLAB);
        DEFLOWER.put(VERTICAL_BLOOMING_AZALEA_STAIR, VERTICAL_AZALEA_STAIR);
        DEFLOWER.put(BLOOMING_AZALEA_MOSAIC, AZALEA_MOSAIC);
        DEFLOWER.put(BLOOMING_AZALEA_MOSAIC_SLABS, AZALEA_MOSAIC_SLABS);
        DEFLOWER.put(BLOOMING_AZALEA_MOSAIC_STAIRS, AZALEA_MOSAIC_STAIRS);
        DEFLOWER.put(BLOOMING_AZALEA_LOG, AZALEA_LOG);
        DEFLOWER.put(BLOOMING_AZALEA_WOOD, AZALEA_WOOD);
        DEFLOWER.put(BLOOMING_STRIPPED_AZALEA_LOG, STRIPPED_AZALEA_LOG);
        DEFLOWER.put(BLOOMING_STRIPPED_AZALEA_WOOD, STRIPPED_AZALEA_WOOD);
        DEFLOWER.put(ENGRAVED_BLOOMING_AZALEA, ENGRAVED_AZALEA);
        DEFLOWER.put(ENGRAVED_BLOOMING_AZALEA_WOOD, ENGRAVED_AZALEA_WOOD);
        DEFLOWER_ENTITY.put(BLOOMING_AZALEA_BOAT_ID, AZALEA_BOAT_ID);
        DEFLOWER_ENTITY.put(BLOOMING_AZALEA_CHEST_BOAT_ID, AZALEA_CHEST_BOAT_ID);

        //Flowering
        FLOWERING.put(AZALEA, FLOWERING_AZALEA);
        FLOWERING.put(POTTED_AZALEA_BUSH, POTTED_FLOWERING_AZALEA_BUSH);
        FLOWERING.put(AZALEA_LEAVES, FLOWERING_AZALEA_LEAVES);
        FLOWERING.put(AZALEA_PLANKS, BLOOMING_AZALEA_PLANKS);
        FLOWERING.put(AZALEA_SLAB, BLOOMING_AZALEA_SLAB);
        FLOWERING.put(AZALEA_STAIRS, BLOOMING_AZALEA_STAIRS);
        FLOWERING.put(CHIPPED_AZALEA_PLANKS, CHIPPED_BLOOMING_AZALEA_PLANKS);
        FLOWERING.put(CHIPPED_AZALEA_SLAB, CHIPPED_BLOOMING_AZALEA_SLAB);
        FLOWERING.put(CHIPPED_AZALEA_STAIRS, CHIPPED_BLOOMING_AZALEA_STAIRS);
        FLOWERING.put(VERTICAL_AZALEA_PLANKS, VERTICAL_BLOOMING_AZALEA_PLANKS);
        FLOWERING.put(VERTICAL_AZALEA_SLAB, VERTICAL_BLOOMING_AZALEA_SLAB);
        FLOWERING.put(VERTICAL_AZALEA_STAIR, VERTICAL_BLOOMING_AZALEA_STAIR);
        FLOWERING.put(AZALEA_MOSAIC, BLOOMING_AZALEA_MOSAIC);
        FLOWERING.put(AZALEA_MOSAIC_SLABS, BLOOMING_AZALEA_MOSAIC_SLABS);
        FLOWERING.put(AZALEA_MOSAIC_STAIRS, BLOOMING_AZALEA_MOSAIC_STAIRS);
        FLOWERING.put(AZALEA_LOG, BLOOMING_AZALEA_LOG);
        FLOWERING.put(AZALEA_WOOD, BLOOMING_AZALEA_WOOD);
        FLOWERING.put(STRIPPED_AZALEA_LOG, BLOOMING_STRIPPED_AZALEA_LOG);
        FLOWERING.put(STRIPPED_AZALEA_WOOD, BLOOMING_STRIPPED_AZALEA_WOOD);
        FLOWERING.put(ENGRAVED_AZALEA, ENGRAVED_BLOOMING_AZALEA);
        FLOWERING.put(ENGRAVED_AZALEA_WOOD, ENGRAVED_BLOOMING_AZALEA_WOOD);
        FLOWERING_ENTITY.put(AZALEA_BOAT_ID, BLOOMING_AZALEA_BOAT_ID);
        FLOWERING_ENTITY.put(AZALEA_CHEST_BOAT_ID, BLOOMING_AZALEA_CHEST_BOAT_ID);

        //Book drop
        BOOK_DROP.put(BOOKSHELF, Items.BOOK);
        BOOK_DROP.put(BIRCH_BOOKSHELF, Items.BOOK);

        //Bookshelf Abandoning
        BOOKSHELF_ABANDONING.put(BOOKSHELF, ABANDONED_OAK_BOOKSHELF);
        BOOKSHELF_ABANDONING.put(BIRCH_BOOKSHELF, ABANDONED_BIRCH_BOOKSHELF);


    }

    public static void registerEvents(){

        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {

            BlockPos targetPos = hitResult.getBlockPos();
            BlockState targetBlock = world.getBlockState(targetPos);
            BlockPos Pos = hitResult.getBlockPos();
            BlockPos fixedPos = targetPos.offset(hitResult.getSide());
            BlockState State = world.getBlockState(Pos);
            ItemStack heldItem = player.getStackInHand(hand);

            //Engraving
            if (heldItem.getItem()==Items.FLINT && State.isIn(CelluloseTags.Blocks.ENGRAVABLE_LOGS)) {
                world.playSound(player, Pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);

                if (player instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, Pos, heldItem);
                    if (!player.isCreative()) {
                        Random random = new Random();
                        if (random.nextFloat() <= 0.25f) {
                            heldItem.decrement(1);//Flint has 25% chance of consumption. This took a long time to figure out for some reason lmfao.
                        }
                    }
                    world.setBlockState(Pos, ENGRAVING.get(State.getBlock()).getStateWithProperties(State));
                }
                return ActionResult.SUCCESS;
            }

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
            //Bookshelf abandoning
            if (heldItem.getItem() instanceof PickaxeItem) {
                if (targetBlock.isIn(CelluloseTags.Blocks.BOOKSHELVES)) {
                    Block.dropStack(world, fixedPos, new ItemStack(BOOK_DROP.get(targetBlock.getBlock())));
                    world.playSound(player, targetPos, SoundEvents.BLOCK_WOOD_HIT, SoundCategory.BLOCKS, 1.0f, 1.0f);
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, targetPos, heldItem);
                        if (!player.isCreative()) heldItem.damage(1, player, null);
                        world.setBlockState(targetPos, BOOKSHELF_ABANDONING.get(targetBlock.getBlock()).getStateWithProperties(targetBlock));
                    }
                    return ActionResult.SUCCESS;
                }
            }
            //Cactus stripping
            if (heldItem.getItem() instanceof AxeItem){
                if (targetBlock.isOf(CACTUS)){
                    world.playSound(player, targetPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, targetPos, heldItem);
                        if (!player.isCreative()) heldItem.damage(1, player, null);
                        world.setBlockState(targetPos, STRIPPED_CACTUS.getDefaultState());
                    }
                    return ActionResult.SUCCESS;
                }
            }
            return ActionResult.PASS;
        });

        UseEntityCallback.EVENT.register(((player, world, hand, entity, hitResult) -> {
            ItemStack heldItem = player.getStackInHand(hand);

            

            return ActionResult.PASS;
        }));

        Cellulose.LOGGER.info("Registering Mod Events");
    }
}
