package io.github.staudlol.listener;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EnderButtListener implements Listener {

    @EventHandler
    public void onThrow(PlayerInteractEvent event) {
        final Player player = event.getPlayer();

        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(player.getItemInHand().getType() == Material.ENDER_PEARL) {
                player.setVelocity(player.getLocation().getDirection().normalize().multiply(4));
                player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1F, 1F);
                player.updateInventory();
                event.setCancelled(true);
            }
        }
    }
}
