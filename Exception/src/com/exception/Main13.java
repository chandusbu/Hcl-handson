package com.exception;

import java.util.Scanner;

public class Main13 {

	private static int i;
	private static Object[] table;
	private static Object ownerName;
	private static Object detail;
	private static Object typeId;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
			//Scanner sc=new Scanner(System.in);
			
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number of the events:");
				System.out.println("Enter the details of event1 ");
				Object name = sc.nextLine();
				sc.nextLine();
				detail=sc.nextLine();
				sc.nextLine();
				ownerName=sc.nextLine();
				typeId=sc.nextDouble();
				System.out.println("Enter the details of event2: ");
				name=sc.nextLine();
				sc.nextLine();
				detail=sc.nextLine();
				sc.nextLine();
				ownerName=sc.nextLine();
				typeId=sc.nextDouble();
				System.out.println("The events entered are:");
				
				Object[][] table = new String[2][];
				table[0] = new String[] { "Book Fair","20% discount","John","2"};
				table[1] = new String[] { "Marathon","50km race"," 50km race ","Jane","3"};

				System.out.format("%-15s%-15s%-15s%-15s\n", "Name", "Details", "Ownername","Eventtypeid");
				for (int i = 0; i < table.length; i++) {
				    Object[] row = table[i];
				    System.out.format("%-15d%-15s%-15s%-15s\n", i, row[0], row[1]);
				   
				}}
						
			catch (Exception e) {
				 if(table[i].equals(typeId))
				    {
				    	System.out.println("true");
				    }
				 else
				 {
				throw new EventTypeDoesNotExistsException();
						
			}
		}
			}
	
	}
