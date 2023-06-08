package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class CAFSzPosProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 2, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.DRIPSTONE_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 2, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.TUFF) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 2, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.DIORITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 2, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.GRANITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 2, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.ANDESITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 2, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.MOSS_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 2, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.STONE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 2, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.DIRT) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DRIPSTONE_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.TUFF) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.FIREGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIORITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GRANITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.ANDESITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.FIREGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.MOSS_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.STONE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.FIREGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIRT) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y, z + 1), CemmModBlocks.FIREGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.DRIPSTONE_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.TUFF) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.DIORITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.GRANITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.ANDESITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.MOSS_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.STONE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.DIRT) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), CemmModBlocks.FIREGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			}
		}
	}
}
