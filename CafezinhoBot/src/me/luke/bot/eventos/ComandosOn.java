package me.luke.bot.eventos;

import me.luke.bot.info;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ComandosOn extends ListenerAdapter {

	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split( " ");
	if(args[0].equalsIgnoreCase( info.PREFIX + "online")){
		int online = 0;
		for (int i = 0; i < event.getGuild().getMembers().size(); i++) {
		  if(event.getGuild().getMembers().get(i).getOnlineStatus() == OnlineStatus.ONLINE || event.getGuild().getMembers().get(i).getOnlineStatus() == OnlineStatus.DO_NOT_DISTURB) {
			  online++;
		  }
			
		}
		event.getChannel().sendMessage( "Atualmente" + online + " Pessoas Online " + event.getGuild().getMembers().size() + " membros no server").queue();
		//d
	}
	}
}
