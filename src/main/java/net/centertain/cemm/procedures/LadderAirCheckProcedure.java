package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LadderAirCheckProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude() && !world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude() && !world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude()
				&& !world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()) {
			return false;
		}
		return true;
	}
}
