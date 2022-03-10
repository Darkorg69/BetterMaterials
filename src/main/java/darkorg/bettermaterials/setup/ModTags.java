package darkorg.bettermaterials.setup;

import darkorg.bettermaterials.BetterMaterials;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {

        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_FLINT = createForgeBlockTag("storage_blocks/flint");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_CHARCOAL = createForgeBlockTag("storage_blocks/charcoal");

        private static ITag.INamedTag<Block> createForgeBlockTag(String path) {
            return BlockTags.createOptional(new ResourceLocation("forge", path));
        }

        private static ITag.INamedTag<Block> createModBlockTag(String path) {
            return BlockTags.createOptional(new ResourceLocation(BetterMaterials.MOD_ID, path));
        }
    }

    public static final class Items {

        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_FLINT = createForgeItemTag("storage_blocks/flint");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_CHARCOAL = createForgeItemTag("storage_blocks/charcoal");

        private static ITag.INamedTag<Item> createForgeItemTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }

        private static ITag.INamedTag<Item> createModItemTag(String path) {
            return ItemTags.createOptional(new ResourceLocation(BetterMaterials.MOD_ID, path));
        }
    }
}
