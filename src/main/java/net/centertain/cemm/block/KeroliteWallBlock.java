
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class KeroliteWallBlock extends WallBlock {
	public KeroliteWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
