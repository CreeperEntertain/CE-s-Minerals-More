
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class CyanIceWallBlock extends WallBlock {
	public CyanIceWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(0.5f).requiresCorrectToolForDrops().friction(0.98f).dynamicShape().forceSolidOn());
	}
}
