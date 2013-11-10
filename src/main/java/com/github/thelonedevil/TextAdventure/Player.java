package com.github.thelonedevil.TextAdventure;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Player {
	String character;
	@Getter
	@Setter
	int level;
	@Getter
	@Setter
	int exp;
	@Getter
	@Setter
	int strength;
	@Getter
	@Setter
	int perception;
	@Getter
	@Setter
	int endurance;
	@Getter
	@Setter
	int charisma;
	@Getter
	@Setter
	int intelligence;
	@Getter
	@Setter
	int agility;
	@Getter
	@Setter
	int luck;

	Player(int number, List<String> list) {
		this.character = list.get(number - 1);
		System.out.println("You have chosen: " + character);
		switch (number) {
		case 1: // human warrior
			strength = 7;
			perception = 4;
			endurance = 8;
			charisma = 4;
			intelligence = 3;
			agility = 4;
			luck = 5;
			break;
		case 2: // human mage
			strength = 3;
			perception = 6;
			endurance = 5;
			charisma = 4;
			intelligence = 8;
			agility = 4;
			luck = 5;
			break;
		case 3:// human archer
			break;
		case 4: // eleven warrior
			break;
		case 5: // eleven mage
			break;
		case 6: // elven archer
			break;
		default:
		}

	}

}
