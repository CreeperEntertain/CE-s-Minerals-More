package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class CanPlaceChlorovinesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.AIR) {
			if (Math.random() <= 0.1) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.CHLOROVINES.get().defaultBlockState(), 3);
			}
		}
	}
}
