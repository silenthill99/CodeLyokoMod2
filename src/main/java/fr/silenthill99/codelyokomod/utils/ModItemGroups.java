package fr.silenthill99.codelyokomod.utils;

import fr.silenthill99.codelyokomod.init.ModBlocks;
import fr.silenthill99.codelyokomod.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModItemGroups
{

    public static final ItemGroup MUSIQUES = new ItemGroup("musiques") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COURT.get());
        }
    };

    public static final ItemGroup TEAMLYOKO = new ItemGroup("team_lyoko") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.WITCH_SPAWN_EGG);
        }
    };

    public static final ItemGroup AUTRES_PERSONNAGES = new ItemGroup("autres_personnages") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.JIM_MORALES_SPAWN_EGG.get());
        }
    };

    public static final ItemGroup ITEMS_DE_CODE_LYOKO = new ItemGroup("items_de_code_lyoko") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.SUPER_CALCULATEUR.get());
        }
    };
}
