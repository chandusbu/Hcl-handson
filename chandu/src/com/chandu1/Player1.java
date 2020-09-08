package com.chandu1;

import java.util.Scanner;

public class Player1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String country;
		String skill;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the Playername:");
		name=s.nextLine();
		System.out.println("enter the countryname:");
		 country=s.nextLine();
		 s.nextLine();
		System.out.println("enter the Skillname:");
		 skill=s.nextLine();
		s.nextLine();
		
		Player p= new Player(name,country,skill);
		p.show();

	}

}
