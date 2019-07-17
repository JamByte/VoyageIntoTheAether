package JamByte.VoyageIntoTheAether.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import JamByte.VoyageIntoTheAether.proxy.CommonProxy;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int metadata,String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(),id));
    }
}