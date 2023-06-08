package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class NylineSpreadingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos(x, y + 1, z)) && ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CemmModBlocks.NYLINE.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CemmModBlocks.NYLINE.get()
				|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == CemmModBlocks.NYLINE.get()
				|| (world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == CemmModBlocks.NYLINE.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == CemmModBlocks.NYLINE.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == CemmModBlocks.NYLINE.get())) {
			if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("cemm:void_forest"))) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NYLINE.get().defaultBlockState(), 3);
			} else if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("cemm:void_pits"))) {
				if (Math.random() <= 0.1) {
					world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NYLINE.get().defaultBlockState(), 3);
				}
			} else if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("cemm:void_flats")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("cemm:void_pillars"))) {
				if (Math.random() <= 0.025) {
					world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NYLINE.get().defaultBlockState(), 3);
				}
			} else {
				if (Math.random() <= 0.01) {
					world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NYLINE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
