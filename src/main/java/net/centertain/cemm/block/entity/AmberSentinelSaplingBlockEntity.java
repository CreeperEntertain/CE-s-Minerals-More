package net.centertain.cemm.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlockEntities;

public class AmberSentinelSaplingBlockEntity extends BlockEntity {
	public AmberSentinelSaplingBlockEntity(BlockPos pos, BlockState state) {
		super(CemmModBlockEntities.AMBER_SENTINEL_SAPLING.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
