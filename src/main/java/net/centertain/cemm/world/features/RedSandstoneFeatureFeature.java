
package net.centertain.cemm.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.BlockPileConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.BlockPileFeature;
import net.minecraft.world.level.WorldGenLevel;

import net.centertain.cemm.procedures.PlainsGenerationCheckProcedure;

public class RedSandstoneFeatureFeature extends BlockPileFeature {
	public RedSandstoneFeatureFeature() {
		super(BlockPileConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<BlockPileConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!PlainsGenerationCheckProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
