
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.centertain.cemm.client.model.ModelRedSkeleton;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CemmModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelRedSkeleton.LAYER_LOCATION, ModelRedSkeleton::createBodyLayer);
	}
}
