package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProcessedFramedGlassExplodedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.PROCESSED_ALUMINUM_FRAME.get().defaultBlockState(), 3);
	}
}
