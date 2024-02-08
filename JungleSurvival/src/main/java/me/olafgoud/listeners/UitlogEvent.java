package me.olafgoud.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.olafgoud.utils.InventoryManager;

public class UitlogEvent implements Listener {
	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		if (e.getPlayer().getWorld().getName().equalsIgnoreCase("Olaffff2")) {
			InventoryManager.savePlayerInventory(e.getPlayer());
		}
	}
	
	@EventHandler
	public void onkick(PlayerKickEvent e) {
		if (e.getPlayer().getWorld().getName().equalsIgnoreCase("Olaffff2")) {
			
			InventoryManager.savePlayerInventory(e.getPlayer());
		}
	}
}
