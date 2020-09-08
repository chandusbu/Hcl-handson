package com.Hcl3;

import java.util.Scanner;

public class Main3 {

	public static String name;
	public static String detail;
	public static String ownerName;
	public static String stallType;
	public static int squareFeet;
	private static int numberOfTV;
	public static String cost;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	private static int numberOfTV;

			@SuppressWarnings("unused")
			//public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				
				//Stall s=new Stall();
				System.out.println("Enter the name of the stall:");
						name=sc.nextLine();
						System.out.println("Enter the detail of the stall:");
						detail=sc.nextLine();
						System.out.println("Enter the owner name of the stall:"); 
								ownerName=sc.nextLine();
								System.out.println("Enter the type of the stall:");
								stallType=sc.nextLine();
								System.out.println("Enter the size of the stall in square feet:");
								//Enter the size of the stall in square feet:
								squareFeet=sc.nextInt();
								System.out.println("Does the hall have TV?(y/n)");
								sc.nextLine();
								System.out.println("Enter the number of TV");
								 numberOfTV=sc.nextInt();
								 System.out.println("The cost of the stall is "+cost);
								 Stall s=new Stall();
								 s.computeCost(cost, numberOfTV);
								 s.computeCost(cost, squareFeet, numberOfTV);
								
								
										
										

										
										
						
				
			}
	}


