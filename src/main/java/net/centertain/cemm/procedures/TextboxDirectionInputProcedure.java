package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class TextboxDirectionInputProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap guistate) {
		if (guistate == null)
			return;
		if ((guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("UP") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("Up")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("up") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("U")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("u") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("0")) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("blockOutputDirection", "up");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (guistate.get("text:DIR") instanceof EditBox _tf)
				_tf.setValue("Up");
		} else if ((guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("DOWN") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("Down")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("down") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("D")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("d") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("1")) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("blockOutputDirection", "down");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (guistate.get("text:DIR") instanceof EditBox _tf)
				_tf.setValue("Down");
		} else if ((guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("EAST") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("East")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("east") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("E")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("e") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("2")) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("blockOutputDirection", "east");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (guistate.get("text:DIR") instanceof EditBox _tf)
				_tf.setValue("East");
		} else if ((guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("WEST") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("West")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("west") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("W")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("w") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("3")) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("blockOutputDirection", "west");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (guistate.get("text:DIR") instanceof EditBox _tf)
				_tf.setValue("West");
		} else if ((guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("NORTH") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("North")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("north") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("N")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("n") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("4")) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("blockOutputDirection", "north");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (guistate.get("text:DIR") instanceof EditBox _tf)
				_tf.setValue("North");
		} else if ((guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("SOUTH") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("South")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("south") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("S")
				|| (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("s") || (guistate.containsKey("text:DIR") ? ((EditBox) guistate.get("text:DIR")).getValue() : "").equals("5")) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("blockOutputDirection", "south");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (guistate.get("text:DIR") instanceof EditBox _tf)
				_tf.setValue("South");
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("blockOutputDirection", "NULL");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (guistate.get("text:DIR") instanceof EditBox _tf)
				_tf.setValue("");
		}
		BlockPlacerGUIClosedProcedure.execute(world, x, y, z);
	}
}
