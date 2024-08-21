package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class AmberSentinelCrownL2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		AmberSentinelPlacementConditionProcedure.execute(world, (x - 0), y, (z - 1));
		AmberSentinelPlacementConditionProcedure.execute(world, (x - 1), y, (z - 0));
		AmberSentinelPlacementConditionProcedure.execute(world, (x + 1), y, (z - 0));
		AmberSentinelPlacementConditionProcedure.execute(world, (x - 0), y, (z + 1));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x - 1), y, (z - 2));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x - 0), y, (z - 2));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x + 1), y, (z - 2));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x - 2), y, (z - 1));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x - 1), y, (z - 1));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x + 1), y, (z - 1));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x + 2), y, (z - 1));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x - 2), y, (z - 0));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x + 2), y, (z - 0));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x - 2), y, (z + 1));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x - 1), y, (z + 1));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x + 1), y, (z + 1));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x + 2), y, (z + 1));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x - 1), y, (z + 2));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x - 0), y, (z + 2));
		AmberSentielLeavesPlacementConditionRandomProcedure.execute(world, (x + 1), y, (z + 2));
	}
}
