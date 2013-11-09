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
		switch (say("You find yourself in a clearing in the middle of a dark and spooky forest.")) {
		case "look around":
			System.out.println("You look around");
			break;
		case "go north":
			System.out.println("You move north of your current location");
			switch (say("You have left the forest")) {
			case "look around":
				switch (say("To your north and east is an open plain, to the south is a forest and to your west is a river.")) {
				case "go west":

				default:
					System.out.println("One is sorry One does not know how to do that");
					break;
				}
				break;
			default:
				System.out.println("One is sorry One does not know how to do that");
				break;
			}
			break;
		default:
			System.out.println("One is sorry One does not know how to do that");
			break;
		}
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

	private String say(String words) {
		System.out.println(words);
		System.out.println("What do you do?");
		return s.nextLine().toLowerCase();

	}
}
