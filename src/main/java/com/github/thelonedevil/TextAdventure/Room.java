package com.github.thelonedevil.TextAdventure;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

public class Room {
	String type;
	HashMap<String, Boolean> exits = new HashMap<String, Boolean>();
	@Getter @Setter HashMap<String, Double> enemies= new HashMap<String, Double>();

	Room(String type, boolean north, boolean east, boolean south, boolean west) {
		this.type = type;
		exits.put("north",north);
		exits.put("east",east);
		exits.put("south",south);
		exits.put("west",west);
		
	}
	void lookAround(){
		
	}
	void goNorth(){
		
	}
	void goSouth(){
		
	}
	void goEast(){
		
	}
	void goWest(){
		
	}
}
