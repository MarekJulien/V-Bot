package com.vbot.listener.commandsystem;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public interface Command {

	void performCommand(TextChannel channel, User user, Message message);
	
}
