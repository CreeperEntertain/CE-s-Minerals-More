
package net.centertain.cemm.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.centertain.cemm.procedures.ReturnTrueProcedure;
import net.centertain.cemm.entity.AshWandererEntity;

public class AshWandererRenderer extends HumanoidMobRenderer<AshWandererEntity, HumanoidModel<AshWandererEntity>> {
	public AshWandererRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(AshWandererEntity entity) {
		return new ResourceLocation("cemm:textures/entities/ash_wanderer.png");
	}

	@Override
	protected boolean isShaking(AshWandererEntity _ent) {
		Entity entity = _ent;
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return ReturnTrueProcedure.execute();
	}
}
