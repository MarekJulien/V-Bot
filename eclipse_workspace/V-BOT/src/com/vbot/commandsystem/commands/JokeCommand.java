package com.vbot.commandsystem.commands;

import java.util.ArrayList;
import java.util.Random;

import com.vbot.commandsystem.Command;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

public class JokeCommand implements Command{

	private ArrayList<String> jokes = this.getJokeList();
	
	@Override
	public void performCommand(TextChannel channel, Member member, Message message) {
		
		channel.sendMessage(getRandomJoke()).queue();
		
	}

	private String getRandomJoke() {
		
		Random r = new Random();
		
		return this.jokes.get(r.nextInt(jokes.size()));
		
	}
	
	private ArrayList<String> getJokeList() {
		
		ArrayList<String> tmp = new ArrayList<String>();
		
		tmp.add("Ich esse nicht jede Sorte Chips. Ich bin da sehr pringelig.");
		tmp.add("Treffen sich zwei Schneemänner, fragt der eine: “Riechst du auch Karotten?”");
		tmp.add("Geld alleine macht niemanden glücklich. Man sollte es schon besitzen.");
		
		return tmp;
		
	}
	
}
