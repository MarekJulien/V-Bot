package com.vbot.listener;

import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {

	// Handle incoming messages
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		
		// Make sure message is from text channel
		if (event.isFromType(ChannelType.TEXT)) {
			
			// Get event details
			TextChannel channel = event.getTextChannel();
			User user = event.getAuthor();
			Message message = event.getMessage();
			
			// Make sure message is not from a bot
			if(!user.isBot()) {
				
				// Reply
				channel.sendMessage(user.getAsMention() + ": " + message.getContentDisplay()).queue();
				
			}
			
		}
		
	}
	
}