package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import net.centertain.cemm.network.CemmModVariables;

import java.util.HashMap;

public class ObjectiveAddButtonExecuteProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal1).isEmpty()) {
			{
				String _setval = guistate.containsKey("text:goalsetter") ? ((EditBox) guistate.get("text:goalsetter")).getValue() : "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal2).isEmpty()) {
			{
				String _setval = guistate.containsKey("text:goalsetter") ? ((EditBox) guistate.get("text:goalsetter")).getValue() : "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal3).isEmpty()) {
			{
				String _setval = guistate.containsKey("text:goalsetter") ? ((EditBox) guistate.get("text:goalsetter")).getValue() : "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal4).isEmpty()) {
			{
				String _setval = guistate.containsKey("text:goalsetter") ? ((EditBox) guistate.get("text:goalsetter")).getValue() : "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal4 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal5).isEmpty()) {
			{
				String _setval = guistate.containsKey("text:goalsetter") ? ((EditBox) guistate.get("text:goalsetter")).getValue() : "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal5 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal6).isEmpty()) {
			{
				String _setval = guistate.containsKey("text:goalsetter") ? ((EditBox) guistate.get("text:goalsetter")).getValue() : "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal6 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal7).isEmpty()) {
			{
				String _setval = guistate.containsKey("text:goalsetter") ? ((EditBox) guistate.get("text:goalsetter")).getValue() : "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal7 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal8).isEmpty()) {
			{
				String _setval = guistate.containsKey("text:goalsetter") ? ((EditBox) guistate.get("text:goalsetter")).getValue() : "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal8 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal9).isEmpty()) {
			{
				String _setval = guistate.containsKey("text:goalsetter") ? ((EditBox) guistate.get("text:goalsetter")).getValue() : "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal9 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).Goal10).isEmpty()) {
			{
				String _setval = guistate.containsKey("text:goalsetter") ? ((EditBox) guistate.get("text:goalsetter")).getValue() : "";
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Goal10 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
