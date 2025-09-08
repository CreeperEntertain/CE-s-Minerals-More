package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.centertain.cemm.world.inventory.BlockRefineryInterfaceMenu;
import net.centertain.cemm.network.BlockRefineryInterfaceButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlockRefineryInterfaceScreen extends AbstractContainerScreen<BlockRefineryInterfaceMenu> {
	private final static HashMap<String, Object> guistate = BlockRefineryInterfaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_recipes;

	public BlockRefineryInterfaceScreen(BlockRefineryInterfaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 195;
	}

	private static final ResourceLocation texture = new ResourceLocation("cemm:textures/screens/block_refinery_interface.png");

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
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/block_refinery_output.png"), this.leftPos + 115, this.topPos + 7, 0, 0, 54, 90, 54, 90);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.block_refinery_interface.label_inventory"), 7, 97, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.block_refinery_interface.label_main_block"), 28, 38, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.block_refinery_interface.label_second_ingredient"), 28, 61, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_recipes = Button.builder(Component.translatable("gui.cemm.block_refinery_interface.button_recipes"), e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new BlockRefineryInterfaceButtonMessage(0, x, y, z));
				BlockRefineryInterfaceButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 7, 61, 20).build();
		guistate.put("button:button_recipes", button_recipes);
		this.addRenderableWidget(button_recipes);
	}
}
