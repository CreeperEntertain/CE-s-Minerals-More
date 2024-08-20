
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class LargeCrimsonPlankWallBlock extends WallBlock {
	public LargeCrimsonPlankWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STEM).strength(2f, 3f).dynamicShape().forceSolidOn());
	}
}
