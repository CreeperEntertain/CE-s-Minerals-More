
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.procedures.ChalkOvergrowthProcedure;

public class MossyDriedMudBrickSlabBlock extends SlabBlock {
	public MossyDriedMudBrickSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERRACK).strength(0.65f, 1f).randomTicks().dynamicShape());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		ChalkOvergrowthProcedure.execute(world, x, y, z);
	}
}
