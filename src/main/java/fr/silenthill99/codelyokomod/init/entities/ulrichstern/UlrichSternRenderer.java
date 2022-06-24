package fr.silenthill99.codelyokomod.init.entities.ulrichstern;

import fr.silenthill99.codelyokomod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class UlrichSternRenderer extends MobRenderer<UlrichStern, UlrichSternModel<UlrichStern>> 
{

    public static ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/ulrish.png");

    public UlrichSternRenderer(EntityRendererManager manager) 
    {
        super(manager, new UlrichSternModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(UlrichStern p_110775_1_) {
        return TEXTURE;
    }
}
