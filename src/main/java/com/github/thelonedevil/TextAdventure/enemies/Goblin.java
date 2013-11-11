package com.github.thelonedevil.TextAdventure.enemies;

import lombok.Getter;

public class Goblin extends Enemy {
	static int health = 20;
	static int baseDamage = 1;
	static int defense = 1;
	@Getter
	String type = "Goblin";

	public Goblin(int level) {
		super(health * level, level, baseDamage * level, defense * level);
	}

}
