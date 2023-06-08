package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.centertain.cemm.world.inventory.InstructionsElectrolyzerMenu;
import net.centertain.cemm.procedures.DisplayYttriumFluoriteCrystalProcedure;
import net.centertain.cemm.procedures.DisplayYtterbiumLanthanumIngotProcedure;
import net.centertain.cemm.procedures.DisplayYtterbiumCrystalsProcedure;
import net.centertain.cemm.procedures.DisplayPraseodymiumPiecesProcedure;
import net.centertain.cemm.procedures.DisplayNiobiumCrystalsProcedure;
import net.centertain.cemm.procedures.DisplayNeodymiumScrapProcedure;
import net.centertain.cemm.procedures.DisplayManganeseChunkProcedure;
import net.centertain.cemm.procedures.DisplayMagnesiumCrystalsProcedure;
import net.centertain.cemm.procedures.DisplayLanthanumScrapProcedure;
import net.centertain.cemm.procedures.DisplayLanthanumLumpProcedure;
import net.centertain.cemm.procedures.DisplayEuropiumOxideProcedure;
import net.centertain.cemm.procedures.DisplayCopperIngotProcedure;
import net.centertain.cemm.procedures.DisplayChromiumCrystalsProcedure;
import net.centertain.cemm.procedures.DisplayCalciumCrystalsProcedure;
import net.centertain.cemm.procedures.DisplayAluminumScrapProcedure;
import net.centertain.cemm.network.InstructionsElectrolyzerButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class InstructionsElectrolyzerScreen extends AbstractContainerScreen<InstructionsElectrolyzerMenu> {
	private final static HashMap<String, Object> guistate = InstructionsElectrolyzerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button_aluminum_scrap;
	ImageButton imagebutton_button_calcium_crystals;
	ImageButton imagebutton_button_chromium_crystal;
	ImageButton imagebutton_button_copper_ingot;
	ImageButton imagebutton_button_lanthanum_lump;
	ImageButton imagebutton_button_praseodymium_pieces;
	ImageButton imagebutton_button_europium_oxide;
	ImageButton imagebutton_button_magnesium_crystals;
	ImageButton imagebutton_button_manganese_chunk;
	ImageButton imagebutton_button_neodymium_scrap;
	ImageButton imagebutton_button_niobium_crystals;
	ImageButton imagebutton_button_ytterbium_crystals;
	ImageButton imagebutton_button_lanthanum_scrap;
	ImageButton imagebutton_button_ytterbium_lanthanum_ingot;
	ImageButton imagebutton_button_yttrium_fluorite_crystal;
	ImageButton imagebutton_back;

	public InstructionsElectrolyzerScreen(InstructionsElectrolyzerMenu container, Inventory inventory, Component text) {
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/electrolyzer.png"));
		this.blit(ms, this.leftPos + 170, this.topPos + 8, 0, 0, 18, 18, 18, 18);

		if (DisplayAluminumScrapProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_aluminum_scrap.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayCalciumCrystalsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_calcium_crystals.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayChromiumCrystalsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_chromium_crystals.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayCopperIngotProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_copper.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayEuropiumOxideProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_europium_oxide.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayLanthanumLumpProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_lanthanum_lump.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayLanthanumScrapProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_lanthanum_scrap.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayMagnesiumCrystalsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_magnesium_crystals.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayManganeseChunkProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_manganese_chunk.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayNeodymiumScrapProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_neodymium_scrap.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayNiobiumCrystalsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_niobium_crystals.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayPraseodymiumPiecesProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_praseodymium_pieces.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayYtterbiumCrystalsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_ytterbium_crystals.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayYtterbiumLanthanumIngotProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_ytterbium_lanthanum_ingot.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayYttriumFluoriteCrystalProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_yttrium_fluorite_crystal.png"));
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
		this.font.draw(poseStack, Component.translatable("gui.cemm.instructions_electrolyzer.label_electrolyzer"), 189, 12, -1);
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
		imagebutton_button_aluminum_scrap = new ImageButton(this.leftPos + 2, this.topPos + 1, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_aluminum_scrap.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(0, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_aluminum_scrap", imagebutton_button_aluminum_scrap);
		this.addRenderableWidget(imagebutton_button_aluminum_scrap);
		imagebutton_button_calcium_crystals = new ImageButton(this.leftPos + 2, this.topPos + 17, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_calcium_crystals.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(1, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_calcium_crystals", imagebutton_button_calcium_crystals);
		this.addRenderableWidget(imagebutton_button_calcium_crystals);
		imagebutton_button_chromium_crystal = new ImageButton(this.leftPos + 2, this.topPos + 32, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_chromium_crystal.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(2, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_chromium_crystal", imagebutton_button_chromium_crystal);
		this.addRenderableWidget(imagebutton_button_chromium_crystal);
		imagebutton_button_copper_ingot = new ImageButton(this.leftPos + 2, this.topPos + 49, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_copper_ingot.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(3, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_copper_ingot", imagebutton_button_copper_ingot);
		this.addRenderableWidget(imagebutton_button_copper_ingot);
		imagebutton_button_lanthanum_lump = new ImageButton(this.leftPos + 2, this.topPos + 81, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_lanthanum_lump.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(4, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_lanthanum_lump", imagebutton_button_lanthanum_lump);
		this.addRenderableWidget(imagebutton_button_lanthanum_lump);
		imagebutton_button_praseodymium_pieces = new ImageButton(this.leftPos + 2, this.topPos + 177, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_praseodymium_pieces.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(5, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_praseodymium_pieces", imagebutton_button_praseodymium_pieces);
		this.addRenderableWidget(imagebutton_button_praseodymium_pieces);
		imagebutton_button_europium_oxide = new ImageButton(this.leftPos + 2, this.topPos + 64, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_europium_oxide.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(6, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_europium_oxide", imagebutton_button_europium_oxide);
		this.addRenderableWidget(imagebutton_button_europium_oxide);
		imagebutton_button_magnesium_crystals = new ImageButton(this.leftPos + 2, this.topPos + 113, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_magnesium_crystals.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(7, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_magnesium_crystals", imagebutton_button_magnesium_crystals);
		this.addRenderableWidget(imagebutton_button_magnesium_crystals);
		imagebutton_button_manganese_chunk = new ImageButton(this.leftPos + 2, this.topPos + 129, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_manganese_chunk.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(8, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_manganese_chunk", imagebutton_button_manganese_chunk);
		this.addRenderableWidget(imagebutton_button_manganese_chunk);
		imagebutton_button_neodymium_scrap = new ImageButton(this.leftPos + 2, this.topPos + 145, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_neodymium_scrap.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(9, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_neodymium_scrap", imagebutton_button_neodymium_scrap);
		this.addRenderableWidget(imagebutton_button_neodymium_scrap);
		imagebutton_button_niobium_crystals = new ImageButton(this.leftPos + 2, this.topPos + 161, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_niobium_crystals.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(10, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_niobium_crystals", imagebutton_button_niobium_crystals);
		this.addRenderableWidget(imagebutton_button_niobium_crystals);
		imagebutton_button_ytterbium_crystals = new ImageButton(this.leftPos + 2, this.topPos + 193, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_ytterbium_crystals.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(11, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_ytterbium_crystals", imagebutton_button_ytterbium_crystals);
		this.addRenderableWidget(imagebutton_button_ytterbium_crystals);
		imagebutton_button_lanthanum_scrap = new ImageButton(this.leftPos + 2, this.topPos + 97, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_lanthanum_scrap.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(12, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_lanthanum_scrap", imagebutton_button_lanthanum_scrap);
		this.addRenderableWidget(imagebutton_button_lanthanum_scrap);
		imagebutton_button_ytterbium_lanthanum_ingot = new ImageButton(this.leftPos + 2, this.topPos + 209, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_ytterbium_lanthanum_ingot.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(13, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_ytterbium_lanthanum_ingot", imagebutton_button_ytterbium_lanthanum_ingot);
		this.addRenderableWidget(imagebutton_button_ytterbium_lanthanum_ingot);
		imagebutton_button_yttrium_fluorite_crystal = new ImageButton(this.leftPos + 2, this.topPos + 225, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_yttrium_fluorite_crystal.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(14, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_yttrium_fluorite_crystal", imagebutton_button_yttrium_fluorite_crystal);
		this.addRenderableWidget(imagebutton_button_yttrium_fluorite_crystal);
		imagebutton_back = new ImageButton(this.leftPos + 388, this.topPos + 200, 32, 32, 0, 0, 32, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_back.png"), 32, 64, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsElectrolyzerButtonMessage(15, x, y, z));
				InstructionsElectrolyzerButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_back", imagebutton_back);
		this.addRenderableWidget(imagebutton_back);
	}
}
