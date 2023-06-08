package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.centertain.cemm.world.inventory.InfoSignUIMenu;
import net.centertain.cemm.network.InfoSignUIButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class InfoSignUIScreen extends AbstractContainerScreen<InfoSignUIMenu> {
	private final static HashMap<String, Object> guistate = InfoSignUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_00;
	ImageButton imagebutton_01;
	ImageButton imagebutton_02;
	ImageButton imagebutton_03;
	ImageButton imagebutton_04;
	ImageButton imagebutton_05;
	ImageButton imagebutton_06;
	ImageButton imagebutton_07;
	ImageButton imagebutton_08;
	ImageButton imagebutton_09;
	ImageButton imagebutton_10;
	ImageButton imagebutton_11;
	ImageButton imagebutton_12;
	ImageButton imagebutton_13;
	ImageButton imagebutton_14;
	ImageButton imagebutton_15;
	ImageButton imagebutton_16;
	ImageButton imagebutton_17;
	ImageButton imagebutton_18;
	ImageButton imagebutton_19;
	ImageButton imagebutton_20;
	ImageButton imagebutton_21;
	ImageButton imagebutton_22;
	ImageButton imagebutton_23;
	ImageButton imagebutton_24;
	ImageButton imagebutton_25;
	ImageButton imagebutton_26;
	ImageButton imagebutton_27;
	ImageButton imagebutton_28;
	ImageButton imagebutton_29;
	ImageButton imagebutton_30;
	ImageButton imagebutton_31;
	ImageButton imagebutton_32;
	ImageButton imagebutton_33;
	ImageButton imagebutton_34;
	ImageButton imagebutton_35;
	ImageButton imagebutton_36;
	ImageButton imagebutton_37;
	ImageButton imagebutton_38;
	ImageButton imagebutton_39;
	ImageButton imagebutton_40;
	ImageButton imagebutton_41;
	ImageButton imagebutton_42;
	ImageButton imagebutton_43;
	ImageButton imagebutton_44;
	ImageButton imagebutton_45;
	ImageButton imagebutton_46;
	ImageButton imagebutton_47;
	ImageButton imagebutton_48;
	ImageButton imagebutton_49;
	ImageButton imagebutton_50;
	ImageButton imagebutton_51;
	ImageButton imagebutton_52;
	ImageButton imagebutton_53;
	ImageButton imagebutton_54;
	ImageButton imagebutton_55;
	ImageButton imagebutton_56;
	ImageButton imagebutton_57;
	ImageButton imagebutton_58;
	ImageButton imagebutton_59;
	ImageButton imagebutton_60;
	ImageButton imagebutton_61;
	ImageButton imagebutton_62;
	ImageButton imagebutton_63;
	ImageButton imagebutton_64;
	ImageButton imagebutton_65;
	ImageButton imagebutton_66;
	ImageButton imagebutton_67;
	ImageButton imagebutton_68;
	ImageButton imagebutton_69;
	ImageButton imagebutton_70;
	ImageButton imagebutton_71;
	ImageButton imagebutton_72;
	ImageButton imagebutton_73;
	ImageButton imagebutton_74;
	ImageButton imagebutton_75;
	ImageButton imagebutton_76;
	ImageButton imagebutton_77;
	ImageButton imagebutton_78;
	ImageButton imagebutton_79;
	ImageButton imagebutton_80;
	ImageButton imagebutton_81;
	ImageButton imagebutton_82;
	ImageButton imagebutton_83;
	ImageButton imagebutton_84;
	ImageButton imagebutton_85;
	ImageButton imagebutton_86;
	ImageButton imagebutton_87;
	ImageButton imagebutton_88;
	ImageButton imagebutton_89;
	ImageButton imagebutton_90;
	ImageButton imagebutton_91;
	ImageButton imagebutton_92;
	ImageButton imagebutton_93;
	ImageButton imagebutton_94;
	ImageButton imagebutton_95;
	ImageButton imagebutton_96;
	ImageButton imagebutton_97;
	ImageButton imagebutton_98;

	public InfoSignUIScreen(InfoSignUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 232;
		this.imageHeight = 192;
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/info_sign_background.png"));
		this.blit(ms, this.leftPos + -1, this.topPos + 0, 0, 0, 232, 192, 232, 192);

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
		imagebutton_00 = new ImageButton(this.leftPos + 5, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_00.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(0, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_00", imagebutton_00);
		this.addRenderableWidget(imagebutton_00);
		imagebutton_01 = new ImageButton(this.leftPos + 5, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_01.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(1, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_01", imagebutton_01);
		this.addRenderableWidget(imagebutton_01);
		imagebutton_02 = new ImageButton(this.leftPos + 5, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_02.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(2, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_02", imagebutton_02);
		this.addRenderableWidget(imagebutton_02);
		imagebutton_03 = new ImageButton(this.leftPos + 5, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_03.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(3, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_03", imagebutton_03);
		this.addRenderableWidget(imagebutton_03);
		imagebutton_04 = new ImageButton(this.leftPos + 5, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_04.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(4, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_04", imagebutton_04);
		this.addRenderableWidget(imagebutton_04);
		imagebutton_05 = new ImageButton(this.leftPos + 5, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_05.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(5, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_05", imagebutton_05);
		this.addRenderableWidget(imagebutton_05);
		imagebutton_06 = new ImageButton(this.leftPos + 5, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_06.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(6, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_06", imagebutton_06);
		this.addRenderableWidget(imagebutton_06);
		imagebutton_07 = new ImageButton(this.leftPos + 5, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_07.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(7, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_07", imagebutton_07);
		this.addRenderableWidget(imagebutton_07);
		imagebutton_08 = new ImageButton(this.leftPos + 5, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_08.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(8, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_08", imagebutton_08);
		this.addRenderableWidget(imagebutton_08);
		imagebutton_09 = new ImageButton(this.leftPos + 25, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_09.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(9, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_09", imagebutton_09);
		this.addRenderableWidget(imagebutton_09);
		imagebutton_10 = new ImageButton(this.leftPos + 25, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_10.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(10, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_10", imagebutton_10);
		this.addRenderableWidget(imagebutton_10);
		imagebutton_11 = new ImageButton(this.leftPos + 25, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_11.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(11, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_11", imagebutton_11);
		this.addRenderableWidget(imagebutton_11);
		imagebutton_12 = new ImageButton(this.leftPos + 25, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_12.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(12, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_12", imagebutton_12);
		this.addRenderableWidget(imagebutton_12);
		imagebutton_13 = new ImageButton(this.leftPos + 25, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_13.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(13, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_13", imagebutton_13);
		this.addRenderableWidget(imagebutton_13);
		imagebutton_14 = new ImageButton(this.leftPos + 25, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_14.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(14, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_14", imagebutton_14);
		this.addRenderableWidget(imagebutton_14);
		imagebutton_15 = new ImageButton(this.leftPos + 25, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_15.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(15, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_15", imagebutton_15);
		this.addRenderableWidget(imagebutton_15);
		imagebutton_16 = new ImageButton(this.leftPos + 25, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_16.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(16, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		guistate.put("button:imagebutton_16", imagebutton_16);
		this.addRenderableWidget(imagebutton_16);
		imagebutton_17 = new ImageButton(this.leftPos + 25, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_17.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(17, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		guistate.put("button:imagebutton_17", imagebutton_17);
		this.addRenderableWidget(imagebutton_17);
		imagebutton_18 = new ImageButton(this.leftPos + 45, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_18.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(18, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});
		guistate.put("button:imagebutton_18", imagebutton_18);
		this.addRenderableWidget(imagebutton_18);
		imagebutton_19 = new ImageButton(this.leftPos + 45, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_19.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(19, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		});
		guistate.put("button:imagebutton_19", imagebutton_19);
		this.addRenderableWidget(imagebutton_19);
		imagebutton_20 = new ImageButton(this.leftPos + 45, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_20.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(20, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		});
		guistate.put("button:imagebutton_20", imagebutton_20);
		this.addRenderableWidget(imagebutton_20);
		imagebutton_21 = new ImageButton(this.leftPos + 45, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_21.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(21, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		});
		guistate.put("button:imagebutton_21", imagebutton_21);
		this.addRenderableWidget(imagebutton_21);
		imagebutton_22 = new ImageButton(this.leftPos + 45, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_22.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(22, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 22, x, y, z);
			}
		});
		guistate.put("button:imagebutton_22", imagebutton_22);
		this.addRenderableWidget(imagebutton_22);
		imagebutton_23 = new ImageButton(this.leftPos + 45, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_23.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(23, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 23, x, y, z);
			}
		});
		guistate.put("button:imagebutton_23", imagebutton_23);
		this.addRenderableWidget(imagebutton_23);
		imagebutton_24 = new ImageButton(this.leftPos + 45, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_24.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(24, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 24, x, y, z);
			}
		});
		guistate.put("button:imagebutton_24", imagebutton_24);
		this.addRenderableWidget(imagebutton_24);
		imagebutton_25 = new ImageButton(this.leftPos + 45, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_25.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(25, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 25, x, y, z);
			}
		});
		guistate.put("button:imagebutton_25", imagebutton_25);
		this.addRenderableWidget(imagebutton_25);
		imagebutton_26 = new ImageButton(this.leftPos + 45, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_26.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(26, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 26, x, y, z);
			}
		});
		guistate.put("button:imagebutton_26", imagebutton_26);
		this.addRenderableWidget(imagebutton_26);
		imagebutton_27 = new ImageButton(this.leftPos + 65, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_27.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(27, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 27, x, y, z);
			}
		});
		guistate.put("button:imagebutton_27", imagebutton_27);
		this.addRenderableWidget(imagebutton_27);
		imagebutton_28 = new ImageButton(this.leftPos + 65, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_28.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(28, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 28, x, y, z);
			}
		});
		guistate.put("button:imagebutton_28", imagebutton_28);
		this.addRenderableWidget(imagebutton_28);
		imagebutton_29 = new ImageButton(this.leftPos + 65, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_29.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(29, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 29, x, y, z);
			}
		});
		guistate.put("button:imagebutton_29", imagebutton_29);
		this.addRenderableWidget(imagebutton_29);
		imagebutton_30 = new ImageButton(this.leftPos + 65, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_30.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(30, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 30, x, y, z);
			}
		});
		guistate.put("button:imagebutton_30", imagebutton_30);
		this.addRenderableWidget(imagebutton_30);
		imagebutton_31 = new ImageButton(this.leftPos + 65, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_31.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(31, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 31, x, y, z);
			}
		});
		guistate.put("button:imagebutton_31", imagebutton_31);
		this.addRenderableWidget(imagebutton_31);
		imagebutton_32 = new ImageButton(this.leftPos + 65, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_32.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(32, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 32, x, y, z);
			}
		});
		guistate.put("button:imagebutton_32", imagebutton_32);
		this.addRenderableWidget(imagebutton_32);
		imagebutton_33 = new ImageButton(this.leftPos + 65, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_33.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(33, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 33, x, y, z);
			}
		});
		guistate.put("button:imagebutton_33", imagebutton_33);
		this.addRenderableWidget(imagebutton_33);
		imagebutton_34 = new ImageButton(this.leftPos + 65, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_34.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(34, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 34, x, y, z);
			}
		});
		guistate.put("button:imagebutton_34", imagebutton_34);
		this.addRenderableWidget(imagebutton_34);
		imagebutton_35 = new ImageButton(this.leftPos + 65, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_35.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(35, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 35, x, y, z);
			}
		});
		guistate.put("button:imagebutton_35", imagebutton_35);
		this.addRenderableWidget(imagebutton_35);
		imagebutton_36 = new ImageButton(this.leftPos + 85, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_36.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(36, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 36, x, y, z);
			}
		});
		guistate.put("button:imagebutton_36", imagebutton_36);
		this.addRenderableWidget(imagebutton_36);
		imagebutton_37 = new ImageButton(this.leftPos + 85, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_37.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(37, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 37, x, y, z);
			}
		});
		guistate.put("button:imagebutton_37", imagebutton_37);
		this.addRenderableWidget(imagebutton_37);
		imagebutton_38 = new ImageButton(this.leftPos + 85, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_38.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(38, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 38, x, y, z);
			}
		});
		guistate.put("button:imagebutton_38", imagebutton_38);
		this.addRenderableWidget(imagebutton_38);
		imagebutton_39 = new ImageButton(this.leftPos + 85, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_39.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(39, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 39, x, y, z);
			}
		});
		guistate.put("button:imagebutton_39", imagebutton_39);
		this.addRenderableWidget(imagebutton_39);
		imagebutton_40 = new ImageButton(this.leftPos + 85, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_40.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(40, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 40, x, y, z);
			}
		});
		guistate.put("button:imagebutton_40", imagebutton_40);
		this.addRenderableWidget(imagebutton_40);
		imagebutton_41 = new ImageButton(this.leftPos + 85, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_41.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(41, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 41, x, y, z);
			}
		});
		guistate.put("button:imagebutton_41", imagebutton_41);
		this.addRenderableWidget(imagebutton_41);
		imagebutton_42 = new ImageButton(this.leftPos + 85, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_42.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(42, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 42, x, y, z);
			}
		});
		guistate.put("button:imagebutton_42", imagebutton_42);
		this.addRenderableWidget(imagebutton_42);
		imagebutton_43 = new ImageButton(this.leftPos + 85, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_43.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(43, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 43, x, y, z);
			}
		});
		guistate.put("button:imagebutton_43", imagebutton_43);
		this.addRenderableWidget(imagebutton_43);
		imagebutton_44 = new ImageButton(this.leftPos + 85, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_44.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(44, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 44, x, y, z);
			}
		});
		guistate.put("button:imagebutton_44", imagebutton_44);
		this.addRenderableWidget(imagebutton_44);
		imagebutton_45 = new ImageButton(this.leftPos + 105, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_45.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(45, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 45, x, y, z);
			}
		});
		guistate.put("button:imagebutton_45", imagebutton_45);
		this.addRenderableWidget(imagebutton_45);
		imagebutton_46 = new ImageButton(this.leftPos + 105, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_46.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(46, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 46, x, y, z);
			}
		});
		guistate.put("button:imagebutton_46", imagebutton_46);
		this.addRenderableWidget(imagebutton_46);
		imagebutton_47 = new ImageButton(this.leftPos + 105, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_47.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(47, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 47, x, y, z);
			}
		});
		guistate.put("button:imagebutton_47", imagebutton_47);
		this.addRenderableWidget(imagebutton_47);
		imagebutton_48 = new ImageButton(this.leftPos + 105, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_48.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(48, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 48, x, y, z);
			}
		});
		guistate.put("button:imagebutton_48", imagebutton_48);
		this.addRenderableWidget(imagebutton_48);
		imagebutton_49 = new ImageButton(this.leftPos + 105, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_49.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(49, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 49, x, y, z);
			}
		});
		guistate.put("button:imagebutton_49", imagebutton_49);
		this.addRenderableWidget(imagebutton_49);
		imagebutton_50 = new ImageButton(this.leftPos + 105, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_50.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(50, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 50, x, y, z);
			}
		});
		guistate.put("button:imagebutton_50", imagebutton_50);
		this.addRenderableWidget(imagebutton_50);
		imagebutton_51 = new ImageButton(this.leftPos + 105, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_51.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(51, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 51, x, y, z);
			}
		});
		guistate.put("button:imagebutton_51", imagebutton_51);
		this.addRenderableWidget(imagebutton_51);
		imagebutton_52 = new ImageButton(this.leftPos + 105, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_52.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(52, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 52, x, y, z);
			}
		});
		guistate.put("button:imagebutton_52", imagebutton_52);
		this.addRenderableWidget(imagebutton_52);
		imagebutton_53 = new ImageButton(this.leftPos + 105, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_53.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(53, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 53, x, y, z);
			}
		});
		guistate.put("button:imagebutton_53", imagebutton_53);
		this.addRenderableWidget(imagebutton_53);
		imagebutton_54 = new ImageButton(this.leftPos + 125, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_54.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(54, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 54, x, y, z);
			}
		});
		guistate.put("button:imagebutton_54", imagebutton_54);
		this.addRenderableWidget(imagebutton_54);
		imagebutton_55 = new ImageButton(this.leftPos + 125, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_55.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(55, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 55, x, y, z);
			}
		});
		guistate.put("button:imagebutton_55", imagebutton_55);
		this.addRenderableWidget(imagebutton_55);
		imagebutton_56 = new ImageButton(this.leftPos + 125, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_56.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(56, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 56, x, y, z);
			}
		});
		guistate.put("button:imagebutton_56", imagebutton_56);
		this.addRenderableWidget(imagebutton_56);
		imagebutton_57 = new ImageButton(this.leftPos + 125, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_57.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(57, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 57, x, y, z);
			}
		});
		guistate.put("button:imagebutton_57", imagebutton_57);
		this.addRenderableWidget(imagebutton_57);
		imagebutton_58 = new ImageButton(this.leftPos + 125, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_58.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(58, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 58, x, y, z);
			}
		});
		guistate.put("button:imagebutton_58", imagebutton_58);
		this.addRenderableWidget(imagebutton_58);
		imagebutton_59 = new ImageButton(this.leftPos + 125, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_59.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(59, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 59, x, y, z);
			}
		});
		guistate.put("button:imagebutton_59", imagebutton_59);
		this.addRenderableWidget(imagebutton_59);
		imagebutton_60 = new ImageButton(this.leftPos + 125, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_60.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(60, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 60, x, y, z);
			}
		});
		guistate.put("button:imagebutton_60", imagebutton_60);
		this.addRenderableWidget(imagebutton_60);
		imagebutton_61 = new ImageButton(this.leftPos + 125, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_61.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(61, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 61, x, y, z);
			}
		});
		guistate.put("button:imagebutton_61", imagebutton_61);
		this.addRenderableWidget(imagebutton_61);
		imagebutton_62 = new ImageButton(this.leftPos + 125, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_62.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(62, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 62, x, y, z);
			}
		});
		guistate.put("button:imagebutton_62", imagebutton_62);
		this.addRenderableWidget(imagebutton_62);
		imagebutton_63 = new ImageButton(this.leftPos + 145, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_63.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(63, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 63, x, y, z);
			}
		});
		guistate.put("button:imagebutton_63", imagebutton_63);
		this.addRenderableWidget(imagebutton_63);
		imagebutton_64 = new ImageButton(this.leftPos + 145, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_64.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(64, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 64, x, y, z);
			}
		});
		guistate.put("button:imagebutton_64", imagebutton_64);
		this.addRenderableWidget(imagebutton_64);
		imagebutton_65 = new ImageButton(this.leftPos + 145, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_65.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(65, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 65, x, y, z);
			}
		});
		guistate.put("button:imagebutton_65", imagebutton_65);
		this.addRenderableWidget(imagebutton_65);
		imagebutton_66 = new ImageButton(this.leftPos + 145, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_66.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(66, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 66, x, y, z);
			}
		});
		guistate.put("button:imagebutton_66", imagebutton_66);
		this.addRenderableWidget(imagebutton_66);
		imagebutton_67 = new ImageButton(this.leftPos + 145, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_67.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(67, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 67, x, y, z);
			}
		});
		guistate.put("button:imagebutton_67", imagebutton_67);
		this.addRenderableWidget(imagebutton_67);
		imagebutton_68 = new ImageButton(this.leftPos + 145, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_68.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(68, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 68, x, y, z);
			}
		});
		guistate.put("button:imagebutton_68", imagebutton_68);
		this.addRenderableWidget(imagebutton_68);
		imagebutton_69 = new ImageButton(this.leftPos + 145, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_69.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(69, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 69, x, y, z);
			}
		});
		guistate.put("button:imagebutton_69", imagebutton_69);
		this.addRenderableWidget(imagebutton_69);
		imagebutton_70 = new ImageButton(this.leftPos + 145, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_70.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(70, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 70, x, y, z);
			}
		});
		guistate.put("button:imagebutton_70", imagebutton_70);
		this.addRenderableWidget(imagebutton_70);
		imagebutton_71 = new ImageButton(this.leftPos + 145, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_71.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(71, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 71, x, y, z);
			}
		});
		guistate.put("button:imagebutton_71", imagebutton_71);
		this.addRenderableWidget(imagebutton_71);
		imagebutton_72 = new ImageButton(this.leftPos + 165, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_72.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(72, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 72, x, y, z);
			}
		});
		guistate.put("button:imagebutton_72", imagebutton_72);
		this.addRenderableWidget(imagebutton_72);
		imagebutton_73 = new ImageButton(this.leftPos + 165, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_73.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(73, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 73, x, y, z);
			}
		});
		guistate.put("button:imagebutton_73", imagebutton_73);
		this.addRenderableWidget(imagebutton_73);
		imagebutton_74 = new ImageButton(this.leftPos + 165, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_74.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(74, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 74, x, y, z);
			}
		});
		guistate.put("button:imagebutton_74", imagebutton_74);
		this.addRenderableWidget(imagebutton_74);
		imagebutton_75 = new ImageButton(this.leftPos + 165, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_75.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(75, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 75, x, y, z);
			}
		});
		guistate.put("button:imagebutton_75", imagebutton_75);
		this.addRenderableWidget(imagebutton_75);
		imagebutton_76 = new ImageButton(this.leftPos + 165, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_76.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(76, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 76, x, y, z);
			}
		});
		guistate.put("button:imagebutton_76", imagebutton_76);
		this.addRenderableWidget(imagebutton_76);
		imagebutton_77 = new ImageButton(this.leftPos + 165, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_77.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(77, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 77, x, y, z);
			}
		});
		guistate.put("button:imagebutton_77", imagebutton_77);
		this.addRenderableWidget(imagebutton_77);
		imagebutton_78 = new ImageButton(this.leftPos + 165, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_78.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(78, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 78, x, y, z);
			}
		});
		guistate.put("button:imagebutton_78", imagebutton_78);
		this.addRenderableWidget(imagebutton_78);
		imagebutton_79 = new ImageButton(this.leftPos + 165, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_79.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(79, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 79, x, y, z);
			}
		});
		guistate.put("button:imagebutton_79", imagebutton_79);
		this.addRenderableWidget(imagebutton_79);
		imagebutton_80 = new ImageButton(this.leftPos + 165, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_80.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(80, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 80, x, y, z);
			}
		});
		guistate.put("button:imagebutton_80", imagebutton_80);
		this.addRenderableWidget(imagebutton_80);
		imagebutton_81 = new ImageButton(this.leftPos + 185, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_81.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(81, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 81, x, y, z);
			}
		});
		guistate.put("button:imagebutton_81", imagebutton_81);
		this.addRenderableWidget(imagebutton_81);
		imagebutton_82 = new ImageButton(this.leftPos + 185, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_82.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(82, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 82, x, y, z);
			}
		});
		guistate.put("button:imagebutton_82", imagebutton_82);
		this.addRenderableWidget(imagebutton_82);
		imagebutton_83 = new ImageButton(this.leftPos + 185, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_83.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(83, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 83, x, y, z);
			}
		});
		guistate.put("button:imagebutton_83", imagebutton_83);
		this.addRenderableWidget(imagebutton_83);
		imagebutton_84 = new ImageButton(this.leftPos + 185, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_84.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(84, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 84, x, y, z);
			}
		});
		guistate.put("button:imagebutton_84", imagebutton_84);
		this.addRenderableWidget(imagebutton_84);
		imagebutton_85 = new ImageButton(this.leftPos + 185, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_85.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(85, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 85, x, y, z);
			}
		});
		guistate.put("button:imagebutton_85", imagebutton_85);
		this.addRenderableWidget(imagebutton_85);
		imagebutton_86 = new ImageButton(this.leftPos + 185, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_86.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(86, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 86, x, y, z);
			}
		});
		guistate.put("button:imagebutton_86", imagebutton_86);
		this.addRenderableWidget(imagebutton_86);
		imagebutton_87 = new ImageButton(this.leftPos + 185, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_87.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(87, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 87, x, y, z);
			}
		});
		guistate.put("button:imagebutton_87", imagebutton_87);
		this.addRenderableWidget(imagebutton_87);
		imagebutton_88 = new ImageButton(this.leftPos + 185, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_88.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(88, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 88, x, y, z);
			}
		});
		guistate.put("button:imagebutton_88", imagebutton_88);
		this.addRenderableWidget(imagebutton_88);
		imagebutton_89 = new ImageButton(this.leftPos + 185, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_89.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(89, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 89, x, y, z);
			}
		});
		guistate.put("button:imagebutton_89", imagebutton_89);
		this.addRenderableWidget(imagebutton_89);
		imagebutton_90 = new ImageButton(this.leftPos + 205, this.topPos + 6, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_90.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(90, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 90, x, y, z);
			}
		});
		guistate.put("button:imagebutton_90", imagebutton_90);
		this.addRenderableWidget(imagebutton_90);
		imagebutton_91 = new ImageButton(this.leftPos + 205, this.topPos + 26, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_91.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(91, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 91, x, y, z);
			}
		});
		guistate.put("button:imagebutton_91", imagebutton_91);
		this.addRenderableWidget(imagebutton_91);
		imagebutton_92 = new ImageButton(this.leftPos + 205, this.topPos + 46, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_92.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(92, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 92, x, y, z);
			}
		});
		guistate.put("button:imagebutton_92", imagebutton_92);
		this.addRenderableWidget(imagebutton_92);
		imagebutton_93 = new ImageButton(this.leftPos + 205, this.topPos + 66, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_93.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(93, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 93, x, y, z);
			}
		});
		guistate.put("button:imagebutton_93", imagebutton_93);
		this.addRenderableWidget(imagebutton_93);
		imagebutton_94 = new ImageButton(this.leftPos + 205, this.topPos + 86, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_94.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(94, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 94, x, y, z);
			}
		});
		guistate.put("button:imagebutton_94", imagebutton_94);
		this.addRenderableWidget(imagebutton_94);
		imagebutton_95 = new ImageButton(this.leftPos + 205, this.topPos + 106, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_95.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(95, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 95, x, y, z);
			}
		});
		guistate.put("button:imagebutton_95", imagebutton_95);
		this.addRenderableWidget(imagebutton_95);
		imagebutton_96 = new ImageButton(this.leftPos + 205, this.topPos + 126, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_96.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(96, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 96, x, y, z);
			}
		});
		guistate.put("button:imagebutton_96", imagebutton_96);
		this.addRenderableWidget(imagebutton_96);
		imagebutton_97 = new ImageButton(this.leftPos + 205, this.topPos + 146, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_97.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(97, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 97, x, y, z);
			}
		});
		guistate.put("button:imagebutton_97", imagebutton_97);
		this.addRenderableWidget(imagebutton_97);
		imagebutton_98 = new ImageButton(this.leftPos + 205, this.topPos + 166, 20, 20, 0, 0, 20, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_98.png"), 20, 40, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InfoSignUIButtonMessage(98, x, y, z));
				InfoSignUIButtonMessage.handleButtonAction(entity, 98, x, y, z);
			}
		});
		guistate.put("button:imagebutton_98", imagebutton_98);
		this.addRenderableWidget(imagebutton_98);
	}
}
