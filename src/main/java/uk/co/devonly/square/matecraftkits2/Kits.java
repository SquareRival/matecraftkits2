package uk.co.devonly.square.matecraftkits2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Kits {
	
	private final MatecraftKits plugin;
	
	public Kits(MatecraftKits plugin) {
		this.plugin = plugin;
	}
	public static void starterKit(Player p) {
		PlayerInventory pi = p.getInventory();
        ItemStack plpick = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        plpick.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
        plpick.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        plpick.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        ItemMeta plpickmeta = plpick.getItemMeta();
        
        ItemStack plaxe = new ItemStack(Material.DIAMOND_AXE, 1);
        plaxe.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
        plaxe.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        plaxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 20);
        ItemMeta plaxemeta = plaxe.getItemMeta();
        
        ItemStack plspade = new ItemStack(Material.DIAMOND_SPADE, 1);
        plspade.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
        plspade.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        plspade.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        ItemMeta plspademeta = plspade.getItemMeta();
        
        ItemStack plfood = new ItemStack(Material.COOKED_CHICKEN, 64);
        plfood.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
        ItemMeta plfoodmeta = plfood.getItemMeta();
        
        if (p.getName().toString().endsWith("s") || p.getName().toString().endsWith("S")) {
            plpickmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + p.getName() + "' First Pick" );
            List<String> plpicklore = new ArrayList<String>();
            plpicklore.add(ChatColor.DARK_GRAY + "This will do for now.");
            plpickmeta.setLore(plpicklore);
            plpick.setItemMeta(plpickmeta);
            
            plaxemeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + p.getName() + "' First Chopping Device" );
            List<String> plaxelore = new ArrayList<String>();
            plaxelore.add(ChatColor.DARK_GRAY + "Chop, chop, chop...");
            plaxemeta.setLore(plaxelore);
            plaxe.setItemMeta(plaxemeta);
            
            plspademeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + p.getName() + "' First Digger" );
            List<String> plspadelore = new ArrayList<String>();
            plspadelore.add(ChatColor.DARK_GRAY + "Where to dig?");
            plspademeta.setLore(plspadelore);
            plspade.setItemMeta(plspademeta);
            
            plfoodmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + p.getName() + "' KFC" );
            List<String> plfoodlore = new ArrayList<String>();
            plfoodlore.add(ChatColor.DARK_GRAY + "Finger lickin' goodness, " + p.getName());
            plfoodlore.add("");
            plfoodlore.add("�9+0.0001 Attack Damage");
            plfoodmeta.setLore(plfoodlore);
            plfood.setItemMeta(plfoodmeta);
            
            pi.addItem(plpick);
            pi.addItem(plaxe);
            pi.addItem(plspade);
            pi.addItem(plfood);
            
            p.sendMessage("�7[�5�lMatecraft�7] �aTools specially crafted just for you, " + p.getName());
            return;
        }
        plpickmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + p.getName() + "'s First Pick" );
        List<String> plpicklore = new ArrayList<String>();
        plpicklore.add(ChatColor.DARK_GRAY + "This will do for now.");
        plpickmeta.setLore(plpicklore);
        plpick.setItemMeta(plpickmeta);
        
        plaxemeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + p.getName() + "'s First Chopping Device" );
        List<String> plaxelore = new ArrayList<String>();
        plaxelore.add(ChatColor.DARK_GRAY + "Chop, chop, chop...");
        plaxemeta.setLore(plaxelore);
        plaxe.setItemMeta(plaxemeta);
        
        plspademeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + p.getName() + "'s First Digger" );
        List<String> plspadelore = new ArrayList<String>();
        plspadelore.add(ChatColor.DARK_GRAY + "Where to dig?");
        plspademeta.setLore(plspadelore);
        plspade.setItemMeta(plspademeta);
        
        plfoodmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + p.getName() + "'s KFC" );
        List<String> plfoodlore = new ArrayList<String>();
        plfoodlore.add(ChatColor.DARK_GRAY + "Finger lickin' goodness, " + p.getName());
        plfoodlore.add("");
        plfoodlore.add("�9+0.0001 Attack Damage");
        plfoodmeta.setLore(plfoodlore);
        plfood.setItemMeta(plfoodmeta);
        
        pi.addItem(plpick);
        pi.addItem(plaxe);
        pi.addItem(plspade);
        pi.addItem(plfood);
        
        p.sendMessage("�7[�5�lMatecraft�7] �aTools specially crafted just for you, " + p.getName());
        }
	
	public static void giveStarterKit(Player t) {
		PlayerInventory ti = t.getInventory();
        ItemStack plpick = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        plpick.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
        plpick.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        plpick.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        ItemMeta plpickmeta = plpick.getItemMeta();
        
        ItemStack plaxe = new ItemStack(Material.DIAMOND_AXE, 1);
        plaxe.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
        plaxe.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        plaxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 20);
        ItemMeta plaxemeta = plaxe.getItemMeta();
        
        ItemStack plspade = new ItemStack(Material.DIAMOND_SPADE, 1);
        plspade.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
        plspade.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        plspade.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        ItemMeta plspademeta = plspade.getItemMeta();
        
        ItemStack plfood = new ItemStack(Material.COOKED_CHICKEN, 64);
        plfood.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
        ItemMeta plfoodmeta = plfood.getItemMeta();
        
        if (t.getName().toString().endsWith("s") || t.getName().toString().endsWith("S")) {
            plpickmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + t.getName() + "' First Pick" );
            List<String> plpicklore = new ArrayList<String>();
            plpicklore.add(ChatColor.DARK_GRAY + "This will do for now.");
            plpickmeta.setLore(plpicklore);
            plpick.setItemMeta(plpickmeta);
            
            plaxemeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + t.getName() + "' First Chopping Device" );
            List<String> plaxelore = new ArrayList<String>();
            plaxelore.add(ChatColor.DARK_GRAY + "Chop, chop, chop...");
            plaxemeta.setLore(plaxelore);
            plaxe.setItemMeta(plaxemeta);
            
            plspademeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + t.getName() + "' First Digger" );
            List<String> plspadelore = new ArrayList<String>();
            plspadelore.add(ChatColor.DARK_GRAY + "Where to dig?");
            plspademeta.setLore(plspadelore);
            plspade.setItemMeta(plspademeta);
            
            plfoodmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + t.getName() + "' KFC" );
            List<String> plfoodlore = new ArrayList<String>();
            plfoodlore.add(ChatColor.DARK_GRAY + "Finger lickin' goodness, " + t.getName());
            plfoodlore.add("");
            plfoodlore.add("�9+0.0001 Attack Damage");
            plfoodmeta.setLore(plfoodlore);
            plfood.setItemMeta(plfoodmeta);
            
            ti.addItem(plpick);
            ti.addItem(plaxe);
            ti.addItem(plspade);
            ti.addItem(plfood);
            
            t.sendMessage("�7[�5�lMatecraft�7] �aTools specially crafted just for you, " + t.getName());
            return;
        }
        plpickmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + t.getName() + "'s First Pick" );
        List<String> plpicklore = new ArrayList<String>();
        plpicklore.add(ChatColor.DARK_GRAY + "This will do for now.");
        plpickmeta.setLore(plpicklore);
        plpick.setItemMeta(plpickmeta);
        
        plaxemeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + t.getName() + "'s First Chopping Device" );
        List<String> plaxelore = new ArrayList<String>();
        plaxelore.add(ChatColor.DARK_GRAY + "Chop, chop, chop...");
        plaxemeta.setLore(plaxelore);
        plaxe.setItemMeta(plaxemeta);
        
        plspademeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + t.getName() + "'s First Digger" );
        List<String> plspadelore = new ArrayList<String>();
        plspadelore.add(ChatColor.DARK_GRAY + "Where to dig?");
        plspademeta.setLore(plspadelore);
        plspade.setItemMeta(plspademeta);
        
        plfoodmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + t.getName() + "'s KFC" );
        List<String> plfoodlore = new ArrayList<String>();
        plfoodlore.add(ChatColor.DARK_GRAY + "Finger lickin' goodness, " + t.getName());
        plfoodlore.add("");
        plfoodlore.add("�9+0.0001 Attack Damage");
        plfoodmeta.setLore(plfoodlore);
        plfood.setItemMeta(plfoodmeta);
        
        ti.addItem(plpick);
        ti.addItem(plaxe);
        ti.addItem(plspade);
        ti.addItem(plfood);
        
        t.sendMessage("�7[�5�lMatecraft�7] �aTools specially crafted just for you, " + t.getName());
        }
	public static void setArmourRed(Player p) {
		Color red = Color.fromRGB(255, 0, 0);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(red);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(red);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(red);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(red);redhelm.setItemMeta(redhelmmeta);
		
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
		
		
	}
	public static void setArmourOrange(Player p) {
		Color orange = Color.fromRGB(255, 127, 0);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(orange);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(orange);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(orange);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(orange);redhelm.setItemMeta(redhelmmeta);
		
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourYellow(Player p) {
		Color yellow = Color.fromRGB(255, 255, 0);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(yellow);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(yellow);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(yellow);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(yellow);redhelm.setItemMeta(redhelmmeta);
	
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourGreen(Player p) {
		Color green = Color.fromRGB(50, 200, 50);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(green);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(green);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(green);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(green);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourLime(Player p) {
		Color lime = Color.fromRGB(0, 255, 0);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(lime);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(lime);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(lime);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(lime);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourAqua(Player p) {
		Color aqua = Color.fromRGB(0, 255, 255);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(aqua);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(aqua);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(aqua);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(aqua);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourSky(Player p) {
		Color sky = Color.fromRGB(50, 160, 255);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(sky);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(sky);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(sky);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(sky);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourBlue(Player p) {
		Color blue = Color.fromRGB(0, 0, 255);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(blue);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(blue);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(blue);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(blue);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourViolet(Player p) {
		Color violet = Color.fromRGB(235, 0, 255);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(violet);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(violet);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(violet);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(violet);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourPurple(Player p) {
		Color purple = Color.fromRGB(170, 0, 255);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(purple);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(purple);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(purple);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(purple);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourPink(Player p) {
		Color pink = Color.fromRGB(255, 130, 255);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(pink);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(pink);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(pink);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(pink);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourWhite(Player p) {
		Color white = Color.fromRGB(255, 255, 255);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(white);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(white);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(white);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(white);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourBlack(Player p) {
		Color black = Color.fromRGB(0, 0, 0);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(black);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(black);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(black);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(black);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourGrey(Player p) {
		Color grey = Color.fromRGB(150, 150, 150);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(grey);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(grey);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(grey);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(grey);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void setArmourBrown(Player p) {
		Color brown = Color.fromRGB(80, 50, 0);
		
		PlayerInventory pi = p.getInventory();
		short bootdur = pi.getBoots().getDurability();
		String bootname = pi.getBoots().getItemMeta().getDisplayName();
		List<String> bootlore = pi.getBoots().getItemMeta().getLore();
		Map<Enchantment, Integer> booten = pi.getBoots().getEnchantments();
		
		short chestdur = pi.getChestplate().getDurability(); 
		String chestname = pi.getChestplate().getItemMeta().getDisplayName(); 
		List<String> chestlore = pi.getChestplate().getItemMeta().getLore(); 
		Map<Enchantment, Integer> chesten = pi.getChestplate().getEnchantments();
		
		short legdur = pi.getLeggings().getDurability(); 
		String legname = pi.getLeggings().getItemMeta().getDisplayName(); 
		List<String> leglore = pi.getLeggings().getItemMeta().getLore();
		Map<Enchantment, Integer> legen = pi.getLeggings().getEnchantments();
		
		short helmdur = pi.getHelmet().getDurability();
		String helmname = pi.getHelmet().getItemMeta().getDisplayName();
		List<String> helmlore = pi.getHelmet().getItemMeta().getLore();
		Map<Enchantment, Integer> helmen = pi.getHelmet().getEnchantments();
		
		ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);redboot.addUnsafeEnchantments(booten);redboot.setDurability(bootdur);LeatherArmorMeta redbootmeta = (LeatherArmorMeta)redboot.getItemMeta();
		redbootmeta.setDisplayName(bootname);redbootmeta.setLore(bootlore);redbootmeta.setColor(brown);redboot.setItemMeta(redbootmeta);
		
		ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);redchest.addUnsafeEnchantments(chesten);redchest.setDurability(chestdur);LeatherArmorMeta redchestmeta = (LeatherArmorMeta)redchest.getItemMeta();
		redchestmeta.setDisplayName(chestname);redchestmeta.setLore(chestlore);redchestmeta.setColor(brown);redchest.setItemMeta(redchestmeta);
		
		ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);redleg.addUnsafeEnchantments(legen);redleg.setDurability(legdur);LeatherArmorMeta redlegmeta = (LeatherArmorMeta)redleg.getItemMeta();
		redlegmeta.setDisplayName(legname);redlegmeta.setLore(leglore);redlegmeta.setColor(brown);redleg.setItemMeta(redlegmeta);
		
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);redhelm.addUnsafeEnchantments(helmen);redhelm.setDurability(helmdur);LeatherArmorMeta redhelmmeta = (LeatherArmorMeta)redhelm.getItemMeta();
		redhelmmeta.setDisplayName(helmname);redhelmmeta.setLore(helmlore);redhelmmeta.setColor(brown);redhelm.setItemMeta(redhelmmeta);
		pi.setBoots(redboot);
		pi.setChestplate(redchest);
		pi.setLeggings(redleg);
		pi.setHelmet(redhelm);
	}
	public static void discoKit(Player p) {
		PlayerInventory pi = p.getInventory();
		
        ItemStack discoHelm = new ItemStack(Material.LEATHER_HELMET, 1);
        discoHelm.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        ItemMeta helmMeta = discoHelm.getItemMeta();
        
        helmMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Disco Armour");
        List<String> helmLore = new ArrayList<String>();
        helmLore.add(ChatColor.GRAY + "Disco I");
        helmLore.add(ChatColor.GRAY + "");
        helmLore.add(ChatColor.GREEN + "You can do " + ChatColor.WHITE + "/disco " + ChatColor.GREEN + "to toggle disco armour!");
        helmMeta.setLore(helmLore);
        discoHelm.setItemMeta(helmMeta);
        
        ItemStack discoChest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        discoChest.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        ItemMeta chestMeta = discoChest.getItemMeta();
        
        chestMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Disco Armour");
        List<String> chestLore = new ArrayList<String>();
        chestLore.add(ChatColor.GRAY + "Disco I");
        chestLore.add(ChatColor.GRAY + "");
        chestLore.add(ChatColor.GREEN + "You can do " + ChatColor.WHITE + "/disco " + ChatColor.GREEN + "to toggle disco armour!");
        chestMeta.setLore(chestLore);
        discoChest.setItemMeta(chestMeta);
        
        ItemStack discoLeg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        discoLeg.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        ItemMeta legMeta = discoLeg.getItemMeta();
        
        legMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Disco Armour");
        List<String> legLore = new ArrayList<String>();
        legLore.add(ChatColor.GRAY + "Disco I");
        legLore.add(ChatColor.GRAY + "");
        legLore.add(ChatColor.GREEN + "You can do " + ChatColor.WHITE + "/disco " + ChatColor.GREEN + "to toggle disco armour!");
        legMeta.setLore(legLore);
        discoLeg.setItemMeta(legMeta);
        
        ItemStack discoBoot = new ItemStack(Material.LEATHER_BOOTS, 1);
        discoBoot.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        ItemMeta bootMeta = discoBoot.getItemMeta();
        
        bootMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Disco Armour");
        List<String> bootLore = new ArrayList<String>();
        bootLore.add(ChatColor.GRAY + "Disco I");
        bootLore.add(ChatColor.GRAY + "");
        bootLore.add(ChatColor.GREEN + "You can do " + ChatColor.WHITE + "/disco " + ChatColor.GREEN + "to toggle disco armour!");
        bootMeta.setLore(bootLore);
        discoBoot.setItemMeta(bootMeta);
        
        if (p.hasPermission("matecraftkits.disco.helmet")) {
		pi.addItem(discoHelm);
        }
        if (p.hasPermission("matecraftkits.disco.chestplate")) {
		pi.addItem(discoChest);
        }
        if (p.hasPermission("matecraftkits.disco.leggings")) {
		pi.addItem(discoLeg);
        }
        if (p.hasPermission("matecraftkits.disco.boots")) {
		pi.addItem(discoBoot);
        }
		
        p.sendMessage("�7[�5�lMatecraft�7] �aDisco armour made just for you, " + p.getName() + ". Thanks for supporting the server!");

	}
	public static void rainbowKit(Player p) {
		PlayerInventory pi = p.getInventory();
		
        ItemStack rainbowHelm = new ItemStack(Material.LEATHER_HELMET, 1);
        rainbowHelm.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        ItemMeta helmMeta = rainbowHelm.getItemMeta();
        
        helmMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Rainbow Armour");
        List<String> helmLore = new ArrayList<String>();
        helmLore.add(ChatColor.GRAY + "Rainbow I");
        helmLore.add(ChatColor.GRAY + "");
        helmLore.add(ChatColor.GREEN + "You can do " + ChatColor.WHITE + "/disco " + ChatColor.GREEN + "to toggle disco armour!");
        helmMeta.setLore(helmLore);
        rainbowHelm.setItemMeta(helmMeta);
        
        ItemStack rainbowChest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        rainbowChest.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        ItemMeta chestMeta = rainbowChest.getItemMeta();
        
        chestMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Rainbow Armour");
        List<String> chestLore = new ArrayList<String>();
        chestLore.add(ChatColor.GRAY + "Rainbow I");
        chestLore.add(ChatColor.GRAY + "");
        chestLore.add(ChatColor.GREEN + "You can do " + ChatColor.WHITE + "/disco " + ChatColor.GREEN + "to toggle disco armour!");
        chestMeta.setLore(chestLore);
        rainbowChest.setItemMeta(chestMeta);
        
        ItemStack rainbowLeg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        rainbowLeg.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        ItemMeta legMeta = rainbowLeg.getItemMeta();
        
        legMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Rainbow Armour");
        List<String> legLore = new ArrayList<String>();
        legLore.add(ChatColor.GRAY + "Rainbow I");
        legLore.add(ChatColor.GRAY + "");
        legLore.add(ChatColor.GREEN + "You can do " + ChatColor.WHITE + "/disco " + ChatColor.GREEN + "to toggle disco armour!");
        legMeta.setLore(legLore);
        rainbowLeg.setItemMeta(legMeta);
        
        ItemStack rainbowBoot = new ItemStack(Material.LEATHER_BOOTS, 1);
        rainbowBoot.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        ItemMeta bootMeta = rainbowBoot.getItemMeta();
        
        bootMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Rainbow Armour");
        List<String> bootLore = new ArrayList<String>();
        bootLore.add(ChatColor.GRAY + "Rainbow I");
        bootLore.add(ChatColor.GRAY + "");
        bootLore.add(ChatColor.GREEN + "You can do " + ChatColor.WHITE + "/disco " + ChatColor.GREEN + "to toggle disco armour!");
        bootMeta.setLore(bootLore);
        rainbowBoot.setItemMeta(bootMeta);
        
        if (p.hasPermission("matecraftkits.rainbow.helmet")) {
		pi.addItem(rainbowHelm);
        }
        if (p.hasPermission("matecraftkits.rainbow.chestplate")) {
		pi.addItem(rainbowChest);
        }
        if (p.hasPermission("matecraftkits.rainbow.leggings")) {
		pi.addItem(rainbowLeg);
        }
        if (p.hasPermission("matecraftkits.rainbow.boots")) {
		pi.addItem(rainbowBoot);
        }
		
        p.sendMessage("�7[�5�lMatecraft�7] �aRainbow armour made just for you, " + p.getName() + ". Thanks for supporting the server!");

	}
}