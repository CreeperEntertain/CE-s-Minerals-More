package net.centertain.cemm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
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

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class TheVoidRenderFogProcedure {
	public static ViewportEvent.RenderFog provider = null;

	public static void setDistance(float start, float end) {
		provider.setNearPlaneDistance(start);
		provider.setFarPlaneDistance(end);
		if (!provider.isCanceled()) {
			provider.setCanceled(true);
		}
	}

	public static void setShape(FogShape shape) {
		provider.setFogShape(shape);
		if (!provider.isCanceled()) {
			provider.setCanceled(true);
		}
	}

	@SubscribeEvent
	public static void renderFog(ViewportEvent.RenderFog event) {
		provider = event;
		if (provider.getMode() == FogRenderer.FogMode.FOG_TERRAIN) {
			ClientLevel level = Minecraft.getInstance().level;
			Entity entity = provider.getCamera().getEntity();
			if (level != null && entity != null) {
				Vec3 pos = entity.getPosition((float) provider.getPartialTick());
				execute(provider, level.dimension());
			}
		}
	}

	public static void execute(ResourceKey<Level> dimension) {
		execute(null, dimension);
	}

	private static void execute(@Nullable Event event, ResourceKey<Level> dimension) {
		if (dimension == null)
			return;
		if (dimension == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("cemm:the_void"))) {
			setDistance((float) (Minecraft.getInstance().gameRenderer.getRenderDistance() / 16), Minecraft.getInstance().gameRenderer.getRenderDistance());
			setShape(FogShape.SPHERE);
		}
	}
}
