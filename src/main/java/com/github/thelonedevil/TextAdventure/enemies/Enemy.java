package com.github.thelonedevil.TextAdventure.enemies;

public class Enemy {
	int health;
	int level;
	int baseDamage;
	int defense;

	Enemy(int health, int level, int baseDamage, int defense) {
		this.health = health;
		this.level = level;
		this.baseDamage = baseDamage;
		this.defense = defense;
	}
}
