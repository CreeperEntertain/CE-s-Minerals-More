package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class NylinePlantGenerationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			random = Math.random();
			if (random >= 0 && random < 0.0125) {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.NYLINE_FUNGUS.get().defaultBlockState(), 3);
			} else if (random >= 0.0125 && random < 0.025) {
				if (world.getBiome(new BlockPos(x, y + 1, z)).is(new ResourceLocation("cemm:void_forest"))) {
					world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.INSTA_LUNARBARK_SAPLING.get().defaultBlockState(), 3);
				} else if (world.getBiome(new BlockPos(x, y + 1, z)).is(new ResourceLocation("cemm:void_pits"))) {
					world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.LUNARBARK_SAPLING.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x, y + 2, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(CemmModBlocks.TALL_SHIFTGRASS.get().defaultBlockState(), "half", "upper")), 3);
					world.setBlock(new BlockPos(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(CemmModBlocks.TALL_SHIFTGRASS.get().defaultBlockState(), "half", "lower")), 3);
				} else {
					world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.SHIFTGRASS.get().defaultBlockState(), 3);
				}
			} else if (random >= 0.025 && random < 0.05 && (world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x, y + 2, z), (new Object() {
					public BlockState with(BlockState _bs, String _property, String _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
					}
				}.with(CemmModBlocks.TALL_SHIFTGRASS.get().defaultBlockState(), "half", "upper")), 3);
				world.setBlock(new BlockPos(x, y + 1, z), (new Object() {
					public BlockState with(BlockState _bs, String _property, String _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
					}
				}.with(CemmModBlocks.TALL_SHIFTGRASS.get().defaultBlockState(), "half", "lower")), 3);
			} else if (random >= 0.05 && random < 0.15) {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.SHIFTGRASS.get().defaultBlockState(), 3);
			} else if (random >= 0.15 && random < 0.25) {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.SHIFTSPROUTS.get().defaultBlockState(), 3);
			} else if (random >= 0.25 && random < 1) {
				world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}
