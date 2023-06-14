package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;

import net.centertain.cemm.world.inventory.BlockPlacerInterfaceMenu;
import net.centertain.cemm.procedures.WestTextProcedure;
import net.centertain.cemm.procedures.UpTextProcedure;
import net.centertain.cemm.procedures.SouthTextProcedure;
import net.centertain.cemm.procedures.NorthTextProcedure;
import net.centertain.cemm.procedures.EastTextProcedure;
import net.centertain.cemm.procedures.DownTextProcedure;
import net.centertain.cemm.procedures.DirectionTextProcedure;
import net.centertain.cemm.network.BlockPlacerInterfaceButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BlockPlacerInterfaceScreen extends AbstractContainerScreen<BlockPlacerInterfaceMenu> {
	private final static HashMap<String, Object> guistate = BlockPlacerInterfaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox DIR;
	Button button_enter;

	public BlockPlacerInterfaceScreen(BlockPlacerInterfaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 320;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("cemm:textures/screens/block_placer_interface.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		DIR.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (DIR.isFocused())
			return DIR.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		DIR.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_block"), 100, 11, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_inventory"), 6, 70, -12829636);
		if (DirectionTextProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_current_orientation"), 6, 55, -12829636);
		if (UpTextProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_up"), 114, 55, -16734208);
		if (DownTextProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_down"), 114, 55, -16734208);
		if (WestTextProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_west"), 114, 55, -16734208);
		if (EastTextProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_east"), 114, 55, -16734208);
		if (NorthTextProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_north"), 114, 55, -16734208);
		if (SouthTextProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_south"), 114, 55, -16734208);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_orientation_input"), 173, 7, -5767168);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_here_you_can_enter_with"), 173, 17, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_which_orientation_the_block"), 173, 27, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_will_be_placed"), 173, 36, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_simply_enter_a_direction"), 172, 46, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_click_the_enter_button_to"), 172, 56, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_set_an_orientation"), 172, 66, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_examples"), 172, 83, -5767168);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_up_up_up_u_u_0"), 172, 94, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_down_down_down_d_d_1"), 172, 105, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_east_east_east_e_e_2"), 172, 116, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_west_west_west_w_w_3"), 172, 127, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_north_north_north_n_n_4"), 172, 138, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cemm.block_placer_interface.label_south_south_south_s_s_5"), 172, 149, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		DIR = new EditBox(this.font, this.leftPos + 6, this.topPos + 33, 120, 20, Component.translatable("gui.cemm.block_placer_interface.DIR")) {
			{
				setSuggestion(Component.translatable("gui.cemm.block_placer_interface.DIR").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.cemm.block_placer_interface.DIR").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.cemm.block_placer_interface.DIR").getString());
				else
					setSuggestion(null);
			}
		};
		DIR.setMaxLength(32767);
		guistate.put("text:DIR", DIR);
		this.addWidget(this.DIR);
		button_enter = Button.builder(Component.translatable("gui.cemm.block_placer_interface.button_enter"), e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new BlockPlacerInterfaceButtonMessage(0, x, y, z));
				BlockPlacerInterfaceButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 128, this.topPos + 33, 40, 20).build();
		guistate.put("button:button_enter", button_enter);
		this.addRenderableWidget(button_enter);
	}
}
