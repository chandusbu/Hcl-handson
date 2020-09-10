package com.cs;
import java.util.*;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Main0 {

	private static int number;
	private static boolean years;
	private static String brand;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your car number");
		number=sc.nextInt();
		System.out.println("How many years old car do you have-"); 
		years=sc.hasNextInt();	
		System.out.println("Car Barnd-");
		brand=sc.nextLine();
	sc.nextLine();
		
		Car s=new Service();
		s.sum();
		s. years();
		s.brand();
			
				
		


	}

}
