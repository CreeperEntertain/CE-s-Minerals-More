package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class StrawberryOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		StrawberryTickUpdateProcedure.execute(world, x, y, z);
		if (Math.random() <= 0.5) {
			StrawberryTickUpdateProcedure.execute(world, x, y, z);
		}
	}
}
