package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

public class SaveInteractedBlockPositionToPlayerProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("interactedBlockX", x);
		entity.getPersistentData().putDouble("interactedBlockY", y);
		entity.getPersistentData().putDouble("interactedBlockZ", z);
	}
}
