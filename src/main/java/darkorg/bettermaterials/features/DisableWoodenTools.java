package darkorg.bettermaterials.features;

import darkorg.bettermaterials.setup.Config;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.TieredItem;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@SuppressWarnings("unused")
public class DisableWoodenTools {
    @SubscribeEvent
    public void breakSpeed(PlayerEvent.BreakSpeed event) {

        PlayerEntity player = event.getPlayer();
        ItemStack stack = player.getHeldItemMainhand();

        if (!Config.disableWoodenTools.get()) {return;}

        if (stack.getItem() instanceof TieredItem) {
            if (((TieredItem) stack.getItem()).getTier() == ItemTier.WOOD) {
                event.setNewSpeed(0.0F);
            }
        }
    }

    @SubscribeEvent
    public void rightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        ItemStack stack = event.getItemStack();

        if (!Config.disableWoodenTools.get()) {return;}

        if (stack.getItem() instanceof TieredItem) {
            if (((TieredItem) stack.getItem()).getTier() == ItemTier.WOOD) {
                event.setCanceled(true);
            }
        }
    }
}
