package com.github.thelonedevil.TextAdventure;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Player {
	String character;
	@Getter @Setter int Level;
	@Getter @Setter int exp;
	@Getter @Setter int strength;
	@Getter @Setter int perception;
	@Getter @Setter int endurance;
	@Getter @Setter int charisma;
	@Getter @Setter int intelligence;
	@Getter @Setter int agilty;
	@Getter @Setter int luck;
	
	Player(int number, List<String> list){
		this.character = list.get(number-1);
		System.out.println("You have chosen: "+ character);
		
	}
	

	
}
