package fr.silenthill99.codelyokomod.data.loot_tables;

import fr.silenthill99.codelyokomod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class BlockLootTable extends BlockLootTables {
    @Override
    protected void addTables() {
        dropSelf(ModBlocks.SUPER_CALCULATEUR.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries()
                .stream().map(RegistryObject::get)
                .collect(Collectors.toList());

    }
}
