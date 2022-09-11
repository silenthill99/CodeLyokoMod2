package fr.silenthill99.codelyokomod.init;

import fr.silenthill99.codelyokomod.Main;
import fr.silenthill99.codelyokomod.utils.CustomArmorMaterials;
import fr.silenthill99.codelyokomod.utils.CustomItemTiers;
import fr.silenthill99.codelyokomod.utils.ModItemGroups;
import fr.silenthill99.codelyokomod.utils.ModSoundEvents;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.WeightedRandom;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> COURT = ITEMS.register("court", () -> new MusicDiscItem(1, ModSoundEvents.UN_MONDE_SANS_DANGERS_VERSION_COURTE, new Item.Properties().stacksTo(1).tab(ModItemGroups.MUSIQUES)));
    public static final RegistryObject<Item> LONGUE = ITEMS.register("longue", () -> new MusicDiscItem(1, ModSoundEvents.UN_MONDE_SANS_DANGERS_VERSION_LONGUE, new Item.Properties().stacksTo(1).tab(ModItemGroups.MUSIQUES)));

    //Oeufs
    public static final RegistryObject<ForgeSpawnEggItem> AELITA_SCHAEFFER_SPAWN_EGG = ITEMS.register("aelita_schaeffer_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.AELITA_SCHAEFFER, 0x990099, 0xFF33FF, new Item.Properties().tab(ModItemGroups.TEAMLYOKO)));
    public static final RegistryObject<ForgeSpawnEggItem> ODD_DELLA_ROBBIA_SPAWN_EGG = ITEMS.register("odd_della_robbia_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.ODD_DELLA_ROBBIA, 0x660066, 0xFFFF00, new Item.Properties().tab(ModItemGroups.TEAMLYOKO)));
    public static final RegistryObject<ForgeSpawnEggItem> JEREMY_BELPOIS_SPAWN_EGG = ITEMS.register("jeremy_belpois_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.JEREMY_BELPOIS, 0x000099, 0xFFFF00, new Item.Properties().tab(ModItemGroups.TEAMLYOKO)));
    public static final RegistryObject<ForgeSpawnEggItem> ULRICH_STERN_SPAWN_ITEM = ITEMS.register("ulrich_stern_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.ULRICH_STERN, 0x663300, 0xffff00, new Item.Properties().tab(ModItemGroups.TEAMLYOKO)));
    public static final RegistryObject<ForgeSpawnEggItem> YUMI_ISHIYAMA_SPAWN_EGG = ITEMS.register("yumi_ishiyama_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.YUMI_ISHIYAMA, 0x000000, 0x000000, new Item.Properties().tab(ModItemGroups.TEAMLYOKO)));
    public static final RegistryObject<ForgeSpawnEggItem> WILLIAM_DUNBAR_SPAWN_EGG = ITEMS.register("william_dunbar_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.WILLIAM_DUNBAR, 0x000000, 0x990000, new Item.Properties().tab(ModItemGroups.TEAMLYOKO)));
    public static final RegistryObject<ForgeSpawnEggItem> JIM_MORALES_SPAWN_EGG = ITEMS.register("jim_morales_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.JIM_MORALES, 0x800000, 0xFF0000,new Item.Properties().tab(ModItemGroups.AUTRES_PERSONNAGES)));

    //Armures
    public static final RegistryObject<Item> LYOKO_GUERRIER_HELMET = ITEMS.register("lyoko_guerrier_helmet", () -> new ArmorItem(CustomArmorMaterials.LYOKO_GUERRIER_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroups.ITEMS_DE_CODE_LYOKO)));
    public static final RegistryObject<Item> LYOKO_GUERRIER_CHESTPLATE = ITEMS.register("lyoko_guerrier_chestplate", () -> new ArmorItem(CustomArmorMaterials.LYOKO_GUERRIER_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroups.ITEMS_DE_CODE_LYOKO)));
    public static final RegistryObject<Item> LYOKO_GUERRIER_LEGGINGS = ITEMS.register("lyoko_guerrier_leggings", () -> new ArmorItem(CustomArmorMaterials.LYOKO_GUERRIER_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.ITEMS_DE_CODE_LYOKO)));
    public static final RegistryObject<Item> LYOKO_GUERRIER_BOOTS = ITEMS.register("lyoko_guerrier_boots", () -> new ArmorItem(CustomArmorMaterials.LYOKO_GUERRIER_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.ITEMS_DE_CODE_LYOKO)));

    //Armes
    public static final RegistryObject<Item> KATANA = ITEMS.register("katana", () -> new SwordItem(CustomItemTiers.KATANA, 2, -1.0f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MATERIALS)));
}
