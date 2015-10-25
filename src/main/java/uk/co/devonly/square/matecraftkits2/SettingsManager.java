package uk.co.devonly.square.matecraftkits2;

import java.io.File;
import java.io.IOException;
//import uk.co.devonly.square.matecraftkits2.SettingsManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

public class SettingsManager {
	
	private SettingsManager() { }
	
	static SettingsManager instance = new SettingsManager();
	
	public static SettingsManager getInstance() {
		return instance;
	}
	
	Plugin p;
        
	FileConfiguration config;
	File cfile;
        
        FileConfiguration playersYML;
        File pfile;
	
	public void setup(Plugin p) {
            	cfile = new File(p.getDataFolder(), "config.yml");
		config = p.getConfig();
		//config.options().copyDefaults(true);
                
                if (!p.getDataFolder().exists()) {
                    try {
                        p.getDataFolder().createNewFile();
                    }
                    catch (IOException e) {
                        Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not create Kits folder!");
                    }
                }
                pfile = new File(p.getDataFolder(), "players.yml");
                
                if (!pfile.exists()) {
                    try {
                        pfile.createNewFile();
                    }
                    catch (IOException e){
                        Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not create player.yml!");
                    }
                }
                playersYML = YamlConfiguration.loadConfiguration(pfile);
                
	}
        
        public FileConfiguration getPlayerYML() {
            return playersYML;
        }
	
	public FileConfiguration getConfig() {
		return config;
	}
        
        public void savePlayersYML() {
            try {
                playersYML.save(pfile);
            }
            catch (IOException e) {
                Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save players.yml!");
            }
        }
	
	public void saveConfig() {
		try {
			config.save(cfile);
		}
		catch (IOException e) {
			Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save config.yml!");
		}
        }
        public void reloadPlayersYML() {
            playersYML = YamlConfiguration.loadConfiguration(pfile);
        }
	public void reloadConfig() {
		config = YamlConfiguration.loadConfiguration(cfile);
	}
	
	public PluginDescriptionFile getDesc() {
		return p.getDescription();
	}
}
