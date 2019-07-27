package JamByte.VoyageIntoTheAether.world;


import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.BlockAetherFlower;
import JamByte.VoyageIntoTheAether.init.BlockInit;
import com.legacy.aether.blocks.BlocksAether;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class test3 extends WorldGenerator
{

    public IBlockState[] flowers;

    public test3(boolean notify, IBlockState[] f)
    {
        super(notify);
        flowers=f;
    }
    @Override
    public boolean generate(World world, Random rand, BlockPos pos)
    {




        IBlockState j1 = world.getBlockState(pos.down());

        if(j1.getBlock() != BlocksAether.aether_grass && j1.getBlock() != BlocksAether.aether_dirt)
        {
            return false;
        }

        this.setBlockAndNotifyAdequately(world, pos, flowers[rand.nextInt(flowers.length)]);
        return true;
    }


}

