
package net.centertain.cemm.world.features;

import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.centertain.cemm.procedures.OverworldCheckProcedure;

public class LimestonePocketFeatureFeature extends LakeFeature {
	public LimestonePocketFeatureFeature() {
		super(LakeFeature.Configuration.CODEC);
	}

	public boolean place(FeaturePlaceContext<LakeFeature.Configuration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!OverworldCheckProcedure.execute(world))
			return false;
		return super.place(context);
	}
}
