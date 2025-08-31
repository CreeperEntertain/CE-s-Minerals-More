
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

public class TallRedGrassBlock extends DoublePlantBlock {
	public TallRedGrassBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.CAVE_VINES).instabreak().noCollission().replaceable().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(CemmModBlocks.BORDEAUX_ANORTHITE.get()) || groundState.is(CemmModBlocks.BORDEAUX_MICROCLINE.get()) || groundState.is(CemmModBlocks.BORDEAUX_MONZONITE.get()) || groundState.is(CemmModBlocks.BORDEAUX_MOSS.get())
				|| groundState.is(CemmModBlocks.BORDEAUX_MYLONITE.get()) || groundState.is(CemmModBlocks.BORDEAUX_OLIGOCLASE.get()) || groundState.is(CemmModBlocks.BORDEAUX_PHYLLITE.get()) || groundState.is(CemmModBlocks.BORDEAUX_PYROXENE.get())
				|| groundState.is(CemmModBlocks.BORDEAUX_QUARTZITE.get()) || groundState.is(CemmModBlocks.BORDEAUX_RED_SALT.get()) || groundState.is(CemmModBlocks.BORDEAUX_SANIDINE.get()) || groundState.is(CemmModBlocks.BORDEAUX_SERANDITE.get())
				|| groundState.is(CemmModBlocks.BORDEAUX_SOAPSTONE.get()) || groundState.is(CemmModBlocks.BORDEAUX_WHITE_GRANITE.get());
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
