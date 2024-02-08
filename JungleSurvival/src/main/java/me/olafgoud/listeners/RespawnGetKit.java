package me.olafgoud.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import me.olafgoud.Main;
import me.olafgoud.utils.DelayedTask;

public class RespawnGetKit implements Listener{
	private static Main main;
	public RespawnGetKit(Main main) {
        this.main = main;
    }
	@EventHandler
	public void onRespawn(PlayerRespawnEvent e) {
		Player player = e.getPlayer();
		if (player.getWorld().getName().equalsIgnoreCase("Olaffff2")) {
			new DelayedTask(() -> {
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "kit give jungledood " + player.getName());
			}, 20*2);
		}
		
	}
	
	
}
