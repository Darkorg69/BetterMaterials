package darkorg.bettermaterials.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FlintBlock extends Block {
    public FlintBlock() {
        super(Properties.create(Material.ROCK)
                .harvestLevel(0)
                .sound(SoundType.STONE)
                .hardnessAndResistance(5.0F, 6.0F)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));
    }
}
