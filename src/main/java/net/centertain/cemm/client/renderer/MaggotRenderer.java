
package net.centertain.cemm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.centertain.cemm.entity.MaggotEntity;
import net.centertain.cemm.client.model.ModelMaggot;

public class MaggotRenderer extends MobRenderer<MaggotEntity, ModelMaggot<MaggotEntity>> {
	public MaggotRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMaggot(context.bakeLayer(ModelMaggot.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(MaggotEntity entity) {
		return new ResourceLocation("cemm:textures/entities/maggot.png");
	}

	@Override
	protected boolean isShaking(MaggotEntity entity) {
		return true;
	}
}
