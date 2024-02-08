package me.olafgoud.utils;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ItemUtils {
	
	public static ItemStack getItem(Material mat, String name, String ... lore) {
		ItemStack item = new ItemStack(mat);
		
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
		List<String> lores = new ArrayList<>();
		for (String s : lore) {
			lores.add(ChatColor.translateAlternateColorCodes('&', s));
		}
		meta.setLore(lores);
		item.setItemMeta(meta);
		
		return item;
	}
}
