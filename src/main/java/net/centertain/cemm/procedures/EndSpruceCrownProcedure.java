package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class EndSpruceCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		EndSpruceCrownLayer0Procedure.execute(world, x, y, z);
		EndSpruceCrownLayer1Procedure.execute(world, x, (y + 1), z);
	}
}
