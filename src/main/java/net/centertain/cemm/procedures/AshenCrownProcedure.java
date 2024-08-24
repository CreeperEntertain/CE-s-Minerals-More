package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class AshenCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 1 - 1 / 3) {
			if (Math.random() <= 0.6) {
				PlaceAshenLeafProcedure.execute(world, (x - 2), y, (z - 1));
			}
			if (Math.random() <= 0.6) {
				PlaceAshenLeafProcedure.execute(world, (x - 2), y, z);
			}
			if (Math.random() <= 0.6) {
				PlaceAshenLeafProcedure.execute(world, (x - 2), y, (z + 1));
			}
			if (Math.random() <= 0.6) {
				PlaceAshenLeafProcedure.execute(world, (x - 1), y, (z - 2));
			}
			PlaceAshenLeafProcedure.execute(world, (x - 1), y, (z - 1));
			PlaceAshenLeafProcedure.execute(world, (x - 1), y, z);
			PlaceAshenLeafProcedure.execute(world, (x - 1), y, (z + 1));
			if (Math.random() <= 0.6) {
				PlaceAshenLeafProcedure.execute(world, (x - 1), y, (z + 2));
			}
			if (Math.random() <= 0.6) {
				PlaceAshenLeafProcedure.execute(world, x, y, (z - 2));
			}
			PlaceAshenLeafProcedure.execute(world, x, y, (z - 1));
			PlaceAshenLeafProcedure.execute(world, x, y, (z + 1));
			if (Math.random() <= 0.6) {
				PlaceAshenLeafProcedure.execute(world, x, y, (z + 2));
			}
			if (Math.random() <= 0.6) {
				PlaceAshenLeafProcedure.execute(world, (x + 1), y, (z - 2));
			}
			PlaceAshenLeafProcedure.execute(world, (x + 1), y, (z - 1));
			PlaceAshenLeafProcedure.execute(world, (x + 1), y, z);
			PlaceAshenLeafProcedure.execute(world, (x + 1), y, (z + 1));
			if (Math.random() <= 0.6) {
				PlaceAshenLeafProcedure.execute(world, (x + 1), y, (z + 2));
			}
			PlaceAshenLeafProcedure.execute(world, (x + 2), y, (z - 1));
			PlaceAshenLeafProcedure.execute(world, (x + 2), y, z);
			PlaceAshenLeafProcedure.execute(world, (x + 2), y, (z + 1));
		}
	}
}
