package net.centertain.cemm.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Iterator;

public class LaserEntityCollisionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double pitchVariation = 0;
		pitchVariation = 0.1;
		if (!(entity instanceof ItemEntity)) {
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
			entity.hurt(DamageSource.IN_FIRE, 2);
			entity.setSecondsOnFire(15);
		}
		if (!entity.isAlive() && (entity instanceof Player || entity instanceof ServerPlayer)) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("cemm:crispy"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
