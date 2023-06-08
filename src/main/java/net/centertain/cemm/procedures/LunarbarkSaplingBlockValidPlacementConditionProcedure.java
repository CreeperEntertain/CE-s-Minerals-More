package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class LunarbarkSaplingBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.NYLINE.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.META_CARBONITE.get()) {
			return true;
		}
		return false;
	}
}
