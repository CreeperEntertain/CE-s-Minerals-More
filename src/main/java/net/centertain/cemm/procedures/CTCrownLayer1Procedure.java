package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CTCrownLayer1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (true) {
			if (Math.random() <= 0.25) {
				CanPlaceChlorowoodLeavesProcedure.execute(world, (x + -2), y, (z + -2));
			}
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + -2), y, (z + -1));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + -2), y, (z + 0));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + -2), y, (z + 1));
			if (Math.random() <= 0.25) {
				CanPlaceChlorowoodLeavesProcedure.execute(world, (x + -2), y, (z + 2));
			}
		}
		if (true) {
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + -1), y, (z + -2));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + -1), y, (z + -1));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + -1), y, (z + 0));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + -1), y, (z + 1));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + -1), y, (z + 2));
		}
		if (true) {
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 0), y, (z + -2));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 0), y, (z + -1));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 0), y, (z + 0));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 0), y, (z + 1));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 0), y, (z + 2));
		}
		if (true) {
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 1), y, (z + -2));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 1), y, (z + -1));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 1), y, (z + 0));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 1), y, (z + 1));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 1), y, (z + 2));
		}
		if (true) {
			if (Math.random() <= 0.25) {
				CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 2), y, (z + -2));
			}
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 2), y, (z + -1));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 2), y, (z + 0));
			CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 2), y, (z + 1));
			if (Math.random() <= 0.25) {
				CanPlaceChlorowoodLeavesProcedure.execute(world, (x + 2), y, (z + 2));
			}
		}
	}
}
