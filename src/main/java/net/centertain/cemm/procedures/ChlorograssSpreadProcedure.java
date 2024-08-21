package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ChlorograssSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ChlorograssBlockConversionProcedure.execute(world, x, (y + 1), z);
		ChlorograssBlockConversionProcedure.execute(world, x, y, z);
		ChlorograssBlockConversionProcedure.execute(world, x, (y - 1), z);
		ChlorograssBlockConversionProcedure.execute(world, x, (y - 2), z);
	}
}
