package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CrownShape1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CS1Layer0Procedure.execute(world, x, (y + 0), z);
		CS1Layer1Procedure.execute(world, x, (y + 1), z);
		CS1Layer2Procedure.execute(world, x, (y + 2), z);
		CS1Layer3Procedure.execute(world, x, (y + 3), z);
		CS1Layer4Procedure.execute(world, x, (y + 4), z);
	}
}
