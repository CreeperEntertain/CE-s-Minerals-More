package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MountainLaurelGeneratorExtensionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ProceduralMountainLaurelTrunkProcedure.execute(world, x, y, z);
		return true;
	}
}
