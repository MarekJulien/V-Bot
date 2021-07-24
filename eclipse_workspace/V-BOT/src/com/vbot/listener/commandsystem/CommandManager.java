package com.vbot.listener.commandsystem;

import java.util.concurrent.ConcurrentHashMap;

import com.vbot.listener.commandsystem.commands.HelpCommand;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class CommandManager {

	private ConcurrentHashMap<String, Command> commands;
	
	// Constructor
	public CommandManager() {
		
		// Create command list
		commands = new ConcurrentHashMap<String, Command>();
		
		// Add commands to list
		commands.put("help", new HelpCommand());
		
	}
	
	public boolean perform(String command, TextChannel channel, User user, Message message) {
		
		Command cmd = this.commands.get(command);
		if(cmd != null) {
			
			cmd.performCommand(channel, user, message);
			return true;
			
		}
		
		return false;
		
	}
	
}
