
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class RawCopperBrickWallBlock extends WallBlock {
	public RawCopperBrickWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS).strength(2f, 3f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
