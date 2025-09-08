package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class SiltTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.WARPED_SILT.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.ROCKY_WARPED_SILT.get()) {
			if (world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.DOWN)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.WARPED_SILT.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SILT.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.COARSE_SILT.get().defaultBlockState(), 3);
				}
			}
		} else {
			if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.DOWN)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SILT.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.WARPED_SILT.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.ROCKY_WARPED_SILT.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
