package net.centertain.cemm.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ThermalPipeEnergyProvisionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.MAGMA_BLOCK
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.MAGMA_BLOCK || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.MAGMA_BLOCK
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.MAGMA_BLOCK || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.MAGMA_BLOCK
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.NETHERRACK || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.NETHERRACK
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.NETHERRACK || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.NETHERRACK
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.NETHERRACK || (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.WARPED_NYLIUM
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.WARPED_NYLIUM || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WARPED_NYLIUM
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.WARPED_NYLIUM || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.WARPED_NYLIUM
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.CRIMSON_NYLIUM || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.CRIMSON_NYLIUM
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CRIMSON_NYLIUM || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.CRIMSON_NYLIUM
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.CRIMSON_NYLIUM) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y + new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "thermalDistance"), z));
				int _amount = (int) (17 - (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "thermalDistance")));
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
	}
}
