package uk.co.devonly.square.matecraftkits2;

import java.util.ArrayList;
import java.util.List;
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
import uk.co.devonly.cleggeh.matecraftkits2.GUI;
import uk.co.devonly.cleggeh.matecraftkits2.lang;

public class MatecraftKits extends JavaPlugin implements Listener {

    ArrayList<String> discoOff = new ArrayList<String>();
    ArrayList<String> rainOff = new ArrayList<String>();

    Kits kits = new Kits(this);
    lang lang = new lang(this);
    Kits RGBitem = new Kits(this);
    GUI GUI = new GUI(this);
    SettingsManager settings = new SettingsManager(this);

    int rainred = 255;
    int rainblue = 0;
    int raingreen = 0;

    @Override
    public void onEnable() {
        settings.setup(this);
        GUI = new GUI(this);
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {

            private final Random r = new Random();

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
        if (!(p.hasPlayedBefore()) || settings.getConfig().getBoolean("joinKit") == true) {
            Kits.starterKit(p);
        }
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player p = (Player) sender;
        PlayerInventory pi = p.getInventory();
        if (cmd.getName().equalsIgnoreCase("delhat")) {
            if (!(sender instanceof Player)) {
                lang.consoleerror(sender); //Console command error
                return true;
            }
            pi.setHelmet(null);
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("inv")) {
            GUI.show(p);
           return true;
        }

        if (cmd.getName().equalsIgnoreCase("dye")) {
            if (!(sender instanceof Player)) {
                lang.consoleerror(sender); //Console command error
                return true;
            }
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
                if (p.getInventory().getHelmet().getType() != Material.LEATHER_HELMET || p.getInventory().getChestplate().getType() != Material.LEATHER_CHESTPLATE || p.getInventory().getLeggings().getType() != Material.LEATHER_LEGGINGS || p.getInventory().getBoots().getType() != Material.LEATHER_BOOTS) {
                    lang.allarmour(p);
                    return false;
                }

                String RGBargs1 = (args[1].toLowerCase());
                switch (RGBargs1) {
                    case "red":
                        Color red = Color.fromRGB(255, 0, 0);
                        Kits.RGBitem(p, red);
                        lang.dyedarmour(p);
                        break;
                    case "orange":
                        Color orange = Color.fromRGB(255, 127, 0);
                        Kits.RGBitem(p, orange);
                        lang.dyedarmour(p);
                        break;
                    case "yellow":
                        Color yellow = Color.fromRGB(255, 255, 0);
                        Kits.RGBitem(p, yellow);
                        lang.dyedarmour(p);
                        break;
                    case "green":
                        Color green = Color.fromRGB(50, 200, 50);
                        Kits.RGBitem(p, green);
                        lang.dyedarmour(p);
                        break;
                    case "lime":
                        Color lime = Color.fromRGB(0, 255, 0);
                        Kits.RGBitem(p, lime);
                        lang.dyedarmour(p);
                        break;
                    case "aqua":
                        Color aqua = Color.fromRGB(0, 255, 255);
                        Kits.RGBitem(p, aqua);
                        lang.dyedarmour(p);
                        break;
                    case "sky":
                        Color sky = Color.fromRGB(50, 160, 255);
                        Kits.RGBitem(p, sky);
                        lang.dyedarmour(p);
                        break;
                    case "blue":
                        Color blue = Color.fromRGB(0, 0, 255);
                        Kits.RGBitem(p, blue);
                        lang.dyedarmour(p);
                        break;
                    case "violet":
                        Color violet = Color.fromRGB(235, 0, 255);
                        Kits.RGBitem(p, violet);
                        lang.dyedarmour(p);
                        break;
                    case "purple":
                        Color purple = Color.fromRGB(170, 0, 255);
                        Kits.RGBitem(p, purple);
                        lang.dyedarmour(p);
                        break;
                    case "pink":
                        Color pink = Color.fromRGB(255, 130, 255);
                        Kits.RGBitem(p, pink);
                        lang.dyedarmour(p);
                        break;
                    case "white":
                        Color white = Color.fromRGB(255, 255, 255);
                        Kits.RGBitem(p, white);
                        lang.dyedarmour(p);
                        break;
                    case "black":
                        Color black = Color.fromRGB(0, 0, 0);
                        Kits.RGBitem(p, black);
                        lang.dyedarmour(p);
                        break;
                    case "grey":
                        Color grey = Color.fromRGB(150, 150, 150);
                        Kits.RGBitem(p, grey);
                        lang.dyedarmour(p);
                        break;
                    case "brown":
                        Color brown = Color.fromRGB(80, 50, 0);
                        Kits.RGBitem(p, brown);
                        lang.dyedarmour(p);
                        break;
                    default:
                        lang.invalidargs(p); // Invalid args
                        break;
                }
                if (args[1].equalsIgnoreCase("RGB")) {
                    if (args.length <= 2) {
                        lang.RGBargs(p);
                        return true;
                    }
                    if (args.length >= 6) {
                        lang.RGBargs(p);
                        return true;
                    }
                    if (args.length < 5) {
                        lang.RGBargs(p);
                        return true;
                    }
                    String redValueStr = args[2];
                    int redValueInt = Integer.parseInt(redValueStr);

                    String greenValueStr = args[3];
                    int greenValueInt = Integer.parseInt(greenValueStr);

                    String blueValueStr = args[4];
                    int blueValueInt = Integer.parseInt(blueValueStr);

                    Color RGB = Color.fromRGB(redValueInt, greenValueInt, blueValueInt);
                    // Replaced block of code with Kits Code using RGB user imput.
                    Kits.RGBitem(p, RGB);
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
                    lang.consoleerror(sender);
                    return true;
                }
                lang.kitinfo(p);
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
        if (args[0].equalsIgnoreCase("list")) {
            if (!(p.hasPermission("matecraftkits.list"))) {
                p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "No permission!");
                return true;
            }
            if (args.length > 1) {
                p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.RED + "Too many arguments!");
                return true;
            }
            lang.kitlist(p);
        }
        if (args[0].equalsIgnoreCase("info")) {
            p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
            p.sendMessage(ChatColor.LIGHT_PURPLE + " MatecraftKits is a custom kit plugin made for Matecraft. It's the plugin that gives you the tools and food you start off with. It's also the plugin that allows for disco armour!");
            p.sendMessage("");
            p.sendMessage(ChatColor.GREEN + "Version: " + ChatColor.LIGHT_PURPLE + "1.0");
            p.sendMessage(ChatColor.GREEN + "Author: " + ChatColor.LIGHT_PURPLE + "SquareRival" + ChatColor.GREEN + "+" + ChatColor.LIGHT_PURPLE + "Cleggeh");

            p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
            return true;
        }
        if (args[0].equalsIgnoreCase("help")) {
            lang.help(p);
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
