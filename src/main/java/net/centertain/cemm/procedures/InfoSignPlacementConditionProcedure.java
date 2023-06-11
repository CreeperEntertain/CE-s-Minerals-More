package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class InfoSignPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude() && blockstate == (new Object() {
			public BlockState with(BlockState _bs, Direction newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
					return _bs.setValue(_dp, newValue);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
			}
		}.with(blockstate, Direction.WEST))) {
			return true;
		}
		if (world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude() && blockstate == (new Object() {
			public BlockState with(BlockState _bs, Direction newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
					return _bs.setValue(_dp, newValue);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
			}
		}.with(blockstate, Direction.EAST))) {
			return true;
		}
		if (world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude() && blockstate == (new Object() {
			public BlockState with(BlockState _bs, Direction newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
					return _bs.setValue(_dp, newValue);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
			}
		}.with(blockstate, Direction.NORTH))) {
			return true;
		}
		if (world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude() && blockstate == (new Object() {
			public BlockState with(BlockState _bs, Direction newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
					return _bs.setValue(_dp, newValue);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
			}
		}.with(blockstate, Direction.SOUTH))) {
			return true;
		}
		return false;
	}
}
