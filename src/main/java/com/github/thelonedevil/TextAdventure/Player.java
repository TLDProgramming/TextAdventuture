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
	int strength; // carry weight, melee damage
	@Getter
	@Setter
	int intelligence; // magic damage, probability of solving puzzles
	@Getter
	@Setter
	int agility; // dodgeing, ranged damage

	Player(int number, List<String> list) {
		this.character = list.get(number - 1);
		System.out.println("You have chosen: " + character);
		switch (number) {
		case 1: // human warrior
			strength = 8;
			intelligence = 3;
			agility = 4;
			break;
		case 2: // human mage
			strength = 3;
			intelligence = 8;
			agility = 4;
			break;
		case 3:// human archer
			strength = 4;
			intelligence = 3;
			agility = 8;
			break;
		case 4: // eleven warrior
			strength = 9;
			intelligence = 3;
			agility = 3;
			break;
		case 5: // eleven mage
			strength = 3;
			intelligence = 9;
			agility = 3;
			break;
		case 6: // elven archer
			strength = 3;
			intelligence = 3;
			agility = 9;
			break;
		default:
		}

	}
}
