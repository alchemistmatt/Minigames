package au.com.mineauz.minigames.commands;

import java.util.List;

import org.bukkit.command.CommandSender;

import au.com.mineauz.minigames.Minigames;
import au.com.mineauz.minigames.minigame.Minigame;

public interface ICommand {
//	public PlayerData pdata = Minigames.plugin.getPlayerData();
//	public MinigameData mdata = Minigames.plugin.getMinigameData();
	public Minigames plugin = Minigames.plugin;
	
	public String getName();
	
	public String[] getAliases();
	
	public boolean canBeConsole();
	
	public String getDescription();
	
	public String[] getParameters();
	
	public String[] getUsage();
	
	public String getPermissionMessage();
	
	public String getPermission();
	
	public boolean onCommand(CommandSender sender, Minigame minigame, String label, String[] args);
	
	public List<String> onTabComplete(CommandSender sender, Minigame minigame, String alias, String[] args);
}
