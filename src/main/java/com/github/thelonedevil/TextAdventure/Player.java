package com.github.thelonedevil.TextAdventure;

import java.util.List;

public class Player {
	String character;
	int strength;
	int perception;
	int endurance;
	int charisma;
	int intelligence;
	int agilty;
	int luck;
	
	Player(int number, List<String> list){
		this.character = list.get(number-1);
		System.out.println("You have chosen: "+ character);
		
	}
	

	
}
