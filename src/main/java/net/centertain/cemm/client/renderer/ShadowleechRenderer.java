
package net.centertain.cemm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.centertain.cemm.entity.ShadowleechEntity;

public class ShadowleechRenderer extends MobRenderer<ShadowleechEntity, SilverfishModel<ShadowleechEntity>> {
	public ShadowleechRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowleechEntity entity) {
		return new ResourceLocation("cemm:textures/entities/shadowleech.png");
	}
}
