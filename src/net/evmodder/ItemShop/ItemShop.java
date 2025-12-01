package net.evmodder.ItemShop;

import java.util.UUID;
import net.evmodder.EvLib.bukkit.EvPlugin;

public class ItemShop extends EvPlugin{
	private static ItemShop plugin;
	public static ItemShop getPlugin(){ return plugin; }

	@Override public void onEvEnable(){
		plugin = this;

		//register listeners
		registerListeners();

		//register commands
		new CommandExampleCommand(this);

	}

	void registerListeners(){
		getServer().getPluginManager().registerEvents(new ShopInteractListener(), this);
	}

	public boolean isOwner(UUID player, UUID shop){
		return true;//TODO: actually test if owner
	}
}