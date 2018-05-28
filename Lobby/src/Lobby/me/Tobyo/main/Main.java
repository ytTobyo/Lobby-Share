package Lobby.me.Tobyo.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		listeners();
		cmd();
		super.onEnable();
	}
	
	private void cmd() {
		// TODO Auto-generated method stub
		
	}

	private void listeners() {
		PluginManager pm = Bukkit.getPluginManager();
		
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
}
