package com.github.thelonedevil.TextAdventure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.github.thelonedevil.TextAdventure.enemies.Enemy;
import com.github.thelonedevil.TextAdventure.weapons.Sword;
import com.github.thelonedevil.TextAdventure.weapons.Weapon;

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
		int c = characterSelect();
		if (c != 0) {
			List<String> characters = new ArrayList<String>();
			characters.add("Human Warrior");
			characters.add("Human Mage");
			characters.add("Human Archer");
			characters.add("Elven Warrior");
			characters.add("Elven Mage");
			characters.add("Elven Archer");
			Player p = new Player(c, characters);
			Room start = new Room(1);
			System.out.println(start.lookAround());
			command(start, p);
		} else
			run();
	}

	private int characterSelect() {
		System.out.println("Select your character:");
		System.out.println("1. Human Warrior");
		System.out.println("2. Human Mage");
		System.out.println("3. Human Archer");
		System.out.println("4. Elven Warrior");
		System.out.println("5. Elven Mage");
		System.out.println("6. Elven Archer");
		try {
			int character = Integer.parseInt(s.nextLine());
			return character;
		} catch (NumberFormatException e) {
			System.out.println("Not a valid character");
		}
		return 0;

	}

	void command(Room room, Player player) {
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
			if (west != 0) {
				newRoom = new Room(west);
				System.out.println(newRoom.lookAround());
			} else
				noRoom();
			break;

		case "swing sword":
			int damage;
			int level;
			double hit = 0;
			int weaponPower;
			Weapon weapon = player.getEquipedWeapon();
			switch (player.getCharacter().toLowerCase()) {
			case "human warrior":
			case "elven warrior":
				if (weapon instanceof Sword) {
					weaponPower = weapon.getPower();
					damage = player.getStrength() * weaponPower;
					level = player.getLevel();
					hit = (damage * level) /* / Math.PI */;
					System.out.println(hit);
				} else
					System.out.println("You do not have a sword equipped");
				break;
			}
			if (room.isCombat()) {
				Enemy enemy = room.getEnemy();
				if (enemy.getHealth() > 0) {
					if (enemy.damage(hit)) {
						System.out.println("You hit " + enemy.getType() + " for " + hit + " damage");
						System.out.println(enemy.getHealth());
					} else
						System.out.println("You missed");
				} if(enemy.getHealth() < 0){
					enemy.dead(enemy.getType());
					room.setCombat(false);
					room.setKilled(true);
				}
			}

			// do things to attack things
			break;
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
			command(newRoom, player);
		} else {
			command(room, player);
		}
	}

	private void noRoom() {
		System.out.println("You can not go that way");
	}

	private void unknownCommand() {
		System.out.println("One is sorry One does not know how to do that");
	}
}
