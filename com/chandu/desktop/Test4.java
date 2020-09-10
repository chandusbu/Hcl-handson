package com.chandu3;
import java.util.Scanner;
import java.util.*;



@SuppressWarnings("unused")
public class Test4 {


	 static String name;
	 static String country;
	 static String skill;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the player details:");
		name=s.nextLine();
		country=s.nextLine();
		skill=s.nextLine();
		String strMain = "MS Dhoni,India,All Rounder";
		 String[] array = strMain.split(",");
	    
	    for (int i=0; i < array.length; i++)
	    {
	      System.out.println(array[i]);
	    }
		
		
		Player p=new Player("MS Dhoni","india","All Rounder");
		p.show();

	}

}
