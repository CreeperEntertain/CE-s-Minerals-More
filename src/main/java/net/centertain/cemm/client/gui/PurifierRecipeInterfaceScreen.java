package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.centertain.cemm.world.inventory.PurifierRecipeInterfaceMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PurifierRecipeInterfaceScreen extends AbstractContainerScreen<PurifierRecipeInterfaceMenu> {
	private final static HashMap<String, Object> guistate = PurifierRecipeInterfaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PurifierRecipeInterfaceScreen(PurifierRecipeInterfaceMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 54, this.topPos + 13, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/charcoal.png"), this.leftPos + 18, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/coal.png"), this.leftPos + 63, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 54, this.topPos + 31, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/dragon_breath.png"), this.leftPos + 63, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/crying_obsidian_preview.png"), this.leftPos + 18, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/deepslate_preview.png"), this.leftPos + 18, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 54, this.topPos + 49, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/obsidian_preview.png"), this.leftPos + 63, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/dirt_preview.png"), this.leftPos + 18, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/gravel_preview.png"), this.leftPos + 63, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/gilded_blackstone_preview.png"), this.leftPos + 18, this.topPos + 85, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/gold_ingot.png"), this.leftPos + 63, this.topPos + 85, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/graphite_block_preview.png"), this.leftPos + 18, this.topPos + 103, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/emerald_shard.png"), this.leftPos + 63, this.topPos + 103, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/diamond_shard.png"), this.leftPos + 90, this.topPos + 103, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/gravel_preview.png"), this.leftPos + 18, this.topPos + 121, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/flint.png"), this.leftPos + 63, this.topPos + 121, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/magma_block_preview.png"), this.leftPos + 18, this.topPos + 139, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/magma_cream.png"), this.leftPos + 63, this.topPos + 139, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/mud_preview.png"), this.leftPos + 18, this.topPos + 157, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/clay_preview.png"), this.leftPos + 63, this.topPos + 157, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/netherrack_preview.png"), this.leftPos + 18, this.topPos + 175, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/quartz.png"), this.leftPos + 63, this.topPos + 175, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/pure_carbon.png"), this.leftPos + 144, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/emerald_shard.png"), this.leftPos + 189, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/diamond_shard.png"), this.leftPos + 216, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/red_sand_preview.png"), this.leftPos + 144, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/gold_nugget.png"), this.leftPos + 189, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/red_sandstone_preview.png"), this.leftPos + 144, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/gold_nugget.png"), this.leftPos + 189, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/smokey_quartz.png"), this.leftPos + 144, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/mountain_quartz.png"), this.leftPos + 189, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/soul_sand_preview.png"), this.leftPos + 144, this.topPos + 85, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/bone_meal.png"), this.leftPos + 189, this.topPos + 85, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/soul_soil_preview.png"), this.leftPos + 144, this.topPos + 103, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/coal.png"), this.leftPos + 189, this.topPos + 103, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/tuff_preview.png"), this.leftPos + 144, this.topPos + 121, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/bone_meal.png"), this.leftPos + 189, this.topPos + 121, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 54, this.topPos + 67, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 54, this.topPos + 85, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 54, this.topPos + 103, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 54, this.topPos + 121, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 54, this.topPos + 139, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 54, this.topPos + 157, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 54, this.topPos + 175, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 180, this.topPos + 13, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 180, this.topPos + 31, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 180, this.topPos + 49, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 180, this.topPos + 67, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 180, this.topPos + 85, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 180, this.topPos + 103, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 180, this.topPos + 121, 0, 0, 1, 16, 1, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_2"), 36, 22, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_1"), 81, 22, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_11"), 81, 40, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_12"), 36, 40, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_32"), 36, 58, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_13"), 81, 58, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_empty"), 18, 58, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_any_similar_item"), 18, 211, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_empty1"), 18, 76, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_21"), 36, 76, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_14"), 81, 76, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_empty2"), 18, 94, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_15"), 36, 94, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_16"), 81, 94, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_22"), 36, 112, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_17"), 81, 112, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_18"), 108, 112, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_211"), 117, 103, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_ab_means_random_chance_numbers"), 18, 229, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_empty3"), 18, 130, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_19"), 36, 130, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_110"), 81, 130, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_8"), 36, 148, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_111"), 81, 148, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_112"), 36, 166, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_113"), 81, 166, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_23"), 36, 184, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_empty4"), 18, 184, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_114"), 81, 184, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_115"), 162, 22, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_116"), 207, 22, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_117"), 234, 22, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_121"), 243, 13, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_118"), 162, 40, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_3"), 207, 40, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_119"), 162, 58, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_31"), 207, 58, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_120"), 162, 76, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_122"), 207, 76, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_123"), 162, 94, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_124"), 207, 94, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_125"), 162, 112, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_126"), 207, 112, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_127"), 162, 130, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cemm.purifier_recipe_interface.label_128"), 207, 130, -1, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
