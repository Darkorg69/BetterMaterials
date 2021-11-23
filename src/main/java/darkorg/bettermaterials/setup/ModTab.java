package darkorg.bettermaterials.setup;

import darkorg.bettermaterials.tools.ModTools;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModTab extends ItemGroup {

    public static final ItemGroup BETTER_MATERIALS = new ModTab("better_materials") ;

    public ModTab(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModTools.FLINT_AXE.get());
    }
}
