package net.qzimyion.cellulose.worldgen.trees.treeDecorators;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import org.jetbrains.annotations.NotNull;

public class MushroomLogDecorator extends TreeDecorator {

    public static final Codec<MushroomLogDecorator> CODEC = RecordCodecBuilder.create((mossCarpetDecoratorInstance ->
            mossCarpetDecoratorInstance.group(
                    Codec.floatRange(0.0F, 1.0F).fieldOf("mushroom_chance").forGetter((treeDecorator) -> treeDecorator.mushroomChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter((treeDecorator) -> treeDecorator.probability)
                    ).apply(mossCarpetDecoratorInstance, MushroomLogDecorator::new)));

    public MushroomLogDecorator(float carpetChance, float probability){
        this.mushroomChance = carpetChance;
        this.probability = probability;
    }

    @Override
    protected @NotNull TreeDecoratorType<?> type() {
        return null;
    }

    public final float mushroomChance;
    private final float probability;


    @Override
    public void place(Context generator) {
        RandomSource random = generator.random();
        if (random.nextFloat() <= this.probability){
            ObjectArrayList<BlockPos> poses = generator.logs();
            Util.shuffle(poses, random);
            BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos();
            BlockState mushroomState = random.nextBoolean() ? Blocks.RED_MUSHROOM.defaultBlockState() : Blocks.BROWN_MUSHROOM.defaultBlockState();
            for (BlockPos pos : poses) {
                mutableBlockPos.set(pos).move(Direction.UP);
                if (generator.isAir(mutableBlockPos)) {
                    if (random.nextFloat() <= this.mushroomChance) {
                        generator.setBlock(mutableBlockPos, mushroomState);
                    }
                }
            }
        }
    }
}
