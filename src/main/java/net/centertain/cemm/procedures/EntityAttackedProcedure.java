package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModMobEffects;
import net.centertain.cemm.init.CemmModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityAttackedProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, damagesource, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CemmModItems.BRIMSTONE.get()
				|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CemmModItems.BRIMSTONE.get()) {
			entity.setSecondsOnFire(15);
		}
		if ((ForgeRegistries.ENTITY_TYPES.getKey(sourceentity.getType()).toString()).equals("cemm:ash_wanderer")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CemmModMobEffects.BLEEDING.get(), 1000000, 3, false, true));
		}
		if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("cemm:gnawing")))) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker_fangs.attack")), SoundSource.BLOCKS, (float) 0.85, (float) (1 + (Math.random() - 0.5) * 0.1));
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker_fangs.attack")), SoundSource.BLOCKS, (float) 0.85, (float) (1 + (Math.random() - 0.5) * 0.1), false);
				}
			}
		}
	}
}
