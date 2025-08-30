
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class CliffgravelBlock extends FallingBlock {
	public CliffgravelBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(0.65f, 0.8f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
