package me.olafgoud.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

import me.olafgoud.utils.DelayedTask;
import me.olafgoud.utils.InventoryManager;

public class PlayerJoinsWorld implements Listener	{
	@EventHandler
	public void onPlayerJoin(PlayerTeleportEvent e) {
		if (e.getFrom().getWorld().getName().equalsIgnoreCase("Olaffff2")) {
			Player player = e.getPlayer();
		} else if (e.getTo().getWorld().getName().equalsIgnoreCase("Olaffff2")) {
			new DelayedTask(() -> {
				InventoryManager.loadPlayerInventory(e.getPlayer());
			}, 20);
		}
	}
}
