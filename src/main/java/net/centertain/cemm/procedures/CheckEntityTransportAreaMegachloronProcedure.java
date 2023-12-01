package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class CheckEntityTransportAreaMegachloronProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double X = 0;
		double Y = 0;
		double Z = 0;
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getPersistentData().getDouble("PosX")), (entity.getPersistentData().getDouble("PosY")), (entity.getPersistentData().getDouble("PosZ")));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("PosX")), (entity.getPersistentData().getDouble("PosY")), (entity.getPersistentData().getDouble("PosZ")), _ent.getYRot(), _ent.getXRot());
		}
		world.setBlock(BlockPos.containing(entity.getPersistentData().getDouble("PosX"), entity.getPersistentData().getDouble("PosY"), entity.getPersistentData().getDouble("PosZ")), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(entity.getPersistentData().getDouble("PosX"), entity.getPersistentData().getDouble("PosY") + 1, entity.getPersistentData().getDouble("PosZ")), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(entity.getPersistentData().getDouble("PosX"), entity.getPersistentData().getDouble("PosY") - 1, entity.getPersistentData().getDouble("PosZ")), Blocks.OBSIDIAN.defaultBlockState(), 3);
	}
}
