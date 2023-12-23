
package net.centertain.cemm.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.BlockPileConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.BlockPileFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.centertain.cemm.procedures.PlainsGenerationCheckProcedure;

import java.util.Set;

public class SandstoneFeatureFeature extends BlockPileFeature {
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.OVERWORLD, ResourceKey.create(Registries.DIMENSION, new ResourceLocation("cemm:chlorophyl_dimension")));

	public SandstoneFeatureFeature() {
		super(BlockPileConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<BlockPileConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!PlainsGenerationCheckProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
