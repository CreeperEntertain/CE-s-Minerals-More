
package net.centertain.cemm.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class PackedBlackIceBlock extends Block {
	public PackedBlackIceBlock() {
		super(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).strength(0.5f).friction(0.98f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
