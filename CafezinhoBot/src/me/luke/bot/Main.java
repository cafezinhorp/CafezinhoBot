package me.luke.bot;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import me.luke.bot.eventos.Ola;
public class Main {
	private static JDA jda;
	
	public static void main(String[] args) throws Exception {
		jda = new JDABuilder(AccountType.BOT)
				.setToken("")
		        .build();
		
		jda.addEventListener(new Ola());
		
	}

}
