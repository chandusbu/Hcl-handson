package com.chandu;
import java.util.*;
import java.util.Scanner;

@SuppressWarnings("unused")
public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name;
		 String city;
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the Venuename:");
			name=s.nextLine();
			System.out.println("enter the cityname:");
			 city=s.nextLine();
			 s.nextLine();
			
Venue n=new Venue(name,city);
n.print();

	
		
		
	

	}

}
