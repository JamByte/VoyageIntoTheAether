package JamByte.VoyageIntoTheAether.objects.block;

import JamByte.VoyageIntoTheAether.VoyageIntoTheAether;
import JamByte.VoyageIntoTheAether.init.BlockInit;
import JamByte.VoyageIntoTheAether.init.ItemInit;
import com.legacy.aether.registry.creative_tabs.AetherCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import JamByte.VoyageIntoTheAether.util.IHasModel;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material, float hardness, int harvestlevel){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AetherCreativeTabs.blocks);
        setHarvestLevel("pickaxe", harvestlevel);
        setHardness(hardness);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Override
    public void registerModels(){
        VoyageIntoTheAether.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");}

}
