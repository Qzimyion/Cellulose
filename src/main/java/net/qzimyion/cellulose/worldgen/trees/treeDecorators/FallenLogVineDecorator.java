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
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

public class FallenLogVineDecorator extends TreeDecorator {
    public static final MapCodec<FallenLogVineDecorator> CODEC = RecordCodecBuilder.mapCodec((instance) -> instance.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter((treeDecorator) -> treeDecorator.probability),
            Codec.intRange(-63, 319).fieldOf("max_height").forGetter((treeDecorator) -> treeDecorator.maxHeight),
            Codec.floatRange(0.0F, 1.0F).fieldOf("placement_chance").forGetter((treeDecorator) -> treeDecorator.placementChance)
    ).apply(instance, FallenLogVineDecorator::new));

    private final float probability;
    private final int maxHeight;
    private final float placementChance;

    public FallenLogVineDecorator(float probability, int maxHeight, float placementChance) {
        this.probability = probability;
        this.maxHeight = maxHeight;
        this.placementChance = placementChance;
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return null;
    }

    @Override
    public void place(Context context) {
        RandomSource random = context.random();
        if (random.nextFloat() <= this.probability) {
            ObjectArrayList<BlockPos> poses = new ObjectArrayList<>(context.logs());
            poses.addAll(context.roots());
            Util.shuffle(poses, random);
            BlockState vineState = Blocks.VINE.defaultBlockState();
            BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos();
            for (BlockPos pos : poses) {
                if (pos.getY() <= this.maxHeight) {
                    for (Direction direction : Direction.Plane.HORIZONTAL) {
                        if (random.nextFloat() <= this.placementChance) {
                            mutableBlockPos.setWithOffset(pos, direction);
                            if (context.isAir(mutableBlockPos)) {
                                context.setBlock(mutableBlockPos, vineState.setValue(VineBlock.PROPERTY_BY_DIRECTION.get(direction.getOpposite()), true));
                            }
                        }
                    }
                }
            }
        }
    }
}
