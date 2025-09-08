package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FleshCoveringProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			FleshConversionProcedure.execute(world, x, y, z);
			FleshConversionProcedure.execute(world, (x - 1), y, z);
			FleshConversionProcedure.execute(world, (x + 1), y, z);
			FleshConversionProcedure.execute(world, x, (y - 1), z);
			FleshConversionProcedure.execute(world, x, (y + 1), z);
			FleshConversionProcedure.execute(world, x, y, (z - 1));
			FleshConversionProcedure.execute(world, x, y, (z + 1));
		}
	}
}
