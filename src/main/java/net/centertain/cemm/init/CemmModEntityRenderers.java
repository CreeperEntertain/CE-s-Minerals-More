
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.centertain.cemm.client.renderer.ShadowleechRenderer;
import net.centertain.cemm.client.renderer.ShadowWalkerRenderer;
import net.centertain.cemm.client.renderer.SaltleechRenderer;
import net.centertain.cemm.client.renderer.RedSkeletonRenderer;
import net.centertain.cemm.client.renderer.AshWandererRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CemmModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CemmModEntities.ASH_WANDERER.get(), AshWandererRenderer::new);
		event.registerEntityRenderer(CemmModEntities.SHADOWLEECH.get(), ShadowleechRenderer::new);
		event.registerEntityRenderer(CemmModEntities.SALTLEECH.get(), SaltleechRenderer::new);
		event.registerEntityRenderer(CemmModEntities.SHADOW_WALKER.get(), ShadowWalkerRenderer::new);
		event.registerEntityRenderer(CemmModEntities.RED_SKELETON.get(), RedSkeletonRenderer::new);
	}
}
