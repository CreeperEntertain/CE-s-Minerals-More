package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.centertain.cemm.world.inventory.InstructionsPressurizerMenu;
import net.centertain.cemm.procedures.DisplayZirconCrystalProcedure;
import net.centertain.cemm.procedures.DisplayZincIngotProcedure;
import net.centertain.cemm.procedures.DisplayTungstenIngotProcedure;
import net.centertain.cemm.procedures.DisplayTinIngotProcedure;
import net.centertain.cemm.procedures.DisplayTantalumBitsProcedure;
import net.centertain.cemm.procedures.DisplayRawYttriumProcedure;
import net.centertain.cemm.procedures.DisplayRawYtterbiumProcedure;
import net.centertain.cemm.procedures.DisplayPureCarbonProcedure;
import net.centertain.cemm.procedures.DisplayManganeseIronGarnetProcedure;
import net.centertain.cemm.procedures.DisplayIndiumScrapProcedure;
import net.centertain.cemm.procedures.DisplayHafniumScrapProcedure;
import net.centertain.cemm.procedures.DisplayHafniumCarbidePowderProcedure;
import net.centertain.cemm.procedures.DisplayHafniumCarbidePelletProcedure;
import net.centertain.cemm.network.InstructionsPressurizerButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class InstructionsPressurizerScreen extends AbstractContainerScreen<InstructionsPressurizerMenu> {
	private final static HashMap<String, Object> guistate = InstructionsPressurizerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button_hafnium_carbide_pellet;
	ImageButton imagebutton_button_hafnium_carbide_powder;
	ImageButton imagebutton_button_manganese_iron_ingot;
	ImageButton imagebutton_button_pure_carbon;
	ImageButton imagebutton_button_raw_yttrium;
	ImageButton imagebutton_button_raw_ytterbium;
	ImageButton imagebutton_button_tin_ingot;
	ImageButton imagebutton_button_tantalum_bits;
	ImageButton imagebutton_button_tungsten_ingot;
	ImageButton imagebutton_button_zinc_ingot;
	ImageButton imagebutton_button_indium_scrap;
	ImageButton imagebutton_button_zircon_crystal;
	ImageButton imagebutton_button_hafnium_scrap;
	ImageButton imagebutton_back;

	public InstructionsPressurizerScreen(InstructionsPressurizerMenu container, Inventory inventory, Component text) {
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/pressurizer.png"));
		this.blit(ms, this.leftPos + 170, this.topPos + 8, 0, 0, 18, 18, 18, 18);

		if (DisplayHafniumCarbidePelletProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_hafnium_carbide_pellet.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayHafniumCarbidePowderProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_hafnium_carbide_powder.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayHafniumScrapProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_hafnium_scrap.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayIndiumScrapProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_indium_scrap.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayManganeseIronGarnetProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_manganese_iron_ingot.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayPureCarbonProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_pure_carbon.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayRawYtterbiumProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_raw_ytterbium.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayRawYttriumProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_raw_yttrium.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayTantalumBitsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_tantalum_bits.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayTinIngotProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_tin_ingot.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayTungstenIngotProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_tungsten_ingot.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayZincIngotProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_zinc_ingot.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayZirconCrystalProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_zircon_crystal.png"));
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
		this.font.draw(poseStack, Component.translatable("gui.cemm.instructions_pressurizer.label_pressurizer"), 189, 12, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_button_hafnium_carbide_pellet = new ImageButton(this.leftPos + 2, this.topPos + 1, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_hafnium_carbide_pellet.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(0, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_hafnium_carbide_pellet", imagebutton_button_hafnium_carbide_pellet);
		this.addRenderableWidget(imagebutton_button_hafnium_carbide_pellet);
		imagebutton_button_hafnium_carbide_powder = new ImageButton(this.leftPos + 2, this.topPos + 17, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_hafnium_carbide_powder.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(1, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_hafnium_carbide_powder", imagebutton_button_hafnium_carbide_powder);
		this.addRenderableWidget(imagebutton_button_hafnium_carbide_powder);
		imagebutton_button_manganese_iron_ingot = new ImageButton(this.leftPos + 2, this.topPos + 65, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_manganese_iron_ingot.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(2, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_manganese_iron_ingot", imagebutton_button_manganese_iron_ingot);
		this.addRenderableWidget(imagebutton_button_manganese_iron_ingot);
		imagebutton_button_pure_carbon = new ImageButton(this.leftPos + 2, this.topPos + 81, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_pure_carbon.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(3, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_pure_carbon", imagebutton_button_pure_carbon);
		this.addRenderableWidget(imagebutton_button_pure_carbon);
		imagebutton_button_raw_yttrium = new ImageButton(this.leftPos + 2, this.topPos + 113, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_raw_yttrium.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(4, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_raw_yttrium", imagebutton_button_raw_yttrium);
		this.addRenderableWidget(imagebutton_button_raw_yttrium);
		imagebutton_button_raw_ytterbium = new ImageButton(this.leftPos + 2, this.topPos + 97, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_raw_ytterbium.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(5, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_raw_ytterbium", imagebutton_button_raw_ytterbium);
		this.addRenderableWidget(imagebutton_button_raw_ytterbium);
		imagebutton_button_tin_ingot = new ImageButton(this.leftPos + 2, this.topPos + 145, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_tin_ingot.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(6, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_tin_ingot", imagebutton_button_tin_ingot);
		this.addRenderableWidget(imagebutton_button_tin_ingot);
		imagebutton_button_tantalum_bits = new ImageButton(this.leftPos + 2, this.topPos + 129, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_tantalum_bits.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(7, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_tantalum_bits", imagebutton_button_tantalum_bits);
		this.addRenderableWidget(imagebutton_button_tantalum_bits);
		imagebutton_button_tungsten_ingot = new ImageButton(this.leftPos + 2, this.topPos + 161, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_tungsten_ingot.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(8, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_tungsten_ingot", imagebutton_button_tungsten_ingot);
		this.addRenderableWidget(imagebutton_button_tungsten_ingot);
		imagebutton_button_zinc_ingot = new ImageButton(this.leftPos + 2, this.topPos + 177, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_zinc_ingot.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(9, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_zinc_ingot", imagebutton_button_zinc_ingot);
		this.addRenderableWidget(imagebutton_button_zinc_ingot);
		imagebutton_button_indium_scrap = new ImageButton(this.leftPos + 2, this.topPos + 49, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_indium_scrap.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(10, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_indium_scrap", imagebutton_button_indium_scrap);
		this.addRenderableWidget(imagebutton_button_indium_scrap);
		imagebutton_button_zircon_crystal = new ImageButton(this.leftPos + 2, this.topPos + 193, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_zircon_crystal.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(11, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_zircon_crystal", imagebutton_button_zircon_crystal);
		this.addRenderableWidget(imagebutton_button_zircon_crystal);
		imagebutton_button_hafnium_scrap = new ImageButton(this.leftPos + 2, this.topPos + 33, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_hafnium_scrap.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(12, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_hafnium_scrap", imagebutton_button_hafnium_scrap);
		this.addRenderableWidget(imagebutton_button_hafnium_scrap);
		imagebutton_back = new ImageButton(this.leftPos + 388, this.topPos + 200, 32, 32, 0, 0, 32, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_back.png"), 32, 64, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsPressurizerButtonMessage(13, x, y, z));
				InstructionsPressurizerButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_back", imagebutton_back);
		this.addRenderableWidget(imagebutton_back);
	}
}
