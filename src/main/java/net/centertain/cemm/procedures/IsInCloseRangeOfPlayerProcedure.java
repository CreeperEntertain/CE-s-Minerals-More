package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

public class IsInCloseRangeOfPlayerProcedure {
	public static boolean execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (Math.sqrt(Math.pow(x + entity.getX(), 2) + Math.pow(y + entity.getY(), 2) + Math.pow(z + entity.getZ(), 2)) <= 10) {
			return true;
		}
		return false;
	}
}
