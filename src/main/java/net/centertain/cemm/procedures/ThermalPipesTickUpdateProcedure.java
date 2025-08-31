package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ThermalPipesTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean pipeAbove = false;
		double thermalDistance = 0;
		pipeAbove = false;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.THERMAL_GENERATOR.get()) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("thermalDistance", 1);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			ThermalPipeEnergyProvisionProcedure.execute(world, x, y, z);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.THERMAL_PIPES.get()) {
			pipeAbove = true;
			thermalDistance = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y + 1, z), "thermalDistance");
		}
		if (pipeAbove && thermalDistance <= 15) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("thermalDistance", (thermalDistance + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			ThermalPipeEnergyProvisionProcedure.execute(world, x, y, z);
		}
	}
}
