package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.centertain.cemm.world.inventory.JournalPage19Menu;
import net.centertain.cemm.network.JournalPage19ButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class JournalPage19Screen extends AbstractContainerScreen<JournalPage19Menu> {
	private final static HashMap<String, Object> guistate = JournalPage19Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_journal_page_right;
	ImageButton imagebutton_journal_page_left;
	ImageButton imagebutton_back;
	ImageButton imagebutton_journal_pressurizer_band;
	ImageButton imagebutton_journal_refinery_band;
	ImageButton imagebutton_journal_electrolyzer_band;
	ImageButton imagebutton_journal_vacuumizer_band;
	ImageButton imagebutton_journal_xanthanium_band;
	ImageButton imagebutton_journal_chlorophyl_band;
	ImageButton imagebutton_journal_steel_band;
	ImageButton imagebutton_journal_aluminum_band;

	public JournalPage19Screen(JournalPage19Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 420;
		this.imageHeight = 210;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
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

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/journal_background.png"), this.leftPos + 136, this.topPos + 0, 0, 0, 146, 180, 146, 180);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/journal_19.png"), this.leftPos + 136, this.topPos + 0, 0, 0, 146, 180, 146, 180);

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
		imagebutton_journal_page_right = new ImageButton(this.leftPos + 236, this.topPos + 189, 46, 21, 0, 0, 21, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_journal_page_right.png"), 46, 42, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(0, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_journal_page_right", imagebutton_journal_page_right);
		this.addRenderableWidget(imagebutton_journal_page_right);
		imagebutton_journal_page_left = new ImageButton(this.leftPos + 136, this.topPos + 189, 46, 21, 0, 0, 21, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_journal_page_left.png"), 46, 42, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(1, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_journal_page_left", imagebutton_journal_page_left);
		this.addRenderableWidget(imagebutton_journal_page_left);
		imagebutton_back = new ImageButton(this.leftPos + 380, this.topPos + 182, 32, 32, 0, 0, 32, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_back.png"), 32, 64, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(2, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_back", imagebutton_back);
		this.addRenderableWidget(imagebutton_back);
		imagebutton_journal_pressurizer_band = new ImageButton(this.leftPos + 8, this.topPos + 11, 128, 24, 0, 0, 24, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_journal_pressurizer_band.png"), 128, 48, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(3, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_journal_pressurizer_band", imagebutton_journal_pressurizer_band);
		this.addRenderableWidget(imagebutton_journal_pressurizer_band);
		imagebutton_journal_refinery_band = new ImageButton(this.leftPos + 8, this.topPos + 37, 128, 24, 0, 0, 24, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_journal_refinery_band.png"), 128, 48, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(4, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_journal_refinery_band", imagebutton_journal_refinery_band);
		this.addRenderableWidget(imagebutton_journal_refinery_band);
		imagebutton_journal_electrolyzer_band = new ImageButton(this.leftPos + 8, this.topPos + 63, 128, 24, 0, 0, 24, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_journal_electrolyzer_band.png"), 128, 48, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(5, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_journal_electrolyzer_band", imagebutton_journal_electrolyzer_band);
		this.addRenderableWidget(imagebutton_journal_electrolyzer_band);
		imagebutton_journal_vacuumizer_band = new ImageButton(this.leftPos + 8, this.topPos + 89, 128, 24, 0, 0, 24, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_journal_vacuumizer_band.png"), 128, 48, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(6, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_journal_vacuumizer_band", imagebutton_journal_vacuumizer_band);
		this.addRenderableWidget(imagebutton_journal_vacuumizer_band);
		imagebutton_journal_xanthanium_band = new ImageButton(this.leftPos + 282, this.topPos + 145, 128, 24, 0, 0, 24, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_journal_xanthanium_band.png"), 128, 48, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(7, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_journal_xanthanium_band", imagebutton_journal_xanthanium_band);
		this.addRenderableWidget(imagebutton_journal_xanthanium_band);
		imagebutton_journal_chlorophyl_band = new ImageButton(this.leftPos + 282, this.topPos + 119, 128, 24, 0, 0, 24, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_journal_chlorophyl_band.png"), 128, 48, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(8, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_journal_chlorophyl_band", imagebutton_journal_chlorophyl_band);
		this.addRenderableWidget(imagebutton_journal_chlorophyl_band);
		imagebutton_journal_steel_band = new ImageButton(this.leftPos + 282, this.topPos + 93, 128, 24, 0, 0, 24, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_journal_steel_band.png"), 128, 48, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(9, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_journal_steel_band", imagebutton_journal_steel_band);
		this.addRenderableWidget(imagebutton_journal_steel_band);
		imagebutton_journal_aluminum_band = new ImageButton(this.leftPos + 282, this.topPos + 67, 128, 24, 0, 0, 24, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_journal_aluminum_band.png"), 128, 48, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new JournalPage19ButtonMessage(10, x, y, z));
				JournalPage19ButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_journal_aluminum_band", imagebutton_journal_aluminum_band);
		this.addRenderableWidget(imagebutton_journal_aluminum_band);
	}
}
