package com.chandu4;

import java.util.Scanner;

public class Venue1 {
 static int Menu = 0;
static String name;
 static String city;


	public static void main(String[] args) {
		int n = 0;
	
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the venue name:");
	name=s.nextLine();
	s.nextLine();
	System.out.println("Enter the city name:");
	city=s.nextLine();
	s.nextLine();
	Venue v=new Venue(name, city);
	v.setName("Greenpark Stadium");
	v.setCity("kanpur");
	System.out.println("VenueDetails:");
    System.out.println("venue name:"+v.getName());
    System.out.println("city name:"+v.getCity());
    do
    {
	  
	  System.out.println("Verify and Update Venue details");
	  System.out.println("Menu");
	  System.out.println("1.Update Venue Name");
	  System.out.println("2.Update City Name");
	  System.out.println("3.All Informations Correct");
	  System.out.println("Type 1 or 2 or 3");
	  Menu=s.nextInt();
	 switch(Menu) 
      { 
          case 1: 
              System.out.println("enter the venue name:");
              name=s.next();
              v.setName(name);
              name=s.next();
              System.out.println("VenueDetails:");
              System.out.println("venue name:"+v.getName());
              System.out.println("city name:"+v.getCity());
               break; 
          case 2: 
              System.out.println("Enter the City Name");
              city=s.next();
              v.setCity(city);
              System.out.println("VenueDetails:");
              System.out.println("venue name:"+v.getName());
              System.out.println("city name:"+v.getCity());
               break; 
          case 3: 
        	  System.out.println("VenueDetails:");
              System.out.println("venue name:"+v.getName());
              System.out.println("city name:"+v.getCity());
              
              break; 
          default: 
              System.out.println("exit"); 
	  
	
	
	}
    }while(n<=3);
	}
}

	