package org.gsa.basemod.itemclasses;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;

public class ItemSeedPlanty extends ItemSeeds implements IPlantable {

    private Block crops;
    private Block soilBlockID;


    public ItemSeedPlanty(Block crops, Block soil)
    {
        super(crops, soil);
        this.crops = crops;
        this.soilBlockID = soil;
    }

    @Override
    public IBlockState getPlant(IBlockAccess world, BlockPos pos)
    {
        return this.crops.getDefaultState();
    }

}
