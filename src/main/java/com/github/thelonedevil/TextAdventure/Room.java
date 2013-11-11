package com.github.thelonedevil.TextAdventure;

import java.util.Random;

import com.github.thelonedevil.TextAdventure.enemies.Enemy;
import com.github.thelonedevil.TextAdventure.enemies.Goblin;

import lombok.Getter;
import lombok.Setter;

public class Room {
	@Getter
	int ID;
	@Getter
	@Setter
	boolean combat = false;
	@Getter
	@Setter
	boolean killed = false;
	@Getter
	Enemy enemy;

	Room(int type) {
		this.ID = type;
		lookAround();

	}

	String lookAround() {
		switch (ID) {
		case 1:
			return "You find yourself in a clearing in the middle of a dark and spooky forest. \nTo the north the trees get less dense, but to the south, east and west they grow closer together, blocking out even more of the light.";
		case 2:
			if (!combat) {
				int rand = new Random().nextInt(2);
				if (rand == 1 && !killed) {
					combat = true;
					enemy = new Goblin(1);
					return "A Level 1 Goblin appears in front of you.";
				}
				return "To your north and east is an open plain, to the south is a forest and to your west is a river.";
			}
			if (combat) {
				return "A level 1 Goblin stands in your way.";
			}
		default:
			return "error";
		}
	}

	int goNorth() {
		switch (ID) {
		case 1:
			System.out.println("You move north of your current location");
			System.out.println("You have left the forest");
			return 2;
		}
		return 0;
	}

	int goSouth() {
		switch (ID) {
		case 2:
			return 1;
		}
		return 0;
	}

	int goEast() {
		switch (ID) {

		}
		return 0;
	}

	int goWest() {
		switch (ID) {

		}
		return 0;
	}

}
