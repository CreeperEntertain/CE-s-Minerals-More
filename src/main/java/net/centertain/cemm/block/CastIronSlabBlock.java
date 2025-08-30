
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CastIronSlabBlock extends SlabBlock {
	public CastIronSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(5f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
