package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

public class BrimstoneEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
