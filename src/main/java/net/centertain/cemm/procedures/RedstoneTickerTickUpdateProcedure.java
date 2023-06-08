package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RedstoneTickerTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos(x, y, z)) : false) || (world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos(x, y + 1, z)) : false)) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.REDSTONE_TICKER.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.REDSTONE_TICKER_ON.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.REDSTONE_TICKER_ON.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.REDSTONE_TICKER.get().defaultBlockState(), 3);
			}
		}
	}
}
