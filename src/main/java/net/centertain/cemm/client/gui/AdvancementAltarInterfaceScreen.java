package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.centertain.cemm.world.inventory.AdvancementAltarInterfaceMenu;
import net.centertain.cemm.procedures.GetXPConsuptionAltarProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AdvancementAltarInterfaceScreen extends AbstractContainerScreen<AdvancementAltarInterfaceMenu> {
	private final static HashMap<String, Object> guistate = AdvancementAltarInterfaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AdvancementAltarInterfaceScreen(AdvancementAltarInterfaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("cemm:textures/screens/advancement_altar_interface.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/enchanted_book.png"));
		this.blit(ms, this.leftPos + 21, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/enchanted_book.png"));
		this.blit(ms, this.leftPos + 21, this.topPos + 56, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/primedust.png"));
		this.blit(ms, this.leftPos + 21, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/3-combination_64x46.png"));
		this.blit(ms, this.leftPos + 55, this.topPos + 20, 0, 0, 64, 46, 64, 46);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/ench.png"));
		this.blit(ms, this.leftPos + 93, this.topPos + 54, 0, 0, 9, 9, 9, 9);

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
		this.font.draw(poseStack,

				GetXPConsuptionAltarProcedure.execute(world, entity), 106, 54, -16738048);
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
