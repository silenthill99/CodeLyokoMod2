package fr.silenthill99.codelyokomod.init.entities.jeremybelpois;

import fr.silenthill99.codelyokomod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class JeremyBelpoisRenderer extends MobRenderer<JeremyBelpois, JeremyBelpoisModel<JeremyBelpois>>
{

    public static ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/jeremy.png");

    public JeremyBelpoisRenderer(EntityRendererManager p_i50961_1_)
    {
        super(p_i50961_1_, new JeremyBelpoisModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(JeremyBelpois p_110775_1_) {
        return TEXTURE;
    }
}
