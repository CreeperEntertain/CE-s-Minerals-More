package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ReplaceChlorograssUnderSaplingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.DIRT.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.STONE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.MOSS_BLOCK.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.ANDESITE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.GRANITE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.DIORITE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.TUFF.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.DRIPSTONE_BLOCK.defaultBlockState(), 3);
		}
	}
}
