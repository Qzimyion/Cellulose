package net.qzimyion.cellulose.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChiseledBookShelfBlockEntity;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.blocks.BlockEntity.CustomBookshelves.*;
import net.qzimyion.cellulose.blocks.BlockEntity.PotionRackBlockEntity;

@SuppressWarnings("unused")
public class CelluloseEntities {

    //Potion racks
    public static final BlockEntityType<PotionRackBlockEntity> POTION_RACK_BLOCK_ENTITY = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "potion_rack"),
            FabricBlockEntityTypeBuilder.create(PotionRackBlockEntity::new, CelluloseBlocks.POTION_RACK).build()
    );

    //Chiseled bookshelf variants
    public static final BlockEntityType<ChiseledBookShelfBlockEntity> BIRCH_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "birch_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(ChiseledBookShelfBlockEntity::new, CelluloseBlocks.BIRCH_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<ChiseledBookShelfBlockEntity> SPRUCE_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "spruce_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(ChiseledBookShelfBlockEntity::new, CelluloseBlocks.SPRUCE_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<FourSlotBookshelfBlockEntity> DARK_OAK_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "dark_oak_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(FourSlotBookshelfBlockEntity::new, CelluloseBlocks.DARK_OAK_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<FiveSlotBlockEntity> JUNGLE_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "jungle_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(FiveSlotBlockEntity::new, CelluloseBlocks.JUNGLE_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<ChiseledBookShelfBlockEntity> ACACIA_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "acacia_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(ChiseledBookShelfBlockEntity::new, CelluloseBlocks.ACACIA_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<NineSlotBookshelfBlockEntity> CRIMSON_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "crimson_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(NineSlotBookshelfBlockEntity::new, CelluloseBlocks.CRIMSON_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<FourSlotBookshelfBlockEntity> WARPED_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "warped_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(FourSlotBookshelfBlockEntity::new, CelluloseBlocks.WARPED_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<FourSlotBookshelfBlockEntity> MANGROVE_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "mangrove_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(FourSlotBookshelfBlockEntity::new, CelluloseBlocks.MANGROVE_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<BambooChiseledBookshelfBlockEntity> BAMBOO_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "bamboo_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(BambooChiseledBookshelfBlockEntity::new, CelluloseBlocks.BAMBOO_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<CherryChiseledBookshelfBlockEntity> CHERRY_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "cherry_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(CherryChiseledBookshelfBlockEntity::new, CelluloseBlocks.CHERRY_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<CactusChiseledBookshelfBlockEntity> CACTUS_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "cactus_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(CactusChiseledBookshelfBlockEntity::new, CelluloseBlocks.CACTUS_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<AzaleaChiseldBookshelfBlockEntity> AZALEA_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "azalea_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(AzaleaChiseldBookshelfBlockEntity::new, CelluloseBlocks.AZALEA_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<FlippedFiveSlotBlockEntity> CEDAR_CHISELED_BOOKSHELF = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(Cellulose.MOD_ID, "cedar_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(FlippedFiveSlotBlockEntity::new, CelluloseBlocks.PINE_CHISELED_BOOKSHELF).build()
    );


    public static void registerEntities(){
        Cellulose.LOGGER.info("Registering Mod entities");
    }
}
