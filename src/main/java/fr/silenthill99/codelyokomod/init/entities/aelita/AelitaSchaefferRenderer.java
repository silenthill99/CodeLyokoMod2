package fr.silenthill99.codelyokomod.init.entities.aelita;

import fr.silenthill99.codelyokomod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class AelitaSchaefferRenderer extends MobRenderer<AelitaSchaeffer, AelitaSchaefferModel<AelitaSchaeffer>> 
{

    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/aelita.png");

    public AelitaSchaefferRenderer(EntityRendererManager manager)
    {
        super(manager, new AelitaSchaefferModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(AelitaSchaeffer p_110775_1_)
    {
        return TEXTURE;
    }
    
}
