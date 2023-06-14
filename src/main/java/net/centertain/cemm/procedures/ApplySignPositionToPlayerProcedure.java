package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

public class ApplySignPositionToPlayerProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("infoSignX", x);
		entity.getPersistentData().putDouble("infoSignY", y);
		entity.getPersistentData().putDouble("infoSignZ", z);
	}
}
