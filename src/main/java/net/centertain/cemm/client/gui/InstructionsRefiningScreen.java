package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.centertain.cemm.world.inventory.InstructionsRefiningMenu;
import net.centertain.cemm.procedures.DisplayZirconiumScrapProcedure;
import net.centertain.cemm.procedures.DisplayYttriumIronGarnetProcedure;
import net.centertain.cemm.procedures.DisplayVanadiumCrystalsProcedure;
import net.centertain.cemm.procedures.DisplaySteelIngotProcedure;
import net.centertain.cemm.procedures.DisplayRutheniumBitsProcedure;
import net.centertain.cemm.procedures.DisplayPlasticGranulesProcedure;
import net.centertain.cemm.procedures.DisplayOsmiumPowderProcedure;
import net.centertain.cemm.procedures.DisplayManganeseIronChunkProcedure;
import net.centertain.cemm.procedures.DisplayMagnesiumNiobiumIngotProcedure;
import net.centertain.cemm.procedures.DisplayLithiumScrapProcedure;
import net.centertain.cemm.procedures.DisplayGalvanizedSteelIngotProcedure;
import net.centertain.cemm.procedures.DisplayDecomposedSpodumeneProcedure;
import net.centertain.cemm.procedures.DisplayCobaltPiecesProcedure;
import net.centertain.cemm.procedures.DisplayClearCrystalProcedure;
import net.centertain.cemm.procedures.DisplayBerylliumIngotProcedure;
import net.centertain.cemm.network.InstructionsRefiningButtonMessage;
import net.centertain.cemm.CemmMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class InstructionsRefiningScreen extends AbstractContainerScreen<InstructionsRefiningMenu> {
	private final static HashMap<String, Object> guistate = InstructionsRefiningMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button_beryllium_ingot;
	ImageButton imagebutton_button_clear_crystal;
	ImageButton imagebutton_button_cobalt_pieces;
	ImageButton imagebutton_button_galvanized_steel_ingot;
	ImageButton imagebutton_button_decomposed_spodumene;
	ImageButton imagebutton_button_magnesium_niobium_ingot;
	ImageButton imagebutton_button_manganese_iron_chunk;
	ImageButton imagebutton_button_plastic_granules;
	ImageButton imagebutton_button_ruthenium_bits;
	ImageButton imagebutton_button_osmium_powder;
	ImageButton imagebutton_button_steel_ingot;
	ImageButton imagebutton_button_vanadium_crystals;
	ImageButton imagebutton_button_yttrium_iron_garnet;
	ImageButton imagebutton_button_zirconium_scrap;
	ImageButton imagebutton_back;
	ImageButton imagebutton_button_lithium_scrap;

	public InstructionsRefiningScreen(InstructionsRefiningMenu container, Inventory inventory, Component text) {
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/refinery.png"));
		this.blit(ms, this.leftPos + 170, this.topPos + 8, 0, 0, 18, 18, 18, 18);

		if (DisplayBerylliumIngotProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_beryllium_ingot.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayClearCrystalProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_clear_crystal.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayCobaltPiecesProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_cobalt_pieces.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayDecomposedSpodumeneProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_decomposed_spodumene.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayGalvanizedSteelIngotProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_galvanized_steel.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayLithiumScrapProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_lithium_scrap.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayMagnesiumNiobiumIngotProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_magnesium_niobium_ingot.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayManganeseIronChunkProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_manganese_iron_chunk.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayOsmiumPowderProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_osmium_powder.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayPlasticGranulesProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_plastic_granules.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayRutheniumBitsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_ruthenium_bits.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplaySteelIngotProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_steel_ingot.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayVanadiumCrystalsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_vanadium_crystal.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayYttriumIronGarnetProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_yttrium_iron_garnet.png"));
			this.blit(ms, this.leftPos + 195, this.topPos + 53, 0, 0, 176, 96, 176, 96);
		}
		if (DisplayZirconiumScrapProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cemm:textures/screens/recipe_zirconium_scrap.png"));
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
		this.font.draw(poseStack, Component.translatable("gui.cemm.instructions_refining.label_refinery"), 189, 12, -1);
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
		imagebutton_button_beryllium_ingot = new ImageButton(this.leftPos + 2, this.topPos + 1, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_beryllium_ingot.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(0, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_beryllium_ingot", imagebutton_button_beryllium_ingot);
		this.addRenderableWidget(imagebutton_button_beryllium_ingot);
		imagebutton_button_clear_crystal = new ImageButton(this.leftPos + 2, this.topPos + 17, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_clear_crystal.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(1, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_clear_crystal", imagebutton_button_clear_crystal);
		this.addRenderableWidget(imagebutton_button_clear_crystal);
		imagebutton_button_cobalt_pieces = new ImageButton(this.leftPos + 2, this.topPos + 33, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_cobalt_pieces.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(2, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_cobalt_pieces", imagebutton_button_cobalt_pieces);
		this.addRenderableWidget(imagebutton_button_cobalt_pieces);
		imagebutton_button_galvanized_steel_ingot = new ImageButton(this.leftPos + 2, this.topPos + 65, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_galvanized_steel_ingot.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(3, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_galvanized_steel_ingot", imagebutton_button_galvanized_steel_ingot);
		this.addRenderableWidget(imagebutton_button_galvanized_steel_ingot);
		imagebutton_button_decomposed_spodumene = new ImageButton(this.leftPos + 2, this.topPos + 49, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_decomposed_spodumene.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(4, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_decomposed_spodumene", imagebutton_button_decomposed_spodumene);
		this.addRenderableWidget(imagebutton_button_decomposed_spodumene);
		imagebutton_button_magnesium_niobium_ingot = new ImageButton(this.leftPos + 2, this.topPos + 97, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_magnesium_niobium_ingot.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(5, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_magnesium_niobium_ingot", imagebutton_button_magnesium_niobium_ingot);
		this.addRenderableWidget(imagebutton_button_magnesium_niobium_ingot);
		imagebutton_button_manganese_iron_chunk = new ImageButton(this.leftPos + 2, this.topPos + 113, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_manganese_iron_chunk.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(6, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_manganese_iron_chunk", imagebutton_button_manganese_iron_chunk);
		this.addRenderableWidget(imagebutton_button_manganese_iron_chunk);
		imagebutton_button_plastic_granules = new ImageButton(this.leftPos + 2, this.topPos + 145, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_plastic_granules.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(7, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_plastic_granules", imagebutton_button_plastic_granules);
		this.addRenderableWidget(imagebutton_button_plastic_granules);
		imagebutton_button_ruthenium_bits = new ImageButton(this.leftPos + 2, this.topPos + 161, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_ruthenium_bits.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(8, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_ruthenium_bits", imagebutton_button_ruthenium_bits);
		this.addRenderableWidget(imagebutton_button_ruthenium_bits);
		imagebutton_button_osmium_powder = new ImageButton(this.leftPos + 2, this.topPos + 129, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_osmium_powder.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(9, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_osmium_powder", imagebutton_button_osmium_powder);
		this.addRenderableWidget(imagebutton_button_osmium_powder);
		imagebutton_button_steel_ingot = new ImageButton(this.leftPos + 2, this.topPos + 177, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_steel_ingot.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(10, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_steel_ingot", imagebutton_button_steel_ingot);
		this.addRenderableWidget(imagebutton_button_steel_ingot);
		imagebutton_button_vanadium_crystals = new ImageButton(this.leftPos + 2, this.topPos + 193, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_vanadium_crystals.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(11, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_vanadium_crystals", imagebutton_button_vanadium_crystals);
		this.addRenderableWidget(imagebutton_button_vanadium_crystals);
		imagebutton_button_yttrium_iron_garnet = new ImageButton(this.leftPos + 2, this.topPos + 209, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_yttrium_iron_garnet.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(12, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_yttrium_iron_garnet", imagebutton_button_yttrium_iron_garnet);
		this.addRenderableWidget(imagebutton_button_yttrium_iron_garnet);
		imagebutton_button_zirconium_scrap = new ImageButton(this.leftPos + 2, this.topPos + 225, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_zirconium_scrap.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(13, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_zirconium_scrap", imagebutton_button_zirconium_scrap);
		this.addRenderableWidget(imagebutton_button_zirconium_scrap);
		imagebutton_back = new ImageButton(this.leftPos + 388, this.topPos + 200, 32, 32, 0, 0, 32, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_back.png"), 32, 64, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(14, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_back", imagebutton_back);
		this.addRenderableWidget(imagebutton_back);
		imagebutton_button_lithium_scrap = new ImageButton(this.leftPos + 2, this.topPos + 81, 150, 16, 0, 0, 16, new ResourceLocation("cemm:textures/screens/atlas/imagebutton_button_lithium_scrap.png"), 150, 32, e -> {
			if (true) {
				CemmMod.PACKET_HANDLER.sendToServer(new InstructionsRefiningButtonMessage(15, x, y, z));
				InstructionsRefiningButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_lithium_scrap", imagebutton_button_lithium_scrap);
		this.addRenderableWidget(imagebutton_button_lithium_scrap);
	}
}
