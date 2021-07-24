package com.vbot.program;

import javax.security.auth.login.LoginException;

import com.vbot.bot.Bot;

public class Main {
	
	public static void main(String[] args) {
		
		// Create Bot
		try {
			Bot.create();
		} catch (LoginException e) {
			e.printStackTrace();
		}
		
		
	}

}
