package JamByte.VoyageIntoTheAether.world;

import com.gildedgames.aether.api.world.templates.PlacementConditionTemplate;
import com.gildedgames.aether.common.world.templates.conditions.TemplateConditions;
import com.gildedgames.orbis.lib.processing.IBlockAccessExtended;
import com.gildedgames.orbis.lib.util.mc.BlockUtil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.structure.template.Template;

import java.util.List;

public class test2 implements PlacementConditionTemplate {
    public boolean canPlace(Template template, IBlockAccessExtended world, BlockPos placedAt, Template.BlockInfo block) {

            return true;

    }
    public boolean canPlaceCheckAll(Template template, IBlockAccessExtended world, BlockPos placedAt, List<Template.BlockInfo> blocks) {
        return true;
    }
}
