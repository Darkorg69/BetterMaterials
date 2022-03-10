package darkorg.bettermaterials.data.common;

import darkorg.bettermaterials.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootTables {

    @Override
    protected void addTables() {
        this.registerDropSelfLootTable(ModBlocks.FLINT_BLOCK.get());
        this.registerDropSelfLootTable(ModBlocks.CHARCOAL_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
    }
}
