package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

import net.centertain.cemm.network.CemmModVariables;

public class PIButton8ExecuteProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "raw_yttrium";
			entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.pressurizerInstructionsRecipe = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
