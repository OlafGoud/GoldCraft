package me.olafgoud.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import me.olafgoud.Main;
import me.olafgoud.utils.ItemUtils;

public class InventoryListener implements Listener{
	private static Main main;
	public InventoryListener(Main main) {
        this.main = main;
    }
	@EventHandler
	public void inventoryListener(InventoryClickEvent e) {
		if (((Player) e.getWhoClicked()).getWorld().getName().equalsIgnoreCase("Olaffff2")) {

			if (e.getView().getTitle() == null) {
				return;
			} else if (e.getView().getTitle().equals("Wood Shop")) {
				Player p = (Player) e.getWhoClicked();
				Integer slot = e.getRawSlot();
				if (slot < 27) {
					e.setCancelled(true);
					switch(slot) {
					case 13: 
						Integer i = 0;
						for (; i < 36 ; i++) {
							ItemStack gold = p.getInventory().getItem(i);
							if (gold == null) {
								continue;
							}
							if (NBTEditor.contains(gold, "material")) {
								if (NBTEditor.getString(gold, "material").contains("gold")) {
									if (gold.getAmount() >= 3) {
										p.getInventory().getItem(i).setAmount(p.getInventory().getItem(i).getAmount() - 3);
										ItemStack item = ItemUtils.getItem(Material.WOOD, "&2Wood Plank", "Official PracticeMC Resource");
										item = NBTEditor.set(item, "wood", "material"); 
										p.getInventory().addItem(item);
										p.sendMessage(ChatColor.DARK_GREEN + "You have bought an item.");
										return;		
									}
								}	
							}
						}

						p.sendMessage(ChatColor.RED + "You do not have enough gold.");
						break;
					default: return;
					}
				}

			} else if (e.getView().getTitle().equals("Gunpowder Shop")) {
				Player p = (Player) e.getWhoClicked();
				Integer slot = e.getRawSlot();
				if (slot < 27) {
					e.setCancelled(true);
					switch(slot) {
					case 13: 
						Integer i = 0;
						for (; i < 36 ; i++) {
							ItemStack gold = p.getInventory().getItem(i);
							if (gold == null) {
								continue;
							}
							if (NBTEditor.contains(gold, "material")) {
								if (NBTEditor.getString(gold, "material").contains("gold")) {
									if (gold.getAmount() >= 5) {
										p.getInventory().getItem(i).setAmount(p.getInventory().getItem(i).getAmount() - 5);
										ItemStack item = ItemUtils.getItem(Material.SULPHUR, "&2Gunpowder", "Official PracticeMC Resource");
										item = NBTEditor.set(item, "gunpowder", "material"); 
										p.getInventory().addItem(item);
										p.sendMessage(ChatColor.DARK_GREEN + "You have bought an item.");
										return;		
									}

								}	
							}
						}

						p.sendMessage(ChatColor.RED + "You do not have enough gold.");
						break;
					default: return;
					}
				}

			} else if (e.getView().getTitle().equals("Material Smelter")) {
				Player p = (Player) e.getWhoClicked();
				Integer slot = e.getRawSlot();
				if (slot < 27) {
					e.setCancelled(true);
					switch(slot) {
					case 9: 
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (!(p.getInventory().getItem(i).getAmount() >= 9)) {
										continue;
									}
									p.getInventory().getItem(i).setAmount(p.getInventory().getItem(i).getAmount() - 9);
									ItemStack item = ItemUtils.getItem(Material.IRON_BLOCK, "&2Iron Block", "&5Official PracticeMC Resource");
									item = NBTEditor.set(item, "ironblock", "material"); 
									p.getInventory().addItem(item);
									p.sendMessage(ChatColor.DARK_GREEN + "You have smelted your items successfuly.");
									return;			
								}	
							}
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 10: 
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("ironpiece")) {
									if (!(p.getInventory().getItem(i).getAmount() >= 6)) {
										continue;
									}
									p.getInventory().getItem(i).setAmount(p.getInventory().getItem(i).getAmount() - 6);
									ItemStack item = ItemUtils.getItem(Material.IRON_INGOT, "&2Iron Ingot", "&5Official PracticeMC Resource");
									item = NBTEditor.set(item, "ironingot", "material"); 
									p.getInventory().addItem(item);
									p.sendMessage(ChatColor.DARK_GREEN + "You have smelted your items successfuly.");
									return;			
								}	
							}
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;

					default: return;
					}
				}
			} else if (e.getView().getTitle().equals("Weaponbench")) {
				Player p = (Player) e.getWhoClicked();
				Integer slot = e.getRawSlot();
				int mat1 = -1;
				int mat2 = -1;
				int mat3 = -1;
				int mat4 = -1;
				int mat5 = -1;
				if (slot < 27) {
					e.setCancelled(true);
					switch(slot) {
					case 0: 
						//walter pp
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("wood")) {
									if (p.getInventory().getItem(i).getAmount() >= 3) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (p.getInventory().getItem(i).getAmount() >= 3) {
										mat2 = i;
									}	
								} else if (NBTEditor.getString(material, "material").contains("ironpiece")) {
									if (p.getInventory().getItem(i).getAmount() >= 8) {
										mat3 = i;
									}	
								}
							}
							if (mat1 > -1 && mat2 > -1 && mat3 > -1) {
								p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 3);
								p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 8);
								p.getInventory().getItem(mat3).setAmount(p.getInventory().getItem(mat3).getAmount() - 3);

								main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getweapon walterpp 50 " + p.getName());
								return;		
							}
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 1: 
						//p92
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("ironblock")) {
									if (p.getInventory().getItem(i).getAmount() >= 2) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (p.getInventory().getItem(i).getAmount() >= 10) {
										mat2 = i;
									}	
								} else if (NBTEditor.getString(material, "material").contains("ironpiece")) {
									if (p.getInventory().getItem(i).getAmount() >= 7) {
										mat3 = i;
									}	
								}
							}
							if (mat1 > -1 && mat2 > -1 && mat3 > -1) {
								p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 2);
								p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 10);
								p.getInventory().getItem(mat3).setAmount(p.getInventory().getItem(mat3).getAmount() - 7);

								main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getweapon p92 50 " + p.getName());
								return;		
							}
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 2: 
						//m24
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("ironblock")) {
									if (p.getInventory().getItem(i).getAmount() >= 4) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (p.getInventory().getItem(i).getAmount() >= 7) {
										mat2 = i;
									}	
								} else if (NBTEditor.getString(material, "material").contains("ironpiece")) {
									if (p.getInventory().getItem(i).getAmount() >= 10) {
										mat3 = i;
									}	
								}
							}
							if (mat1 > -1 && mat2 > -1 && mat3 > -1) {
								p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 4);
								p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 7);
								p.getInventory().getItem(mat3).setAmount(p.getInventory().getItem(mat3).getAmount() - 10);

								main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getweapon m24 30 " + p.getName());
								return;		
							}
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 3: 
						//mossberg 500
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("wood")) {
									if (p.getInventory().getItem(i).getAmount() >= 10) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironblock")) {
									if (p.getInventory().getItem(i).getAmount() >= 1) {
										mat2 = i;
									}	
								} else if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (p.getInventory().getItem(i).getAmount() >= 5) {
										mat3 = i;
									}	
								} else if (NBTEditor.getString(material, "material").contains("ironpiece")) {
									if (p.getInventory().getItem(i).getAmount() >= 5) {
										mat4 = i;
									}
								}
							}
						}
						if (mat1 > -1 && mat2 > -1 && mat3 > -1 && mat4 > -1) {
							p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 10);
							p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 1);
							p.getInventory().getItem(mat3).setAmount(p.getInventory().getItem(mat3).getAmount() - 5);
							p.getInventory().getItem(mat4).setAmount(p.getInventory().getItem(mat3).getAmount() - 5);

							main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getweapon mossberg500 50 " + p.getName());
							return;		
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 4: 
						//T4
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("ironblock")) {
									if (p.getInventory().getItem(i).getAmount() >= 3) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (p.getInventory().getItem(i).getAmount() >= 9) {
										mat2 = i;
									}	
								} else if (NBTEditor.getString(material, "material").contains("ironpiece")) {
									if (p.getInventory().getItem(i).getAmount() >= 7) {
										mat3 = i;
									}	
								}
							}
							if (mat1 > -1 && mat2 > -1 && mat3 > -1) {
								p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 3);
								p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 9);
								p.getInventory().getItem(mat3).setAmount(p.getInventory().getItem(mat3).getAmount() - 7);

								main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getweapon t4 200 " + p.getName());
								return;		
							}
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 5: 
						//ak-47
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("wood")) {
									if (p.getInventory().getItem(i).getAmount() >= 10) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironblock")) {
									if (p.getInventory().getItem(i).getAmount() >= 2) {
										mat2 = i;
									}	
								} else if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (p.getInventory().getItem(i).getAmount() >= 10) {
										mat3 = i;
									}	
								} else if (NBTEditor.getString(material, "material").contains("ironpiece")) {
									if (p.getInventory().getItem(i).getAmount() >= 5) {
										mat4 = i;
									}	
								}
							}
						}
						if (mat1 > -1 && mat2 > -1 && mat3 > -1 && mat4 > -1) {
							p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 10);
							p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 2);
							p.getInventory().getItem(mat3).setAmount(p.getInventory().getItem(mat3).getAmount() - 10);
							p.getInventory().getItem(mat4).setAmount(p.getInventory().getItem(mat3).getAmount() - 5);

							main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getweapon ak-47 200 " + p.getName());
							return;		
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 6: 
						//thompson
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("wood")) {
									if (p.getInventory().getItem(i).getAmount() >= 6) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironblock")) {
									if (p.getInventory().getItem(i).getAmount() >= 1) {
										mat2 = i;
									}	
								} else if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (p.getInventory().getItem(i).getAmount() >= 4) {
										mat3 = i;
									}	
								} else if (NBTEditor.getString(material, "material").contains("ironpiece")) {
									if (p.getInventory().getItem(i).getAmount() >= 3) {
										mat4 = i;
									}	
								}
							}
						}
						if (mat1 > -1 && mat2 > -1 && mat3 > -1 && mat4 > -1) {
							p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 6);
							p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 1);
							p.getInventory().getItem(mat3).setAmount(p.getInventory().getItem(mat3).getAmount() - 4);
							p.getInventory().getItem(mat4).setAmount(p.getInventory().getItem(mat3).getAmount() - 3);

							main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getweapon thompson 200 " + p.getName());
							return;		
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 9: 
						//thompsonammo
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("gunpowder")) {
									if (p.getInventory().getItem(i).getAmount() >= 7) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (p.getInventory().getItem(i).getAmount() >= 3) {
										mat2 = i;
									}	
								}
							}
						}
						if (mat1 > -1 && mat2 > -1) {
							p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 7);
							p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 3);
							main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getammo thompsonammo " + p.getName());
							return;		
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 10: 
						//9mm
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("gunpowder")) {
									if (p.getInventory().getItem(i).getAmount() >= 3) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironpiece")) {
									if (p.getInventory().getItem(i).getAmount() >= 3) {
										mat2 = i;
									}	
								}
							}
						}
						if (mat1 > -1 && mat2 > -1) {
							p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 3);
							p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 3);
							main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getammo 9mm " + p.getName());
							return;		
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 11: 
						//5.6x61mm
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("gunpowder")) {
									if (p.getInventory().getItem(i).getAmount() >= 5) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (p.getInventory().getItem(i).getAmount() >= 4) {
										mat2 = i;
									}	
								}
							}
						}
						if (mat1 > -1 && mat2 > -1) {
							p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 5);
							p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 4);
							main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getammo 5_6x61mm " + p.getName());
							return;		
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 12: 
						//shell
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("gunpowder")) {
									if (p.getInventory().getItem(i).getAmount() >= 2) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironingot")) {
									if (p.getInventory().getItem(i).getAmount() >= 3) {
										mat2 = i;
									}	
								}
							}
						}
						if (mat1 > -1 && mat2 > -1) {
							p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 2);
							p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 3);
							main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getammo shelll " + p.getName());
							return;		
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					case 13: 
						//7.62x51mm
						for (int i = 0; i < 36 ; i++) {
							ItemStack material = p.getInventory().getItem(i);
							if (material == null) {
								continue;
							}
							if (NBTEditor.contains(material, "material")) {
								if (NBTEditor.getString(material, "material").contains("gunpowder")) {
									if (p.getInventory().getItem(i).getAmount() >= 3) {
										mat1 = i;
									}		
								} else if (NBTEditor.getString(material, "material").contains("ironpiece")) {
									if (p.getInventory().getItem(i).getAmount() >= 4) {
										mat2 = i;
									}	
								}
							}
						}
						if (mat1 > -1 && mat2 > -1) {
							p.getInventory().getItem(mat1).setAmount(p.getInventory().getItem(mat1).getAmount() - 3);
							p.getInventory().getItem(mat2).setAmount(p.getInventory().getItem(mat2).getAmount() - 4);
							main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "gunshell getammo 7_62x51mm " + p.getName());
							return;		
						}
						p.sendMessage(ChatColor.RED + "You do not have enough material.");
						break;
					default: return;
					}
				}
			}
		}
	}
}
