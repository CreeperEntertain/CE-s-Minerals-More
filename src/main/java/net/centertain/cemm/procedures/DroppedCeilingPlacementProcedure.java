package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class DroppedCeilingPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude() || world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()
				|| world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude() || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.DROPPED_CEILING.get()
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.DROPPED_CEILING.get() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.DROPPED_CEILING.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.DROPPED_CEILING.get() || world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			return true;
		}
		return false;
	}
}
