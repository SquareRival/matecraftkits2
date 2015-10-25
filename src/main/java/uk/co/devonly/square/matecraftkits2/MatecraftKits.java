package uk.co.devonly.square.matecraftkits2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;
import uk.co.devonly.cleggeh.matecraftkits2.lang;

public class MatecraftKits extends JavaPlugin implements Listener {

    lang lang = new lang(this);

    ArrayList<String> discoOff = new ArrayList<String>();
    ArrayList<String> rainOff = new ArrayList<String>();

    SettingsManager settings = SettingsManager.getInstance();

    Kits starterKit = new Kits(this);
    Kits giveStarterKit = new Kits(this);
    Kits setArmourRed = new Kits(this);
    Kits setArmourOrange = new Kits(this);
    Kits setArmourYellow = new Kits(this);
    Kits setArmourGreen = new Kits(this);
    Kits setArmourLime = new Kits(this);
    Kits setArmourAqua = new Kits(this);
    Kits setArmourSky = new Kits(this);
    Kits setArmourBlue = new Kits(this);
    Kits setArmourViolet = new Kits(this);
    Kits setArmourPurple = new Kits(this);
    Kits setArmourPink = new Kits(this);
    Kits setArmourWhite = new Kits(this);
    Kits setArmourBlack = new Kits(this);
    Kits setArmourGrey = new Kits(this);
    Kits setArmourBrown = new Kits(this);

