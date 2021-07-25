package com.vbot.commandsystem.commands;

import com.vbot.commandsystem.Command;
import com.vbot.listener.constants.Constants;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

public class HelpCommand implements Command{

	@Override
	public void performCommand(TextChannel channel, Member member, Message message) {
		
		channel.sendMessage("__**Diese Commands kannst du verwenden:**__\n"
				+ Constants.PREFIX + "**help**: Zeigt alle verfügbaren Befehle an\n"
				+ Constants.PREFIX + "**anonymmessage [Nachricht]**: Sendet eine anonyme Nachricht\n"
				+ Constants.PREFIX + "**joke**: Sendet einen zufälligen Witz\n"
				+ Constants.PREFIX + "**randomname**: Gibt dir einen zufälligen Namen").queue();

	}

}
