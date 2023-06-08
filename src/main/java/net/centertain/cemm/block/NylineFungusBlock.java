
package net.centertain.cemm.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

import java.util.List;
import java.util.Collections;

public class NylineFungusBlock extends FlowerBlock {
	public NylineFungusBlock() {
		super(MobEffects.DIG_SPEED, 1800, BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.FUNGUS).instabreak().noCollission());
	}

	@Override
	public int getEffectDuration() {
		return 1800;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(CemmModBlocks.META_CARBONITE.get()) || groundState.is(CemmModBlocks.NYLINE.get()) || groundState.is(CemmModBlocks.POLYMOROUS_ORE.get()) || groundState.is(CemmModBlocks.CHRONOCRYSTAL_BLOCK.get())
				|| groundState.is(CemmModBlocks.BUDDING_CHRONOCRYSTAL.get()) || groundState.is(CemmModBlocks.LUNARBARK_STEM.get()) || groundState.is(CemmModBlocks.STRIPPED_LUNARBARK_STEM.get()) || groundState.is(CemmModBlocks.LUNARBARK_PLANKS.get())
				|| groundState.is(CemmModBlocks.MISERY_STONE.get()) || groundState.is(CemmModBlocks.XANTHANIUM_BLOCK.get()) || groundState.is(CemmModBlocks.NIGHTBARK_LEAVES.get()) || groundState.is(CemmModBlocks.NIGHTBARK_LEAVES_1.get())
				|| groundState.is(CemmModBlocks.NIGHTBARK_LEAVES_2.get()) || groundState.is(CemmModBlocks.NIGHTBARK_LEAVES_3.get()) || groundState.is(CemmModBlocks.LUNARBARK_LEAVES.get()) || groundState.is(CemmModBlocks.NIGHTBARK_LEAVES_4.get())
				|| groundState.is(CemmModBlocks.NIGHTBARK_LEAVES_5.get()) || groundState.is(CemmModBlocks.NIGHTBARK_LEAVES_6.get()) || groundState.is(CemmModBlocks.NIGHTBARK_LEAVES_7.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}
}
