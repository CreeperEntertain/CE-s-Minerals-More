package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class NylineSpreadingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))
				&& ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.NYLINE.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.NYLINE.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == CemmModBlocks.NYLINE.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == CemmModBlocks.NYLINE.get()
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == CemmModBlocks.NYLINE.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == CemmModBlocks.NYLINE.get())) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("cemm:void_forest"))) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.NYLINE.get().defaultBlockState(), 3);
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("cemm:void_pits"))) {
				if (Math.random() <= 0.1) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.NYLINE.get().defaultBlockState(), 3);
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("cemm:void_flats")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("cemm:void_pillars"))) {
				if (Math.random() <= 0.025) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.NYLINE.get().defaultBlockState(), 3);
				}
			} else {
				if (Math.random() <= 0.01) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.NYLINE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
