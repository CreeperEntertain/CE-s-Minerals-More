package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WindsweptGeneratorExtensionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ProceduralWindsweptTrunkProcedure.execute(world, x, y, z);
		return true;
	}
}
