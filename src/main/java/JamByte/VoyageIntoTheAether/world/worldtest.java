package JamByte.VoyageIntoTheAether.world;

import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.BlockAetherFlower;
import JamByte.VoyageIntoTheAether.init.BlockInit;
import com.legacy.aether.AetherConfig;
import com.legacy.aether.world.biome.decoration.AetherGenSkyrootTree;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class worldtest implements IWorldGenerator
{
    public IBlockState[] flowers;
    private BlockPos chunkPos = BlockPos.ORIGIN;
    public test3 flower;
    public WorldGenerator tree;
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        int blockX = chunkX * 16;
        int blockZ = chunkZ * 16;
        chunkPos = new BlockPos(blockX, 0, blockZ);

        if (world.provider.getDimension()  == AetherConfig.dimension.aether_dimension_id)
        {
            generateOverworld(world, random, blockX, blockZ);
        }
    }
    public worldtest(){
        flowers=new IBlockState[]{
                BlockInit.PINK_SWINGTIP.getDefaultState(),
                BlockInit.GREEN_SWINGTIP.getDefaultState(),
                BlockInit.NEVERBLOOM.getDefaultState(),
                BlockInit.AETHER_FLOWER.getStateFromMeta(BlockAetherFlower.BURSTBLOSSOM.getMeta()),
                BlockInit.AETHER_FLOWER.getStateFromMeta(BlockAetherFlower.WHITE_ROSE.getMeta()),
                BlockInit.AETHER_FLOWER.getStateFromMeta(BlockAetherFlower.PURPLE_FLOWER.getMeta()),
                BlockInit.AETHER_FLOWER.getStateFromMeta(BlockAetherFlower.AECHOR_SPROUT.getMeta()),
                BlockInit.QUICKSHOOT.getDefaultState(),
                BlockInit.BLUE_SWINGTIP.getDefaultState(),
                BlockInit.BARKSHROOM.getDefaultState(),
                BlockInit.STONESHRROM.getDefaultState(),
                BlockInit.MAGNETIC_SHROOM.getDefaultState(),
                BlockInit.FORGOTTEN_ROSE.getDefaultState(),
                BlockInit.IRRADIATED_FLOWER.getDefaultState(),
                BlockInit.HIGHLANDS_TULIPS.getDefaultState()
    };

        flower = new test3(true, flowers);

        tree = new test(true);}


    private void generateOverworld(World world, Random rand, int blockX, int blockZ)
    {
        WorldGenerator largeTree = new test(true);
        for ( int i = 0 ; i < 40 ; i++ )
        {
            int i8 = rand.nextInt(16) + 8;
            int l11 = rand.nextInt(16) + 8;
            BlockPos blockpos2 = world.getHeight(this.chunkPos.add(i8, 0, l11));

            flower.generate(world, rand, blockpos2);
        }
        for ( int i = 0 ; i < 5 ; i++ )
        {
            int i8 = rand.nextInt(16) + 8;
            int l11 = rand.nextInt(16) + 8;
            BlockPos blockpos2 = world.getHeight(this.chunkPos.add(i8, 0, l11));

            tree.generate(world, rand, blockpos2);
        }


    }



}

