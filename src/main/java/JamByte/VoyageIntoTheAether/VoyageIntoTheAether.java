package JamByte.VoyageIntoTheAether;

import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.Templates;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.TemplatesDef;
import JamByte.VoyageIntoTheAether.proxy.CommonProxy;
import JamByte.VoyageIntoTheAether.world.worldtest;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = VoyageIntoTheAether.MODID, version = VoyageIntoTheAether.VERSION,name = VoyageIntoTheAether.NAME)
public class VoyageIntoTheAether
{
    public static final String MODID = "voyage_into_the_aether";
    public static final String NAME = "Voyage Into The Aether";
    public static final String VERSION = "1.0";
    public static final String CLIENT = "JamByte.VoyageIntoTheAether.proxy.ClientProxy";
    public static final String SERVER = "JamByte.VoyageIntoTheAether.proxy.CommonProxy";
    public static final Logger logger = LogManager.getLogger(MODID);
    @Mod.Instance
    public static VoyageIntoTheAether instance;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        Templates.init();
        TemplatesDef.load();
        GameRegistry.registerWorldGenerator(new worldtest(), 0);
    }

    @SidedProxy(clientSide = CLIENT, serverSide = SERVER)
    public static CommonProxy proxy;
}
