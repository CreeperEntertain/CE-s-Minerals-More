
package net.centertain.cemm.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.Collections;

public class HardenedSandWallBlock extends WallBlock {
	public HardenedSandWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.SNARE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.hardened_sand.break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.hardened_sand.step")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.hardened_sand.place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.hardened_sand.hit")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.hardened_sand.step"))))
				.strength(0.75f, 0.5f).dynamicShape().forceSolidOn());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
