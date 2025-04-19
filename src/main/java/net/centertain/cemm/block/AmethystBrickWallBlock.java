
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class AmethystBrickWallBlock extends WallBlock {
	public AmethystBrickWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.AMETHYST).strength(1.5f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
