package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

import net.centertain.cemm.network.CemmModVariables;

public class VIButton1ExecuteProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "cesium_pellet";
			entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.vacuumizerInstructionsRecipe = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
