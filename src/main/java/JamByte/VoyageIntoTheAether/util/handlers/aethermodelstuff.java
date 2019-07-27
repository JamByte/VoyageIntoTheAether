package JamByte.VoyageIntoTheAether.util.handlers;


import JamByte.VoyageIntoTheAether.VoyageIntoTheAether;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.BlockAetherFlower;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.BlockAetherFlowerBase;
import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.saplings.*;
import JamByte.VoyageIntoTheAether.init.BlockInit;
import com.gildedgames.aether.client.util.ItemModelBuilder;
import com.gildedgames.aether.common.blocks.natural.leaves.BlockAetherLeaves;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Map;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(Side.CLIENT)
public class aethermodelstuff {
    @SubscribeEvent()
    public static void onModelRegistryReady(final ModelRegistryEvent event) {
        final StateMap leavesMapper = new StateMap.Builder().ignore(BlockAetherLeaves.PROPERTY_CHECK_DECAY, BlockAetherLeaves.PROPERTY_DECAYABLE).build();

        ModelLoader.setCustomStateMapper(BlockInit.SKYROOT_SAPLING, new StateMap.Builder().ignore(BlockAetherSapling.PROPERTY_STAGE).build());
        ModelLoader.setCustomStateMapper(BlockInit.UNIQUE_SAPLING, new StateMap.Builder().ignore(BlockAetherSapling.PROPERTY_STAGE).build());
        ModelLoader.setCustomStateMapper(BlockInit.WISPROOT_SAPLING, new StateMap.Builder().ignore(BlockAetherSapling.PROPERTY_STAGE).build());
        ModelLoader.setCustomStateMapper(BlockInit.GREATROOT_SAPLING, new StateMap.Builder().ignore(BlockAetherSapling.PROPERTY_STAGE).build());
        registerItemModels(BlockInit.SKYROOT_SAPLING, new ItemModelBuilder("saplings/")
                .add(BlockAetherSkyrootSapling.GREEN.getMeta(), "green_skyroot_sapling")
                .add(BlockAetherSkyrootSapling.BLUE.getMeta(), "blue_skyroot_sapling")
                .add(BlockAetherSkyrootSapling.DARK_BLUE.getMeta(), "dark_blue_skyroot_sapling"));
        registerItemModels(BlockInit.UNIQUE_SAPLING, new ItemModelBuilder("saplings/")
                .add(BlockAetherUniqueSapling.AMBEROOT.getMeta(), "amberoot_sapling")
                .add(BlockAetherUniqueSapling.MUTANT_TREE.getMeta(), "mutant_tree_sapling"));

        registerItemModels(BlockInit.WISPROOT_SAPLING, new ItemModelBuilder("saplings/")
                .add(BlockAetherWisprootSapling.GREEN.getMeta(), "green_wisproot_sapling")
                .add(BlockAetherWisprootSapling.BLUE.getMeta(), "blue_wisproot_sapling")
                .add(BlockAetherWisprootSapling.DARK_BLUE.getMeta(), "dark_blue_wisproot_sapling"));

        registerItemModels(BlockInit.GREATROOT_SAPLING, new ItemModelBuilder("saplings/")
                .add(BlockAetherGreatrootSapling.GREEN.getMeta(), "green_greatroot_sapling")
                .add(BlockAetherGreatrootSapling.BLUE.getMeta(), "blue_greatroot_sapling")
                .add(BlockAetherGreatrootSapling.DARK_BLUE.getMeta(), "dark_blue_greatroot_sapling"));


        ModelLoader.setCustomStateMapper(BlockInit.BLUE_SKYROOT_LEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.GREEN_SKYROOOT_LEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.DARK_BLUE_SKYROOT_LEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.AMBERROOT_LEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.BLUE_DARK_SKYROOT_LEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.GREEN_DARK_SKYROOT_LEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.DARK_BLUE_DARK_SKYROOT_LEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.BLUE_LIGHT_SKYROOTLEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.GREEN_LIGHT_SKYROOT_LEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.DARK_BLUE_LIGHT_SKYROOT_LEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.MUTANT_LEAVES, leavesMapper);
        ModelLoader.setCustomStateMapper(BlockInit.MUTANT_LEAVES_DECORATED, leavesMapper);

        registerItemModels(BlockInit.BLUE_SKYROOT_LEAVES, "leaves/blue_skyroot_leaves");
        registerItemModels(BlockInit.GREEN_SKYROOOT_LEAVES, "leaves/green_skyroot_leaves");
        registerItemModels(BlockInit.DARK_BLUE_SKYROOT_LEAVES, "leaves/dark_blue_skyroot_leaves");

        registerItemModels(BlockInit.BLUE_DARK_SKYROOT_LEAVES, "leaves/blue_dark_skyroot_leaves");
        registerItemModels(BlockInit.GREEN_DARK_SKYROOT_LEAVES, "leaves/green_dark_skyroot_leaves");
        registerItemModels(BlockInit.DARK_BLUE_DARK_SKYROOT_LEAVES, "leaves/dark_blue_dark_skyroot_leaves");

        registerItemModels(BlockInit.BLUE_LIGHT_SKYROOTLEAVES, "leaves/blue_light_skyroot_leaves");
        registerItemModels(BlockInit.GREEN_LIGHT_SKYROOT_LEAVES, "leaves/green_light_skyroot_leaves");
        registerItemModels(BlockInit.DARK_BLUE_LIGHT_SKYROOT_LEAVES, "leaves/dark_blue_light_skyroot_leaves");

        registerItemModels(BlockInit.AMBERROOT_LEAVES, "leaves/amberoot_leaves");


        registerItemModels(BlockInit.MUTANT_LEAVES, "leaves/mutant_leaves");
        registerItemModels(BlockInit.MUTANT_LEAVES_DECORATED, "leaves/mutant_leaves_decorated");


        registerItemModels(BlockInit.AETHER_FLOWER, new ItemModelBuilder("flowers/")
                .add(BlockAetherFlower.WHITE_ROSE.getMeta(), "white_rose")
                .add(BlockAetherFlower.PURPLE_FLOWER.getMeta(), "purple_flower")
                .add(BlockAetherFlower.BURSTBLOSSOM.getMeta(), "burstblossom")
                .add(BlockAetherFlower.AECHOR_SPROUT.getMeta(), "aechor_sprout")
                .add(BlockAetherFlower.WHITE_ROSE.getMeta() + BlockAetherFlower.PROPERTY_VARIANT.func_177700_c().size(), "white_rose_snowy")
                .add(BlockAetherFlower.PURPLE_FLOWER.getMeta() + BlockAetherFlower.PROPERTY_VARIANT.func_177700_c().size(), "purple_flower_snowy")
                .add(BlockAetherFlower.BURSTBLOSSOM.getMeta() + BlockAetherFlower.PROPERTY_VARIANT.func_177700_c().size(), "burstblossom_snowy")
                .add(BlockAetherFlower.AECHOR_SPROUT.getMeta() + BlockAetherFlower.PROPERTY_VARIANT.func_177700_c().size(), "aechor_sprout_snowy"));

        registerSnowyFlower(BlockInit.ARTIC_SPIKESPRING, "arctic_spikespring");
        registerSnowyFlower(BlockInit.BARKSHROOM, "barkshroom");
        registerSnowyFlower(BlockInit.BLUE_SWINGTIP, "blue_swingtip");
        registerSnowyFlower(BlockInit.FORGOTTEN_ROSE, "forgotten_rose");
        registerSnowyFlower(BlockInit.GREEN_SWINGTIP, "green_swingtip");
        registerSnowyFlower(BlockInit.HIGHLANDS_TULIPS, "highlands_tulips");
        registerSnowyFlower(BlockInit.IRRADIATED_FLOWER, "irradiated_flower");
        registerSnowyFlower(BlockInit.MAGNETIC_SHROOM, "magnetic_shroom");
        registerSnowyFlower(BlockInit.NEVERBLOOM, "neverbloom");
        registerSnowyFlower(BlockInit.PINK_SWINGTIP, "pink_swingtip");
        registerSnowyFlower(BlockInit.QUICKSHOOT, "quickshoot");
        registerSnowyFlower(BlockInit.STONESHRROM, "stoneshroom");

    }
    private static void registerSnowyFlower(Block block, String name)
    {
        registerItemModels(block, new ItemModelBuilder("flowers/")
                .add(BlockAetherFlowerBase.NORMAL_META, name)
                .add(BlockAetherFlowerBase.SNOWY_META, name + "_snowy"));
    }
    private static void registerItemModels(final Item item, final ItemModelBuilder builder)
    {
        for (final Map.Entry<Integer, ModelResourceLocation> entry : builder.getRegistrations().entrySet())
        {
            ModelLoader.setCustomModelResourceLocation(item, entry.getKey(), entry.getValue());
        }
    }
    private static Item getItem(final Block block) {
        return Item.getItemFromBlock(block);
    }

    private static void registerItemModels(final Block block, final String path)
    {
        registerItemModels(getItem(block), path);
    }

    private static void registerItemModels(final Item item, final String path)
    {
        final ModelResourceLocation resource = new ModelResourceLocation(VoyageIntoTheAether.MODID+":"+path, "inventory");

        ModelLoader.setCustomModelResourceLocation(item, 0, resource);
    }

    private static void registerItemModels(final Block block, final ItemModelBuilder builder)
    {
        registerItemModels(getItem(block), builder);
    }
}