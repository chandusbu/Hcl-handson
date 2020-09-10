package com.chandu1;
import java.util.Scanner;

import java.util.*;

@SuppressWarnings("unused")
public class Player {

	String name;
	String country;
	String skill;
	
	Player(String name,String country,String skill)
	{
		this.name=name;
		this.country=country;
		this.skill=skill;
	}
	void show()
	
		
		{
			System.out.println("PlayerDetails:");
			System.out.println("player name: "+name);
			System.out.println("country name: "+country);
			System.out.println("skill name: "+skill);
			
	}
	
	
}



