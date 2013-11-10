package com.github.thelonedevil.TextAdventure;

import java.util.HashMap;


public class Room {
	int ID;
	HashMap<String, Boolean> exits = new HashMap<String, Boolean>();
	HashMap<String, Double> enemies= new HashMap<String, Double>();

	Room(int type) {
		this.ID = type;
		lookAround();
		
		
	}
	String lookAround(){
		switch(ID){
		case 1:
			return "You find yourself in a clearing in the middle of a dark and spooky forest.";
		case 2:
			return "To your north and east is an open plain, to the south is a forest and to your west is a river.";
		default:
			return "error";
		}
	}
	int goNorth(){
		switch(ID){
		case 1:
			return 2;
		}
		return 0;
	}
	int goSouth(){
		switch(ID){
		case 2:
			return 1;
		}
		return 0;
	}
	int goEast(){
		switch(ID){
		
		}
		return 0;
	}
	int goWest(){
		switch(ID){
		
		}
		return 0;
	}
}
