package com.chandu2;
import java.util.Scanner;
import java.util.*;


@SuppressWarnings("unused")
public class Delivery1 {



	public static void main(String[] args) {
		long over;
		long ball;
		long runs;
		String batsman;
		String bowler;
		String nonstriker = null;
		// TODO Auto-generated method stub
		
		
		
		
		
		
		Scanner s=new Scanner(System.in);
		
	System.out.println("enter the Over:");
	over=s.nextLong();
	System.out.println("enter the Ball:");
	 ball=s.nextLong();
	System.out.println("enter the Runs:");
	 runs=s.nextLong();
	s.nextLine();
	System.out.println("Enter the Batsman name:");
    batsman=s.nextLine();
    s.nextLine();
    System.out.println("Enter the Bowler name:");
    bowler=s.nextLine();
	s.nextLine();
	System.out.println("Enter the Nonstriker name:");
    nonstriker=s.nextLine();
	s.nextLine();
	Delivery d=new Delivery(over,ball,runs,batsman,bowler,nonstriker);
	d.displayDeliveryDetails();
	
	





	}
	
	
	
	
	
	
	
	
		
		
		
		

	}


