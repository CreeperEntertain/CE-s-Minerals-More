package net.centertain.cemm.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.centertain.cemm.world.inventory.BlockRefineryRecipeInterfaceMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlockRefineryRecipeInterfaceScreen extends AbstractContainerScreen<BlockRefineryRecipeInterfaceMenu> {
	private final static HashMap<String, Object> guistate = BlockRefineryRecipeInterfaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BlockRefineryRecipeInterfaceScreen(BlockRefineryRecipeInterfaceMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/gold_ingot.png"), this.leftPos + 36, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/rough_marble_preview.png"), this.leftPos + 18, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/framed_rough_marble_preview.png"), this.leftPos + 72, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/rough_marble_preview.png"), this.leftPos + 18, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/cyan_dye.png"), this.leftPos + 36, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_preview.png"), this.leftPos + 72, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_stairs_preview.png"), this.leftPos + 90, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_slab_preview.png"), this.leftPos + 108, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_wall_preview.png"), this.leftPos + 126, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_frame_preview.png"), this.leftPos + 144, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_bottom_preview.png"), this.leftPos + 162, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_top_preview.png"), this.leftPos + 180, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_crowned_preview.png"), this.leftPos + 198, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_middle_preview.png"), this.leftPos + 216, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_board_preview.png"), this.leftPos + 234, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/painted_rough_marble_chiseled_frame_preview.png"), this.leftPos + 252, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/crowned_rough_marble_preview.png"), this.leftPos + 90, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/crowned_rough_marble_facing_preview.png"), this.leftPos + 108, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/ornamented_rough_marble_preview.png"), this.leftPos + 126, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/ornamented_rough_marble_facing_preview.png"), this.leftPos + 144, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/lined_rough_marble_preview.png"), this.leftPos + 162, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/lined_rough_marble_facing_preview.png"), this.leftPos + 180, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/gilded_rough_marble_preview.png"), this.leftPos + 198, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/gilded_rough_marble_facing_preview.png"), this.leftPos + 216, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/rough_marble_corner_top_left_preview.png"), this.leftPos + 234, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/rough_marble_corner_top_right_preview.png"), this.leftPos + 252, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/rough_marble_corner_bottom_left_preview.png"), this.leftPos + 270, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/rough_marble_corner_bottom_right_preview.png"), this.leftPos + 288, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 62, this.topPos + 13, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 62, this.topPos + 31, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/vertical_line_16.png"), this.leftPos + 62, this.topPos + 49, 0, 0, 1, 16, 1, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/iron_ingot.png"), this.leftPos + 36, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/ravenstone_preview.png"), this.leftPos + 18, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/ravenstone_flooring_preview.png"), this.leftPos + 72, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/decorated_ravenstone_flooring_preview.png"), this.leftPos + 90, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/framed_ravenstone_preview.png"), this.leftPos + 108, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/rimmed_ravenstone_preview.png"), this.leftPos + 126, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/crowned_ravenstone_preview.png"), this.leftPos + 144, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/ravenstone_ornament_preview.png"), this.leftPos + 162, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("cemm:textures/screens/lined_ravenstone_preview.png"), this.leftPos + 180, this.topPos + 49, 0, 0, 16, 16, 16, 16);

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
	public void init() {
		super.init();
	}
}
