package com.vbot.listener;

import com.vbot.commandsystem.CommandManager;
import com.vbot.listener.constants.Constants;

import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {

	public CommandManager cmdMan;

	// Constructor
	public MessageListener() {

		// Create CommandManager
		cmdMan = new CommandManager();

	}

	// Handle incoming messages
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {

		// Make sure message is from text channel
		if (event.isFromType(ChannelType.TEXT)) {

			// Get event details
			TextChannel channel = event.getTextChannel();
			Member member = event.getMember();
			Message message = event.getMessage();
			
			String messageContent = message.getContentDisplay();

			// Make sure message is not from a bot
			if (!member.getUser().isBot()) {

				// Make sure message starts with prefix
				if (messageContent.startsWith(Constants.PREFIX)) {

					// Extract command by removing prefix
					String command = messageContent.substring(Constants.PREFIX.length());

					// Make sure command is not null
					if (command.length() > 0) {

						// Send error if Command does not exist
						if (!cmdMan.perform(command, channel, member, message)) {

							channel.sendMessage("Diesen Command kenne ich nicht, verwende " + Constants.PREFIX
									+ "**help**, um dir alle verfügbaren Commandos anzegeigen zu lassen").queue();

						}

					}

				}

			}

		}

	}

}