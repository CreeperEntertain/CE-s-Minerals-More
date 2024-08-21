package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralEndSpruceBranchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		double RANDDirection = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		RAND = Mth.nextInt(RandomSource.create(), 2, 3);
		RANDDirection = Mth.nextInt(RandomSource.create(), 1, 4);
		X = x;
		Y = y;
		Z = z;
		if (RANDDirection == 1) {
			Z = Z - 1;
		} else if (RANDDirection == 2) {
			Z = Z + 1;
		} else if (RANDDirection == 3) {
			X = X - 1;
		} else {
			X = X + 1;
		}
		for (int index0 = 0; index0 < (int) RAND; index0++) {
			if ((world.getBlockState(BlockPos.containing(X, Y, Z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(X, Y, Z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
				world.setBlock(BlockPos.containing(X, Y, Z), CemmModBlocks.END_SPRUCE_LOG.get().defaultBlockState(), 3);
				if (RANDDirection == 1) {
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = BlockPos.containing(X, Y, Z);
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
				} else if (RANDDirection == 2) {
					{
						Direction _dir = Direction.SOUTH;
						BlockPos _pos = BlockPos.containing(X, Y, Z);
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
				} else if (RANDDirection == 3) {
					{
						Direction _dir = Direction.WEST;
						BlockPos _pos = BlockPos.containing(X, Y, Z);
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
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = BlockPos.containing(X, Y, Z);
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
			if (RANDDirection == 1) {
				Z = Z - 1;
			} else if (RANDDirection == 2) {
				Z = Z + 1;
			} else if (RANDDirection == 3) {
				X = X - 1;
			} else {
				X = X + 1;
			}
		}
		if (RANDDirection == 1) {
			Z = Z + 1;
		} else if (RANDDirection == 2) {
			Z = Z - 1;
		} else if (RANDDirection == 3) {
			X = X + 1;
		} else {
			X = X - 1;
		}
		RAND = Mth.nextInt(RandomSource.create(), 2, 5);
		for (int index1 = 0; index1 < (int) RAND; index1++) {
			if ((world.getBlockState(BlockPos.containing(X, Y, Z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(X, Y, Z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
				world.setBlock(BlockPos.containing(X, Y, Z), CemmModBlocks.END_SPRUCE_LOG.get().defaultBlockState(), 3);
			}
			Y = Y + 1;
		}
		world.setBlock(BlockPos.containing(X, Y, Z), CemmModBlocks.END_SPRUCE_LOG.get().defaultBlockState(), 3);
		EndSpruceCrownProcedure.execute(world, X, Y, Z);
	}
}
