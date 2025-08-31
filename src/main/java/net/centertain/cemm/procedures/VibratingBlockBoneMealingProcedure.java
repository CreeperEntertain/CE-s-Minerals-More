package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class VibratingBlockBoneMealingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		VibratingBlockSpreadingProcedure.execute(world, (x - 1), y, z);
		VibratingBlockSpreadingProcedure.execute(world, (x + 1), y, z);
		VibratingBlockSpreadingProcedure.execute(world, x, y, (z - 1));
		VibratingBlockSpreadingProcedure.execute(world, x, y, (z + 1));
		VibratingBlockSpreadingProcedure.execute(world, (x - 1), (y - 1), z);
		VibratingBlockSpreadingProcedure.execute(world, (x - 1), (y + 1), z);
		VibratingBlockSpreadingProcedure.execute(world, (x + 1), (y - 1), z);
		VibratingBlockSpreadingProcedure.execute(world, (x + 1), (y + 1), z);
		VibratingBlockSpreadingProcedure.execute(world, x, (y - 1), (z - 1));
		VibratingBlockSpreadingProcedure.execute(world, x, (y + 1), (z - 1));
		VibratingBlockSpreadingProcedure.execute(world, x, (y - 1), (z + 1));
		VibratingBlockSpreadingProcedure.execute(world, x, (y + 1), (z + 1));
	}
}
