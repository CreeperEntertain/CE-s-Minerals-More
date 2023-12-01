package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ChalkLimestoneOvergrowingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CHALK.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRASSED_CHALK.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRASSED_LIMESTONE.get().defaultBlockState(), 3);
		}
	}
}
