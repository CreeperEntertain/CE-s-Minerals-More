package net.centertain.cemm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.centertain.cemm.network.CemmModVariables;
import net.centertain.cemm.CemmMod;

import java.util.Optional;

public class JumpPadTriggerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 120, 0));
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 5), 2, (entity.getDeltaMovement().z() * 5)));
		if (world instanceof ServerLevel _level && _level.getServer() != null) {
			Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("cemm:jump_pad_sound"));
			if (_fopt.isPresent())
				_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
		}
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("cemm:leap_of_faith"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				for (String criteria : _ap.getRemainingCriteria())
					_player.getAdvancements().award(_adv, criteria);
			}
		}
		CemmMod.queueServerWork(10, () -> {
			{
				boolean _setval = true;
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.launched = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		});
	}
}
