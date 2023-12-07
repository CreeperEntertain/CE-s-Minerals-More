package net.centertain.cemm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.centertain.cemm.init.CemmModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LowGravityProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("cemm:icaron"))) && !(entity instanceof Player player && player.getAbilities().flying) && !entity.isNoGravity()
				&& !(entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(CemmModMobEffects.GRAVITY.get())) && !(entity instanceof LivingEntity _livEnt ? _livEnt.isFallFlying() : false)
				&& !(entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.SLOW_FALLING)) && !entity.isInWater() && !entity.isInLava()) {
			if (entity.getDeltaMovement().y() != 0) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (((entity.getDeltaMovement().y() / 0.98 + 0.08) - 0.02) * 0.98), (entity.getDeltaMovement().z())));
			}
			if (entity.onGround()) {
				entity.getPersistentData().putDouble("jumpGround", (entity.getY() - 2));
			} else {
				if (entity.getY() >= entity.getPersistentData().getDouble("jumpGround")) {
					entity.fallDistance = 0;
				}
			}
		}
	}
}
