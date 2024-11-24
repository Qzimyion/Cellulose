package net.qzimyion.cellulose.worldgen.trees.feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

@SuppressWarnings("deprecation")
public class SlicedLogFeature extends Feature<NoneFeatureConfiguration> {
    Block log;

    public SlicedLogFeature(Codec<NoneFeatureConfiguration> configCodec, Block log) {
        super(configCodec);
        this.log = log;
    }

    @Override
    public boolean place(FeaturePlaceContext context) {
        return generate(context.level(), context.random(), context.origin());
    }

    private boolean generate(WorldGenLevel world, RandomSource random, BlockPos pos) {
        int size = random.nextInt(3) + 3;
        int distance = random.nextInt(6) > 1 ? 1 : 2;
        BlockPos trunkTopPos = world.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,pos);
        if(!world.getBlockState(trunkTopPos).canBeReplaced()
                || !(world.getBlockState(trunkTopPos.below()).is(Blocks.DIRT)
                || world.getBlockState(trunkTopPos.below()).is(Blocks.COARSE_DIRT)
                || world.getBlockState(trunkTopPos.below()).is(Blocks.PODZOL)
                || world.getBlockState(trunkTopPos.below()).is(Blocks.GRASS_BLOCK)
                || world.getBlockState(trunkTopPos.below()).is(Blocks.DIRT_PATH))){
            return false;
        }
        Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(random);
        generateLog(world, direction, size, distance, trunkTopPos,4);
        return true;
    }

    private boolean generateLog(WorldGenLevel world, Direction direction, int length, int distance, BlockPos pos, int tries){
        if (tries <= 0){
            return false;
        }
        BlockPos start = world.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,pos.relative(direction,distance));
        int maxY = start.getY();
        for (int i = 0; i < length; i++){
            BlockPos pos1 = world.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,start.relative(direction, i));
            if(pos1.getY() > maxY){
                maxY = pos1.getY();
            }
        }
        for(int i = 0; i < length; i++){
            BlockPos.MutableBlockPos temp = start.relative(direction, i).mutable();
            temp.setY(maxY);
            if(((maxY - start.getY()) > 3 || (pos.getY() - maxY) > 3 || !world.getBlockState(temp).canBeReplaced() || world.getBlockState(temp.below()).liquid() || world.getBlockState(temp.below()).is(BlockTags.LOGS) || world.getBlockState(temp.below()).is(Blocks.RED_MUSHROOM_BLOCK) || world.getBlockState(temp.below()).is(Blocks.BROWN_MUSHROOM_BLOCK)) && i < 2){
                return generateLog(world, direction.getClockWise(), length, distance, pos, tries - 1);
            }
        }
        for(int i = 0; i < length; i++){
            BlockPos.MutableBlockPos temp = start.relative(direction, i).mutable();
            temp.setY(maxY);
            if(world.getBlockState(temp).canBeReplaced()){
                world.setBlock(temp, log.defaultBlockState().setValue(RotatedPillarBlock.AXIS,direction.getAxis()),3);
                if(world.getBlockState(temp.above()).canBeReplaced()){
                    world.setBlock(temp.above(), Blocks.AIR.defaultBlockState(),3);
                }
            }else{
                break;
            }
        }
        return true;
    }
}
