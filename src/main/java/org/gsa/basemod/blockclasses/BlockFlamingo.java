package org.gsa.basemod.blockclasses;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BlockFlamingo extends Block {

    private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.625 * 7, 0, 0.625, 0.625 * 7, 0.625*8, 0.625*5);

    public BlockFlamingo(Material materialIn) {
        super(materialIn);
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean isFullCube(IBlockState state){
        return false;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

    @Override
    public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side){

        return false;
    }

    public boolean isFullBlock(){

        return false;

    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @SuppressWarnings("deprecation")
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){

        return BOUNDING_BOX;

    }

    @SuppressWarnings("deprecation")
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean p_185477_7_)
    {
        addCollisionBoxToList(pos, entityBox, collidingBoxes, BOUNDING_BOX);
    }


}
