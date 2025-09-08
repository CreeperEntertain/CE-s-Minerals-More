package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FiregrassTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FiregrassRottingProcedure.execute(world, x, y, z);
		FiregrassPlantGenerationProcedure.execute(world, x, y, z);
		FiregrassSpreadProcedure.execute(world, (x - 1), y, z);
		FiregrassSpreadProcedure.execute(world, (x + 1), y, z);
		FiregrassSpreadProcedure.execute(world, x, y, (z - 1));
		FiregrassSpreadProcedure.execute(world, x, y, (z + 1));
	}
}
