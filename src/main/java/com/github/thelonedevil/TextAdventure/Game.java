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
		Room start = new Room("Start", true, true, true ,true);
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
	
	private void unknownCommand(){
		System.out.println("One is sorry One does not know how to do that");
	}
}
