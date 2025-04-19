
package net.centertain.cemm.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SmolderbarkLeavesBlock extends LeavesBlock {
	public SmolderbarkLeavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.AZALEA_LEAVES).strength(0.2f).lightLevel(s -> 12).noOcclusion().randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}
}
