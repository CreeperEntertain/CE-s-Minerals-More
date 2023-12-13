package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class OvergrownBlockSpreadingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.25) {
			if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
					|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:moss_blocks")))) {
				if ((world.getLevelData().isRaining() || world.getLevelData().isThundering()) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= 7
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:water")))) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COBBLESTONE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_COBBLESTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DIRTY_COBBLESTONE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_DIRTY_COBBLESTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MOSSY_COBBLESTONE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_MOSSY_COBBLESTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.ROCKY_STONE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_ROCKY_STONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_STONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TUFF) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_TUFF.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_DEEPSLATE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COBBLED_DEEPSLATE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_COBBLED_DEEPSLATE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.PEAT.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_PEAT.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MUD) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_MUD.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CALCITE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_CALCITE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIRT) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_DIRT.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ROOTED_DIRT) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_ROOTED_DIRT.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COARSE_DIRT) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_COARSE_DIRT.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CHALK.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_CHALK.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.LIMESTONE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_LIMESTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.PACKED_MUD) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_PACKED_MUD.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OBSIDIAN) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_OBSIDIAN.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRYING_OBSIDIAN) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_CRYING_OBSIDIAN.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BLACKSTONE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_BLACKSTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SANDSTONE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_SANDSTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.RED_SANDSTONE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_RED_SANDSTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CLAY) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_CLAY.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_TUBE_CORAL_BLOCK) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_TUBE_CORAL.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_BRAIN_CORAL_BLOCK) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_BRAIN_CORAL.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_BUBBLE_CORAL_BLOCK) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_BUBBLE_CORAL.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_FIRE_CORAL_BLOCK) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_FIRE_CORAL.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_HORN_CORAL_BLOCK) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_HORN_CORAL.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BASALT) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_BASALT.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SMOOTH_BASALT) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_SMOOTH_BASALT.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SLATE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_SLATE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GNEISS.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_GNEISS.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.RHYOLITE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_RHYOLITE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DRIPSTONE_BLOCK) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_DRIPSTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GABBRO.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_GABBRO.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DEEPSTONE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_DEEPSTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.PUMICE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_PUMICE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SILTSTONE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_SILTSTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.MUDSTONE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_MUDSTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SEA_SALT_BLOCK.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_SEA_SALT.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SALT_BLOCK.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_SALT.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.HARDENED_SAND.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_HARDENED_SAND.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.TOUGH_SAND.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_TOUGH_SAND.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ANDESITE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_ANDESITE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIORITE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_ANDESITE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRANITE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_GRANITE.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
