package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.centertain.cemm.world.inventory.OreDisplayGUIMenu;
import net.centertain.cemm.network.OreDisplayGUIButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class OreDisplayGUIScreen extends AbstractContainerScreen<OreDisplayGUIMenu> {
	private final static HashMap<String, Object> guistate = OreDisplayGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_mc_aluminum;
	ImageButton imagebutton_mc_antimony;
	ImageButton imagebutton_mc_arsenic;
	ImageButton imagebutton_mc_baryte;
	ImageButton imagebutton_mc_beryllium;
	ImageButton imagebutton_mc_cesium;
	ImageButton imagebutton_mc_chromium;
	ImageButton imagebutton_mc_cobalt;
	ImageButton imagebutton_mc_yttrium;
	ImageButton imagebutton_mc_fluorite;
	ImageButton imagebutton_mc_lanthanum;
	ImageButton imagebutton_mc_calcium;
	ImageButton imagebutton_mc_graphite;
	ImageButton imagebutton_mc_lead;
	ImageButton imagebutton_mc_zirconium;
	ImageButton imagebutton_mc_zinc;
	ImageButton imagebutton_mc_lithium;
	ImageButton imagebutton_mc_magnesium;
	ImageButton imagebutton_mc_manganese;
	ImageButton imagebutton_mc_neodymium;
	ImageButton imagebutton_mc_niobium;
	ImageButton imagebutton_mc_platinum;
	ImageButton imagebutton_mc_osmium;
	ImageButton imagebutton_mc_tin;
	ImageButton imagebutton_mc_tungsten;
	ImageButton imagebutton_mc_vanadium;
	ImageButton imagebutton_mc_sulfur;
	ImageButton imagebutton_mc_niter;

	public OreDisplayGUIScreen(OreDisplayGUIMenu container, Inventory inventory, Component text) {
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
		imagebutton_mc_aluminum = new ImageButton(this.leftPos + 17, this.topPos + 11, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_aluminum.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(0, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_aluminum", imagebutton_mc_aluminum);
		this.addRenderableWidget(imagebutton_mc_aluminum);
		imagebutton_mc_antimony = new ImageButton(this.leftPos + 17, this.topPos + 30, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_antimony.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(1, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_antimony", imagebutton_mc_antimony);
		this.addRenderableWidget(imagebutton_mc_antimony);
		imagebutton_mc_arsenic = new ImageButton(this.leftPos + 17, this.topPos + 49, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_arsenic.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(2, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_arsenic", imagebutton_mc_arsenic);
		this.addRenderableWidget(imagebutton_mc_arsenic);
		imagebutton_mc_baryte = new ImageButton(this.leftPos + 17, this.topPos + 68, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_baryte.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(3, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_baryte", imagebutton_mc_baryte);
		this.addRenderableWidget(imagebutton_mc_baryte);
		imagebutton_mc_beryllium = new ImageButton(this.leftPos + 17, this.topPos + 87, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_beryllium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(4, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_beryllium", imagebutton_mc_beryllium);
		this.addRenderableWidget(imagebutton_mc_beryllium);
		imagebutton_mc_cesium = new ImageButton(this.leftPos + 17, this.topPos + 125, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_cesium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(5, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_cesium", imagebutton_mc_cesium);
		this.addRenderableWidget(imagebutton_mc_cesium);
		imagebutton_mc_chromium = new ImageButton(this.leftPos + 17, this.topPos + 144, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_chromium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(6, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_chromium", imagebutton_mc_chromium);
		this.addRenderableWidget(imagebutton_mc_chromium);
		imagebutton_mc_cobalt = new ImageButton(this.leftPos + 17, this.topPos + 163, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_cobalt.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(7, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_cobalt", imagebutton_mc_cobalt);
		this.addRenderableWidget(imagebutton_mc_cobalt);
		imagebutton_mc_yttrium = new ImageButton(this.leftPos + 293, this.topPos + 30, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_yttrium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(8, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_yttrium", imagebutton_mc_yttrium);
		this.addRenderableWidget(imagebutton_mc_yttrium);
		imagebutton_mc_fluorite = new ImageButton(this.leftPos + 17, this.topPos + 182, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_fluorite.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(9, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_fluorite", imagebutton_mc_fluorite);
		this.addRenderableWidget(imagebutton_mc_fluorite);
		imagebutton_mc_lanthanum = new ImageButton(this.leftPos + 17, this.topPos + 220, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_lanthanum.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(10, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_lanthanum", imagebutton_mc_lanthanum);
		this.addRenderableWidget(imagebutton_mc_lanthanum);
		imagebutton_mc_calcium = new ImageButton(this.leftPos + 17, this.topPos + 106, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_calcium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(11, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_calcium", imagebutton_mc_calcium);
		this.addRenderableWidget(imagebutton_mc_calcium);
		imagebutton_mc_graphite = new ImageButton(this.leftPos + 17, this.topPos + 201, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_graphite.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(12, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_graphite", imagebutton_mc_graphite);
		this.addRenderableWidget(imagebutton_mc_graphite);
		imagebutton_mc_lead = new ImageButton(this.leftPos + 155, this.topPos + 11, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_lead.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(13, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_lead", imagebutton_mc_lead);
		this.addRenderableWidget(imagebutton_mc_lead);
		imagebutton_mc_zirconium = new ImageButton(this.leftPos + 293, this.topPos + 68, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_zirconium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(14, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_zirconium", imagebutton_mc_zirconium);
		this.addRenderableWidget(imagebutton_mc_zirconium);
		imagebutton_mc_zinc = new ImageButton(this.leftPos + 293, this.topPos + 49, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_zinc.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(15, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_zinc", imagebutton_mc_zinc);
		this.addRenderableWidget(imagebutton_mc_zinc);
		imagebutton_mc_lithium = new ImageButton(this.leftPos + 155, this.topPos + 30, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_lithium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(16, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_lithium", imagebutton_mc_lithium);
		this.addRenderableWidget(imagebutton_mc_lithium);
		imagebutton_mc_magnesium = new ImageButton(this.leftPos + 155, this.topPos + 49, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_magnesium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(17, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_magnesium", imagebutton_mc_magnesium);
		this.addRenderableWidget(imagebutton_mc_magnesium);
		imagebutton_mc_manganese = new ImageButton(this.leftPos + 155, this.topPos + 68, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_manganese.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(18, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_manganese", imagebutton_mc_manganese);
		this.addRenderableWidget(imagebutton_mc_manganese);
		imagebutton_mc_neodymium = new ImageButton(this.leftPos + 155, this.topPos + 87, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_neodymium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(19, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_neodymium", imagebutton_mc_neodymium);
		this.addRenderableWidget(imagebutton_mc_neodymium);
		imagebutton_mc_niobium = new ImageButton(this.leftPos + 155, this.topPos + 106, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_niobium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(20, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_niobium", imagebutton_mc_niobium);
		this.addRenderableWidget(imagebutton_mc_niobium);
		imagebutton_mc_platinum = new ImageButton(this.leftPos + 155, this.topPos + 163, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_platinum.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(21, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_platinum", imagebutton_mc_platinum);
		this.addRenderableWidget(imagebutton_mc_platinum);
		imagebutton_mc_osmium = new ImageButton(this.leftPos + 155, this.topPos + 144, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_osmium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(22, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 22, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_osmium", imagebutton_mc_osmium);
		this.addRenderableWidget(imagebutton_mc_osmium);
		imagebutton_mc_tin = new ImageButton(this.leftPos + 155, this.topPos + 201, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_tin.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(23, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 23, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_tin", imagebutton_mc_tin);
		this.addRenderableWidget(imagebutton_mc_tin);
		imagebutton_mc_tungsten = new ImageButton(this.leftPos + 155, this.topPos + 220, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_tungsten.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(24, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 24, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_tungsten", imagebutton_mc_tungsten);
		this.addRenderableWidget(imagebutton_mc_tungsten);
		imagebutton_mc_vanadium = new ImageButton(this.leftPos + 293, this.topPos + 11, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_vanadium.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(25, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 25, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_vanadium", imagebutton_mc_vanadium);
		this.addRenderableWidget(imagebutton_mc_vanadium);
		imagebutton_mc_sulfur = new ImageButton(this.leftPos + 155, this.topPos + 182, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_sulfur.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(26, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 26, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_sulfur", imagebutton_mc_sulfur);
		this.addRenderableWidget(imagebutton_mc_sulfur);
		imagebutton_mc_niter = new ImageButton(this.leftPos + 155, this.topPos + 125, 136, 18, 0, 0, 18, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_mc_niter.png"), 136, 36, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new OreDisplayGUIButtonMessage(27, x, y, z));
				OreDisplayGUIButtonMessage.handleButtonAction(entity, 27, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mc_niter", imagebutton_mc_niter);
		this.addRenderableWidget(imagebutton_mc_niter);
	}
}
