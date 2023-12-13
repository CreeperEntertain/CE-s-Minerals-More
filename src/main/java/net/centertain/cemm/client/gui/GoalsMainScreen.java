package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.centertain.cemm.world.inventory.GoalsMainMenu;
import net.centertain.cemm.procedures.GoalElementDisplayCheck9Procedure;
import net.centertain.cemm.procedures.GoalElementDisplayCheck8Procedure;
import net.centertain.cemm.procedures.GoalElementDisplayCheck7Procedure;
import net.centertain.cemm.procedures.GoalElementDisplayCheck6Procedure;
import net.centertain.cemm.procedures.GoalElementDisplayCheck5Procedure;
import net.centertain.cemm.procedures.GoalElementDisplayCheck4Procedure;
import net.centertain.cemm.procedures.GoalElementDisplayCheck3Procedure;
import net.centertain.cemm.procedures.GoalElementDisplayCheck2Procedure;
import net.centertain.cemm.procedures.GoalElementDisplayCheck1Procedure;
import net.centertain.cemm.procedures.GoalElementDisplayCheck10Procedure;
import net.centertain.cemm.procedures.GoalCheckText9Procedure;
import net.centertain.cemm.procedures.GoalCheckText8Procedure;
import net.centertain.cemm.procedures.GoalCheckText7Procedure;
import net.centertain.cemm.procedures.GoalCheckText6Procedure;
import net.centertain.cemm.procedures.GoalCheckText5Procedure;
import net.centertain.cemm.procedures.GoalCheckText4Procedure;
import net.centertain.cemm.procedures.GoalCheckText3Procedure;
import net.centertain.cemm.procedures.GoalCheckText2Procedure;
import net.centertain.cemm.procedures.GoalCheckText1Procedure;
import net.centertain.cemm.procedures.GoalCheckText10Procedure;
import net.centertain.cemm.procedures.AddCheckConditionProcedure;
import net.centertain.cemm.network.GoalsMainButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GoalsMainScreen extends AbstractContainerScreen<GoalsMainMenu> {
	private final static HashMap<String, Object> guistate = GoalsMainMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox goalsetter;
	Button button_add;
	Button button_remove;
	Button button_remove1;
	Button button_remove2;
	Button button_remove3;
	Button button_remove4;
	Button button_remove5;
	Button button_remove6;
	Button button_remove7;
	Button button_remove8;
	Button button_remove9;

	public GoalsMainScreen(GoalsMainMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 425;
		this.imageHeight = 240;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		goalsetter.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (goalsetter.isFocused())
			return goalsetter.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		goalsetter.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		if (GoalElementDisplayCheck1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GoalCheckText1Procedure.execute(entity), 62, 42, -1, false);
		if (GoalElementDisplayCheck2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GoalCheckText2Procedure.execute(entity), 62, 62, -1, false);
		if (GoalElementDisplayCheck3Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GoalCheckText3Procedure.execute(entity), 62, 82, -1, false);
		if (GoalElementDisplayCheck4Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GoalCheckText4Procedure.execute(entity), 62, 102, -1, false);
		if (GoalElementDisplayCheck5Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GoalCheckText5Procedure.execute(entity), 62, 122, -1, false);
		if (GoalElementDisplayCheck6Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GoalCheckText6Procedure.execute(entity), 62, 142, -1, false);
		if (GoalElementDisplayCheck7Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GoalCheckText7Procedure.execute(entity), 62, 162, -1, false);
		if (GoalElementDisplayCheck8Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GoalCheckText8Procedure.execute(entity), 62, 182, -1, false);
		if (GoalElementDisplayCheck9Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GoalCheckText9Procedure.execute(entity), 62, 202, -1, false);
		if (GoalElementDisplayCheck10Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GoalCheckText10Procedure.execute(entity), 62, 222, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		goalsetter = new EditBox(this.font, this.leftPos + 124, this.topPos + 8, 120, 20, Component.translatable("gui.cemm.goals_main.goalsetter")) {
			{
				setSuggestion(Component.translatable("gui.cemm.goals_main.goalsetter").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.cemm.goals_main.goalsetter").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.cemm.goals_main.goalsetter").getString());
				else
					setSuggestion(null);
			}
		};
		goalsetter.setMaxLength(32767);
		guistate.put("text:goalsetter", goalsetter);
		this.addWidget(this.goalsetter);
		button_add = Button.builder(Component.translatable("gui.cemm.goals_main.button_add"), e -> {
			if (AddCheckConditionProcedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(0, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 260, this.topPos + 8, 40, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (AddCheckConditionProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_add", button_add);
		this.addRenderableWidget(button_add);
		button_remove = Button.builder(Component.translatable("gui.cemm.goals_main.button_remove"), e -> {
			if (GoalElementDisplayCheck1Procedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(1, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 37, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GoalElementDisplayCheck1Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_remove", button_remove);
		this.addRenderableWidget(button_remove);
		button_remove1 = Button.builder(Component.translatable("gui.cemm.goals_main.button_remove1"), e -> {
			if (GoalElementDisplayCheck2Procedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(2, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 57, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GoalElementDisplayCheck2Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_remove1", button_remove1);
		this.addRenderableWidget(button_remove1);
		button_remove2 = Button.builder(Component.translatable("gui.cemm.goals_main.button_remove2"), e -> {
			if (GoalElementDisplayCheck3Procedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(3, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 77, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GoalElementDisplayCheck3Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_remove2", button_remove2);
		this.addRenderableWidget(button_remove2);
		button_remove3 = Button.builder(Component.translatable("gui.cemm.goals_main.button_remove3"), e -> {
			if (GoalElementDisplayCheck4Procedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(4, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 97, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GoalElementDisplayCheck4Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_remove3", button_remove3);
		this.addRenderableWidget(button_remove3);
		button_remove4 = Button.builder(Component.translatable("gui.cemm.goals_main.button_remove4"), e -> {
			if (GoalElementDisplayCheck5Procedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(5, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 117, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GoalElementDisplayCheck5Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_remove4", button_remove4);
		this.addRenderableWidget(button_remove4);
		button_remove5 = Button.builder(Component.translatable("gui.cemm.goals_main.button_remove5"), e -> {
			if (GoalElementDisplayCheck6Procedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(6, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 137, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GoalElementDisplayCheck6Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_remove5", button_remove5);
		this.addRenderableWidget(button_remove5);
		button_remove6 = Button.builder(Component.translatable("gui.cemm.goals_main.button_remove6"), e -> {
			if (GoalElementDisplayCheck7Procedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(7, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 157, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GoalElementDisplayCheck7Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_remove6", button_remove6);
		this.addRenderableWidget(button_remove6);
		button_remove7 = Button.builder(Component.translatable("gui.cemm.goals_main.button_remove7"), e -> {
			if (GoalElementDisplayCheck8Procedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(8, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 177, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GoalElementDisplayCheck8Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_remove7", button_remove7);
		this.addRenderableWidget(button_remove7);
		button_remove8 = Button.builder(Component.translatable("gui.cemm.goals_main.button_remove8"), e -> {
			if (GoalElementDisplayCheck9Procedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(9, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 197, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GoalElementDisplayCheck9Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_remove8", button_remove8);
		this.addRenderableWidget(button_remove8);
		button_remove9 = Button.builder(Component.translatable("gui.cemm.goals_main.button_remove9"), e -> {
			if (GoalElementDisplayCheck10Procedure.execute(entity)) {
				CemmMod.PACKET_HANDLER.sendToServer(new GoalsMainButtonMessage(10, x, y, z));
				GoalsMainButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 217, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GoalElementDisplayCheck10Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_remove9", button_remove9);
		this.addRenderableWidget(button_remove9);
	}
}
