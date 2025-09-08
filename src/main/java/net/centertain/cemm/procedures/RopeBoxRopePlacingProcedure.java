package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class RopeBoxRopePlacingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean Found = false;
		boolean CanPlace = false;
		double Slot = 0;
		double RopeEnd = 0;
		double LastRope = 0;
		if (world instanceof Level _level0 && _level0.hasNeighborSignal(BlockPos.containing(x, y, z))) {
			Slot = 8;
			RopeEnd = y;
			for (int index0 = 0; index0 < 9; index0++) {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), (int) Slot)).getItem() == CemmModBlocks.ROPE.get().asItem()) {
					Found = true;
					break;
				}
				Slot = Slot - 1;
			}
			if (Found) {
				while ((world.getBlockState(BlockPos.containing(x, RopeEnd, z))).getBlock() == CemmModBlocks.ROPE.get() || (world.getBlockState(BlockPos.containing(x, RopeEnd, z))).getBlock() == CemmModBlocks.ROPE_BOX.get()) {
					RopeEnd = RopeEnd - 1;
					if ((world.getBlockState(BlockPos.containing(x, RopeEnd, z))).getBlock() == Blocks.AIR) {
						CanPlace = true;
					}
				}
				if (CanPlace) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = (int) Slot;
							final ItemStack _setstack = new ItemStack(CemmModBlocks.ROPE.get()).copy();
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), (int) Slot) - 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					world.setBlock(BlockPos.containing(x, RopeEnd, z), CemmModBlocks.ROPE.get().defaultBlockState(), 3);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x + 0.5, RopeEnd + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound((x + 0.5), (RopeEnd + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
				}
			}
		} else {
			RopeEnd = y;
			for (int index2 = 0; index2 < 9; index2++) {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), (int) Slot)).getItem() == Blocks.AIR.asItem() || (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), (int) Slot)).getItem() == CemmModBlocks.ROPE.get().asItem() && new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), (int) Slot) < new ItemStack(CemmModBlocks.ROPE.get()).getMaxStackSize()) {
					Found = true;
					break;
				}
				Slot = Slot + 1;
			}
			if (Found) {
				LastRope = y;
				while ((world.getBlockState(BlockPos.containing(x, RopeEnd, z))).getBlock() == CemmModBlocks.ROPE.get() || (world.getBlockState(BlockPos.containing(x, RopeEnd, z))).getBlock() == CemmModBlocks.ROPE_BOX.get()) {
					RopeEnd = RopeEnd - 1;
					if ((world.getBlockState(BlockPos.containing(x, RopeEnd, z))).getBlock() == CemmModBlocks.ROPE.get()) {
						LastRope = RopeEnd;
						CanPlace = true;
					}
				}
				if (y > LastRope) {
					world.setBlock(BlockPos.containing(x, LastRope, z), Blocks.AIR.defaultBlockState(), 3);
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = (int) Slot;
							final ItemStack _setstack = new ItemStack(CemmModBlocks.ROPE.get()).copy();
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), (int) Slot) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					world.levelEvent(2001, BlockPos.containing(x, LastRope, z), Block.getId(CemmModBlocks.ROPE.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x + 0.5, LastRope + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound((x + 0.5), (LastRope + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
