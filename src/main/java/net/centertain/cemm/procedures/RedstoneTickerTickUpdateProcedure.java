package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RedstoneTickerTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level0 && _level0.hasNeighborSignal(BlockPos.containing(x, y, z)) || world instanceof Level _level1 && _level1.hasNeighborSignal(BlockPos.containing(x, y + 1, z))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.REDSTONE_TICKER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.REDSTONE_TICKER_ON.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.REDSTONE_TICKER_ON.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.REDSTONE_TICKER.get().defaultBlockState(), 3);
			}
		}
	}
}
