
package net.centertain.cemm.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.BlockBlobFeature;
import net.minecraft.world.level.WorldGenLevel;

import net.centertain.cemm.procedures.OverworldCheckProcedure;

public class ObsidianFeatureFeature extends BlockBlobFeature {
	public ObsidianFeatureFeature() {
		super(BlockStateConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<BlockStateConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!OverworldCheckProcedure.execute(world))
			return false;
		return super.place(context);
	}
}
