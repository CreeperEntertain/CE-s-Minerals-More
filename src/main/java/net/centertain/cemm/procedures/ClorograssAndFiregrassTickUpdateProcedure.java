package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ClorograssAndFiregrassTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ChlorograssAndFiregrassSpreadProcedure.execute(world, x, y, z);
		ChlorograssRottingProcedure.execute(world, x, y, z);
		FiregrassRottingProcedure.execute(world, x, y, z);
		if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
			ChlorograssPlantGenerationProcedure.execute(world, x, y, z);
		}
		if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
			FiregrassPlantGenerationProcedure.execute(world, x, y, z);
		}
	}
}
