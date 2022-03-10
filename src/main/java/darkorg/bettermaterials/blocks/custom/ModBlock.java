package darkorg.bettermaterials.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class ModBlock extends Block {
    public ModBlock() {
        super(Properties.create(Material.ROCK, MaterialColor.STONE)
                .hardnessAndResistance(5.0F, 6.0F)
                .setRequiresTool().harvestTool(ToolType.PICKAXE));
    }
}
