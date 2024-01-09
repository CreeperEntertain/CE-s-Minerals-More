
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.centertain.cemm.entity.ShadowleechEntity;
import net.centertain.cemm.entity.ShadowWalkerEntity;
import net.centertain.cemm.entity.SaltleechEntity;
import net.centertain.cemm.entity.RedSkeletonEntity;
import net.centertain.cemm.entity.AshWandererEntity;
import net.centertain.cemm.CemmMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CemmModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CemmMod.MODID);
	public static final RegistryObject<EntityType<AshWandererEntity>> ASH_WANDERER = register("ash_wanderer", EntityType.Builder.<AshWandererEntity>of(AshWandererEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AshWandererEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowleechEntity>> SHADOWLEECH = register("shadowleech", EntityType.Builder.<ShadowleechEntity>of(ShadowleechEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowleechEntity::new).fireImmune().sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<SaltleechEntity>> SALTLEECH = register("saltleech", EntityType.Builder.<SaltleechEntity>of(SaltleechEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(SaltleechEntity::new).fireImmune().sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<ShadowWalkerEntity>> SHADOW_WALKER = register("shadow_walker", EntityType.Builder.<ShadowWalkerEntity>of(ShadowWalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ShadowWalkerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RedSkeletonEntity>> RED_SKELETON = register("red_skeleton", EntityType.Builder.<RedSkeletonEntity>of(RedSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RedSkeletonEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AshWandererEntity.init();
			ShadowleechEntity.init();
			SaltleechEntity.init();
			ShadowWalkerEntity.init();
			RedSkeletonEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ASH_WANDERER.get(), AshWandererEntity.createAttributes().build());
		event.put(SHADOWLEECH.get(), ShadowleechEntity.createAttributes().build());
		event.put(SALTLEECH.get(), SaltleechEntity.createAttributes().build());
		event.put(SHADOW_WALKER.get(), ShadowWalkerEntity.createAttributes().build());
		event.put(RED_SKELETON.get(), RedSkeletonEntity.createAttributes().build());
	}
}
