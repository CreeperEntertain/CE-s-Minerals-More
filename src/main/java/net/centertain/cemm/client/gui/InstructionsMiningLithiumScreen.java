package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.centertain.cemm.world.inventory.InstructionsMiningLithiumMenu;
import net.centertain.cemm.network.InstructionsMiningLithiumButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class InstructionsMiningLithiumScreen extends AbstractContainerScreen<InstructionsMiningLithiumMenu> {
	private final static HashMap<String, Object> guistate = InstructionsMiningLithiumMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_back;

	public InstructionsMiningLithiumScreen(InstructionsMiningLithiumMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 450;
		this.imageHeight = 250;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/z_screen_lithium.png"), this.leftPos + 25, this.topPos + 19, 0, 0, 400, 200, 400, 200);

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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_back = new ImageButton(this.leftPos + 398, this.topPos + 205, 32, 32, 0, 0, 32, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_back.png"), 32, 64, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningLithiumButtonMessage(0, x, y, z));
				InstructionsMiningLithiumButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_back", imagebutton_back);
		this.addRenderableWidget(imagebutton_back);
	}
}
