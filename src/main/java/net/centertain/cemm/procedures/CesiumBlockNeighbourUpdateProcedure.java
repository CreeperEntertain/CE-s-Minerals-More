package net.centertain.cemm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class CesiumBlockNeighbourUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.WATER) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 10, Explosion.BlockInteraction.DESTROY);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"advancement grant @a only cemm:call_me_a_chemist");
		}
	}
}
