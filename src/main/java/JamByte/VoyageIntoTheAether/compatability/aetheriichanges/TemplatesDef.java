package JamByte.VoyageIntoTheAether.compatability.aetheriichanges;

import com.gildedgames.aether.api.world.templates.TemplateDefinition;
import com.gildedgames.aether.common.world.templates.conditions.TemplateConditions;
import com.gildedgames.orbis.lib.processing.CenterOffsetProcessor;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;

public class TemplatesDef {

        public static TemplateDefinition blue_skyroot_tree_1, blue_skyroot_tree_2, blue_skyroot_tree_3;

        public static TemplateDefinition green_skyroot_tree_1, green_skyroot_tree_2, green_skyroot_tree_3;

        public static TemplateDefinition green_skyroot_oak_1, green_skyroot_oak_2;

        public static TemplateDefinition golden_oak_1, golden_oak_2;

        public static TemplateDefinition green_skyroot_windswept_1, green_skyroot_windswept_2, green_skyroot_windswept_3, green_skyroot_windswept_4, green_skyroot_windswept_5, green_skyroot_windswept_6, green_skyroot_windswept_7;

        public static TemplateDefinition large_green_skyroot_pine_1, large_green_skyroot_pine_2;

        public static TemplateDefinition green_skyroot_pine_1, green_skyroot_pine_2, green_skyroot_pine_3, green_skyroot_pine_4, green_skyroot_pine_5;

        public static TemplateDefinition dark_blue_skyroot_tree_1, dark_blue_skyroot_tree_2, dark_blue_skyroot_tree_3;

        public static TemplateDefinition dark_blue_skyroot_oak_1, dark_blue_skyroot_oak_2;



        public static void load()
        {
            registerLegacyTemplates();
        }



        private static void registerLegacyTemplates()
        {
            blue_skyroot_tree_1 = new TemplateDefinition(Templates.blue_skyroot_tree_1)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            blue_skyroot_tree_2 = new TemplateDefinition(Templates.blue_skyroot_tree_2)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            blue_skyroot_tree_3 = new TemplateDefinition(Templates.blue_skyroot_tree_3)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);

            green_skyroot_tree_1 = new TemplateDefinition(Templates.green_skyroot_tree_1)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_tree_2 = new TemplateDefinition(Templates.green_skyroot_tree_2)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_tree_3 = new TemplateDefinition(Templates.green_skyroot_tree_3)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);

            final CenterOffsetProcessor oak_center = rotation ->
            {
                if (rotation == Rotation.CLOCKWISE_90)
                {
                    return new BlockPos(-1, 0, 0);
                }

                if (rotation == Rotation.COUNTERCLOCKWISE_90)
                {
                    return new BlockPos(0, 0, -1);
                }

                if (rotation == Rotation.CLOCKWISE_180)
                {
                    return new BlockPos(-1, 0, -1);
                }

                return new BlockPos(0, 0, 0);
            };

            green_skyroot_oak_1 = new TemplateDefinition(Templates.green_skyroot_oak_1)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY).setOffset(oak_center);
            green_skyroot_oak_2 = new TemplateDefinition(Templates.green_skyroot_oak_2)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY).setOffset(oak_center);

            golden_oak_1 = new TemplateDefinition(Templates.golden_oak_1).setConditions(TemplateConditions.REPLACEABLE_CANOPY).setOffset(oak_center);
            golden_oak_2 = new TemplateDefinition(Templates.golden_oak_2).setConditions(TemplateConditions.REPLACEABLE_CANOPY).setOffset(oak_center);

            dark_blue_skyroot_oak_1 = new TemplateDefinition(Templates.dark_blue_skyroot_oak_1)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY).setOffset(oak_center);
            dark_blue_skyroot_oak_2 = new TemplateDefinition(Templates.dark_blue_skyroot_oak_2)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY).setOffset(oak_center);

            green_skyroot_windswept_1 = new TemplateDefinition(Templates.green_skyroot_windswept_1)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_windswept_2 = new TemplateDefinition(Templates.green_skyroot_windswept_2)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_windswept_3 = new TemplateDefinition(Templates.green_skyroot_windswept_3)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_windswept_4 = new TemplateDefinition(Templates.green_skyroot_windswept_4)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_windswept_5 = new TemplateDefinition(Templates.green_skyroot_windswept_5)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_windswept_6 = new TemplateDefinition(Templates.green_skyroot_windswept_6)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_windswept_7 = new TemplateDefinition(Templates.green_skyroot_windswept_7)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);

            large_green_skyroot_pine_1 = new TemplateDefinition(Templates.large_green_skyroot_pine_1).setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            large_green_skyroot_pine_2 = new TemplateDefinition(Templates.large_green_skyroot_pine_2).setConditions(TemplateConditions.REPLACEABLE_CANOPY);

            green_skyroot_pine_1 = new TemplateDefinition(Templates.green_skyroot_pine_1)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_pine_2 = new TemplateDefinition(Templates.green_skyroot_pine_2)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_pine_3 = new TemplateDefinition(Templates.green_skyroot_pine_3)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_pine_4 = new TemplateDefinition(Templates.green_skyroot_pine_4)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            green_skyroot_pine_5 = new TemplateDefinition(Templates.green_skyroot_pine_5)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);

            dark_blue_skyroot_tree_1 = new TemplateDefinition(Templates.dark_blue_skyroot_tree_1)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            dark_blue_skyroot_tree_2 = new TemplateDefinition(Templates.dark_blue_skyroot_tree_2)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);
            dark_blue_skyroot_tree_3 = new TemplateDefinition(Templates.dark_blue_skyroot_tree_3)
                    .setConditions(TemplateConditions.REPLACEABLE_CANOPY);


        }



    }

