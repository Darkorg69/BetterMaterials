package darkorg.bettermaterials.items;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.blocks.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

public class ModItems {
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);

    public static final RegistryObject<Item> FLINT_BLOCK = BLOCK_ITEMS.register("flint_block", () ->
            new BlockItem(ModBlocks.FLINT_BLOCK.get(), new Item.Properties().group(BetterMaterials.TAB_BETTER_MATERIALS)));

    public static final RegistryObject<Item> CHARCOAL_BLOCK = BLOCK_ITEMS.register("charcoal_block", () ->
            new BlockItem(ModBlocks.CHARCOAL_BLOCK.get(), new Item.Properties().group(BetterMaterials.TAB_BETTER_MATERIALS)) {
                @Override public int getBurnTime(ItemStack itemStack, @Nullable IRecipeType<?> recipeType) {return 16000;}
            });

    public static void init(IEventBus bus) {
        BLOCK_ITEMS.register(bus);
    }
}
