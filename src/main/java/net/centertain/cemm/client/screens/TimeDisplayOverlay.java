
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

import net.centertain.cemm.procedures.TimeDisplayValueProcedure;
import net.centertain.cemm.procedures.TimeDisplayDisplayConditionProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class TimeDisplayOverlay {
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
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.cemm.time_display.label_time"), posX + -207, posY + 108, -103, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					TimeDisplayValueProcedure.execute(world), posX + -167, posY + 108, -1, false);
		}
	}
}
