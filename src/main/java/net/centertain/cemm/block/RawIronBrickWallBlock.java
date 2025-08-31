
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class RawIronBrickWallBlock extends WallBlock {
	public RawIronBrickWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS).strength(5f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
