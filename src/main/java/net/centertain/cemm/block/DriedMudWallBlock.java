
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class DriedMudWallBlock extends WallBlock {
	public DriedMudWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERRACK).strength(0.65f, 1f).dynamicShape().forceSolidOn());
	}
}
