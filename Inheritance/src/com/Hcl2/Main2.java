package com.Hcl2;
import java.util.Scanner;

public class Main2 {
	
	
	private static int menu;
	private static int noofstall;
	@SuppressWarnings("unused")
	private static int noofshows;
	@SuppressWarnings("unused")
	private static int noofseatsperperson;
	private static int n;
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String detail;
		String ownerName;



Event e=new Exhibition();
StageEvent e1=new StageEvent( noofshows,  noofseatsperperson);
	
Scanner sc=new Scanner(System.in);
do
{
	
	System.out.println("Enter the name of the event:");
	name=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter the detail of the event:");
	detail=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter the static owner name of the event:");
	detail=sc.nextLine();
	System.out.println("Enter the type of the event");
	System.out.println("1.Exhibition");
	System.out.println("2.StageEvent");
	menu=sc.nextInt();
	switch(menu)
	{
	case 1:
		System.out.println("Enter the number of stalls:");
		noofstall=sc.nextInt();
		System.out.println("ProjectedRevenue of the Event is"+noofstall*1000);
		break;
	case 2:
		System.out.println("Enter the number of shows:");
		noofshows=sc.nextInt();
		System.out.println("Enter the number of seats per show:");
		noofseatsperperson=sc.nextInt();
				System.out.println("The projected revenue of the event is "+50*noofshows*noofseatsperperson);
			
				break;
		default:
			System.out.println("Invalid");
	}
	
}while(n<=2);

	}

}

