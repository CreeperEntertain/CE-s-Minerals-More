package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ShootShulkerBulletProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double shootingDistance = 0;
		double velocityMultiplier = 0;
		shootingDistance = 1.8;
		velocityMultiplier = 2;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EntityType.SHULKER_BULLET.spawn(_level,
					BlockPos.containing(entity.getX() + entity.getLookAngle().x * shootingDistance, entity.getY() + 1.6 + entity.getLookAngle().y * shootingDistance, entity.getZ() + entity.getLookAngle().z * shootingDistance),
					MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement((entity.getLookAngle().x * velocityMultiplier), (entity.getLookAngle().y * velocityMultiplier), (entity.getLookAngle().z * velocityMultiplier));
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(entity.getX() + entity.getLookAngle().x * shootingDistance, entity.getY() + 1.6 + entity.getLookAngle().y * shootingDistance, entity.getZ() + entity.getLookAngle().z * shootingDistance),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.shulker.shoot")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound((entity.getX() + entity.getLookAngle().x * shootingDistance), (entity.getY() + 1.6 + entity.getLookAngle().y * shootingDistance), (entity.getZ() + entity.getLookAngle().z * shootingDistance),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.shulker.shoot")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.OFF_HAND, true);
		}
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
	}
}
