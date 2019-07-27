package JamByte.VoyageIntoTheAether.proxy;

import jdk.nashorn.internal.ir.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import JamByte.VoyageIntoTheAether.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int metadata,String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(),id));

    }
    @Override
    public void registerEventHandlers() {
        super.registerEventHandlers();

    }
}