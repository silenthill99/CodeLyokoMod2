package fr.silenthill99.codelyokomod.init;

import fr.silenthill99.codelyokomod.Main;
import fr.silenthill99.codelyokomod.init.blocks.SuperCalculateur;
import fr.silenthill99.codelyokomod.utils.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks
{

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final RegistryObject<Block> SUPER_CALCULATEUR = createBlock("supercalculateur", SuperCalculateur::new);

    private static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> bloc = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(bloc.get(), new Item.Properties().tab(ModItemGroups.ITEMS_DE_CODE_LYOKO)));
        return bloc;
    }

}
