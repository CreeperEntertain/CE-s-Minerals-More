
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class PolishedRawRubyWallBlock extends WallBlock {
	public PolishedRawRubyWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANCIENT_DEBRIS).strength(4f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
