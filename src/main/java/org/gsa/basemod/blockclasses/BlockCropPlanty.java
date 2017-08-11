package org.gsa.basemod.blockclasses;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.util.math.AxisAlignedBB;

public class BlockCropPlanty extends BlockCrops {

    public static final AxisAlignedBB[] KALE_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5425D, 1.0D)}
    public static final PropertyInteger KALE_AGE = PropertyInteger.create("age", 0, 2);

}
