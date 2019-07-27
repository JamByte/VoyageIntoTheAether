package JamByte.VoyageIntoTheAether.world;

import JamByte.VoyageIntoTheAether.VoyageIntoTheAether;
import com.gildedgames.aether.common.AetherCore;
import com.legacy.aether.Aether;
import com.legacy.aether.AetherConfig;
import com.legacy.aether.blocks.BlocksAether;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class aetheriitreegen{
    public ArrayList<Template> template = new ArrayList<Template>();
    public String[] nbttoread={"normal/blue/blue_skyroot_tree_1.nbt"};
    public PlacementSettings placementSettings = (new PlacementSettings()).setMirror(Mirror.NONE)
            .setIgnoreStructureBlock(false)
            .setRotation(Rotation.NONE);

    public aetheriitreegen(){
        int index =0;
        for (String location:nbttoread){
            template.add(new Template());
            try {
                template.get(index).read(CompressedStreamTools.readCompressed(MinecraftServer.class.getResourceAsStream("/assets/aether/structures/highlands/trees/" + location)));
            }
            catch(IOException e){e.printStackTrace();}
            index++;
            }


    }


    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        if(worldIn.provider.getDimension()== AetherConfig.dimension.aether_dimension_id){
            if(worldIn.getBlockState(position).getBlock()== BlocksAether.aether_grass){
            if(rand.nextInt(30) == 0){
                    template.get(rand.nextInt(template.size())).addBlocksToWorld(worldIn,position, placementSettings);
                    return true;
                }
            }
        }
        return false;
    }

}