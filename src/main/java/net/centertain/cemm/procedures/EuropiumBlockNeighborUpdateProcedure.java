package net.centertain.cemm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.centertain.cemm.CemmMod;

public class EuropiumBlockNeighborUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER) {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 7, Level.ExplosionInteraction.BLOCK);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"advancement grant @a only cemm:call_me_a_chemist");
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				CemmMod.queueServerWork(1, () -> {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 7, Level.ExplosionInteraction.BLOCK);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"advancement grant @a only cemm:call_me_a_chemist");
				});
			}
		}
	}
}
