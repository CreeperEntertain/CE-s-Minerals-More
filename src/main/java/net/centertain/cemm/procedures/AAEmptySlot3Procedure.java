package net.centertain.cemm.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class AAEmptySlot3Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos(entity.getPersistentData().getDouble("interactedBlockX"), entity.getPersistentData().getDouble("interactedBlockY"), entity.getPersistentData().getDouble("interactedBlockZ")));
			if (_ent != null) {
				final int _slotid = 3;
				final ItemStack _setstack = new ItemStack(Blocks.AIR);
				_setstack.setCount(1);
				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable)
						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
				});
			}
		}
	}
}
