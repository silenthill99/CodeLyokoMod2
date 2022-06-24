package fr.silenthill99.codelyokomod.init.entities.blok;

import fr.silenthill99.codelyokomod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BlokRenderer extends MobRenderer<Blok, BlokModel<Blok>> 
{

    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/blok.png");

    public BlokRenderer(EntityRendererManager manager) 
    {
        super(manager, new BlokModel<>(), 2.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(Blok p_110775_1_) 
    {
        return TEXTURE;
    }
}
