
package net.centertain.cemm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.centertain.cemm.entity.RedSkeletonEntity;
import net.centertain.cemm.client.model.ModelRedSkeleton;

public class RedSkeletonRenderer extends MobRenderer<RedSkeletonEntity, ModelRedSkeleton<RedSkeletonEntity>> {
	public RedSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRedSkeleton(context.bakeLayer(ModelRedSkeleton.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedSkeletonEntity entity) {
		return new ResourceLocation("cemm:textures/entities/red_skeleton.png");
	}
}
