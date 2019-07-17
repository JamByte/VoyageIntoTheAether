package JamByte.VoyageIntoTheAether.objects.items;

import JamByte.VoyageIntoTheAether.VoyageIntoTheAether;
import JamByte.VoyageIntoTheAether.init.ItemInit;
import com.legacy.aether.registry.creative_tabs.AetherCreativeTabs;
import net.minecraft.item.Item;
import JamByte.VoyageIntoTheAether.util.IHasModel;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setRegistryName(name);
        setCreativeTab(AetherCreativeTabs.blocks);
        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels(){
        VoyageIntoTheAether.proxy.registerItemRenderer(this,0,"inventory");}
}
