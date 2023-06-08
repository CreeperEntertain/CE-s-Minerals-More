package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ChlorovinesOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y - 1, z), CemmModBlocks.CHLOROVINES.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z), CemmModBlocks.CHLOROVINES_PLANT.get().defaultBlockState(), 3);
	}
}
