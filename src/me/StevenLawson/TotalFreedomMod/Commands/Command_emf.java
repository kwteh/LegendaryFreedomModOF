package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Tell them to use english.", usage = "/<command> <player>")
public class Command_emf extends TFM_Command{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
		 if (args.length == 0)
	        {
	            return false;
	        }

	        final Player player = getPlayer(args[0]);

	        if (player == null)
	        {
	            playerMsg(TotalFreedomMod.PLAYER_NOT_FOUND, ChatColor.RED);
	            return true;
	        }
        String targetName = null;
        TFM_Util.adminAction(sender.getName(), "§4Is si§6ck an§3d tire§1d of " + player.getName() + " no§dt spea§9king Engli§lsh...", true);
        player.sendMessage(ChatColor.RED + "You better start using English you worthless dipshit, or worse is to come...");
        player.setOp(false);
        player.setHealth(0);
        player.getWorld().strikeLightning(player.getLocation());
		return true;
	}

}