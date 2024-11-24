package net.qzimyion.cellulose.worldgen.trees.treeDecorators;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.List;

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
    protected @NotNull TreeDecoratorType<?> type() {
        return WorldGenRegistry.MOSS_CARPET_DECORATOR;
    }

    public final float carpetChance;

    private boolean shouldPlaceMossCarpet(RandomSource random) {
        return random.nextFloat() < carpetChance;
    }

    @Override
    public void place(Context generator) {
        ObjectArrayList<BlockPos> nodes = generator.logs();
        for (BlockPos node : nodes){
            if (shouldPlaceMossCarpet(generator.random())) {
                BlockPos abovePos = node.above();
                if (generator.level().isStateAtPosition(abovePos, BlockBehaviour.BlockStateBase::isAir)){
                    generator.setBlock(abovePos, Blocks.MOSS_CARPET.defaultBlockState());
                }
            }
        }
    }
}
