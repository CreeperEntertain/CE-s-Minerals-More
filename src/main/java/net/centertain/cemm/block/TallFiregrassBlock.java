
package net.centertain.cemm.block;

import net.minecraftforge.common.PlantType;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class TallFiregrassBlock extends DoublePlantBlock {
	public TallFiregrassBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().noCollission().replaceable().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(CemmModBlocks.FIREGRASS_BLOCK_ANDESITE.get()) || groundState.is(CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get()) || groundState.is(CemmModBlocks.FIREGRASS_BLOCK_DIRT.get())
				|| groundState.is(CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get()) || groundState.is(CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get()) || groundState.is(CemmModBlocks.FIREGRASS_BLOCK_MOSS.get())
				|| groundState.is(CemmModBlocks.FIREGRASS_BLOCK_STONE.get()) || groundState.is(CemmModBlocks.FIREGRASS_BLOCK_TUFF.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		if (blockstate.getValue(HALF) == DoubleBlockHalf.UPPER)
			return groundState.is(this) && groundState.getValue(HALF) == DoubleBlockHalf.LOWER;
		else
			return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.PLAINS;
	}
}
