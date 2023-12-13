package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

import net.centertain.cemm.network.CemmModVariables;

public class GoalCheckText8Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal8;
	}
}
