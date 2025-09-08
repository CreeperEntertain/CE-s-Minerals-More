package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ChlorograssTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ChlorograssRottingProcedure.execute(world, x, y, z);
		ChlorograssPlantGenerationProcedure.execute(world, x, y, z);
		ChlorograssSpreadProcedure.execute(world, (x - 1), y, z);
		ChlorograssSpreadProcedure.execute(world, (x + 1), y, z);
		ChlorograssSpreadProcedure.execute(world, x, y, (z - 1));
		ChlorograssSpreadProcedure.execute(world, x, y, (z + 1));
	}
}
