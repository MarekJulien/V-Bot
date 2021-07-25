package com.vbot.bot;

import javax.security.auth.login.LoginException;

import com.vbot.listener.MessageListener;
import com.vbot.listener.constants.Constants;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Bot {
	
	private static JDABuilder builder;

	public static void create() throws LoginException {

		builder = JDABuilder.createDefault(null);

		// Setup
		builder.setToken(Constants.TOKEN);
		builder.setStatus(OnlineStatus.ONLINE);
		builder.setActivity(Activity.listening("to users"));

		// Add event listener
		builder.addEventListeners(new MessageListener());
		
		// Build bot
		builder.build();
		
		// Print confirmation
		System.out.println();
		System.out.println("Bot online");
		System.out.println();

	}

}
