package darkorg.bettermaterials.features;

import darkorg.bettermaterials.setup.Config;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TieredItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.*;

@SuppressWarnings("unused")
public class PermaTools {

    @SubscribeEvent
    public void breakSpeed(PlayerEvent.BreakSpeed event) {

        PlayerEntity player = event.getPlayer();
        ItemStack stack = player.getHeldItemMainhand();
        Item item = stack.getItem();

        if (!Config.permaToolsEnabled.get()) {return;}

        if (item instanceof TieredItem) {
            if (this.isBroken(stack)) {
                event.setNewSpeed(0.0F);
            }
        }
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void itemTooltip (ItemTooltipEvent event) {
        List<ITextComponent> tooltip = event.getToolTip();
        ItemStack stack = event.getItemStack();

        if (!Config.permaToolsEnabled.get()) {return;}

        if(this.isBroken(stack)) {
            tooltip.add(0, new TranslationTextComponent("tooltip.bettermaterials.broken"));
        }
    }

    @SubscribeEvent
    public void rightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        ItemStack stack = event.getItemStack();

        if (Config.permaToolsEnabled.get()) {return;}

        if(this.isBroken(stack)) {
            event.setCanceled(true);
        }
    }

    private Boolean isBroken(ItemStack stack) {return stack.getDamage() == stack.getMaxDamage() - 1;}
}
