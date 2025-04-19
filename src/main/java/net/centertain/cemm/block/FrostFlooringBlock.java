
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class FrostFlooringBlock extends Block {
	public FrostFlooringBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1.5f, 0.5f).requiresCorrectToolForDrops().friction(0.75f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
