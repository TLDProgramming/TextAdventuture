package com.github.thelonedevil.TextAdventure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
	Scanner s = new Scanner(System.in);

	/*
	 * public int login() {
	 * String user;
	 * String pass;
	 * System.out.println("Please login");
	 * System.out.println("Username:");
	 * user = s.nextLine();
	 * System.out.println("Password:");
	 * pass = s.nextLine();
	 * boolean bool = true;
	 * if (bool) {
	 * System.out.println("Login Successful");
	 * return 0;
	 * }
	 * return 1;
	 * }
	 */

	public void run() {
		List<String> characters = new ArrayList<String>();
		characters.add("Human Warrior");
		characters.add("Human Mage");
		characters.add("Human Archer");
		characters.add("Elven Warrior");
		characters.add("Elven Mage");
		characters.add("Elven Archer");
		Player p = new Player(characterSelect(), characters);
		Room start = new Room(1);
		System.out.println(start.lookAround());
		command(start);
	}

	private int characterSelect() {
		System.out.println("Select your character:");
		System.out.println("1. Human Warrior");
		System.out.println("2. Human Mage");
		System.out.println("3. Human Archer");
		System.out.println("4. Elven Warrior");
		System.out.println("5. Elven Mage");
		System.out.println("6. Elven Archer");
		int character = Integer.parseInt(s.nextLine());
		return character;

	}

	void command(Room room) {
		System.out.println("What do you do?");
		Room newRoom = null;
		switch (s.nextLine().toLowerCase().trim()) {
		case "look around":
			System.out.println(room.lookAround());
			break;
		case "go north":
			int north = room.goNorth();
			if (north != 0) {
				newRoom = new Room(north);
				System.out.println(newRoom.lookAround());
			} else
				noRoom();
			break;
		case "go east":
			int east = room.goEast();
			if (east != 0) {
				newRoom = new Room(east);
				System.out.println(newRoom.lookAround());
			} else
				noRoom();
			break;
		case "go south":
			int south = room.goSouth();
			if (south != 0) {
				newRoom = new Room(south);
				System.out.println(newRoom.lookAround());
			} else
				noRoom();
			break;
		case "go west":
			int west = room.goWest();
			if(west != 0){
			newRoom = new Room(west);
			System.out.println(newRoom.lookAround());
			} else noRoom();
			break;

		case "swing sword":
			// do things to attack things

		case "quit":
			System.out.println("Are you sure you want to quit the game? y/n");
			switch (s.nextLine().toLowerCase().trim()) {
			case "y":
				System.exit(0);
				break;
			case "n":
				break;
			default:
				unknownCommand();
			}
			break;
		default:
			unknownCommand();
		}
		if (newRoom != null) {
			command(newRoom);
		} else {
			command(room);
		}
	}

	private void noRoom() {
		System.out.println("You can not go that way");
	}

	private void unknownCommand() {
		System.out.println("One is sorry One does not know how to do that");
	}
}
