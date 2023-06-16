
package net.centertain.cemm.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.procedures.OvergrownBlockUpdateTickProcedure;

public class OvergrownDirtyCobblestoneBlock extends Block {
	public OvergrownDirtyCobblestoneBlock() {
		super(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL).strength(0.85f, 1.5f).randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		OvergrownBlockUpdateTickProcedure.execute(world, x, y, z);
	}
}
