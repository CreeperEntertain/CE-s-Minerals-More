
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class PolishedAmethystWallBlock extends WallBlock {
	public PolishedAmethystWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.AMETHYST).strength(1.5f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
