package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.centertain.cemm.world.inventory.InstructionsMainMenu;
import net.centertain.cemm.network.InstructionsMainButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class InstructionsMainScreen extends AbstractContainerScreen<InstructionsMainMenu> {
	private final static HashMap<String, Object> guistate = InstructionsMainMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button_background_new;
	ImageButton imagebutton_button_background_new1;
	ImageButton imagebutton_button_background_new2;
	ImageButton imagebutton_button_background_new3;
	ImageButton imagebutton_button_where_to_mine;
	ImageButton imagebutton_button_journal;

	public InstructionsMainScreen(InstructionsMainMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/text_electrolyzer.png"), this.leftPos + 23, this.topPos + 84, 0, 0, 132, 16, 132, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/text_pressurizer.png"), this.leftPos + 294, this.topPos + 84, 0, 0, 127, 16, 127, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/text_refinery.png"), this.leftPos + 67, this.topPos + 151, 0, 0, 88, 16, 88, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/text_vacuumizer.png"), this.leftPos + 294, this.topPos + 151, 0, 0, 115, 16, 115, 16);

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
		imagebutton_button_background_new = new ImageButton(this.leftPos + 159, this.topPos + 60, 64, 64, 0, 0, 64, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_background_new.png"), 64, 128, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMainButtonMessage(0, x, y, z));
				InstructionsMainButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_background_new", imagebutton_button_background_new);
		this.addRenderableWidget(imagebutton_button_background_new);
		imagebutton_button_background_new1 = new ImageButton(this.leftPos + 226, this.topPos + 60, 64, 64, 0, 0, 64, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_background_new1.png"), 64, 128, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMainButtonMessage(1, x, y, z));
				InstructionsMainButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_background_new1", imagebutton_button_background_new1);
		this.addRenderableWidget(imagebutton_button_background_new1);
		imagebutton_button_background_new2 = new ImageButton(this.leftPos + 159, this.topPos + 127, 64, 64, 0, 0, 64, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_background_new2.png"), 64, 128, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMainButtonMessage(2, x, y, z));
				InstructionsMainButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_background_new2", imagebutton_button_background_new2);
		this.addRenderableWidget(imagebutton_button_background_new2);
		imagebutton_button_background_new3 = new ImageButton(this.leftPos + 226, this.topPos + 127, 64, 64, 0, 0, 64, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_background_new3.png"), 64, 128, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMainButtonMessage(3, x, y, z));
				InstructionsMainButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_background_new3", imagebutton_button_background_new3);
		this.addRenderableWidget(imagebutton_button_background_new3);
		imagebutton_button_where_to_mine = new ImageButton(this.leftPos + 252, this.topPos + 211, 184, 32, 0, 0, 32, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_where_to_mine.png"), 184, 64, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMainButtonMessage(4, x, y, z));
				InstructionsMainButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_where_to_mine", imagebutton_button_where_to_mine);
		this.addRenderableWidget(imagebutton_button_where_to_mine);
		imagebutton_button_journal = new ImageButton(this.leftPos + 13, this.topPos + 211, 184, 32, 0, 0, 32, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_journal.png"), 184, 64, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMainButtonMessage(5, x, y, z));
				InstructionsMainButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_journal", imagebutton_button_journal);
		this.addRenderableWidget(imagebutton_button_journal);
	}
}
