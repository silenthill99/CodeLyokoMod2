package fr.silenthill99.codelyokomod.init.entities.yumiishiyama;

import fr.silenthill99.codelyokomod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class YumiIshiyamaRenderer extends MobRenderer<YumiIshiyama, YumiIshiyamaModel<YumiIshiyama>>
{
    public static ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/yumi.png");

    public YumiIshiyamaRenderer(EntityRendererManager manager) 
    {
        super(manager, new YumiIshiyamaModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(YumiIshiyama p_110775_1_) 
    {
        return TEXTURE;
    }
}
