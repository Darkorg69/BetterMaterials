package darkorg.bettermaterials.items.custom;

import darkorg.bettermaterials.setup.ModTab;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block blockIn) {super(blockIn, new Item.Properties().group(ModTab.BETTER_MATERIALS));}
}
