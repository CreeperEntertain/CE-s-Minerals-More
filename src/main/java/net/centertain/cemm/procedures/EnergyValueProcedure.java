package net.centertain.cemm.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class EnergyValueProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format(new Object() {
			public int getEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(world, BlockPos.containing(entity.getPersistentData().getDouble("interactedBlockX"), entity.getPersistentData().getDouble("interactedBlockY"), entity.getPersistentData().getDouble("interactedBlockZ"))));
	}
}
