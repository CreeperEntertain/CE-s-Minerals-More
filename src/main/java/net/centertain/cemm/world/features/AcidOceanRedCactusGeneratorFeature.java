
package net.centertain.cemm.world.features;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.procedures.ProceduralRedCactusProcedure;
import net.centertain.cemm.init.CemmModBlocks;

import java.util.Set;
import java.util.List;

public class AcidOceanRedCactusGeneratorFeature extends Feature<NoneFeatureConfiguration> {
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("cemm:icaron")));
	private final List<Block> base_blocks;
	private StructureTemplate template = null;

	public AcidOceanRedCactusGeneratorFeature() {
		super(NoneFeatureConfiguration.CODEC);
		base_blocks = List.of(CemmModBlocks.BORDEAUX_SOAPSTONE.get());
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("cemm", "ebony_generator"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 500000) {
			int count = context.random().nextInt(3) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.WORLD_SURFACE_WG, i, k) - 1;
				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;
				BlockPos spawnTo = new BlockPos(i + 0, j + 1, k + 0);
				WorldGenLevel world = context.level();
				int x = spawnTo.getX();
				int y = spawnTo.getY();
				int z = spawnTo.getZ();
				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE).setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR).setIgnoreEntities(false), context.random(), 2)) {
					ProceduralRedCactusProcedure.execute(world, x, y, z);
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
