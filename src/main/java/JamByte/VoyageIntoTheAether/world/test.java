package JamByte.VoyageIntoTheAether.world;


import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.TemplatesDef;
import com.gildedgames.aether.api.world.templates.TemplateDefinition;
import com.gildedgames.aether.api.world.templates.TemplateLoc;
import com.legacy.aether.blocks.BlocksAether;
import com.gildedgames.aether.common.world.templates.TemplatePlacer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

import java.util.ArrayList;
import java.util.Random;

public class test extends WorldGenAbstractTree
    {
        public ArrayList<Template> template = new ArrayList<Template>();
        public String[] nbttoread={"normal/dark_blue/dark_blue_skyroot_tree_3.nbt"};
        public TemplateDefinition[]TemplatesDefinitions={TemplatesDef.blue_skyroot_tree_1,TemplatesDef.blue_skyroot_tree_2,TemplatesDef.blue_skyroot_tree_3,
              TemplatesDef.dark_blue_skyroot_tree_1,TemplatesDef.dark_blue_skyroot_tree_2,TemplatesDef.dark_blue_skyroot_tree_3,
              TemplatesDef.green_skyroot_tree_1,TemplatesDef.green_skyroot_tree_2,TemplatesDef.green_skyroot_tree_3,
              TemplatesDef.blue_skyroot_tree_1,TemplatesDef.blue_skyroot_tree_2,TemplatesDef.blue_skyroot_tree_3,
              TemplatesDef.dark_blue_skyroot_tree_1,TemplatesDef.dark_blue_skyroot_tree_2,TemplatesDef.dark_blue_skyroot_tree_3,
              TemplatesDef.green_skyroot_tree_1,TemplatesDef.green_skyroot_tree_2,TemplatesDef.green_skyroot_tree_3,
              TemplatesDef.dark_blue_skyroot_oak_1,TemplatesDef.dark_blue_skyroot_oak_2,
              TemplatesDef.green_skyroot_oak_1,TemplatesDef.green_skyroot_oak_2,
              TemplatesDef.blue_skyroot_tree_1,TemplatesDef.blue_skyroot_tree_2,TemplatesDef.blue_skyroot_tree_3,
              TemplatesDef.dark_blue_skyroot_tree_1,TemplatesDef.dark_blue_skyroot_tree_2,TemplatesDef.dark_blue_skyroot_tree_3,
              TemplatesDef.green_skyroot_tree_1,TemplatesDef.green_skyroot_tree_2,TemplatesDef.green_skyroot_tree_3,
              TemplatesDef.dark_blue_skyroot_oak_1,TemplatesDef.dark_blue_skyroot_oak_2,
              TemplatesDef.green_skyroot_oak_1,TemplatesDef.green_skyroot_oak_2,
              TemplatesDef.blue_skyroot_tree_1,TemplatesDef.blue_skyroot_tree_2,TemplatesDef.blue_skyroot_tree_3,
              TemplatesDef.dark_blue_skyroot_tree_1,TemplatesDef.dark_blue_skyroot_tree_2,TemplatesDef.dark_blue_skyroot_tree_3,
              TemplatesDef.green_skyroot_tree_1,TemplatesDef.green_skyroot_tree_2,TemplatesDef.green_skyroot_tree_3,
              TemplatesDef.dark_blue_skyroot_oak_1,TemplatesDef.dark_blue_skyroot_oak_2,
              TemplatesDef.green_skyroot_oak_1,TemplatesDef.green_skyroot_oak_2,
              TemplatesDef.green_skyroot_pine_1,TemplatesDef.green_skyroot_pine_2,TemplatesDef.green_skyroot_pine_3,TemplatesDef.green_skyroot_pine_4,TemplatesDef.green_skyroot_pine_5,
              TemplatesDef.large_green_skyroot_pine_1,TemplatesDef.large_green_skyroot_pine_2,
              TemplatesDef.green_skyroot_windswept_1,TemplatesDef.green_skyroot_windswept_2,TemplatesDef.green_skyroot_windswept_3,TemplatesDef.green_skyroot_windswept_4,TemplatesDef.green_skyroot_windswept_5,TemplatesDef.green_skyroot_windswept_6,TemplatesDef.green_skyroot_windswept_7}


            ;

        public PlacementSettings placementSettings = (new PlacementSettings()).setMirror(Mirror.NONE)
                .setIgnoreStructureBlock(false)
                .setRotation(Rotation.NONE);
        private static final IBlockState DEFAULT_TRUNK=null;
        private static final IBlockState DEFAULT_LEAF=null;
        /** The minimum height of a generated tree. */
        private final int minTreeHeight;
        /** True if this tree should grow Vines. */
        private final boolean vinesGrow;
        /** The metadata value of the wood to use in tree generation. */
        private final IBlockState metaWood;
        /** The metadata value of the leaves to use in tree generation. */
        private final IBlockState metaLeaves;

        public test(boolean p_i2027_1_)
        {

            this(p_i2027_1_, 4, DEFAULT_TRUNK, DEFAULT_LEAF, false);
        }

        public test(boolean notify, int minTreeHeight, IBlockState metaWood, IBlockState metaLeaves, boolean vinesGrow)
        {
            super(notify);
            this.minTreeHeight = minTreeHeight;
            this.metaWood = metaWood;
            this.metaLeaves = metaLeaves;
            this.vinesGrow = vinesGrow;
            int index =0;
            /*for (TemplatesDefinition t:TemplatesDefinitions){
                t=t.clone().setConditions(new test2(), new PlacementConditionTemplate[]{new test2(),new test2()});
               TemplatesDefinitions[index]=t;
                index++;
            }
            /*for (String location:nbttoread){
                template.add(new Template());
                try {

                    template.get(index).read(CompressedStreamTools.readCompressed(MinecraftServer.class.getResourceAsStream("/assets/aether/structures/highlands/trees/" + location)));
                }
                catch(IOException e){e.printStackTrace();}
                index++;
            }*/
        }
        @Override
        public boolean generate(World world, Random rand, BlockPos pos)
        {
            TemplateDefinition temp=TemplatesDefinitions[rand.nextInt(TemplatesDefinitions.length)];



            IBlockState j1 = world.getBlockState(pos.down());

            if(j1.getBlock() != BlocksAether.aether_grass && j1.getBlock() != BlocksAether.aether_dirt)
            {
                return false;
            }

            this.setBlockAndNotifyAdequately(world, pos.down(), BlocksAether.aether_dirt.getDefaultState());
            TemplatePlacer.place(world,temp,new TemplateLoc().set(pos).set(true), rand);
            return true;
        }



    }

