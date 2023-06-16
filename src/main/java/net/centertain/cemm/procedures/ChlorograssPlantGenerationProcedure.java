package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ChlorograssPlantGenerationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Rand = 0;
		double RandRot = 0;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			Rand = Math.random();
			if (Rand <= 0.01) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.CHLOROWOOD_SAPLING.get().defaultBlockState(), 3);
			} else if (Rand <= 0.05) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.CHLOROSTALK.get().defaultBlockState(), 3);
			} else if (Rand <= 0.15) {
				if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y + 2, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(CemmModBlocks.TALL_CHLOROGRASS.get().defaultBlockState(), "half", "upper")), 3);
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(CemmModBlocks.TALL_CHLOROGRASS.get().defaultBlockState(), "half", "lower")), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.CHLOROGRASS.get().defaultBlockState(), 3);
				}
			} else if (Rand <= 0.4) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.CHLOROGRASS.get().defaultBlockState(), 3);
			} else {
				RandRot = Math.random();
				if (RandRot <= 0.25) {
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(CemmModBlocks.CHLOROLEAVES.get().defaultBlockState(), "facing", "north")), 3);
				} else if (RandRot <= 0.5) {
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(CemmModBlocks.CHLOROLEAVES.get().defaultBlockState(), "facing", "south")), 3);
				} else if (RandRot <= 0.75) {
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(CemmModBlocks.CHLOROLEAVES.get().defaultBlockState(), "facing", "east")), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(CemmModBlocks.CHLOROLEAVES.get().defaultBlockState(), "facing", "west")), 3);
				}
			}
		}
	}
}
