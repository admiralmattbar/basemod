package org.gsa.basemod.itemclasses;

import java.util.List;

import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockProperties;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ItemBalls2U extends Item implements IBlockProperties{
	public boolean canMessage = true;
	public int count = 0;
	
	public ItemBalls2U(){
		setRegistryName("item_balls2u");
		setUnlocalizedName("balls2u");
		setCreativeTab(CreativeTabs.MISC);
	}

	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		
		ItemStack itemstack = player.getHeldItem(hand);
		
		if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
        {
			player.sendMessage(new TextComponentString("Not canPlayerEdit"));
            return EnumActionResult.FAIL;
        }
		else
		{
        	if (worldIn.getBlockState(pos).getMaterial() == Material.WATER){
        		int random = (int)Math.random()*50+1;
        		player.sendMessage(new TextComponentString(Double.toString(random)));
        		if(random <=45){
        			this.setBlock(itemstack, player, worldIn, pos, Blocks.ICE.getDefaultState());
        			return EnumActionResult.SUCCESS;
        		}else{
        			this.setBlock(itemstack, player, worldIn, pos, Blocks.LAVA.getDefaultState());
        			return EnumActionResult.SUCCESS;
        		}
        	}
        	player.sendMessage(new TextComponentString("I guess nothing happened."));
            return EnumActionResult.PASS;
        }
    }
	
	protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        
        if (!worldIn.isRemote)
        {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(0, player);
        }
    }
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		if(count == 0 && canMessage == true){
			playerIn.sendMessage(new TextComponentString("Balls to you!"));
			canMessage = false;
			count = 1;
			return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
		} else {
			if(count == 1 && canMessage == true){
				playerIn.sendMessage(new TextComponentString("No, sir, balls to you!")); 
				canMessage=false;
				count = 2;
				return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
			}else{
				if(count == 2 && canMessage == true){
					playerIn.sendMessage(new TextComponentString("Oh, I insist, balls to you!")); 
					canMessage=false;
					count = 0;
					return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
				}
			}
		}
		canMessage = true;
        return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }

	@Override
	public Material getMaterial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFullBlock() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canEntitySpawn(Entity entityIn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLightOpacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLightOpacity(IBlockAccess world, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLightValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLightValue(IBlockAccess world, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isTranslucent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean useNeighborBrightness() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MapColor getMapColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBlockState withRotation(Rotation rot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBlockState withMirror(Mirror mirrorIn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFullCube() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasCustomBreakingProgress() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EnumBlockRenderType getRenderType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPackedLightmapCoords(IBlockAccess source, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getAmbientOcclusionLightValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBlockNormalCube() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isNormalCube() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canProvidePower() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getWeakPower(IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasComparatorInputOverride() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getComparatorInputOverride(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getBlockHardness(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getPlayerRelativeBlockHardness(EntityPlayer player, World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStrongPower(IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EnumPushReaction getMobilityFlag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBlockState getActualState(IBlockAccess blockAccess, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AxisAlignedBB getSelectedBoundingBox(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, BlockPos pos, EnumFacing facing) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockAccess worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCollisionBoxToList(World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185908_6_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockAccess blockAccess, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RayTraceResult collisionRayTrace(World worldIn, BlockPos pos, Vec3d start, Vec3d end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFullyOpaque() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doesSideBlockRendering(IBlockAccess world, BlockPos pos, EnumFacing side) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSideSolid(IBlockAccess world, BlockPos pos, EnumFacing side) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vec3d getOffset(IBlockAccess access, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean causesSuffocation() {
		// TODO Auto-generated method stub
		return false;
	}
}
