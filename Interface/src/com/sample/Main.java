package com.sample;
import java.util.*;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Main {

	private static int menu;
	@SuppressWarnings("unused")
	private static String StallName;
	private static int cost;
	private static String ownerName;
	@SuppressWarnings("unused")
	private static int tvSet;
	private static int projector;
	private static int n;
	private static int screens;
	private static String stallName;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Stall d=new GoldStall("The Mechanic",120000,"Johnson",10);
		//d.display();
		Stall d1=new PremiumStall();
		Stall d2=new ExecutiveStall();
		do
		{
			System.out.println("Choose StallType:");
			System.out.println("1.GoldStall");
			System.out.println("2.PremiumStall");
			System.out.println("3.ExecutiveStall");
			menu=sc.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
				stallName=sc.nextLine();
				
				cost=sc.nextInt();
				ownerName=sc.nextLine();
				tvSet=sc.nextInt();
				Stall d=new GoldStall("The Mechanic",120000,"Johnson",10);
				d.display();
				//d.display();
				//System.out.println("tvset"+tvSet);	
				
				case 2:
				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of projectors)");
				stallName=sc.nextLine();
				cost=sc.nextInt();
				ownerName=sc.nextLine();
				projector=sc.nextInt();
				d1.display("Knitting plaza",300000,"Zain",20);
				break;
			case 3:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
			stallName=sc.nextLine();
			cost=sc.nextInt();
			ownerName=sc.nextLine();
			screens=sc.nextInt();
            d2.display("Fruits Hunt",10000,"Uber",7); 
	        break;


				
			}
		}while(n<=3);
		

	}

}
