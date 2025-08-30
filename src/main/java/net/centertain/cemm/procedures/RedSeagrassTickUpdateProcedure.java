package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RedSeagrassTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 7
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip2 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip2) : -1) < 2) {
			{
				int _value = (int) (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip4
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip4)
						: -1) + 1);
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}
