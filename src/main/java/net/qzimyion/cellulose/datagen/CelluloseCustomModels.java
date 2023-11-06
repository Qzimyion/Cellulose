package net.qzimyion.cellulose.datagen;

import com.google.gson.JsonElement;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.BlockStateSupplier;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public record CelluloseCustomModels(Consumer<BlockStateSupplier> blockStateCollector,
                                    BiConsumer<Identifier, Supplier<JsonElement>> modelCollector) {

    public void registerBookshelf(Block block) {
        TextureMap textureMap = TextureMap.sideEnd(TextureMap.getId(Blocks.BOOKSHELF), TextureMap.getId(Blocks.OAK_PLANKS));
        Identifier identifier = Models.CUBE_COLUMN.upload(Blocks.BOOKSHELF, textureMap, this.modelCollector);
        this.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(Blocks.BOOKSHELF, identifier));
    }
}
