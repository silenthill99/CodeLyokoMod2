package fr.silenthill99.codelyokomod.utils;

import fr.silenthill99.codelyokomod.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents
{

    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Main.MODID);

    public static final RegistryObject<SoundEvent> UN_MONDE_SANS_DANGERS_VERSION_COURTE = registerSoundEvent("un_monde_sans_danger_version_courte");
    public static final RegistryObject<SoundEvent> UN_MONDE_SANS_DANGERS_VERSION_LONGUE = registerSoundEvent("un_monde_sans_danger_version_longue");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name)
    {
        return SOUND_EVENT.register(name, () -> new SoundEvent(new ResourceLocation(Main.MODID, name)));
    }

}
