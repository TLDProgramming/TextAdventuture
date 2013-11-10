package com.github.thelonedevil.TextAdventure.enemies;

public class Goblin extends Enemy {
	static int health = 20;
	static int baseDamage = 1;
	static int defense = 1;

	Goblin(int level) {
		super(health * level, level, baseDamage * level, defense * level);
	}

}
