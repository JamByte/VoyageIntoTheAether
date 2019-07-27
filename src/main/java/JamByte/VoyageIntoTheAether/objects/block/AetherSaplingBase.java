package JamByte.VoyageIntoTheAether.objects.block;

import JamByte.VoyageIntoTheAether.VoyageIntoTheAether;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.saplings.BlockAetherSapling;
import JamByte.VoyageIntoTheAether.init.BlockInit;
import JamByte.VoyageIntoTheAether.init.ItemInit;
import JamByte.VoyageIntoTheAether.util.IHasModel;
import com.gildedgames.aether.common.init.CreativeTabsAether;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;

public class AetherSaplingBase{
    public BlockAetherSapling block;
    public Block potato(String name, BlockAetherSapling block){
        block.setUnlocalizedName(name);
        block.setRegistryName(name);
        block.setCreativeTab(CreativeTabsAether.TAB_NATURAL_BLOCKS);
        block.setHardness(2);
        BlockInit.BLOCKS.add(block);
        ItemInit.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        this.block=block;
        return block;
    }

}