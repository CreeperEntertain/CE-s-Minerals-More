
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class FrostBrickWallBlock extends WallBlock {
	public FrostBrickWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS).strength(1.5f, 0.5f).requiresCorrectToolForDrops().friction(0.75f).dynamicShape().forceSolidOn());
	}
}
