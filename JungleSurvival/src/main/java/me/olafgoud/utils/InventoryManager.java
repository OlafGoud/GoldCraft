package me.olafgoud.utils;


import java.io.File;
import java.util.UUID;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.olafgoud.Main;

public class InventoryManager {
	private static Main main;
	// Save the inventory to a YAML file for a specific player
	public static void savePlayerInventory(Player player) {
		UUID playerUUID = player.getUniqueId();
		File file = new File("plugins/JunglePlugin/PlayerInventories", playerUUID.toString() + ".yml");

		YamlConfiguration config = new YamlConfiguration();
		for (int i = 0; i < player.getInventory().getSize(); i++) {
			ItemStack item = player.getInventory().getItem(i);
			if (item != null) {
				config.set("inventory." + i, item.serialize());
			}
		}

		try {
			config.save(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Load the inventory from a YAML file for a specific player
	public static Inventory loadPlayerInventory(Player player) {
		UUID playerUUID = player.getUniqueId();
		File file = new File("plugins/JunglePlugin/PlayerInventories", playerUUID.toString() + ".yml");
		if (!file.exists()) {
			player.getInventory().clear();
			main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "kit give jungledood " + player.getName()); 
			return null;
		}
 		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		ConfigurationSection items = config.getConfigurationSection("inventory");
		player.getInventory().clear();
		if (items != null) {
			
			for (String key : items.getKeys(false)) {
				int slot = Integer.parseInt(key);
				ItemStack item = ItemStack.deserialize(config.getConfigurationSection("inventory." + key).getValues(false));
				player.getInventory().setItem(slot, item);
			}
		}

		return null;
	}
	

    public InventoryManager(Main main) {
        this.main = main;

    }
}

