package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CrownShape3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CS3Layer0Procedure.execute(world, x, (y + 0), z);
		CS3Layer1Procedure.execute(world, x, (y + 1), z);
		CS3Layer2Procedure.execute(world, x, (y + 2), z);
		CS3Layer3Procedure.execute(world, x, (y + 3), z);
		CS3Layer4Procedure.execute(world, x, (y + 4), z);
	}
}
