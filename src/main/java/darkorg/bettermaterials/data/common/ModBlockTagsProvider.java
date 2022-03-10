package darkorg.bettermaterials.data.common;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.blocks.ModBlocks;
import darkorg.bettermaterials.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, BetterMaterials.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_FLINT)
                .add(ModBlocks.FLINT_BLOCK.get());
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_CHARCOAL)
                .add(ModBlocks.CHARCOAL_BLOCK.get());
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(ModTags.Blocks.STORAGE_BLOCKS_FLINT)
                .addTag(ModTags.Blocks.STORAGE_BLOCKS_CHARCOAL);
    }
}
