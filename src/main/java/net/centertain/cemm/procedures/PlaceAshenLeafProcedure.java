package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class PlaceAshenLeafProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (TestIfAshenReplacableProcedure.execute(world, x, y, z)) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.ASHEN_LEAVES_0.get().defaultBlockState(), 3);
		}
	}
}
