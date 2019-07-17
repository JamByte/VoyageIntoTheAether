package JamByte.VoyageIntoTheAether;

import JamByte.VoyageIntoTheAether.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = VoyageIntoTheAether.MODID, version = VoyageIntoTheAether.VERSION,name = VoyageIntoTheAether.NAME)
public class VoyageIntoTheAether
{
    public static final String MODID = "voyage_into_the_aether";
    public static final String NAME = "Voyage Into The Aether";
    public static final String VERSION = "1.0";
    public static final String CLIENT = "JamByte.VoyageIntoTheAether.proxy.ClientProxy";
    public static final String SERVER = "JamByte.VoyageIntoTheAether.proxy.CommonProxy";

    @Mod.Instance
    public static VoyageIntoTheAether instance;

    @SidedProxy(clientSide = CLIENT, serverSide = SERVER)
    public static CommonProxy proxy;
}
