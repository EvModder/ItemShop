package net.evmodder.ItemShop;

import java.util.UUID;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class ShopInteractListener implements Listener{
	final ItemShop plugin;

	public ShopInteractListener(){
		plugin = ItemShop.getPlugin();
	}

	@EventHandler
	public void onHorseFeed(PlayerInteractEntityEvent evt){
		if(evt.isCancelled() || evt.getRightClicked().getType() != EntityType.ITEM_FRAME) return;

		UUID playerUUID = evt.getPlayer().getUniqueId();
		UUID frameUUID = evt.getRightClicked().getUniqueId();

		//TODO: test is itemframe is a shop?

		if(plugin.isOwner(playerUUID, frameUUID)){
			ItemStack itemInHand = evt.getPlayer().getInventory().getItemInMainHand();
			//TODO: put item in shop?
		}
	}
}