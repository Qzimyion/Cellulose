package net.qzimyion.cellulose.worldgen.trees.treeDecorators;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MossCarpetDecorator extends TreeDecorator {

    public static final Codec<MossCarpetDecorator> CODEC = RecordCodecBuilder.create((mossCarpetDecoratorInstance ->
            mossCarpetDecoratorInstance.group(
                    Codec.floatRange(0.0F, 1.0F).fieldOf("carpet_chance").forGetter((treeDecorator) -> treeDecorator.carpetChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter((treeDecorator) -> treeDecorator.probability)
                    ).apply(mossCarpetDecoratorInstance, MossCarpetDecorator::new)));

    public MossCarpetDecorator(float carpetChance, float probability){
        this.carpetChance = carpetChance;
        this.probability = probability;
    }

    @Override
    protected @NotNull TreeDecoratorType<?> type() {
        return WorldGenRegistry.MOSS_CARPET_DECORATOR;
    }

    public final float carpetChance;
    private final float probability;


    @Override
    public void place(Context generator) {
        RandomSource random = generator.random();
        if (random.nextFloat() <= this.probability){
            ObjectArrayList<BlockPos> poses = generator.logs();
            Util.shuffle(poses, random);
            BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos();
            BlockState mossState = Blocks.MOSS_CARPET.defaultBlockState();
            for (BlockPos pos : poses) {
                mutableBlockPos.set(pos).move(Direction.UP);
                if (generator.isAir(mutableBlockPos)) {
                    if (random.nextFloat() <= this.carpetChance) {
                        generator.setBlock(mutableBlockPos, mossState);
                    }
                }
            }
        }
    }
}
