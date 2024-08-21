
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class CitrineWallBlock extends WallBlock {
	public CitrineWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANCIENT_DEBRIS).strength(4f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
