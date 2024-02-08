package me.olafgoud.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import me.olafgoud.utils.InventoryUtils;

public class BuyGunPowderCommand implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players can use this command");
			return true;
		}
		Player player = (Player) sender;
		if (!player.hasPermission("canbuy")) {
			return true;
		}
		Inventory inv = InventoryUtils.gunpowderBuyMenu(player);
		player.openInventory(inv);
		
		return true;
	}
}
