package com.vbot.bot;

import javax.security.auth.login.LoginException;

import com.vbot.program.TokenManager;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Bot {

	static JDABuilder builder;

	public static void create() throws LoginException {

		builder = JDABuilder.createDefault(null);

		// Get Token
		final String TOKEN = TokenManager.getToken();

		// Setup
		builder.setToken(TOKEN);
		builder.setStatus(OnlineStatus.ONLINE);
		builder.setActivity(Activity.listening("to users"));

		builder.build();

	}

}
