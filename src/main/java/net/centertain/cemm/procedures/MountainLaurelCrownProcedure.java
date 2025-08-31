package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MountainLaurelCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MountainLaurelCrownLayerTProcedure.execute(world, x, (y - 1), z);
		MountainLaurelCrownLayerWProcedure.execute(world, x, y, z);
		MountainLaurelCrownLayerTProcedure.execute(world, x, (y + 1), z);
	}
}
