package fr.silenthill99.codelyokomod.init.entities.jimmorales;

import fr.silenthill99.codelyokomod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class JimMoralesRenderer extends MobRenderer<JimMorales, JimMoralesModel<JimMorales>>
{

    public static ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/jim_morales.png");

    public JimMoralesRenderer(EntityRendererManager manager) {
        super(manager, new JimMoralesModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(JimMorales p_110775_1_) {
        return TEXTURE;
    }
}
