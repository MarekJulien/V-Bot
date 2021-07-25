package com.vbot.commandsystem;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

public interface Command {

	void performCommand(TextChannel channel, Member member, Message message);
	
}
