package net.centertain.cemm.mixins;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.ChorusFlowerBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

@Mixin(ChorusFlowerBlock.class)
public abstract class ChorusFlowerBlockMixin extends Block {
	public ChorusFlowerBlockMixin(Properties settings) {
		super(settings);
	}

	@Inject(method = "canSurvive", at = @At("HEAD"), cancellable = true)
	private void canSurvive(BlockState state, LevelReader world, BlockPos pos, CallbackInfoReturnable<Boolean> info) {
		BlockState blockstate = world.getBlockState(pos.below());
		if (blockstate.is(CemmModBlocks.WEATHERED_END_STONE.get()) || blockstate.is(CemmModBlocks.SMOOTH_END_STONE.get()) || blockstate.is(CemmModBlocks.LAYERED_END_STONE.get()) || blockstate.is(CemmModBlocks.MIDORI_LINED_END_STONE.get())
				|| blockstate.is(CemmModBlocks.END_STONE_LINED_MIDORI.get()) || blockstate.is(CemmModBlocks.ROUGH_MIDORI.get()) || blockstate.is(CemmModBlocks.MIDORI.get()) || blockstate.is(CemmModBlocks.CRACKED_MIDORI.get())
				|| blockstate.is(CemmModBlocks.PURPUR_STONE.get()) || blockstate.is(CemmModBlocks.PURPUR_MOSSED_END_STONE.get()) || blockstate.is(CemmModBlocks.PURPUR_MOSS_BLOCK.get()) || blockstate.is(CemmModBlocks.PURPLE_MOSSY_END_STONE.get())
				|| blockstate.is(CemmModBlocks.MOSSED_END_STONE.get()) || blockstate.is(CemmModBlocks.END_MOSS_BLOCK.get()) || blockstate.is(CemmModBlocks.MOSSY_END_STONE.get())) {
			info.setReturnValue(true);
			info.cancel();
		}
	}
}
