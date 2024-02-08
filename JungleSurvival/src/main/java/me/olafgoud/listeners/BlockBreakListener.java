package me.olafgoud.listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import me.olafgoud.utils.DelayedTask;
import me.olafgoud.utils.ItemUtils;

public class BlockBreakListener implements Listener{
	
	@EventHandler
	public void BlockBreak(BlockBreakEvent e) {

		Block block = e.getBlock();
		Player player = e.getPlayer();
		if (player.getWorld().getName().equalsIgnoreCase("Olaffff2")) {

			if (!player.getGameMode().equals(GameMode.SURVIVAL)) {
				return;
			} else { e.setCancelled(true); }
			Material mat = player.getInventory().getItemInMainHand().getType();
			ItemStack iteminmainhand = player.getInventory().getItemInMainHand();
			if ((mat.equals(Material.DIAMOND_PICKAXE) || mat.equals(Material.IRON_PICKAXE) || mat.equals(Material.GOLD_PICKAXE) || mat.equals(Material.STONE_PICKAXE) || mat.equals(Material.WOOD_PICKAXE)) ) {
				

				if (block.getType().equals(Material.IRON_ORE)) {
					e.setCancelled(true);
					ItemStack item = ItemUtils.getItem(Material.IRON_NUGGET, "&2Iron Piece", "&5Official PracticeMC Resource");
					item = NBTEditor.set(item, "ironpiece", "material");
					player.getInventory().addItem(item);
					if (NBTEditor.contains(iteminmainhand, "pickaxedura")) {
						List<String> lores = new ArrayList<>();
						lores.add(ChatColor.GOLD + "Official PracticeMC Tool");
						lores.add(ChatColor.GOLD + "Durability: " + ChatColor.WHITE + (NBTEditor.getInt(iteminmainhand, "pickaxedura") - 1));
						ItemMeta meta = iteminmainhand.getItemMeta();
						meta.setLore(lores);
						ItemStack itemTerugTeGeven = iteminmainhand;
						itemTerugTeGeven.setItemMeta(meta);
						player.getInventory().setItemInMainHand(NBTEditor.set(itemTerugTeGeven, NBTEditor.getInt(itemTerugTeGeven, "pickaxedura") - 1, "pickaxedura"));
						System.out.println(NBTEditor.getInt(iteminmainhand, "pickaxedura"));
						if (NBTEditor.getInt(iteminmainhand, "pickaxedura") <= 1) {
							player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));
						}
					} else {
						List<String> lores = new ArrayList<>();
						lores.add(ChatColor.GOLD + "Official PracticeMC Tool");
						lores.add(ChatColor.GOLD + "Durability: " + ChatColor.WHITE + "49");
						ItemMeta meta = iteminmainhand.getItemMeta();
						meta.setLore(lores);
						ItemStack itemTerugTeGeven = iteminmainhand;
						itemTerugTeGeven.setItemMeta(meta);
						player.getInventory().setItemInMainHand(NBTEditor.set(itemTerugTeGeven, 49, "pickaxedura"));
					}
					block.setType(Material.BEDROCK);
					new DelayedTask(() -> {
						block.setType(Material.GOLD_ORE);			
					}, 20 * 60 * 3);
					return;
				}

				if (block.getType().equals(Material.GOLD_ORE)) {
					e.setCancelled(true);
					ItemStack item = ItemUtils.getItem(Material.GOLD_NUGGET, "&2Gold Piece", "&5Official PracticeMC Resource");
					item = NBTEditor.set(item, "goldpiece", "material");
					player.getInventory().addItem(item);
					if (NBTEditor.contains(iteminmainhand, "pickaxedura")) {
						List<String> lores = new ArrayList<>();
						lores.add(ChatColor.GOLD + "Official PracticeMC Tool");
						lores.add(ChatColor.GOLD + "Durability: " + ChatColor.WHITE + (NBTEditor.getInt(iteminmainhand, "pickaxedura") - 1));
						ItemMeta meta = iteminmainhand.getItemMeta();
						meta.setLore(lores);
						ItemStack itemTerugTeGeven = iteminmainhand;
						itemTerugTeGeven.setItemMeta(meta);
						player.getInventory().setItemInMainHand(NBTEditor.set(itemTerugTeGeven, NBTEditor.getInt(itemTerugTeGeven, "pickaxedura") - 1, "pickaxedura"));
						System.out.println(NBTEditor.getInt(iteminmainhand, "pickaxedura"));
						if (NBTEditor.getInt(iteminmainhand, "pickaxedura") <= 1) {
							player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));
						}
					} else {
						List<String> lores = new ArrayList<>();
						lores.add(ChatColor.GOLD + "Official PracticeMC Tool");
						lores.add(ChatColor.GOLD + "Durability: " + ChatColor.WHITE + "49");
						ItemMeta meta = iteminmainhand.getItemMeta();
						meta.setLore(lores);
						ItemStack itemTerugTeGeven = iteminmainhand;
						itemTerugTeGeven.setItemMeta(meta);
						player.getInventory().setItemInMainHand(NBTEditor.set(itemTerugTeGeven, 49, "pickaxedura"));
					}
					block.setType(Material.BEDROCK);
					new DelayedTask(() -> {
						block.setType(Material.IRON_ORE);			
					}, 20 * 60 * 3);

					return;
				}
			} else if (NBTEditor.contains(player.getInventory().getItemInMainHand(), "practicemc")) {
				if (NBTEditor.getString(player.getInventory().getItemInMainHand(), "practicemc").contains("mes")) {
					if (block.getType().equals(Material.LEAVES)) {
						e.setCancelled(true);
						Random rand = new Random();
						if (rand.nextInt(10) == 2) {
							player.getInventory().addItem(NBTEditor.set(ItemUtils.getItem(Material.STRING, "&2Rope", "Official PracticeMC Resource"), "rope", "material"));
							
						}
						Block block1 = block;
						block.setType(Material.AIR);
						new DelayedTask(() -> {
							block.setType(block1.getType());	
							block.setData(block1.getData());
						}, 20 * 30);


					}
				}
			}
		}

	}
}
