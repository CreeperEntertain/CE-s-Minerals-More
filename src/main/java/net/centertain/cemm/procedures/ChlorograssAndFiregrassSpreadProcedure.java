package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ChlorograssAndFiregrassSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Rand = 0;
		double Chance = 0;
		Chance = 0.25;
		Rand = Math.random();
		if (Rand <= Chance) {
			CAFSxPosProcedure.execute(world, x, y, z);
		}
		if (Rand <= Chance) {
			CAFSxNegProcedure.execute(world, x, y, z);
		}
		if (Rand <= Chance) {
			CAFSzPosProcedure.execute(world, x, y, z);
		}
		if (Rand <= Chance) {
			CAFSzNegProcedure.execute(world, x, y, z);
		}
	}
}
