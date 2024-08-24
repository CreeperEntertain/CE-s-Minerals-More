
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class GypsumWallBlock extends WallBlock {
	public GypsumWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.TUFF).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
