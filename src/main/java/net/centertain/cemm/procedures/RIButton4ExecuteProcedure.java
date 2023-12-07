package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

import net.centertain.cemm.network.CemmModVariables;

public class RIButton4ExecuteProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "decomposed_spodumene";
			entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.refineryInstructionsRecipe = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
