package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class OvergrownBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		GrassblockGrassRegrowthProcedure.execute(world, x, y, z);
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= 7 && (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:moss_blocks"))))) {
			OvergrownBlockSpreadingProcedure.execute(world, (x - 1), y, z);
			OvergrownBlockSpreadingProcedure.execute(world, (x + 1), y, z);
			OvergrownBlockSpreadingProcedure.execute(world, x, y, (z - 1));
			OvergrownBlockSpreadingProcedure.execute(world, x, y, (z + 1));
			OvergrownBlockSpreadingProcedure.execute(world, (x - 1), (y - 1), z);
			OvergrownBlockSpreadingProcedure.execute(world, (x - 1), (y + 1), z);
			OvergrownBlockSpreadingProcedure.execute(world, (x + 1), (y - 1), z);
			OvergrownBlockSpreadingProcedure.execute(world, (x + 1), (y + 1), z);
			OvergrownBlockSpreadingProcedure.execute(world, x, (y - 1), (z - 1));
			OvergrownBlockSpreadingProcedure.execute(world, x, (y + 1), (z - 1));
			OvergrownBlockSpreadingProcedure.execute(world, x, (y - 1), (z + 1));
			OvergrownBlockSpreadingProcedure.execute(world, x, (y + 1), (z + 1));
		} else if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() && !(world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:moss_blocks")))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_COBBLESTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_DIRTY_COBBLESTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DIRTY_COBBLESTONE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_MOSSY_COBBLESTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_ROCKY_STONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.ROCKY_STONE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_STONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_TUFF.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.TUFF.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_DEEPSLATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DEEPSLATE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_COBBLED_DEEPSLATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.COBBLED_DEEPSLATE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_PEAT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.PEAT.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_MUD.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.MUD.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_CALCITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CALCITE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_DIRT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_ROOTED_DIRT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_COARSE_DIRT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.COARSE_DIRT.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_CHALK.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHALK.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_LIMESTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.LIMESTONE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_PACKED_MUD.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.PACKED_MUD.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_OBSIDIAN.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.OBSIDIAN.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_CRYING_OBSIDIAN.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_BLACKSTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.BLACKSTONE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_SANDSTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.SANDSTONE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_RED_SANDSTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.RED_SANDSTONE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_CLAY.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CLAY.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_TUBE_CORAL.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DEAD_TUBE_CORAL_BLOCK.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_BRAIN_CORAL.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DEAD_BRAIN_CORAL_BLOCK.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_BUBBLE_CORAL.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DEAD_BUBBLE_CORAL_BLOCK.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_FIRE_CORAL.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DEAD_FIRE_CORAL_BLOCK.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_HORN_CORAL.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DEAD_HORN_CORAL_BLOCK.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_BASALT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.BASALT.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_SMOOTH_BASALT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.SMOOTH_BASALT.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_SLATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SLATE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_GNEISS.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GNEISS.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_RHYOLITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RHYOLITE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_DRIPSTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DRIPSTONE_BLOCK.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_GABBRO.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GABBRO.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_DEEPSTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DEEPSTONE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_PUMICE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.PUMICE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_SILTSTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SILTSTONE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_MUDSTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.MUDSTONE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_SEA_SALT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SEA_SALT_BLOCK.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_SALT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SALT_BLOCK.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_HARDENED_SAND.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.HARDENED_SAND.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_TOUGH_SAND.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.TOUGH_SAND.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_ANDESITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.ANDESITE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_DIORITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DIORITE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_GRANITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.GRANITE.defaultBlockState(), 3);
			}
		}
	}
}
