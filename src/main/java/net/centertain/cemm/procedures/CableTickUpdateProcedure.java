package net.centertain.cemm.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;

public class CableTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double energy = 0;
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.DOWN) {
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y + 1, z))) {
				energy = new Object() {
					public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
						return _retval.get();
					}
				}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
				energy = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y + 1, z), (int) energy);
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y + 1, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.UP) {
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.DOWN).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y - 1, z))) {
				energy = new Object() {
					public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
						return _retval.get();
					}
				}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
				energy = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, Direction.DOWN).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y - 1, z), (int) energy);
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.DOWN).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.SOUTH).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y, z + 1))) {
				energy = new Object() {
					public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
						return _retval.get();
					}
				}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
				energy = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, Direction.SOUTH).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y, z + 1), (int) energy);
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.SOUTH).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.NORTH).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y, z - 1))) {
				energy = new Object() {
					public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
						return _retval.get();
					}
				}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
				energy = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, Direction.NORTH).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x, y, z - 1), (int) energy);
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z - 1));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.NORTH).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.EAST).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x + 1, y, z))) {
				energy = new Object() {
					public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
						return _retval.get();
					}
				}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
				energy = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, Direction.EAST).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x + 1, y, z), (int) energy);
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.EAST).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.WEST).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x - 1, y, z))) {
				energy = new Object() {
					public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
						return _retval.get();
					}
				}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
				energy = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, Direction.WEST).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, BlockPos.containing(x - 1, y, z), (int) energy);
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x - 1, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.WEST).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		}
	}
}
