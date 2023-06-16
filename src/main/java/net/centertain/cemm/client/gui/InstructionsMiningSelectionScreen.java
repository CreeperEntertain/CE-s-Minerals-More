package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.centertain.cemm.world.inventory.InstructionsMiningSelectionMenu;
import net.centertain.cemm.network.InstructionsMiningSelectionButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class InstructionsMiningSelectionScreen extends AbstractContainerScreen<InstructionsMiningSelectionMenu> {
	private final static HashMap<String, Object> guistate = InstructionsMiningSelectionMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_back;
	ImageButton imagebutton_card_select_hover;
	ImageButton imagebutton_card_select_hover1;
	ImageButton imagebutton_card_select_hover2;
	ImageButton imagebutton_card_select_hover3;
	ImageButton imagebutton_card_select_hover4;
	ImageButton imagebutton_card_select_hover5;
	ImageButton imagebutton_card_select_hover6;
	ImageButton imagebutton_card_select_hover7;
	ImageButton imagebutton_card_select_hover8;
	ImageButton imagebutton_card_select_hover9;
	ImageButton imagebutton_card_select_hover10;
	ImageButton imagebutton_card_select_hover11;
	ImageButton imagebutton_card_select_hover12;
	ImageButton imagebutton_card_select_hover13;
	ImageButton imagebutton_card_select_hover14;
	ImageButton imagebutton_card_select_hover15;
	ImageButton imagebutton_card_select_hover16;
	ImageButton imagebutton_card_select_hover17;
	ImageButton imagebutton_card_select_hover18;
	ImageButton imagebutton_card_select_hover19;
	ImageButton imagebutton_card_select_hover20;
	ImageButton imagebutton_card_select_hover21;
	ImageButton imagebutton_card_select_hover22;
	ImageButton imagebutton_card_select_hover23;
	ImageButton imagebutton_card_select_hover24;
	ImageButton imagebutton_card_select_hover25;
	ImageButton imagebutton_card_select_hover26;
	ImageButton imagebutton_card_select_hover27;
	ImageButton imagebutton_card_select_hover28;
	ImageButton imagebutton_card_select_hover29;
	ImageButton imagebutton_card_select_hover30;
	ImageButton imagebutton_card_select_hover31;
	ImageButton imagebutton_card_select_hover32;
	ImageButton imagebutton_card_select_hover33;
	ImageButton imagebutton_card_select_hover34;
	ImageButton imagebutton_card_select_hover35;
	ImageButton imagebutton_card_select_hover36;
	ImageButton imagebutton_card_select_hover37;

	public InstructionsMiningSelectionScreen(InstructionsMiningSelectionMenu container, Inventory inventory, Component text) {
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_antimony.png"));
		this.blit(ms, this.leftPos + 333, this.topPos + 120, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_arsenic.png"));
		this.blit(ms, this.leftPos + 53, this.topPos + 8, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_baryte.png"));
		this.blit(ms, this.leftPos + 93, this.topPos + 8, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_bastnaesite.png"));
		this.blit(ms, this.leftPos + 93, this.topPos + 120, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_bauxite.png"));
		this.blit(ms, this.leftPos + 13, this.topPos + 8, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_beryl.png"));
		this.blit(ms, this.leftPos + 133, this.topPos + 8, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_bismuth.png"));
		this.blit(ms, this.leftPos + 173, this.topPos + 8, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_cassiterite.png"));
		this.blit(ms, this.leftPos + 53, this.topPos + 176, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_cesium.png"));
		this.blit(ms, this.leftPos + 93, this.topPos + 64, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_chlorophyl.png"));
		this.blit(ms, this.leftPos + 213, this.topPos + 8, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_chrome.png"));
		this.blit(ms, this.leftPos + 53, this.topPos + 64, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_cinnabar.png"));
		this.blit(ms, this.leftPos + 253, this.topPos + 176, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_cobalt.png"));
		this.blit(ms, this.leftPos + 13, this.topPos + 64, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_columbite.png"));
		this.blit(ms, this.leftPos + 53, this.topPos + 120, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_dolomite.png"));
		this.blit(ms, this.leftPos + 373, this.topPos + 64, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_fluorite.png"));
		this.blit(ms, this.leftPos + 373, this.topPos + 8, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_graphite.png"));
		this.blit(ms, this.leftPos + 253, this.topPos + 8, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_iridosmine.png"));
		this.blit(ms, this.leftPos + 133, this.topPos + 120, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_lignite.png"));
		this.blit(ms, this.leftPos + 293, this.topPos + 8, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_limestone.png"));
		this.blit(ms, this.leftPos + 333, this.topPos + 8, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_magnetite.png"));
		this.blit(ms, this.leftPos + 173, this.topPos + 64, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_malachite.png"));
		this.blit(ms, this.leftPos + 133, this.topPos + 64, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_minium.png"));
		this.blit(ms, this.leftPos + 213, this.topPos + 120, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_misery_drops.png"));
		this.blit(ms, this.leftPos + 333, this.topPos + 64, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_monazite.png"));
		this.blit(ms, this.leftPos + 253, this.topPos + 64, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_mountain_quartz.png"));
		this.blit(ms, this.leftPos + 373, this.topPos + 120, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_niter.png"));
		this.blit(ms, this.leftPos + 213, this.topPos + 64, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_platinum.png"));
		this.blit(ms, this.leftPos + 253, this.topPos + 120, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_polymorous.png"));
		this.blit(ms, this.leftPos + 173, this.topPos + 120, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_pyrolusite.png"));
		this.blit(ms, this.leftPos + 13, this.topPos + 120, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_smokey_quartz.png"));
		this.blit(ms, this.leftPos + 13, this.topPos + 176, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_spodumene.png"));
		this.blit(ms, this.leftPos + 293, this.topPos + 64, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_sulfur.png"));
		this.blit(ms, this.leftPos + 293, this.topPos + 120, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_vanadinite.png"));
		this.blit(ms, this.leftPos + 93, this.topPos + 176, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_wolframite.png"));
		this.blit(ms, this.leftPos + 133, this.topPos + 176, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_xenotime.png"));
		this.blit(ms, this.leftPos + 173, this.topPos + 176, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_ytterbium.png"));
		this.blit(ms, this.leftPos + 213, this.topPos + 176, 0, 0, 36, 52, 36, 52);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/card_zircon.png"));
		this.blit(ms, this.leftPos + 293, this.topPos + 176, 0, 0, 36, 52, 36, 52);

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
	}

	@Override
	public void init() {
		super.init();
		imagebutton_back = new ImageButton(this.leftPos + 388, this.topPos + 200, 32, 32, 0, 0, 32, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_back.png"), 32, 64, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(0, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_back", imagebutton_back);
		this.addRenderableWidget(imagebutton_back);
		imagebutton_card_select_hover = new ImageButton(this.leftPos + 13, this.topPos + 8, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(1, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover", imagebutton_card_select_hover);
		this.addRenderableWidget(imagebutton_card_select_hover);
		imagebutton_card_select_hover1 = new ImageButton(this.leftPos + 53, this.topPos + 8, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover1.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(2, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover1", imagebutton_card_select_hover1);
		this.addRenderableWidget(imagebutton_card_select_hover1);
		imagebutton_card_select_hover2 = new ImageButton(this.leftPos + 93, this.topPos + 8, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover2.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(3, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover2", imagebutton_card_select_hover2);
		this.addRenderableWidget(imagebutton_card_select_hover2);
		imagebutton_card_select_hover3 = new ImageButton(this.leftPos + 133, this.topPos + 8, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover3.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(4, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover3", imagebutton_card_select_hover3);
		this.addRenderableWidget(imagebutton_card_select_hover3);
		imagebutton_card_select_hover4 = new ImageButton(this.leftPos + 173, this.topPos + 8, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover4.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(5, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover4", imagebutton_card_select_hover4);
		this.addRenderableWidget(imagebutton_card_select_hover4);
		imagebutton_card_select_hover5 = new ImageButton(this.leftPos + 213, this.topPos + 8, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover5.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(6, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover5", imagebutton_card_select_hover5);
		this.addRenderableWidget(imagebutton_card_select_hover5);
		imagebutton_card_select_hover6 = new ImageButton(this.leftPos + 253, this.topPos + 8, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover6.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(7, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover6", imagebutton_card_select_hover6);
		this.addRenderableWidget(imagebutton_card_select_hover6);
		imagebutton_card_select_hover7 = new ImageButton(this.leftPos + 293, this.topPos + 8, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover7.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(8, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover7", imagebutton_card_select_hover7);
		this.addRenderableWidget(imagebutton_card_select_hover7);
		imagebutton_card_select_hover8 = new ImageButton(this.leftPos + 333, this.topPos + 8, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover8.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(9, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover8", imagebutton_card_select_hover8);
		this.addRenderableWidget(imagebutton_card_select_hover8);
		imagebutton_card_select_hover9 = new ImageButton(this.leftPos + 373, this.topPos + 8, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover9.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(10, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover9", imagebutton_card_select_hover9);
		this.addRenderableWidget(imagebutton_card_select_hover9);
		imagebutton_card_select_hover10 = new ImageButton(this.leftPos + 13, this.topPos + 64, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover10.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(11, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover10", imagebutton_card_select_hover10);
		this.addRenderableWidget(imagebutton_card_select_hover10);
		imagebutton_card_select_hover11 = new ImageButton(this.leftPos + 53, this.topPos + 64, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover11.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(12, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover11", imagebutton_card_select_hover11);
		this.addRenderableWidget(imagebutton_card_select_hover11);
		imagebutton_card_select_hover12 = new ImageButton(this.leftPos + 93, this.topPos + 64, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover12.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(13, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover12", imagebutton_card_select_hover12);
		this.addRenderableWidget(imagebutton_card_select_hover12);
		imagebutton_card_select_hover13 = new ImageButton(this.leftPos + 133, this.topPos + 64, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover13.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(14, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover13", imagebutton_card_select_hover13);
		this.addRenderableWidget(imagebutton_card_select_hover13);
		imagebutton_card_select_hover14 = new ImageButton(this.leftPos + 173, this.topPos + 64, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover14.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(15, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover14", imagebutton_card_select_hover14);
		this.addRenderableWidget(imagebutton_card_select_hover14);
		imagebutton_card_select_hover15 = new ImageButton(this.leftPos + 213, this.topPos + 64, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover15.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(16, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover15", imagebutton_card_select_hover15);
		this.addRenderableWidget(imagebutton_card_select_hover15);
		imagebutton_card_select_hover16 = new ImageButton(this.leftPos + 253, this.topPos + 64, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover16.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(17, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover16", imagebutton_card_select_hover16);
		this.addRenderableWidget(imagebutton_card_select_hover16);
		imagebutton_card_select_hover17 = new ImageButton(this.leftPos + 293, this.topPos + 64, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover17.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(18, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover17", imagebutton_card_select_hover17);
		this.addRenderableWidget(imagebutton_card_select_hover17);
		imagebutton_card_select_hover18 = new ImageButton(this.leftPos + 333, this.topPos + 64, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover18.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(19, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover18", imagebutton_card_select_hover18);
		this.addRenderableWidget(imagebutton_card_select_hover18);
		imagebutton_card_select_hover19 = new ImageButton(this.leftPos + 373, this.topPos + 64, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover19.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(20, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover19", imagebutton_card_select_hover19);
		this.addRenderableWidget(imagebutton_card_select_hover19);
		imagebutton_card_select_hover20 = new ImageButton(this.leftPos + 13, this.topPos + 120, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover20.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(21, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover20", imagebutton_card_select_hover20);
		this.addRenderableWidget(imagebutton_card_select_hover20);
		imagebutton_card_select_hover21 = new ImageButton(this.leftPos + 53, this.topPos + 120, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover21.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(22, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 22, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover21", imagebutton_card_select_hover21);
		this.addRenderableWidget(imagebutton_card_select_hover21);
		imagebutton_card_select_hover22 = new ImageButton(this.leftPos + 93, this.topPos + 120, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover22.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(23, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 23, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover22", imagebutton_card_select_hover22);
		this.addRenderableWidget(imagebutton_card_select_hover22);
		imagebutton_card_select_hover23 = new ImageButton(this.leftPos + 133, this.topPos + 120, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover23.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(24, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 24, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover23", imagebutton_card_select_hover23);
		this.addRenderableWidget(imagebutton_card_select_hover23);
		imagebutton_card_select_hover24 = new ImageButton(this.leftPos + 173, this.topPos + 120, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover24.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(25, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 25, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover24", imagebutton_card_select_hover24);
		this.addRenderableWidget(imagebutton_card_select_hover24);
		imagebutton_card_select_hover25 = new ImageButton(this.leftPos + 213, this.topPos + 120, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover25.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(26, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 26, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover25", imagebutton_card_select_hover25);
		this.addRenderableWidget(imagebutton_card_select_hover25);
		imagebutton_card_select_hover26 = new ImageButton(this.leftPos + 253, this.topPos + 120, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover26.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(27, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 27, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover26", imagebutton_card_select_hover26);
		this.addRenderableWidget(imagebutton_card_select_hover26);
		imagebutton_card_select_hover27 = new ImageButton(this.leftPos + 293, this.topPos + 120, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover27.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(28, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 28, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover27", imagebutton_card_select_hover27);
		this.addRenderableWidget(imagebutton_card_select_hover27);
		imagebutton_card_select_hover28 = new ImageButton(this.leftPos + 333, this.topPos + 120, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover28.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(29, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 29, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover28", imagebutton_card_select_hover28);
		this.addRenderableWidget(imagebutton_card_select_hover28);
		imagebutton_card_select_hover29 = new ImageButton(this.leftPos + 373, this.topPos + 120, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover29.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(30, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 30, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover29", imagebutton_card_select_hover29);
		this.addRenderableWidget(imagebutton_card_select_hover29);
		imagebutton_card_select_hover30 = new ImageButton(this.leftPos + 13, this.topPos + 176, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover30.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(31, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 31, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover30", imagebutton_card_select_hover30);
		this.addRenderableWidget(imagebutton_card_select_hover30);
		imagebutton_card_select_hover31 = new ImageButton(this.leftPos + 53, this.topPos + 176, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover31.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(32, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 32, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover31", imagebutton_card_select_hover31);
		this.addRenderableWidget(imagebutton_card_select_hover31);
		imagebutton_card_select_hover32 = new ImageButton(this.leftPos + 93, this.topPos + 176, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover32.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(33, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 33, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover32", imagebutton_card_select_hover32);
		this.addRenderableWidget(imagebutton_card_select_hover32);
		imagebutton_card_select_hover33 = new ImageButton(this.leftPos + 133, this.topPos + 176, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover33.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(34, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 34, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover33", imagebutton_card_select_hover33);
		this.addRenderableWidget(imagebutton_card_select_hover33);
		imagebutton_card_select_hover34 = new ImageButton(this.leftPos + 173, this.topPos + 176, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover34.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(35, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 35, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover34", imagebutton_card_select_hover34);
		this.addRenderableWidget(imagebutton_card_select_hover34);
		imagebutton_card_select_hover35 = new ImageButton(this.leftPos + 213, this.topPos + 176, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover35.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(36, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 36, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover35", imagebutton_card_select_hover35);
		this.addRenderableWidget(imagebutton_card_select_hover35);
		imagebutton_card_select_hover36 = new ImageButton(this.leftPos + 253, this.topPos + 176, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover36.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(37, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 37, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover36", imagebutton_card_select_hover36);
		this.addRenderableWidget(imagebutton_card_select_hover36);
		imagebutton_card_select_hover37 = new ImageButton(this.leftPos + 293, this.topPos + 176, 36, 52, 0, 0, 52, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_card_select_hover37.png"), 36, 104, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsMiningSelectionButtonMessage(38, x, y, z));
				InstructionsMiningSelectionButtonMessage.handleButtonAction(entity, 38, x, y, z);
			}
		});
		guistate.put("button:imagebutton_card_select_hover37", imagebutton_card_select_hover37);
		this.addRenderableWidget(imagebutton_card_select_hover37);
	}
}
