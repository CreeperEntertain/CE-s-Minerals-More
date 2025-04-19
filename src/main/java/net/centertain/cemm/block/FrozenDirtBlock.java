
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class FrozenDirtBlock extends Block {
	public FrozenDirtBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.CALCITE).strength(0.85f, 0.75f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
