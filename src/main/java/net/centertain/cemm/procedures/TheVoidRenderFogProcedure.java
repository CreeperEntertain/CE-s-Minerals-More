package net.centertain.cemm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import com.mojang.blaze3d.shaders.FogShape;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class TheVoidRenderFogProcedure {
	@SubscribeEvent
	public static void renderFog(ViewportEvent.RenderFog event) {
		try {
			if (event.getMode() == FogRenderer.FogMode.FOG_TERRAIN) {
				ClientLevel clientLevel = Minecraft.getInstance().level;
				Entity entity = event.getCamera().getEntity();
				execute(null, clientLevel, event);
				event.setCanceled(true);
			}
		} catch (Exception e) {
		}
	}

	public static void execute(LevelAccessor world, ViewportEvent viewport) {
		execute(null, world, viewport);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, ViewportEvent viewport) {
		if (viewport == null)
			return;
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("cemm:the_void")))) {
			if (viewport instanceof ViewportEvent.RenderFog _renderFog) {
				_renderFog.setNearPlaneDistance(50);
				_renderFog.setFarPlaneDistance(150);
			}
			if (viewport instanceof ViewportEvent.RenderFog _renderFog) {
				_renderFog.setFogShape(FogShape.SPHERE);
			}
		}
	}
}
