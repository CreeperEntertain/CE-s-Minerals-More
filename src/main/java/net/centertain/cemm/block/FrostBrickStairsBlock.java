
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class FrostBrickStairsBlock extends StairBlock {
	public FrostBrickStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS).strength(1.5f, 0.5f).requiresCorrectToolForDrops().friction(0.75f).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 0.5f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
