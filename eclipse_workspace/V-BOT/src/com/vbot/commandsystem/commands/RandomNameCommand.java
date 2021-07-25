package com.vbot.commandsystem.commands;

import java.util.Random;

import com.vbot.commandsystem.Command;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

public class RandomNameCommand implements Command{

	private String[] namelist = {"Cheese Pizza", "Cool Dinosaur", "Connection Lost", "Basshunter"};
	
	@Override
	public void performCommand(TextChannel channel, Member member, Message message) {
		
		// TODO Make sure bots role is higher than members
		if(true) {
			
			// Get random name
			String newName = getRandomName();
			
			// Rename member
			member.modifyNickname(newName);
			
			// Print message
			channel.sendMessage(member.getAsMention() + ", du heißt jetzt " + newName + "!").queue();
			
		}
		
	}
	
	// Pick random name from list
	private String getRandomName() {
		
		Random r = new Random();
		return namelist[r.nextInt(namelist.length)];
		
	}

}
