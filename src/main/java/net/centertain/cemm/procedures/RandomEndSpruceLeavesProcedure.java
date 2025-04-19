package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RandomEndSpruceLeavesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() >= 0.025 && CanPlaceLeavesProcedure.execute(world, x, y, z)) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.END_SPRUCE_LEAVES.get().defaultBlockState(), 3);
		}
	}
}
