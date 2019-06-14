package net.evmodder.ItemShop;

import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import net.evmodder.EvLib.EvCommand;

public class CommandExampleCommand extends EvCommand{
	public CommandExampleCommand(JavaPlugin pl){
		super(pl);
	}

	@Override
	public List<String> onTabComplete(CommandSender arg0, Command arg1, String arg2, String[] arg3){
		return null;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String args[]){
		//cmd:	/example-command <arg>

		if(sender instanceof Player == false){
			sender.sendMessage(ChatColor.RED + "This command can only be run by a player");
		}
		else{
			sender.sendMessage(ChatColor.GREEN + "Ran command with args: " + ChatColor.YELLOW + args.toString());
		}
		return true;
	}
}