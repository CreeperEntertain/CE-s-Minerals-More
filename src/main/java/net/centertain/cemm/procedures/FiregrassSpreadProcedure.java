package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FiregrassSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FiregrassBlockConversionProcedure.execute(world, x, (y + 1), z);
		FiregrassBlockConversionProcedure.execute(world, x, y, z);
		FiregrassBlockConversionProcedure.execute(world, x, (y - 1), z);
		FiregrassBlockConversionProcedure.execute(world, x, (y - 2), z);
	}
}
