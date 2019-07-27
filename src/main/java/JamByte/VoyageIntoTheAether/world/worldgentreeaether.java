package JamByte.VoyageIntoTheAether.world;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class worldgentreeaether implements IWorldGenerator {
    private BlockPos chunkPos = BlockPos.ORIGIN;
    public aetheriitreegen aetheriitreegen = new aetheriitreegen();
    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world,
                         net.minecraft.world.gen.IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        for ( int i = 0 ; i<9; i++ )
        {
            int i8 = rand.nextInt(16) + 8;
            int l11 = rand.nextInt(16) + 8;
            BlockPos blockpos2 = world.getHeight(this.chunkPos.add(i8, 0, l11));

            aetheriitreegen.generate(world, rand, blockpos2);
        }

        return;
    }


}
