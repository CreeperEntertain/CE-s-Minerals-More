package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

import java.util.Map;

public class ConveyorRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_BOTTOM.get()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(CemmModBlocks.CONVEYOR_BOTTOM.get().defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.CONVEYOR_TOP.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_TOP.get()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(CemmModBlocks.CONVEYOR_TOP.get().defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.CONVEYOR_BOTTOM.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_IMPROVED_BOTTOM.get()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(CemmModBlocks.CONVEYOR_IMPROVED_BOTTOM.get().defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.CONVEYOR_IMPROVED_TOP.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_IMPROVED_TOP.get()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(CemmModBlocks.CONVEYOR_IMPROVED_TOP.get().defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.CONVEYOR_IMPROVED_BOTTOM.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_ADVANCED_BOTTOM.get()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(CemmModBlocks.CONVEYOR_ADVANCED_BOTTOM.get().defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.CONVEYOR_ADVANCED_TOP.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_ADVANCED_TOP.get()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(CemmModBlocks.CONVEYOR_ADVANCED_TOP.get().defaultBlockState()));
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.CONVEYOR_ADVANCED_BOTTOM.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
