package JamByte.VoyageIntoTheAether.proxy;

import JamByte.VoyageIntoTheAether.VoyageIntoTheAether;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.leaves.*;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.*;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.saplings.BlockAetherGreatrootSapling;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.saplings.BlockAetherSkyrootSapling;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.saplings.BlockAetherUniqueSapling;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.saplings.BlockAetherWisprootSapling;
import com.gildedgames.aether.api.registrar.ItemsAether;
import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.blocks.natural.leaves.BlockAetherLeaves;
import com.gildedgames.aether.common.blocks.natural.wood.AetherWoodType;
import com.gildedgames.aether.common.blocks.util.BlockCustomBed;
import com.gildedgames.aether.common.init.BlocksAetherInit;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.WorldProviderSurface;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import com.gildedgames.aether.common.init.CreativeTabsAether;
public class CommonProxy {
    public void registerItemRenderer(Item item, int metadata, String id){}
    public void registerEventHandlers() {    }

    }

