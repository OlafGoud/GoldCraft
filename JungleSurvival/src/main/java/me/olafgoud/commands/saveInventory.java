package me.olafgoud.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.olafgoud.utils.InventoryManager;

public class saveInventory implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (args == null) {
			return true;
		}
		
		InventoryManager.savePlayerInventory(Bukkit.getPlayer(args[0]));
		
		return true;
	}
}
