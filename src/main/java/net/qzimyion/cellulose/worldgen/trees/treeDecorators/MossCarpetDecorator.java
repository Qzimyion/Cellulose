package net.qzimyion.cellulose.worldgen.trees.treeDecorators;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;

public class MossCarpetDecorator extends TreeDecorator {

    public static final Codec<MossCarpetDecorator> CODEC = RecordCodecBuilder.create((mossCarpetDecoratorInstance ->
            mossCarpetDecoratorInstance.group(Codec.floatRange(0.0F, 1.0F)
                    .fieldOf("carpet_chance")
                    .forGetter((treeDecorator) -> treeDecorator.carpetChance))
                    .apply(mossCarpetDecoratorInstance, MossCarpetDecorator::new)));

    public MossCarpetDecorator(float carpetChance){
        this.carpetChance = carpetChance;
    }

    @Override
    protected TreeDecoratorType<?> getType() {
        return WorldGenRegistry.MOSS_CARPET_DECORATOR;
    }

    public final float carpetChance;

    private boolean shouldPlaceMossCarpet(Random random) {
        return random.nextFloat() < carpetChance;
    }

    @Override
    public void generate(Generator generator) {
        ObjectArrayList<BlockPos> nodes = generator.getLogPositions();
        for (BlockPos node : nodes){
            if (shouldPlaceMossCarpet(generator.getRandom())) {
                BlockPos.Mutable abovePos = (BlockPos.Mutable) node.up();
                if (generator.getWorld().testBlockState(abovePos, blockState -> blockState.isAir() || blockState.getBlock() == Blocks.MOSS_CARPET)){
                    generator.replace(abovePos, Blocks.MOSS_CARPET.getDefaultState());
                }
            }
        }
    }
}
