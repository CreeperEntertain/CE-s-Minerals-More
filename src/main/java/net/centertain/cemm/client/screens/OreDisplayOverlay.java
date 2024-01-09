
package net.centertain.cemm.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.centertain.cemm.procedures.TimeDisplayDisplayConditionProcedure;
import net.centertain.cemm.procedures.OreDisplayVisibilityProcedure;
import net.centertain.cemm.procedures.OreDisplayBarProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class OreDisplayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (TimeDisplayDisplayConditionProcedure.execute(entity)) {
			if (OreDisplayVisibilityProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.cemm.ore_display.label_time"), posX + -207, posY + 97, -16737793, false);
			if (OreDisplayVisibilityProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						OreDisplayBarProcedure.execute(world, x, y, z, entity), posX + -167, posY + 97, -1, false);
		}
	}
}
