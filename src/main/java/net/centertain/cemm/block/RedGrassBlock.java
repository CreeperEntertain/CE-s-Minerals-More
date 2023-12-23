
package net.centertain.cemm.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RedGrassBlock extends FlowerBlock {
	public RedGrassBlock() {
		super(() -> MobEffects.MOVEMENT_SPEED, 100,
				BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.CAVE_VINES).instabreak().noCollission().replaceable().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(2, 0, 2, 14, 12, 14).move(offset.x, offset.y, offset.z);
	}

	@Override
	public int getEffectDuration() {
		return 100;
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
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}
}
