package darkorg.bettermaterials.blocks;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.blocks.custom.ModBlock;
import net.minecraft.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterMaterials.MOD_ID);

    public static final RegistryObject<Block> FLINT_BLOCK = BLOCKS.register("flint_block", ModBlock::new);
    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", ModBlock::new);

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
