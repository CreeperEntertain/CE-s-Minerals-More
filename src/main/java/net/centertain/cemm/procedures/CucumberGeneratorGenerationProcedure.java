package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class CucumberGeneratorGenerationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double height = 0;
		height = Mth.nextInt(RandomSource.create(), 1, 3);
		if (height == 3) {
			if (Math.random() <= 0.5) {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.CUCUMBER_GRID_00.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.THREAD_GRID.get().defaultBlockState(), 3);
			}
			if (Math.random() <= 0.5) {
				world.setBlock(new BlockPos(x, y + 2, z), CemmModBlocks.CUCUMBER_GRID_00.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y + 2, z), CemmModBlocks.THREAD_GRID.get().defaultBlockState(), 3);
			}
			if (Math.random() <= 0.5) {
				world.setBlock(new BlockPos(x, y + 3, z), CemmModBlocks.CUCUMBER_GRID_00.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y + 3, z), CemmModBlocks.THREAD_GRID.get().defaultBlockState(), 3);
			}
			{
				Direction _dir = Direction.getRandom(RandomSource.create());
				BlockPos _pos = new BlockPos(x, y + 1, z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
			{
				Direction _dir = (new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(new BlockPos(x, y + 1, z)))));
				BlockPos _pos = new BlockPos(x, y + 2, z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
			{
				Direction _dir = (new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(new BlockPos(x, y + 1, z)))));
				BlockPos _pos = new BlockPos(x, y + 3, z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		} else if (height == 2) {
			if (Math.random() <= 0.5) {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.CUCUMBER_GRID_00.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.THREAD_GRID.get().defaultBlockState(), 3);
			}
			if (Math.random() <= 0.5) {
				world.setBlock(new BlockPos(x, y + 2, z), CemmModBlocks.CUCUMBER_GRID_00.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y + 2, z), CemmModBlocks.THREAD_GRID.get().defaultBlockState(), 3);
			}
			{
				Direction _dir = Direction.getRandom(RandomSource.create());
				BlockPos _pos = new BlockPos(x, y + 1, z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
			{
				Direction _dir = (new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(new BlockPos(x, y + 1, z)))));
				BlockPos _pos = new BlockPos(x, y + 2, z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		} else {
			if (Math.random() <= 0.5) {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.CUCUMBER_GRID_00.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.THREAD_GRID.get().defaultBlockState(), 3);
			}
			{
				Direction _dir = Direction.getRandom(RandomSource.create());
				BlockPos _pos = new BlockPos(x, y + 1, z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		}
	}
}
