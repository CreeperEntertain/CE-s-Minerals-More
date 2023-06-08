package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class FiregrassPlantGenerationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Rand = 0;
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			Rand = Math.random();
			if (Rand <= 0.05) {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.FIREFRUIT_SHRUB.get().defaultBlockState(), 3);
			} else if (Rand <= 0.2) {
				if ((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x, y + 2, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(CemmModBlocks.TALL_FIREGRASS.get().defaultBlockState(), "half", "upper")), 3);
					world.setBlock(new BlockPos(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(CemmModBlocks.TALL_FIREGRASS.get().defaultBlockState(), "half", "lower")), 3);
				} else {
					world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.FIREGRASS.get().defaultBlockState(), 3);
				}
			} else if (Rand <= 0.7) {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.FIREGRASS.get().defaultBlockState(), 3);
			}
		}
	}
}
