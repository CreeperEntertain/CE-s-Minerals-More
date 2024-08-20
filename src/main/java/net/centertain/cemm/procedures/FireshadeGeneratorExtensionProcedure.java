package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FireshadeGeneratorExtensionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ProceduralFireshadeTrunkProcedure.execute(world, x, y, z);
		return true;
	}
}
