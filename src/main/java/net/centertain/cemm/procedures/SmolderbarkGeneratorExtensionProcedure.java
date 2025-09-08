package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class SmolderbarkGeneratorExtensionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ProceduralSmolderbarkTrunkProcedure.execute(world, x, y, z);
		return true;
	}
}
