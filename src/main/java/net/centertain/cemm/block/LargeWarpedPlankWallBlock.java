
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class LargeWarpedPlankWallBlock extends WallBlock {
	public LargeWarpedPlankWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STEM).strength(2f, 3f).dynamicShape().forceSolidOn());
	}
}
