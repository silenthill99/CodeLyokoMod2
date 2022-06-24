package fr.silenthill99.codelyokomod.init.entities.odddellarobbia;

import fr.silenthill99.codelyokomod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class OddDellaRobbiaRenderer extends MobRenderer<OddDellaRobbia, OddDellaRobbiaModel<OddDellaRobbia>>
{
    public static ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/odd.png");
    public OddDellaRobbiaRenderer(EntityRendererManager p_i50961_1_)
    {
        super(p_i50961_1_, new OddDellaRobbiaModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(OddDellaRobbia p_110775_1_) {
        return TEXTURE;
    }
}
