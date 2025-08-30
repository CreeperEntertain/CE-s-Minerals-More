
package net.centertain.cemm.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class LunarbarkStairsBlock extends StairBlock {
	public LunarbarkStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.STEM).strength(26f, 6f).lightLevel(s -> 5).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 6f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
