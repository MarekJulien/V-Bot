package com.vbot.listener.commandsystem.commands;

import com.vbot.listener.commandsystem.Command;
import com.vbot.listener.constants.Constants;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class HelpCommand implements Command{

	@Override
	public void performCommand(TextChannel channel, User user, Message message) {
		
		channel.sendMessage("__**Diese Commands kannst du verwenden:**__\n"
				+ Constants.PREFIX + "**help**: Zeigt alle verfügbaren Befehle an").queue();
		
	}

}
