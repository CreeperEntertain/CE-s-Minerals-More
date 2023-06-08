package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class CheckIfChloroOrFireProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get()) {
			return 1;
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.FIREGRASS_BLOCK_ANDESITE.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.FIREGRASS_BLOCK_DIRT.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.FIREGRASS_BLOCK_MOSS.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.FIREGRASS_BLOCK_STONE.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.FIREGRASS_BLOCK_TUFF.get()) {
			return 2;
		}
		return 0;
	}
}
