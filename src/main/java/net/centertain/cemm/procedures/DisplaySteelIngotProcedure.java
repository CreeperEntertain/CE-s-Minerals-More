package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

import net.centertain.cemm.network.CemmModVariables;

public class DisplaySteelIngotProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).refineryInstructionsRecipe).equals("steel_ingot")) {
			return true;
		}
		return false;
	}
}
