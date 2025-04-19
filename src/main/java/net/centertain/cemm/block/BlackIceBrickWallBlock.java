
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class BlackIceBrickWallBlock extends WallBlock {
	public BlackIceBrickWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(0.5f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
