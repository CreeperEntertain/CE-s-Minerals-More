package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class DeadSpiderSucculentBladesTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.SPIDER_SUCCULENT_BULB.get()) {
			world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.DEAD_SPIDER_SUCCULENT_BULB.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.SPIDER_SUCCULENT.get()) {
			world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.DEAD_SPIDER_SUCCULENT.get().defaultBlockState(), 3);
		}
	}
}
