
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class LepidocrociteWallBlock extends WallBlock {
	public LepidocrociteWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
