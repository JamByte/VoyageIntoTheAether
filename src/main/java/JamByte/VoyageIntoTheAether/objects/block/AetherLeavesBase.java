package JamByte.VoyageIntoTheAether.objects.block;

import JamByte.VoyageIntoTheAether.VoyageIntoTheAether;
import JamByte.VoyageIntoTheAether.init.BlockInit;
import JamByte.VoyageIntoTheAether.init.ItemInit;
import JamByte.VoyageIntoTheAether.util.IHasModel;
import com.gildedgames.aether.common.init.CreativeTabsAether;
import com.legacy.aether.registry.creative_tabs.AetherCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class AetherLeavesBase implements IHasModel {
    public Block block;
    public AetherLeavesBase(String name, Block block){
        block.setUnlocalizedName(name);
        block.setRegistryName(name);
        block.setCreativeTab(CreativeTabsAether.TAB_NATURAL_BLOCKS);
        block.setHardness(2);
        BlockInit.BLOCKS.add(block);
        ItemInit.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        this.block=block;
    }
    @Override
    public void registerModels(){
        VoyageIntoTheAether.proxy.registerItemRenderer(Item.getItemFromBlock(block),0,"inventory");}

}

