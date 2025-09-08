
package net.centertain.cemm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.centertain.cemm.entity.SaltleechEntity;

public class SaltleechRenderer extends MobRenderer<SaltleechEntity, SilverfishModel<SaltleechEntity>> {
	public SaltleechRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SaltleechEntity entity) {
		return new ResourceLocation("cemm:textures/entities/saltleech.png");
	}
}
