package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.centertain.cemm.world.inventory.InstructionsVacuumizingMenu;
import net.centertain.cemm.procedures.DisplayEuropiumPelletProcedure;
import net.centertain.cemm.procedures.DisplayCesiumPelletProcedure;
import net.centertain.cemm.network.InstructionsVacuumizingButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
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
		this.imageWidth = 430;
		this.imageHeight = 240;
	}

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/vertical_line_225px.png"));
		this.blit(ms, this.leftPos + 162, this.topPos + 8, 0, 0, 1, 225, 1, 225);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/vacuumizer.png"));
		this.blit(ms, this.leftPos + 170, this.topPos + 8, 0, 0, 18, 18, 18, 18);

		if (DisplayCesiumPelletProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_cesium_pellet.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayEuropiumPelletProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_europium_pellet.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
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
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.cemm.instructions_vacuumizing.label_vacuumizer"), 189, 12, -1);
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
		imagebutton_button_cesium_pellet = new ImageButton(this.leftPos + 2, this.topPos + 1, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_cesium_pellet.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsVacuumizingButtonMessage(0, x, y, z));
				InstructionsVacuumizingButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_cesium_pellet", imagebutton_button_cesium_pellet);
		this.addRenderableWidget(imagebutton_button_cesium_pellet);
		imagebutton_button_europium_pellet = new ImageButton(this.leftPos + 2, this.topPos + 17, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_europium_pellet.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsVacuumizingButtonMessage(1, x, y, z));
				InstructionsVacuumizingButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_europium_pellet", imagebutton_button_europium_pellet);
		this.addRenderableWidget(imagebutton_button_europium_pellet);
		imagebutton_back = new ImageButton(this.leftPos + 388, this.topPos + 200, 32, 32, 0, 0, 32, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_back.png"), 32, 64, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsVacuumizingButtonMessage(2, x, y, z));
				InstructionsVacuumizingButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_back", imagebutton_back);
		this.addRenderableWidget(imagebutton_back);
	}
}
