package net.centertain.cemm.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class PurifierTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public int getEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(world, BlockPos.containing(x, y, z)) >= 100) {
			PCharcoalToCoalProcedure.execute(world, x, y, z);
			PDirtToGravelProcedure.execute(world, x, y, z);
			PGravelToFlintProcedure.execute(world, x, y, z);
			PRedSandToGoldNuggetProcedure.execute(world, x, y, z);
			PSoulSandToBonemealProcedure.execute(world, x, y, z);
			PMudToClayProcedure.execute(world, x, y, z);
			PSoulSoilToCoalProcedure.execute(world, x, y, z);
			PNetherrackToQuartzProcedure.execute(world, x, y, z);
			PMagmaToCramProcedure.execute(world, x, y, z);
			PCryingObsidianToBragonsBreathProcedure.execute(world, x, y, z);
			PTuffToBonemealProcedure.execute(world, x, y, z);
			PMudToClayProcedure.execute(world, x, y, z);
			PSoulSoilToCoalProcedure.execute(world, x, y, z);
			PNetherrackToQuartzProcedure.execute(world, x, y, z);
			PMagmaToCramProcedure.execute(world, x, y, z);
			PCryingObsidianToBragonsBreathProcedure.execute(world, x, y, z);
			PTuffToBonemealProcedure.execute(world, x, y, z);
			PGildedBlackstoneToGoldProcedure.execute(world, x, y, z);
			PDeepslateToObsidianProcedure.execute(world, x, y, z);
			PGraphiteToGemsProcedure.execute(world, x, y, z);
			PPureCarbonToGemsProcedure.execute(world, x, y, z);
			PSmokeyQuartzToMountainQuartzProcedure.execute(world, x, y, z);
		}
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "foundItem"))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("working", false);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putBoolean("foundItem", false);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}
