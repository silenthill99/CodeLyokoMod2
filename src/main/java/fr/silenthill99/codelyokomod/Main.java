package fr.silenthill99.codelyokomod;

import fr.silenthill99.codelyokomod.init.ModBiomes;
import fr.silenthill99.codelyokomod.init.ModBlocks;
import fr.silenthill99.codelyokomod.init.ModEntityTypes;
import fr.silenthill99.codelyokomod.init.ModItems;
import fr.silenthill99.codelyokomod.init.entities.aelita.AelitaSchaeffer;
import fr.silenthill99.codelyokomod.init.entities.aelita.AelitaSchaefferRenderer;
import fr.silenthill99.codelyokomod.init.entities.blok.Blok;
import fr.silenthill99.codelyokomod.init.entities.blok.BlokRenderer;
import fr.silenthill99.codelyokomod.init.entities.jeremybelpois.JeremyBelpois;
import fr.silenthill99.codelyokomod.init.entities.jeremybelpois.JeremyBelpoisRenderer;
import fr.silenthill99.codelyokomod.init.entities.jimmorales.JimMorales;
import fr.silenthill99.codelyokomod.init.entities.jimmorales.JimMoralesRenderer;
import fr.silenthill99.codelyokomod.init.entities.odddellarobbia.OddDellaRobbia;
import fr.silenthill99.codelyokomod.init.entities.odddellarobbia.OddDellaRobbiaRenderer;
import fr.silenthill99.codelyokomod.init.entities.ulrichstern.UlrichStern;
import fr.silenthill99.codelyokomod.init.entities.ulrichstern.UlrichSternRenderer;
import fr.silenthill99.codelyokomod.init.entities.williamdunbar.WilliamDunbar;
import fr.silenthill99.codelyokomod.init.entities.williamdunbar.WilliamDunbarRenderer;
import fr.silenthill99.codelyokomod.init.entities.yumiishiyama.YumiIshiyama;
import fr.silenthill99.codelyokomod.init.entities.yumiishiyama.YumiIshiyamaRenderer;
import fr.silenthill99.codelyokomod.utils.ModSoundEvents;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main
{

    public static final String MODID = "code_lyoko_mod";

    public Main()
    {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onEntityAttributeCreation);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBiomes.BIOMES.register(bus);
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModSoundEvents.SOUND_EVENT.register(bus);
        ModEntityTypes.ENTITY_TYPES.register(bus);

    }

    private void setup(FMLCommonSetupEvent event)
    {

    }

    private void clientSetup(FMLClientSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.AELITA_SCHAEFFER.get(), AelitaSchaefferRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ODD_DELLA_ROBBIA.get(), OddDellaRobbiaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.JEREMY_BELPOIS.get(), JeremyBelpoisRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ULRICH_STERN.get(), UlrichSternRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.YUMI_ISHIYAMA.get(), YumiIshiyamaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.WILLIAM_DUNBAR.get(), WilliamDunbarRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.JIM_MORALES.get(), JimMoralesRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BLOK.get(), BlokRenderer::new);
        RenderTypeLookup.setRenderLayer(ModBlocks.SUPER_CALCULATEUR.get(), RenderType.cutout());
    }

    private void onEntityAttributeCreation(EntityAttributeCreationEvent event)
    {
        event.put(ModEntityTypes.AELITA_SCHAEFFER.get(), AelitaSchaeffer.createAttributes().build());
        event.put(ModEntityTypes.ODD_DELLA_ROBBIA.get(), OddDellaRobbia.createAttributes().build());
        event.put(ModEntityTypes.JEREMY_BELPOIS.get(), JeremyBelpois.createAttributes().build());
        event.put(ModEntityTypes.ULRICH_STERN.get(), UlrichStern.createAttributes().build());
        event.put(ModEntityTypes.YUMI_ISHIYAMA.get(), YumiIshiyama.createAttributes().build());
        event.put(ModEntityTypes.WILLIAM_DUNBAR.get(), WilliamDunbar.createAttributes().build());
        event.put(ModEntityTypes.JIM_MORALES.get(), JimMorales.createAttributes().build());
        event.put(ModEntityTypes.BLOK.get(), Blok.createAttributes().build());
    }
}
