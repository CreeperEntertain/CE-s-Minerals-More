package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RedCactusTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "growthStage") == 6)) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("growthStage", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "growthStage") + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:red_cactus_base")))
					&& (world.getBlockState(BlockPos.containing(x, y - 2, z))).is(BlockTags.create(new ResourceLocation("cemm:red_cactus_base")))
					&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).is(BlockTags.create(new ResourceLocation("cemm:red_cactus_base")))) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.RED_CACTUS.get().defaultBlockState(), 3);
			}
		}
	}
}
