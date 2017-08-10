package org.gsa.basemod.blockclasses;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;


public class BlockClimber extends Block {


    protected static final AxisAlignedBB COLLISION_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
    protected static final AxisAlignedBB BOUNDING_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);

    public BlockClimber() {
        super(Material.ROCK);
    }

    @Override
    public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side) {
        return this.canPlaceBlockAt(worldIn, pos);
    }


    @Override
    public boolean isLadder(IBlockState state, IBlockAccess world, BlockPos pos, EntityLivingBase entity)
    {
        return true;

    }

    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return COLLISION_AABB;
    }

    public AxisAlignedBB getBoundingAabb(IBlockState blockState, IBlockAccess worldIn, BlockPos pos){

        return BOUNDING_AABB;
    }


}
