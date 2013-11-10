package com.github.thelonedevil.TextAdventure;

import java.util.HashMap;
import java.util.Random;

public class Room {
	int ID;
	HashMap<String, Boolean> exits = new HashMap<String, Boolean>();

	Room(int type) {
		this.ID = type;
		lookAround();

	}

	String lookAround() {
		switch (ID) {
		case 1:
			return "You find yourself in a clearing in the middle of a dark and spooky forest.";
		case 2:
			int rand = new Random().nextInt(5);
			System.out.println(rand);
			if(rand == 1){
				return "A Level 1 Goblin appears in front of you";
			}
			return "To your north and east is an open plain, to the south is a forest and to your west is a river.";
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
