package fr.silenthill99.codelyokomod.init.entities.williamdunbar;

import fr.silenthill99.codelyokomod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Resource;

public class WilliamDunbarRenderer extends MobRenderer<WilliamDunbar, WilliamDunbarModel<WilliamDunbar>>
{

    public static ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/william_dunbar.png");

    public WilliamDunbarRenderer(EntityRendererManager p_i50961_1_)
    {
        super(p_i50961_1_, new WilliamDunbarModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(WilliamDunbar p_110775_1_) {
        return TEXTURE;
    }
}
