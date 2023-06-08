package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class AcidMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double pitchVariation = 0;
		pitchVariation = 0.1;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands()
						.performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level.getServer(), _ent),
								("playsound " + "minecraft:block.redstone_torch.burnout " + "master " + "@a " + "~0 " + "~0.5 " + "~0 " + "0.2 " + (1 - pitchVariation + Math.random() * 2 * pitchVariation) + " 0"));
			}
		}
		entity.hurt(DamageSource.WITHER, 4);
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), ("particle " + "minecraft:dust " + "1 " + "1 " + "1 " + "1 " + "~0 " + "~1 " + "~0 " + "0.25 " + "0.5 " + "0.25 " + "1 " + "20 " + "normal"));
			}
		}
	}
}
