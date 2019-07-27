package JamByte.VoyageIntoTheAether.init;

import JamByte.VoyageIntoTheAether.compatability.aetheriichanges.plants.saplings.BlockAetherSapling;
import JamByte.VoyageIntoTheAether.objects.block.AetherSaplingBase;
import JamByte.VoyageIntoTheAether.objects.block.BlockBase;
import JamByte.VoyageIntoTheAether.objects.block.BlockBaseDropItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

import static com.gildedgames.aether.common.init.CreativeTabsAether.TAB_NATURAL_BLOCKS;

public class BlockInit {
   public static final List<Block> BLOCKS = new ArrayList<Block>();
    /*ores with drops differing from their block*/
    public static final Block ENERGIZED_ORE = new BlockBaseDropItems("energized_ore", Material.ROCK, 1, "thermalfoundation:material",894, 1, 3, 2, 1);
    public static final Block RESONANT_ORE = new BlockBaseDropItems("resonant_ore", Material.ROCK, 1, "thermalfoundation:material",895, 1, 3, 2, 1);
    public static final Block DESTABILIZED_REDSTONE_ORE = new BlockBaseDropItems("destablized_redstone_ore", Material.ROCK, 1, "thermalfoundation:material",893, 1, 3, 2, 1);
    public static final Block CURDE_OIL_ORE = new BlockBaseDropItems("curde_oil_ore", Material.ROCK, 1, "thermalfoundation:material",892, 1, 3, 2, 1);
    public static final Block COAL_ORE = new BlockBaseDropItems("coal_ore", Material.ROCK, 1, "minecraft:coal",0, 1, 1, 2, 1);
    public static final Block REDSTONE_ORE = new BlockBaseDropItems("redstone_ore", Material.ROCK, 1, "minecraft:redstone",0, 4, 5, 2, 1);
    public static final Block EMERALD_ORE = new BlockBaseDropItems("emerald_ore", Material.ROCK, 1, "minecraft:emeral",0, 1, 1, 2, 1);
    public static final Block DIAMOND_ORE = new BlockBaseDropItems("diamond_ore", Material.ROCK, 1, "minecraft:diamond",0, 1, 1, 2, 1);
    public static final Block QUARTZ_ORE = new BlockBaseDropItems("quartz_ore", Material.ROCK, 1, "minecraft:quartz",0, 2, 5, 2, 1);
    public static final Block LAPIS_ORE = new BlockBaseDropItems("lapis_ore", Material.ROCK, 1, "minecraft:dye",4, 4, 5, 2, 1);

    /*ores with the same drop as their block*/
    public static final Block ALUMINIUM_ORE = new BlockBase("aluminium_ore", Material.ROCK,2, 1 );
    public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK,2, 1 );
    public static final Block IRIDIUM_ORE = new BlockBase("iridium_ore", Material.ROCK,2, 1 );
    public static final Block LEAD_ORE = new BlockBase("lead_ore", Material.ROCK,2, 1 );
    public static final Block MITHRIL_ORE = new BlockBase("mithril_ore", Material.ROCK,2, 1 );
    public static final Block NICKEL_ORE = new BlockBase("nickel_ore", Material.ROCK,2, 1 );
    public static final Block PLATINUM_ORE = new BlockBase("platinum_ore", Material.ROCK,2, 1 );
    public static final Block SILVER_ORE = new BlockBase("silver_ore", Material.ROCK,2, 1 );
    public static final Block TIN_ORE = new BlockBase("tin_ore", Material.ROCK,2, 1 );
    public static final Block GOLD_ORE = new BlockBase("gold_ore", Material.ROCK,2, 1 );
    public static final Block IRON_ORE = new BlockBase("iron_ore", Material.ROCK,2, 1 );

   public static Block SKYROOT_SAPLING;
   public static Block GREATROOT_SAPLING;
   public static Block WISPROOT_SAPLING;
   public static Block UNIQUE_SAPLING;

   public static Block AMBERROOT_LEAVES;
   public static Block BLUE_DARK_SKYROOT_LEAVES;
   public static Block BLUE_LIGHT_SKYROOTLEAVES;
   public static Block BLUE_SKYROOT_LEAVES;
   public static Block DARK_BLUE_DARK_SKYROOT_LEAVES;
   public static Block DARK_BLUE_LIGHT_SKYROOT_LEAVES;
   public static Block DARK_BLUE_SKYROOT_LEAVES;
   public static Block GREEN_DARK_SKYROOT_LEAVES;
   public static Block GREEN_LIGHT_SKYROOT_LEAVES;
   public static Block GREEN_SKYROOOT_LEAVES;
   public static Block MUTANT_LEAVES;
   public static Block MUTANT_LEAVES_DECORATED;

   public static Block ARTIC_SPIKESPRING;
   public static Block BARKSHROOM;
   public static Block BLUE_SWINGTIP;
   public static Block AETHER_FLOWER;
   public static Block FORGOTTEN_ROSE;
   public static Block GREEN_SWINGTIP;
   public static Block HIGHLANDS_TULIPS;
   public static Block IRRADIATED_FLOWER;
   public static Block MAGNETIC_SHROOM;
   public static Block NEVERBLOOM;
   public static Block PINK_SWINGTIP;
   public static Block QUICKSHOOT;
   public static Block STONESHRROM;



}
