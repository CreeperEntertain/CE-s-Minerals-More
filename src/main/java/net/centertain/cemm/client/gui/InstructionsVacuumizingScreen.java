package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.centertain.cemm.world.inventory.InstructionsVacuumizingMenu;
import net.centertain.cemm.procedures.DisplayEuropiumPelletProcedure;
import net.centertain.cemm.procedures.DisplayCesiumPelletProcedure;
import net.centertain.cemm.network.InstructionsVacuumizingButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class InstructionsVacuumizingScreen extends AbstractContainerScreen<InstructionsVacuumizingMenu> {
	private final static HashMap<String, Object> guistate = InstructionsVacuumizingMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button_cesium_pellet;
	ImageButton imagebutton_button_europium_pellet;
	ImageButton imagebutton_back;

	public InstructionsVacuumizingScreen(InstructionsVacuumizingMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_225px.png"), this.leftPos + 172, this.topPos + 13, 0, 0, 1, 225, 1, 225);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vacuumizer.png"), this.leftPos + 180, this.topPos + 13, 0, 0, 18, 18, 18, 18);

		if (DisplayCesiumPelletProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cemm:textures/screens/recipe_cesium_pellet.png"), this.leftPos + 205, this.topPos + 58, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayEuropiumPelletProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cemm:textures/screens/recipe_europium_pellet.png"), this.leftPos + 205, this.topPos + 58, 0, 0, 176, 96, 176, 96);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.instructions_vacuumizing.label_vacuumizer"), 199, 17, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_button_cesium_pellet = new ImageButton(this.leftPos + 12, this.topPos + 6, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_cesium_pellet.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsVacuumizingButtonMessage(0, x, y, z));
				InstructionsVacuumizingButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_cesium_pellet", imagebutton_button_cesium_pellet);
		this.addRenderableWidget(imagebutton_button_cesium_pellet);
		imagebutton_button_europium_pellet = new ImageButton(this.leftPos + 12, this.topPos + 22, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_europium_pellet.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsVacuumizingButtonMessage(1, x, y, z));
				InstructionsVacuumizingButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_europium_pellet", imagebutton_button_europium_pellet);
		this.addRenderableWidget(imagebutton_button_europium_pellet);
		imagebutton_back = new ImageButton(this.leftPos + 398, this.topPos + 205, 32, 32, 0, 0, 32, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_back.png"), 32, 64, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsVacuumizingButtonMessage(2, x, y, z));
				InstructionsVacuumizingButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_back", imagebutton_back);
		this.addRenderableWidget(imagebutton_back);
	}
}
