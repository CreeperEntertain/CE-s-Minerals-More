
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class DriedMudSlabBlock extends SlabBlock {
	public DriedMudSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERRACK).strength(0.65f, 1f).dynamicShape());
	}
}
