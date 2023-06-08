package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.centertain.cemm.world.inventory.CoalGeneratorInterfaceMenu;
import net.centertain.cemm.procedures.Overlay9Procedure;
import net.centertain.cemm.procedures.Overlay8Procedure;
import net.centertain.cemm.procedures.Overlay89Procedure;
import net.centertain.cemm.procedures.Overlay88Procedure;
import net.centertain.cemm.procedures.Overlay87Procedure;
import net.centertain.cemm.procedures.Overlay86Procedure;
import net.centertain.cemm.procedures.Overlay85Procedure;
import net.centertain.cemm.procedures.Overlay84Procedure;
import net.centertain.cemm.procedures.Overlay83Procedure;
import net.centertain.cemm.procedures.Overlay82Procedure;
import net.centertain.cemm.procedures.Overlay81Procedure;
import net.centertain.cemm.procedures.Overlay80Procedure;
import net.centertain.cemm.procedures.Overlay7Procedure;
import net.centertain.cemm.procedures.Overlay79Procedure;
import net.centertain.cemm.procedures.Overlay78Procedure;
import net.centertain.cemm.procedures.Overlay76Procedure;
import net.centertain.cemm.procedures.Overlay75Procedure;
import net.centertain.cemm.procedures.Overlay74Procedure;
import net.centertain.cemm.procedures.Overlay73Procedure;
import net.centertain.cemm.procedures.Overlay72Procedure;
import net.centertain.cemm.procedures.Overlay71Procedure;
import net.centertain.cemm.procedures.Overlay70Procedure;
import net.centertain.cemm.procedures.Overlay6Procedure;
import net.centertain.cemm.procedures.Overlay69Procedure;
import net.centertain.cemm.procedures.Overlay68Procedure;
import net.centertain.cemm.procedures.Overlay67Procedure;
import net.centertain.cemm.procedures.Overlay66Procedure;
import net.centertain.cemm.procedures.Overlay65Procedure;
import net.centertain.cemm.procedures.Overlay64Procedure;
import net.centertain.cemm.procedures.Overlay63Procedure;
import net.centertain.cemm.procedures.Overlay62Procedure;
import net.centertain.cemm.procedures.Overlay61Procedure;
import net.centertain.cemm.procedures.Overlay60Procedure;
import net.centertain.cemm.procedures.Overlay5Procedure;
import net.centertain.cemm.procedures.Overlay59Procedure;
import net.centertain.cemm.procedures.Overlay58Procedure;
import net.centertain.cemm.procedures.Overlay57Procedure;
import net.centertain.cemm.procedures.Overlay56Procedure;
import net.centertain.cemm.procedures.Overlay55Procedure;
import net.centertain.cemm.procedures.Overlay54Procedure;
import net.centertain.cemm.procedures.Overlay53Procedure;
import net.centertain.cemm.procedures.Overlay52Procedure;
import net.centertain.cemm.procedures.Overlay51Procedure;
import net.centertain.cemm.procedures.Overlay50Procedure;
import net.centertain.cemm.procedures.Overlay4Procedure;
import net.centertain.cemm.procedures.Overlay49Procedure;
import net.centertain.cemm.procedures.Overlay48Procedure;
import net.centertain.cemm.procedures.Overlay47Procedure;
import net.centertain.cemm.procedures.Overlay46Procedure;
import net.centertain.cemm.procedures.Overlay45Procedure;
import net.centertain.cemm.procedures.Overlay44Procedure;
import net.centertain.cemm.procedures.Overlay43Procedure;
import net.centertain.cemm.procedures.Overlay42Procedure;
import net.centertain.cemm.procedures.Overlay41Procedure;
import net.centertain.cemm.procedures.Overlay40Procedure;
import net.centertain.cemm.procedures.Overlay3Procedure;
import net.centertain.cemm.procedures.Overlay39Procedure;
import net.centertain.cemm.procedures.Overlay38Procedure;
import net.centertain.cemm.procedures.Overlay37Procedure;
import net.centertain.cemm.procedures.Overlay36Procedure;
import net.centertain.cemm.procedures.Overlay35Procedure;
import net.centertain.cemm.procedures.Overlay34Procedure;
import net.centertain.cemm.procedures.Overlay33Procedure;
import net.centertain.cemm.procedures.Overlay32Procedure;
import net.centertain.cemm.procedures.Overlay31Procedure;
import net.centertain.cemm.procedures.Overlay30Procedure;
import net.centertain.cemm.procedures.Overlay2Procedure;
import net.centertain.cemm.procedures.Overlay29Procedure;
import net.centertain.cemm.procedures.Overlay28Procedure;
import net.centertain.cemm.procedures.Overlay27Procedure;
import net.centertain.cemm.procedures.Overlay26Procedure;
import net.centertain.cemm.procedures.Overlay25Procedure;
import net.centertain.cemm.procedures.Overlay24Procedure;
import net.centertain.cemm.procedures.Overlay23Procedure;
import net.centertain.cemm.procedures.Overlay22Procedure;
import net.centertain.cemm.procedures.Overlay21Procedure;
import net.centertain.cemm.procedures.Overlay20Procedure;
import net.centertain.cemm.procedures.Overlay1Procedure;
import net.centertain.cemm.procedures.Overlay19Procedure;
import net.centertain.cemm.procedures.Overlay18Procedure;
import net.centertain.cemm.procedures.Overlay17Procedure;
import net.centertain.cemm.procedures.Overlay16Procedure;
import net.centertain.cemm.procedures.Overlay15Procedure;
import net.centertain.cemm.procedures.Overlay14Procedure;
import net.centertain.cemm.procedures.Overlay13Procedure;
import net.centertain.cemm.procedures.Overlay12Procedure;
import net.centertain.cemm.procedures.Overlay11Procedure;
import net.centertain.cemm.procedures.Overlay10Procedure;
import net.centertain.cemm.procedures.Overay77Procedure;
import net.centertain.cemm.procedures.EnergyValueProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CoalGeneratorInterfaceScreen extends AbstractContainerScreen<CoalGeneratorInterfaceMenu> {
	private final static HashMap<String, Object> guistate = CoalGeneratorInterfaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CoalGeneratorInterfaceScreen(CoalGeneratorInterfaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 186;
	}

	private static final ResourceLocation texture = new ResourceLocation("cemm:textures/screens/coal_generator_interface.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar.png"));
		this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);

		if (Overlay1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_1.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_2.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_3.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_4.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_5.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_6.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_7.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_8.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_9.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_10.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_11.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay12Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_12.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_13.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay14Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_14.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay15Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_15.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay16Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_16.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay17Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_17.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay18Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_18.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay19Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_19.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay20Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay20.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay21Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay21.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay22Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay22.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay23Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay23.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay24Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay24.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay25Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay25.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay26Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay26.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay27Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay27.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay28Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay28.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay29Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay29.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay30Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay30.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay31Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay31.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay32Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay32.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay33Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay33.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay34Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay34.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay35Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay35.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay36Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay36.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay37Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay37.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay38Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay38.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay39Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay39.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay40Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay40.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay41Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay41.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay42Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay42.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay43Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay43.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay44Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay44.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay45Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay45.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay46Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay46.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay47Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay47.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay48Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay48.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay49Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay49.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay50Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay50.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay51Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay51.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay52Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay52.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay53Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay53.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay54Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay54.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay55Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay55.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay56Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay56.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay57Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay57.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay58Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay58.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay59Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay59.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay60Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay60.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay61Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay61.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay62Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay62.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay63Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay63.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay64Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay64.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay65Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay65.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay66Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay66.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay67Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay67.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay68Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay68.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay69Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay69.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay70Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay70.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay71Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay71.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay72Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay72.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay73Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay73.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay74Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay74.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay75Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay75.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay76Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay76.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overay77Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay77.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay78Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay78.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay79Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay79.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay80Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay80.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay81Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay81.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay82Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay82.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay83Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay83.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay84Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay84.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay85Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay85.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay86Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay86.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay87Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay87.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay88Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay88.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}
		if (Overlay89Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay89.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/bar_overlay_top.png"));
		this.blit(ms, this.leftPos + 7, this.topPos + 90, 0, 0, 182, 5, 182, 5);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/crusher.png"));
		this.blit(ms, this.leftPos + 49, this.topPos + 58, 0, 0, 30, 10, 30, 10);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/crusher.png"));
		this.blit(ms, this.leftPos + 121, this.topPos + 58, 0, 0, 30, 10, 30, 10);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/coal.png"));
		this.blit(ms, this.leftPos + 55, this.topPos + 7, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/charcoal.png"));
		this.blit(ms, this.leftPos + 127, this.topPos + 7, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/input_overlay_4x20.png"));
		this.blit(ms, this.leftPos + 61, this.topPos + 23, 0, 0, 4, 20, 4, 20);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/input_overlay_4x20.png"));
		this.blit(ms, this.leftPos + 133, this.topPos + 23, 0, 0, 4, 20, 4, 20);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/horizontal_connection_56x6.png"));
		this.blit(ms, this.leftPos + 71, this.topPos + 48, 0, 0, 56, 6, 56, 6);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/output_overlay_6x20.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 53, 0, 0, 6, 20, 6, 20);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.cemm.coal_generator_interface.label_energy_level_energy"), 7, 75, -12829636);
		this.font.draw(poseStack,

				EnergyValueProcedure.execute(world, entity), 79, 75, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
