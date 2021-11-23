package darkorg.bettermaterials.items;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.blocks.ModBlocks;
import darkorg.bettermaterials.items.custom.BlockItemBase;
import darkorg.bettermaterials.items.custom.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);

    public static final RegistryObject<Item> TOOL_HANDLE = ITEMS.register("tool_handle", ItemBase::new);

    public static final RegistryObject<Item> FLINT_BLOCK = ITEMS.register("flint_block", ()-> new BlockItemBase(ModBlocks.FLINT_BLOCK.get()));

    public static void init(IEventBus bus) {ITEMS.register(bus);}
}
