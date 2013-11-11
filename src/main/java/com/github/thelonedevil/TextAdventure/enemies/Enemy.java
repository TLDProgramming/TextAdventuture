package com.github.thelonedevil.TextAdventure.enemies;

import java.util.Random;

import lombok.Getter;

public class Enemy {
	@Getter
	int health;
	int level;
	int baseDamage;
	int defense;
	@Getter
	String type = "Base";

	Enemy(int health, int level, int baseDamage, int defense) {
		this.health = health;
		this.level = level;
		this.baseDamage = baseDamage;
		this.defense = defense;
	}

	public boolean damage(double hit) {
		int rand = new Random().nextInt(2);
		System.out.println(hit);
		if ((rand == 1 && hit != 0)) {
			health = (int) Math.floor(health - hit);
			return true;
		} else
			return false;
	}
	
	public void dead(String enemy){
		System.out.println("Level "+level+ " "+enemy+ " has been killed");
	}

}
