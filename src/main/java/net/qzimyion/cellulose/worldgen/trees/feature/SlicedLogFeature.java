package net.qzimyion.cellulose.worldgen.trees.feature;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.VineBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

@SuppressWarnings("deprecation")
public class SlicedLogFeature extends Feature<DefaultFeatureConfig> {
    Block log;

    public SlicedLogFeature(Codec<DefaultFeatureConfig> configCodec, Block log) {
        super(configCodec);
        this.log = log;
    }

    @Override
    public boolean generate(FeatureContext context) {
        return generate(context.getWorld(), context.getRandom(), context.getOrigin());
    }

    private boolean generate(StructureWorldAccess world, Random random, BlockPos pos) {
        int size = random.nextInt(3) + 3;
        int distance = random.nextInt(6) > 1 ? 1 : 2;
        BlockPos trunkTopPos = world.getTopPosition(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,pos);
        if(!world.getBlockState(trunkTopPos).isReplaceable()
                || !(world.getBlockState(trunkTopPos.down()).isOf(Blocks.DIRT)
                || world.getBlockState(trunkTopPos.down()).isOf(Blocks.COARSE_DIRT)
                || world.getBlockState(trunkTopPos.down()).isOf(Blocks.PODZOL)
                || world.getBlockState(trunkTopPos.down()).isOf(Blocks.GRASS_BLOCK)
                || world.getBlockState(trunkTopPos.down()).isOf(Blocks.DIRT_PATH))){
            return false;
        }
        Direction direction = Direction.Type.HORIZONTAL.random(random);
        generateLog(world ,direction ,size, distance + 1, trunkTopPos,4);
        return true;
    }

    private boolean generateLog(StructureWorldAccess world, Direction direction, int length, int distance, BlockPos pos, int tries){
        if (tries <= 0){
            return false;
        }
        BlockPos start = world.getTopPosition(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,pos.offset(direction,distance));
        int maxY = start.getY();
        for (int i = 0; i < length; i++){
            BlockPos pos1 = world.getTopPosition(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,start.offset(direction, i));
            if(pos1.getY() > maxY){
                maxY = pos1.getY();
            }
        }
        for(int i = 0; i < length; i++){
            BlockPos.Mutable temp = start.offset(direction, i).mutableCopy();
            temp.setY(maxY);
            if(((maxY - start.getY()) > 3 || (pos.getY() - maxY) > 3 || !world.getBlockState(temp).isReplaceable() || world.getBlockState(temp.down()).isLiquid() || world.getBlockState(temp.down()).isIn(BlockTags.LOGS) || world.getBlockState(temp.down()).isOf(Blocks.RED_MUSHROOM_BLOCK) || world.getBlockState(temp.down()).isOf(Blocks.BROWN_MUSHROOM_BLOCK)) && i < 2){
                return generateLog(world, direction.rotateYClockwise(), length, distance, pos, tries - 1);
            }
        }
        for(int i = 0; i < length; i++){
            BlockPos.Mutable temp = start.offset(direction, i).mutableCopy();
            temp.setY(maxY);
            if(world.getBlockState(temp).isReplaceable()){
                world.setBlockState(temp, log.getDefaultState().with(PillarBlock.AXIS,direction.getAxis()),3);
                if(world.getBlockState(temp.up()).isReplaceable()){
                    world.setBlockState(temp.up(), Blocks.AIR.getDefaultState(),3);
                }
            }else{
                break;
            }
        }
        return true;
    }
}
