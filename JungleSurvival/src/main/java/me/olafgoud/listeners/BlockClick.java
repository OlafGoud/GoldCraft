package me.olafgoud.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.olafgoud.utils.InventoryUtils;

public class BlockClick implements Listener{

	@EventHandler
	public void blockClick(PlayerInteractEvent e) {
		if (e.getPlayer().getWorld().getName().equalsIgnoreCase("Olaffff2")) {

			if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {

				if (e.getClickedBlock().getType().equals(Material.FURNACE)) {
					Player p = e.getPlayer();
					p.openInventory(InventoryUtils.smelterInventory(p));
					e.setCancelled(true);
				} else if (e.getClickedBlock().getType().equals(Material.ANVIL)) {
					Player p = e.getPlayer();
					p.openInventory(InventoryUtils.weaponInventory(p));
					e.setCancelled(true);
				} else if (e.getClickedBlock().getType().equals(Material.GREEN_GLAZED_TERRACOTTA)) {
					Player p = e.getPlayer();
					p.openInventory(InventoryUtils.armorInventory(p));
					e.setCancelled(true);
				}
			} 
		}
	}
}
