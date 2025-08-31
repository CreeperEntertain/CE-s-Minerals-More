package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class DarkBambooGeneratorExtensionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double Height = 0;
		double Type = 0;
		Type = Mth.nextInt(RandomSource.create(), 1, 3);
		Height = 0;
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 9, 14); index0++) {
			world.setBlock(BlockPos.containing(x, y + Height, z), CemmModBlocks.DARK_BAMBOO.get().defaultBlockState(), 3);
			if (Type == 1) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y + Height, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if (Type == 2) {
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y + Height, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				{
					int _value = 4;
					BlockPos _pos = BlockPos.containing(x, y + Height, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
			Height = Height + 1;
		}
		world.setBlock(BlockPos.containing(x, y + Height, z), CemmModBlocks.DARK_BAMBOO.get().defaultBlockState(), 3);
		if (Type == 1) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y + Height, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (Type == 2) {
			{
				int _value = 3;
				BlockPos _pos = BlockPos.containing(x, y + Height, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else {
			{
				int _value = 5;
				BlockPos _pos = BlockPos.containing(x, y + Height, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y + Height, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putBoolean("topmost", true);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		return true;
	}
}
