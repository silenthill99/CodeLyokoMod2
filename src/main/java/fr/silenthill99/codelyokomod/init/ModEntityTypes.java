package fr.silenthill99.codelyokomod.init;

import fr.silenthill99.codelyokomod.Main;
import fr.silenthill99.codelyokomod.init.entities.aelita.AelitaSchaeffer;
import fr.silenthill99.codelyokomod.init.entities.blok.Blok;
import fr.silenthill99.codelyokomod.init.entities.jeremybelpois.JeremyBelpois;
import fr.silenthill99.codelyokomod.init.entities.jimmorales.JimMorales;
import fr.silenthill99.codelyokomod.init.entities.odddellarobbia.OddDellaRobbia;
import fr.silenthill99.codelyokomod.init.entities.ulrichstern.UlrichStern;
import fr.silenthill99.codelyokomod.init.entities.williamdunbar.WilliamDunbar;
import fr.silenthill99.codelyokomod.init.entities.yumiishiyama.YumiIshiyama;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class ModEntityTypes
{

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Main.MODID);

    public static final RegistryObject<EntityType<AelitaSchaeffer>> AELITA_SCHAEFFER = ENTITY_TYPES.register("aelita_schaeffer", () -> EntityType.Builder.of(AelitaSchaeffer::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID, "aelita_schaeffer").toString()));
    public static final RegistryObject<EntityType<OddDellaRobbia>> ODD_DELLA_ROBBIA = ENTITY_TYPES.register("odd_della_robbia", () -> EntityType.Builder.of(OddDellaRobbia::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID, "odd_della_robbia").toString()));
    public static final RegistryObject<EntityType<JeremyBelpois>> JEREMY_BELPOIS = ENTITY_TYPES.register("jeremy_belpois", () -> EntityType.Builder.of(JeremyBelpois::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID, "jeremy_belpois").toString()));
    public static final RegistryObject<EntityType<UlrichStern>> ULRICH_STERN = ENTITY_TYPES.register("ulrich_stern", () -> EntityType.Builder.of(UlrichStern::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID, "ulrich_stern").toString()));
    public static final RegistryObject<EntityType<YumiIshiyama>> YUMI_ISHIYAMA = ENTITY_TYPES.register("yumi_ishiyama", () -> EntityType.Builder.of(YumiIshiyama::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID, "yumi_ishiyama").toString()));
    public static final RegistryObject<EntityType<WilliamDunbar>> WILLIAM_DUNBAR = ENTITY_TYPES.register("william_dunbar", () -> EntityType.Builder.of(WilliamDunbar::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID, "william_dunbar").toString()));
    public static final RegistryObject<EntityType<JimMorales>> JIM_MORALES = ENTITY_TYPES.register("jim_morales", () -> EntityType.Builder.of(JimMorales::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID + "jim_morales").toString()));

    //Monstres de XANA
    public static final RegistryObject<EntityType<Blok>> BLOK = ENTITY_TYPES.register("blok", () -> EntityType.Builder.of(Blok::new, EntityClassification.MONSTER).sized(2.0f, 3.0f).build(new ResourceLocation(Main.MODID, "blok").toString()));

}
