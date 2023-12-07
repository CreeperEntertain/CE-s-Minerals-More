package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralAshenTreeGenerationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double PosX = 0;
		double PosY = 0;
		double PosZ = 0;
		double Height = 0;
		double count = 0;
		boolean CrownDelay = false;
		String equals = "";
		PosX = x;
		PosY = y;
		PosZ = z;
		Height = Mth.nextInt(RandomSource.create(), 3, 10);
		count = Mth.nextInt(RandomSource.create(), 0, 1);
		CrownDelay = false;
		for (int index0 = 0; index0 < (int) Height; index0++) {
			if ((world.getBlockState(BlockPos.containing(PosX, PosY, PosZ))).is(BlockTags.create(new ResourceLocation("cemm:ashen_replacable")))) {
				world.setBlock(BlockPos.containing(PosX, PosY, PosZ), CemmModBlocks.ASHEN_LOG.get().defaultBlockState(), 3);
				PosY = PosY + 1;
			} else {
				break;
			}
			if (CrownDelay == true) {
				if (count == 1) {
					AshenCrownProcedure.execute(world, PosX, (PosY - 1), PosZ);
					count = 0;
				} else {
					count = 1;
				}
			} else {
				CrownDelay = true;
			}
		}
	}
}
