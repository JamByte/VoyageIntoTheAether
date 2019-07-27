package JamByte.VoyageIntoTheAether.util.handlers;

import JamByte.VoyageIntoTheAether.VoyageIntoTheAether;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.Templates;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.TemplatesDef;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.leaves.*;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.BlockAetherFlower;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.BlockAetherFlowerBase;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.BlockAetherMushroom;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.saplings.*;
import JamByte.VoyageIntoTheAether.init.BlockInit;
import JamByte.VoyageIntoTheAether.init.ItemInit;
import JamByte.VoyageIntoTheAether.objects.block.AetherSaplingBase;
import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.blocks.IBlockMultiName;
import com.gildedgames.aether.common.blocks.IBlockWithItem;
import com.gildedgames.aether.common.blocks.IInternalBlock;
import com.gildedgames.aether.common.blocks.natural.leaves.BlockAetherLeaves;
import com.gildedgames.aether.common.blocks.natural.wood.AetherWoodType;
import com.gildedgames.aether.common.init.BlocksAetherInit;
import com.gildedgames.aether.common.items.blocks.ItemBlockMultiName;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.terraingen.WorldTypeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import JamByte.VoyageIntoTheAether.util.IHasModel;
import net.minecraftforge.registries.IForgeRegistry;
import static com.gildedgames.aether.common.init.CreativeTabsAether.*;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import static scala.collection.concurrent.Debug.log;

