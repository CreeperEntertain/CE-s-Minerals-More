
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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.procedures.ProceduralAmberSentinelTrunkProcedure;
import net.centertain.cemm.init.CemmModBlocks;

import java.util.Set;
import java.util.List;

public class AmberSentinelGeneratorFeature extends Feature<NoneFeatureConfiguration> {
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
	private final List<Block> base_blocks;
	private StructureTemplate template = null;

	public AmberSentinelGeneratorFeature() {
		super(NoneFeatureConfiguration.CODEC);
		base_blocks = List.of(CemmModBlocks.DIRTY_COBBLESTONE.get(), CemmModBlocks.OVERGROWN_DIRTY_COBBLESTONE.get(), CemmModBlocks.OVERGROWN_DIRT.get(), CemmModBlocks.OVERGROWN_ROOTED_DIRT.get(), CemmModBlocks.OVERGROWN_COARSE_DIRT.get(),
				CemmModBlocks.SCORCHED_DIRT.get(), CemmModBlocks.GRASSED_SCORCHED_DIRT.get(), CemmModBlocks.OVERGROWN_SCORCHED_DIRT.get(), CemmModBlocks.DIRTY_MUD.get(), CemmModBlocks.OVERGROWN_DIRTY_MUD.get(), CemmModBlocks.GRASSED_DIRTY_MUD.get(),
				Blocks.DIRT, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.ROOTED_DIRT, CemmModBlocks.GRASSED_DRIED_MUD.get(), Blocks.GRASS_BLOCK);
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
		if ((context.random().nextInt(1000000) + 1) <= 1000000) {
			int count = context.random().nextInt(9) + 8;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;
				BlockPos spawnTo = new BlockPos(i + 0, j + 1, k + 0);
				WorldGenLevel world = context.level();
				int x = spawnTo.getX();
				int y = spawnTo.getY();
				int z = spawnTo.getZ();
				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE).setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR).setIgnoreEntities(false), context.random(), 2)) {
					ProceduralAmberSentinelTrunkProcedure.execute(world, x, y, z);
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
