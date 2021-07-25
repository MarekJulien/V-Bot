package com.vbot.commandsystem;

import java.util.concurrent.ConcurrentHashMap;

import com.vbot.commandsystem.commands.AnonymMessageCommand;
import com.vbot.commandsystem.commands.HelpCommand;
import com.vbot.commandsystem.commands.RandomNameCommand;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

public class CommandManager {

	private ConcurrentHashMap<String, Command> commands;
	
	// Constructor
	public CommandManager() {
		
		// Create command list
		commands = new ConcurrentHashMap<String, Command>();
		
		// Add commands to list
		commands.put("help", new HelpCommand());
		commands.put("randomname", new RandomNameCommand());
		commands.put("anonymmessage", new AnonymMessageCommand());
		
	}
	
	public boolean perform(String command, TextChannel channel, Member member, Message message) {
		
		Command cmd = this.commands.get(command);
		if(cmd != null) {
			
			cmd.performCommand(channel, member, message);
			return true;
			
		}
		
		return false;
		
	}
	
	// Extract arguments from message
	public static String[] getCommandArgs(Message message) {
		
		String content = message.getContentDisplay();
		String[] args = content.split(" ");
		
		return args;
		
	}
	
}