@Mod.EventBusSubscriber
public class RegistryHandler {
    private static final Set<Block> registeredBlocks = new HashSet<>();
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
        for (final Block block : registeredBlocks)
        {
            final ItemBlock item;

            if (block instanceof IInternalBlock)
            {
                continue;
            }
            else if (block instanceof IBlockWithItem)
            {
                item = ((IBlockWithItem) block).createItemBlock();
            }
            else if (block instanceof IBlockMultiName)
            {
                item = new ItemBlockMultiName(block);
            }
            else
            {
                item = new ItemBlock(block);
            }

            if (block.getRegistryName() == null)
            {
                throw new RuntimeException("Registry name of block cannot be null");
            }

            String registryName = block.getRegistryName().getResourcePath();

            item.setUnlocalizedName(VoyageIntoTheAether.MODID + "." + registryName);
            item.setRegistryName(VoyageIntoTheAether.MODID, registryName);

            event.getRegistry().register(item);
        }



    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event){

        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
        BlockInit.SKYROOT_SAPLING = new BlockAetherSkyrootSapling().setCreativeTab(TAB_NATURAL_BLOCKS);
        BlockInit.GREATROOT_SAPLING = new BlockAetherGreatrootSapling().setCreativeTab(TAB_NATURAL_BLOCKS);
        BlockInit.WISPROOT_SAPLING = new BlockAetherWisprootSapling().setCreativeTab(TAB_NATURAL_BLOCKS);
        BlockInit.UNIQUE_SAPLING = new BlockAetherUniqueSapling().setCreativeTab(TAB_NATURAL_BLOCKS);
        final RegistryHandler.BlockRegistryHelper r = new RegistryHandler.BlockRegistryHelper(event.getRegistry());
        r.register("skyroot_sapling",BlockInit.SKYROOT_SAPLING);

        r.register("greatroot_sapling", BlockInit.GREATROOT_SAPLING.setCreativeTab(TAB_NATURAL_BLOCKS));

        r.register("wisproot_sapling", BlockInit.WISPROOT_SAPLING.setCreativeTab(TAB_NATURAL_BLOCKS));

        r.register("unique_sapling",BlockInit.UNIQUE_SAPLING.setCreativeTab(TAB_NATURAL_BLOCKS));


        BlockInit.AMBERROOT_LEAVES=new BlockUniqueLeaves(AetherWoodType.AMBERROOT);
        BlockInit.BLUE_DARK_SKYROOT_LEAVES=new BlockGreatrootLeaves(BlockColoredLeaves.Color.BLUE);
        BlockInit.BLUE_LIGHT_SKYROOTLEAVES=new BlockWisprootLeaves(BlockColoredLeaves.Color.BLUE);
        BlockInit.BLUE_SKYROOT_LEAVES= new BlockSkyrootLeaves(BlockColoredLeaves.Color.BLUE);
        BlockInit.DARK_BLUE_DARK_SKYROOT_LEAVES=new BlockGreatrootLeaves(BlockColoredLeaves.Color.DARK_BLUE);
        BlockInit.DARK_BLUE_LIGHT_SKYROOT_LEAVES=new BlockWisprootLeaves(BlockColoredLeaves.Color.DARK_BLUE);
        BlockInit.DARK_BLUE_SKYROOT_LEAVES=new BlockSkyrootLeaves(BlockColoredLeaves.Color.DARK_BLUE);
        BlockInit.GREEN_DARK_SKYROOT_LEAVES=new BlockGreatrootLeaves(BlockColoredLeaves.Color.GREEN);
        BlockInit.GREEN_LIGHT_SKYROOT_LEAVES=new BlockWisprootLeaves(BlockColoredLeaves.Color.GREEN);
        BlockInit.GREEN_SKYROOOT_LEAVES=new BlockSkyrootLeaves(BlockColoredLeaves.Color.GREEN);
        BlockInit.MUTANT_LEAVES= new BlockUniqueLeaves(AetherWoodType.MUTANT);
        BlockInit.MUTANT_LEAVES_DECORATED=new BlockUniqueLeaves(AetherWoodType.MUTANT);
        r.register("amberoot_leaves", BlockInit.AMBERROOT_LEAVES.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("blue_dark_skyroot_leaves",BlockInit.BLUE_DARK_SKYROOT_LEAVES.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("blue_light_skyroot_leaves", BlockInit.BLUE_LIGHT_SKYROOTLEAVES .setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("blue_skyroot_leaves",BlockInit.BLUE_SKYROOT_LEAVES.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("dark_blue_dark_skyroot_leaves", BlockInit.DARK_BLUE_DARK_SKYROOT_LEAVES .setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("dark_blue_light_skyroot_leaves", BlockInit.DARK_BLUE_LIGHT_SKYROOT_LEAVES .setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("dark_blue_skyroot_leaves",  BlockInit.DARK_BLUE_SKYROOT_LEAVES.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("green_dark_skyroot_leaves",BlockInit.GREEN_DARK_SKYROOT_LEAVES .setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("green_light_skyroot_leaves", BlockInit.GREEN_LIGHT_SKYROOT_LEAVES.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("green_skyroot_leaves", BlockInit.GREEN_SKYROOOT_LEAVES.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("mutant_leaves",BlockInit.MUTANT_LEAVES.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("mutant_leaves_decorated", BlockInit.MUTANT_LEAVES_DECORATED.setLightLevel(1f).setCreativeTab(TAB_NATURAL_BLOCKS));


        BlockInit.AETHER_FLOWER= new BlockAetherFlower();
        BlockInit.ARTIC_SPIKESPRING = new BlockAetherFlowerBase();
        BlockInit.BARKSHROOM =  new BlockAetherMushroom();
        BlockInit.BLUE_SWINGTIP =  new BlockAetherFlowerBase();
        BlockInit.FORGOTTEN_ROSE = new BlockAetherFlowerBase();
        BlockInit.GREEN_SWINGTIP = new BlockAetherFlowerBase();
        BlockInit.HIGHLANDS_TULIPS = new BlockAetherFlowerBase();
        BlockInit.IRRADIATED_FLOWER = new BlockAetherFlowerBase();
        BlockInit.MAGNETIC_SHROOM =  new BlockAetherMushroom();
        BlockInit.NEVERBLOOM =  new BlockAetherFlowerBase();
        BlockInit.PINK_SWINGTIP = new BlockAetherFlowerBase();
        BlockInit.QUICKSHOOT =  new BlockAetherFlowerBase();
        BlockInit.STONESHRROM= new BlockAetherMushroom();


        r.register("aether_flower", BlockInit.AETHER_FLOWER.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("arctic_spikespring",BlockInit.ARTIC_SPIKESPRING .setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("barkshroom", BlockInit.BARKSHROOM.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("blue_swingtip",BlockInit.BLUE_SWINGTIP.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("forgotten_rose",BlockInit.FORGOTTEN_ROSE .setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("green_swingtip", BlockInit.GREEN_SWINGTIP.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("highlands_tulips", BlockInit.HIGHLANDS_TULIPS .setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("irradiated_flower",  BlockInit.IRRADIATED_FLOWER .setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("magnetic_shroom",BlockInit.MAGNETIC_SHROOM.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("neverbloom", BlockInit.NEVERBLOOM.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("pink_swingtip", BlockInit.PINK_SWINGTIP.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("quickshoot",BlockInit.QUICKSHOOT.setCreativeTab(TAB_NATURAL_BLOCKS));
        r.register("stoneshroom", BlockInit.STONESHRROM .setCreativeTab(TAB_NATURAL_BLOCKS));



    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for ( Item item : ItemInit.ITEMS  ){
            if(item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }
        for(Block block: BlockInit.BLOCKS){
            if(block instanceof  IHasModel){
                ((IHasModel)block).registerModels();
            }
        }

    }
    private static class BlockRegistryHelper
    {
        private final IForgeRegistry<Block> registry;

        BlockRegistryHelper(final IForgeRegistry<Block> registry)
        {
            this.registry = registry;
        }

        private void register(final String registryName, final Block block)
        {
            block.setUnlocalizedName(VoyageIntoTheAether.MODID + "." + registryName);
            block.setRegistryName(VoyageIntoTheAether.MODID, registryName);

            this.registry.register(block);

            registeredBlocks.add(block);
        }
    }

}
