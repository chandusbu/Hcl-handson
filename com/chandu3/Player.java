package com.chandu3;

public class Player {
	
	String name;
	String country;
	String skill;
	public Player(String name, String country, String skill) {
		
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
		void show()
		{
			System.out.println("PlayerDetails:");
			System.out.println("playername:" +name);
			System.out.println("countryname:" +country);
			System.out.println("skillname:" +skill);
		
	

}}
