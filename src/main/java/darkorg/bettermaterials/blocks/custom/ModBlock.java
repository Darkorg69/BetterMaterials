package darkorg.bettermaterials.blocks.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class ModBlock extends Block {
    public ModBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).strength(5.0F, 6.0F).requiresCorrectToolForDrops());
    }
}
