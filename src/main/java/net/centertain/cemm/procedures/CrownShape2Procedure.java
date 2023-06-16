package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CrownShape2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CS2Layer0Procedure.execute(world, x, (y + 0), z);
		CS2Layer1Procedure.execute(world, x, (y + 1), z);
		CS2Layer2Procedure.execute(world, x, (y + 2), z);
	}
}