    int rainred = 255;
    int rainblue = 0;
    int raingreen = 0;

    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        settings.setup(this);

        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {

            private Random r = new Random();

            public void run() {

                Color c = Color.fromRGB(rainred, raingreen, rainblue);

                Color d = Color.fromRGB(r.nextInt(255), r.nextInt(255), r.nextInt(255));

                for (Player p : Bukkit.getServer().getOnlinePlayers()) {
                    if (p.getInventory().getHelmet() != null && p.getInventory().getHelmet().getType() == Material.LEATHER_HELMET && p.hasPermission("matecraftkits.disco.helmet") && p.getInventory().getHelmet().getItemMeta().hasLore() == true && p.getInventory().getHelmet().getItemMeta().getLore().toString().contains("Disco I") && !(discoOff.contains(p.getName()))) {
                        p.getInventory().setHelmet(getColorArmor(Material.LEATHER_HELMET, d));
                    }

                    if (p.getInventory().getChestplate() != null && p.getInventory().getChestplate().getType() == Material.LEATHER_CHESTPLATE && p.hasPermission("matecraftkits.disco.chestplate") && p.getInventory().getChestplate().getItemMeta().hasLore() == true && p.getInventory().getChestplate().getItemMeta().getLore().toString().contains("Disco I") && !(discoOff.contains(p.getName()))) {
                        p.getInventory().setChestplate(getColorArmor(Material.LEATHER_CHESTPLATE, d));
                    }

                    if (p.getInventory().getLeggings() != null && p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.hasPermission("matecraftkits.disco.leggings") && p.getInventory().getLeggings().getItemMeta().hasLore() == true && p.getInventory().getLeggings().getItemMeta().getLore().toString().contains("Disco I") && !(discoOff.contains(p.getName()))) {
                        p.getInventory().setLeggings(getColorArmor(Material.LEATHER_LEGGINGS, d));
                    }

                    if (p.getInventory().getBoots() != null && p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS && p.hasPermission("matecraftkits.disco.boots") && p.getInventory().getBoots().getItemMeta().hasLore() == true && p.getInventory().getBoots().getItemMeta().getLore().toString().contains("Disco I") && !(discoOff.contains(p.getName()))) {
                        p.getInventory().setBoots(getColorArmor(Material.LEATHER_BOOTS, d));
                    }

                    if (p.getInventory().getHelmet() != null && p.getInventory().getHelmet().getType() == Material.LEATHER_HELMET && p.hasPermission("matecraftkits.rainbow.helmet") && p.getInventory().getHelmet().getItemMeta().hasLore() == true && p.getInventory().getHelmet().getItemMeta().getLore().toString().contains("Rainbow I") && !(rainOff.contains(p.getName()))) {
                        p.getInventory().setHelmet(getColorArmor1(Material.LEATHER_HELMET, c));

                    }
                    if (p.getInventory().getChestplate() != null && p.getInventory().getChestplate().getType() == Material.LEATHER_CHESTPLATE && p.hasPermission("matecraftkits.rainbow.chestplate") && p.getInventory().getChestplate().getItemMeta().hasLore() == true && p.getInventory().getChestplate().getItemMeta().getLore().toString().contains("Rainbow I") && !(rainOff.contains(p.getName()))) {
                        p.getInventory().setChestplate(getColorArmor1(Material.LEATHER_CHESTPLATE, c));

                    }
                    if (p.getInventory().getLeggings() != null && p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.hasPermission("matecraftkits.rainbow.leggings") && p.getInventory().getLeggings().getItemMeta().hasLore() == true && p.getInventory().getLeggings().getItemMeta().getLore().toString().contains("Rainbow I") && !(rainOff.contains(p.getName()))) {
                        p.getInventory().setLeggings(getColorArmor1(Material.LEATHER_LEGGINGS, c));

                    }
                    if (p.getInventory().getBoots() != null && p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS && p.hasPermission("matecraftkits.rainbow.boots") && p.getInventory().getBoots().getItemMeta().hasLore() == true && p.getInventory().getBoots().getItemMeta().getLore().toString().contains("Rainbow I") && !(rainOff.contains(p.getName()))) {
                        p.getInventory().setBoots(getColorArmor1(Material.LEATHER_BOOTS, c));

                    }

                    if (raingreen != 255 && rainblue == 0 && rainred != 0) {
                        raingreen = raingreen + 15;
                    }
                    if (raingreen == 255 && rainblue == 0 && rainred != 0) {
                        rainred = rainred - 15;
                    }
                    if (rainred == 0 && raingreen == 255 && rainblue != 255) {
                        rainblue = rainblue + 15;
                    }
                    if (rainred == 0 && rainblue == 255 && raingreen != 0) {
                        raingreen = raingreen - 15;
                    }
                    if (rainblue == 255 && raingreen == 0 && rainred != 255) {
                        rainred = rainred + 15;
                    }
                    if (rainred == 255 && raingreen == 0 && rainblue != 0) {
                        rainblue = rainblue - 15;
                    }

                }
            }
        }, 0, settings.getConfig().getInt("colourDelay"));
    }

    private ItemStack getColorArmor(Material m, Color d) {
        ItemStack i = new ItemStack(m, 1);
        i.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        LeatherArmorMeta meta = (LeatherArmorMeta) i.getItemMeta();
        meta.setColor(d);
        List<String> iLore = new ArrayList<String>();
        iLore.add(ChatColor.GRAY + "Disco I");
        iLore.add(ChatColor.GRAY + "");
        iLore.add(ChatColor.GREEN + "You can do " + ChatColor.WHITE + "/disco " + ChatColor.GREEN + "to toggle disco armour!");
        meta.setLore(iLore);
        meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Disco Armour");
        i.setItemMeta(meta);
        return i;

    }

    private ItemStack getColorArmor1(Material m, Color c) {
        ItemStack i = new ItemStack(m, 1);
        i.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
        LeatherArmorMeta meta = (LeatherArmorMeta) i.getItemMeta();
        meta.setColor(c);
        List<String> iLore = new ArrayList<String>();
        iLore.add(ChatColor.GRAY + "Rainbow I");
        iLore.add(ChatColor.GRAY + "");
        iLore.add(ChatColor.GREEN + "You can do " + ChatColor.WHITE + "/disco " + ChatColor.GREEN + "to toggle disco armour!");
        meta.setLore(iLore);
        meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Rainbow Armour");
        i.setItemMeta(meta);
        return i;

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (!(p.hasPlayedBefore())) {
            Kits.starterKit(p);
        }
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        
        
        if (cmd.getName().equalsIgnoreCase("dye")) {
            if (!(sender instanceof Player)) {
                lang.consoleerror(sender); //Console command error
                return true;
            }
            Player p = (Player) sender;
            if (!(p.hasPermission("matecraftkits.dye"))) {
                lang.noperms(p); // Player no perms
                return true;
            }
            if ((args.length == 0) || (args.length < 1)) {
                lang.args(p); // Not enough Args
                return true;
            }
            if (args[0].equalsIgnoreCase("colour")) {
                if (args.length == 1) {
                    lang.colourhelp(p);
                }
            }
            if (args[0].equalsIgnoreCase("all")) {
                if (args.length == 1) {
                    p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Please specify a colour you wish your armour to be!");
                    return true;
                }
                if (args[1].equalsIgnoreCase("red")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourRed(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("orange")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourOrange(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("yellow")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourYellow(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("green")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourGreen(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("lime")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourLime(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("aqua")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourAqua(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("sky")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourSky(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("blue")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourBlue(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("violet")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourViolet(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("purple")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourPurple(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("pink")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourPink(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("white")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourWhite(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("black")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourBlack(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("grey")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourGrey(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("brown")) {
                    if (p.getInventory().getHelmet() == null || p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate() == null || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings() == null || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots() == null || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                        lang.allarmour(p);
                        return true;
                    }
                    Kits.setArmourBrown(p);
                    lang.dyedarmour(p);
                    return true;
                }
                if (args[1].equalsIgnoreCase("RGB")) {
                    if (args.length <= 2) {
                        p.sendMessage("");

                        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Please specify an integer for the red, green, and blue values!");
                        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Proper use: /dye all RGB [redValue(0 - 255)] [greenValue(0 - 255)] [blueValue(0 - 255)]");
                        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "If you need help choosing a colour, check here: " + ChatColor.LIGHT_PURPLE + "http://www.colorpicker.com/");
                        return true;
                    }
                    if (args.length >= 6) {
                        p.sendMessage("");

                        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Too many arguments given!");
                        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Proper use: /dye all RGB [redValue(0 - 255)] [greenValue(0 - 255)] [blueValue(0 - 255)]");
                        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "If you need help choosing a colour, check here: " + ChatColor.LIGHT_PURPLE + "http://www.colorpicker.com/");
                        return true;
                    }
                    if (args.length < 5) {
                        p.sendMessage("");

                        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Please specify an integer for ALL red, green, and blue values!");
                        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Proper use: /dye all RGB [redValue(0 - 255)] [greenValue(0 - 255)] [blueValue(0 - 255)]");
                        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "If you need help choosing a colour, check here: " + ChatColor.LIGHT_PURPLE + "http://www.colorpicker.com/");
                        return true;
                    }
                    String redValueStr = args[2];
                    int redValueInt = Integer.parseInt(redValueStr);

                    String greenValueStr = args[3];
                    int greenValueInt = Integer.parseInt(greenValueStr);

                    String blueValueStr = args[4];
                    int blueValueInt = Integer.parseInt(blueValueStr);

                    Color RGB = Color.fromRGB(redValueInt, greenValueInt, blueValueInt);

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

                    ItemStack redboot = new ItemStack(Material.LEATHER_BOOTS, 1);
                    redboot.addUnsafeEnchantments(booten);
                    redboot.setDurability(bootdur);
                    LeatherArmorMeta redbootmeta = (LeatherArmorMeta) redboot.getItemMeta();
                    redbootmeta.setDisplayName(bootname);
                    redbootmeta.setLore(bootlore);
                    redbootmeta.setColor(RGB);
                    redboot.setItemMeta(redbootmeta);

                    ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
                    redchest.addUnsafeEnchantments(chesten);
                    redchest.setDurability(chestdur);
                    LeatherArmorMeta redchestmeta = (LeatherArmorMeta) redchest.getItemMeta();
                    redchestmeta.setDisplayName(chestname);
                    redchestmeta.setLore(chestlore);
                    redchestmeta.setColor(RGB);
                    redchest.setItemMeta(redchestmeta);

                    ItemStack redleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
                    redleg.addUnsafeEnchantments(legen);
                    redleg.setDurability(legdur);
                    LeatherArmorMeta redlegmeta = (LeatherArmorMeta) redleg.getItemMeta();
                    redlegmeta.setDisplayName(legname);
                    redlegmeta.setLore(leglore);
                    redlegmeta.setColor(RGB);
                    redleg.setItemMeta(redlegmeta);

                    ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET, 1);
                    redhelm.addUnsafeEnchantments(helmen);
                    redhelm.setDurability(helmdur);
                    LeatherArmorMeta redhelmmeta = (LeatherArmorMeta) redhelm.getItemMeta();
                    redhelmmeta.setDisplayName(helmname);
                    redhelmmeta.setLore(helmlore);
                    redhelmmeta.setColor(RGB);
                    redhelm.setItemMeta(redhelmmeta);
                    pi.setBoots(redboot);
                    pi.setChestplate(redchest);
                    pi.setLeggings(redleg);
                    pi.setHelmet(redhelm);
                    return true;

                } else {
                    p.sendMessage("");
                    p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Something wasn't input correctly or the colour doesn't exist...");
                    p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Proper use: /dye all [colour / RGB] [redValue(0 - 255)] [greenValue(0 - 255)] [blueValue(0 - 255)]");
                    p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.LIGHT_PURPLE + "If you need help choosing a colour, check here: " + ChatColor.DARK_PURPLE + "http://www.colorpicker.com/");
                    return true;
                }
            }
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("disco") && sender.hasPermission("matecraftkits.disco.toggle")) {
            if (discoOff.contains(sender.getName())) {
                discoOff.remove(sender.getName());
                sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "Disco armour is now enabled for you!");
                return true;
            }
            if (!(discoOff.contains(sender.getName()))) {
                discoOff.add(sender.getName());
                sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "Disco armour is now disabled for you!");
                return true;
            }
        }
        if (cmd.getName().equalsIgnoreCase("rainbow") && sender.hasPermission("matecraftkits.rainbow.toggle")) {
            if (rainOff.contains(sender.getName())) {
                rainOff.remove(sender.getName());
                sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "Rainbow armour is now enabled for you!");
                return true;
            }
            if (!(rainOff.contains(sender.getName()))) {
                rainOff.add(sender.getName());
                sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "Rainbow armour is now disabled for you!");
                return true;
            }
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("mkit") || cmd.getName().equalsIgnoreCase("kit")) {
            if (args.length == 0) {
                if (!(sender instanceof Player)) {
                    sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Welp! That didn't work. Try /mkit give [player] instead!");
                    return true;
                }
                Player p = (Player) sender;
                p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
                p.sendMessage(ChatColor.GREEN + "§ /mkit info");
                p.sendMessage(ChatColor.GRAY + " > Gives info about MatecraftKits");
                if (p.hasPermission("matecraftkits.use")) {
                    p.sendMessage(ChatColor.GREEN + "§ /mkit");
                    p.sendMessage(ChatColor.GRAY + " > Shows this menu");
                    p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.use");
                }
                if (p.hasPermission("matecraftkits.list")) {
                    p.sendMessage(ChatColor.GREEN + "§ /mkit list");
                    p.sendMessage(ChatColor.GRAY + " > Shows all available MatecraftKits");
                    p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.list");
                }
                if (p.hasPermission("matecraftkits.disco.toggle")) {
                    p.sendMessage(ChatColor.GREEN + "§ /disco");
                    p.sendMessage(ChatColor.GRAY + " > Toggles your use of disco armour");
                    p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.disco.toggle");
                }
                if (p.hasPermission("matecraftkits.setcolourdelay")) {
                    p.sendMessage(ChatColor.GREEN + "§ /mkit setcolourdelay [value]");
                    p.sendMessage(ChatColor.GRAY + " > Sets the amount of ticks per colour change for disco armour");
                    p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.setcolourdelay");
                }
                if (p.hasPermission("matecraftkits.reload")) {
                    p.sendMessage(ChatColor.GREEN + "§ /mkit reload");
                    p.sendMessage(ChatColor.GRAY + " > Reload MatecraftKits (Does nothing at the moment)");
                    p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.reload");
                }
                if (p.hasPermission("matecraftkits.dye")) {
                    p.sendMessage(ChatColor.GREEN + "§ /dye [all, helmet, chestplate, leggings, boots] [colour / RGB] (redValue) (greenValue) (blueValue)");
                    p.sendMessage(ChatColor.GRAY + " > Changes the colour of your leather armour");
                    p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.dye");
                }
                if (p.hasPermission("matecraftkits.dye")) {
                    p.sendMessage(ChatColor.GREEN + "§ /dye colours");
                    p.sendMessage(ChatColor.GRAY + " > Shows all the colours");
                    p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.dye");
                }
                p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
                return true;
            }
            if ((args[0].equalsIgnoreCase("setcolourdelay")) && sender.hasPermission("matecraftkits.setcolourdelay")) {
                if (args.length > 2) {
                    sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Too many arguments!");
                    return true;
                }
                if (args.length == 1) {
                    sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Not enough arguments!");
                    return true;
                }
                String colourdelay = args[1];
                int delay = Integer.parseInt(colourdelay);
                settings.getConfig().set("colourDelay", delay);
                settings.saveConfig();
                sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "Colour delay set to: " + ChatColor.GREEN + args[1]);
                return true;
            }
            if (args[0].equalsIgnoreCase("reload")) {
                settings.saveConfig();
                settings.reloadConfig();
                sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "MatecraftKits config reloaded!");
                return true;
            }
            if (args[0].equalsIgnoreCase("give")) {
                if (args.length == 1) {
                    sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Please specify a player you wish to give a kit to!");
                    return true;
                }
                Player t = Bukkit.getServer().getPlayer(args[1]);
                if (t == null) {
                    sender.sendMessage(ChatColor.DARK_RED + args[1] + ChatColor.RED + " is not online!");
                    return true;
                }
                Kits.giveStarterKit(t);
                sender.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.DARK_GREEN + t.getName() + ChatColor.GREEN + " has recieved their custom kit!");
                return true;
            }
            Player p = (Player) sender;
            if (args[0].equalsIgnoreCase("starter")) {
                if (!(p.hasPermission("pkit.use.starter"))) {
                    p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "No permission!");
                    return true;
                }
                if (args.length > 1) {
                    p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Too many arguments!");
                    return true;
                }
                Kits.starterKit(p);
                return true;
            }
        }
        Player p = (Player) sender;
        if (args[0].equalsIgnoreCase("list")) {
            if (!(p.hasPermission("matecraftkits.list"))) {
                p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "No permission!");
                return true;
            }
            if (args.length > 1) {
                p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Too many arguments!");
                return true;
            }
            p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
            if (p.hasPermission("matecraftkits.use.starter")) {
                p.sendMessage(ChatColor.GREEN + "§ /mkit starter");
                p.sendMessage(ChatColor.GRAY + " > Gives starter kit");
                p.sendMessage(ChatColor.GRAY + " > Kit includes:");
                p.sendMessage(ChatColor.GRAY + " > §f1 §dPickaxe");
                p.sendMessage(ChatColor.GRAY + " > §f1 §dAxe");
                p.sendMessage(ChatColor.GRAY + " > §f1 §dShovel");
                p.sendMessage(ChatColor.GRAY + " > §f64 §dKFCs");
                p.sendMessage(ChatColor.GRAY + "§8§l§m+----------------------+");
            }
            if (p.hasPermission("matecraftkits.use.disco")) {
                p.sendMessage(ChatColor.GREEN + "§ /mkit disco");
                p.sendMessage(ChatColor.GRAY + " > Gives disco armour kit");
                p.sendMessage(ChatColor.GRAY + " > Kit includes:");
                p.sendMessage(ChatColor.GRAY + " > §f1 §dDisco Armour Set");
            }
            p.sendMessage("§8§§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
            return true;
        }
        if (args[0].equalsIgnoreCase("info")) {
            p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
            p.sendMessage(ChatColor.LIGHT_PURPLE + " MatecraftKits is a custom kit plugin made for Matecraft. It's the plugin that gives you the tools and food you start off with. It's also the plugin that allows for disco armour!");
            p.sendMessage("");
            p.sendMessage(ChatColor.GREEN + "Version: " + ChatColor.LIGHT_PURPLE + "1.0");
            p.sendMessage(ChatColor.GREEN + "Author: " + ChatColor.LIGHT_PURPLE + "SquareRival");

            p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
            return true;
        }
        if (args[0].equalsIgnoreCase("help")) {
            p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
            if (p.hasPermission("matecraftkits.use")) {
                p.sendMessage(ChatColor.GREEN + "§ /mkit");
                p.sendMessage(ChatColor.GRAY + " > Shows this menu");
                p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.use");
            }
            if (p.hasPermission("matecraftkits.list")) {
                p.sendMessage(ChatColor.GREEN + "§ /mkit list");
                p.sendMessage(ChatColor.GRAY + " > Shows all available MatecraftKits");
                p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.list");
            }
            if (p.hasPermission("matecraftkits.disco.toggle")) {
                p.sendMessage(ChatColor.GREEN + "§ /disco");
                p.sendMessage(ChatColor.GRAY + " > Toggles your use of disco armour");
                p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.disco.toggle");
            }
            if (p.hasPermission("matecraftkits.setcolourdelay")) {
                p.sendMessage(ChatColor.GREEN + "§ /mkit setcolourdelay [value]");
                p.sendMessage(ChatColor.GRAY + " > Sets the amount of ticks per colour change for disco armour");
                p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.setcolourdelay");
            }
            if (p.hasPermission("matecraftkits.reload")) {
                p.sendMessage(ChatColor.GREEN + "§ /mkit reload");
                p.sendMessage(ChatColor.GRAY + " > Reload MatecraftKits (Does nothing at the moment)");
                p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.reload");
            }
            p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
            return true;
        }
        if (args[0].equalsIgnoreCase("disco")) {
            if (!(p.hasPermission("matecraftkits.use.disco"))) {
                p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "No permission!");
                return true;
            }
            if (args.length > 1) {
                p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Too many arguments!");
                return true;
            }
            Kits.discoKit(p);
            return true;
        }
        if (args[0].equalsIgnoreCase("rainbow")) {
            if (!(p.hasPermission("matecraftkits.use.rainbow"))) {
                p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "No permission!");
                return true;
            }
            Kits.rainbowKit(p);
            return true;
        }
        return true;
    }
}
