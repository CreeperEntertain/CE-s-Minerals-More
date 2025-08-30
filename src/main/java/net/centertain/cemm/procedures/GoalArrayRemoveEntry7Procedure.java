package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

import net.centertain.cemm.network.CemmModVariables;

public class GoalArrayRemoveEntry7Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal8).isEmpty()) {
			{
				String _setval = (entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal8;
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal7 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal9).isEmpty()) {
				{
					String _setval = (entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal9;
					entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Goal8 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (!((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal10).isEmpty()) {
					{
						String _setval = (entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal10;
						entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Goal9 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "";
						entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Goal10 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = "";
						entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Goal9 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				{
					String _setval = "";
					entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Goal8 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			{
				String _setval = "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal7 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
