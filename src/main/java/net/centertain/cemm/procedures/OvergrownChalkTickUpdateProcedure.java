package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class OvergrownChalkTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		GrassblockGrassRegrowthProcedure.execute(world, x, y, z);
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRASSED_CHALK.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHALK.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRASSED_LIMESTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.LIMESTONE.get().defaultBlockState(), 3);
			}
		}
	}
}
