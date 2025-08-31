package net.centertain.cemm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.centertain.cemm.network.CemmModVariables;

public class TheVoidOnPortalTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (CemmModVariables.WorldVariables.get(world).voidPortalOpen == false) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"playsound block.end_portal.spawn master @a");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"tellraw @a {\"text\":\"The void has been breached. Beware its call.\",\"color\":\"blue\"}");
			CemmModVariables.WorldVariables.get(world).voidPortalOpen = true;
			CemmModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
