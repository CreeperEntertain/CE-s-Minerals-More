
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class RawAquamarineWallBlock extends WallBlock {
	public RawAquamarineWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DRIPSTONE_BLOCK).strength(1.5f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
