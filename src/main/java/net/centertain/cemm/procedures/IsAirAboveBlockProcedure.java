package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class IsAirAboveBlockProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR) {
			return true;
		}
		return false;
	}
}
