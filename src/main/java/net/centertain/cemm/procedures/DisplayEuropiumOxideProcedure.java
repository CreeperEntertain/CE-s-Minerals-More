package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

import net.centertain.cemm.network.CemmModVariables;

public class DisplayEuropiumOxideProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).electrolyzerInstructionsRecipe).equals("europium_oxide")) {
			return true;
		}
		return false;
	}
}
