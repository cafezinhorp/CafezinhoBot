package me.luke.bot.eventos;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Ola extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String [] args = event.getMessage().getContentRaw().split( " ");
		
		if(args[0].equalsIgnoreCase( "salve")) {
			if(!event.getMember().getUser().isBot()) {
			event.getChannel().sendMessage( "salve macho").queue();
		}
	}
	}

}
