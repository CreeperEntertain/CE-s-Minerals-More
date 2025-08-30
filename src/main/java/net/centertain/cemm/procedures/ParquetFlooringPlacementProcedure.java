package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ParquetFlooringPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			return true;
		}
		return false;
	}
}
