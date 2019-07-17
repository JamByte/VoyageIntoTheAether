package JamByte.VoyageIntoTheAether.objects.block;

import JamByte.VoyageIntoTheAether.VoyageIntoTheAether;
import JamByte.VoyageIntoTheAether.init.BlockInit;
import JamByte.VoyageIntoTheAether.init.ItemInit;
import JamByte.VoyageIntoTheAether.util.IHasModel;
import com.legacy.aether.registry.creative_tabs.AetherCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class BlockBaseDropItems extends Block implements IHasModel {
    private String ItemDrop;
    private int Meta;
    private int Lowerbound;
    private int Higherbound;
    public BlockBaseDropItems(String name, Material material, float lightlevel, String itemdrop, int meta, int lowerbound, int higherbound, float hardness, int harvestlevel){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AetherCreativeTabs.blocks);
        setHarvestLevel("pickaxe", harvestlevel);
        setHardness(hardness);
        setLightLevel(lightlevel);
        ItemDrop=itemdrop;
        Lowerbound=lowerbound;
        Higherbound=higherbound;
        Meta=meta;
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Override
    public void registerModels() {
        VoyageIntoTheAether.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getByNameOrId(ItemDrop);
    }

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt((Higherbound-Lowerbound+1)) + Lowerbound;
    }
    @Override
    public int quantityDroppedWithBonus(int fortune,Random random) {
        return this.quantityDropped(random) + fortune;
    }
    @Override
    public int damageDropped(IBlockState state){
        return Meta;
    }

}
