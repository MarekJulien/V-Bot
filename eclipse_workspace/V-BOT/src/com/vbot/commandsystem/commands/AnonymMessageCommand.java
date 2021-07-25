package com.vbot.commandsystem.commands;

import com.vbot.commandsystem.Command;
import com.vbot.commandsystem.CommandManager;
import com.vbot.listener.constants.Constants;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

public class AnonymMessageCommand implements Command {

	@Override
	public void performCommand(TextChannel channel, Member member, Message message) {

		// Get command arguments
		String[] args = CommandManager.getCommandArgs(message);

		// Delete original message
		message.delete().queue();

		// Check if message is not empty
		if (args.length > 1) {

			// Get message as String
			String messageContent = "";
			for (int i = 1; i < args.length; i++) {

				messageContent += args[i];
				
				if(!(i == args.length - 1)) {
					
					messageContent += " ";
					
				}

			}

			// Post anonym message
			channel.sendMessage("**Anonym:** " + messageContent).queue();

		}else {

			channel.sendMessage("Ungültige Parameter, bitte verwende " + Constants.PREFIX + "**anonymmessage [Nachricht]**").queue();

		} 

	}

}
