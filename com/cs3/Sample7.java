package com.cs3;

import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long over,ball,runs;
	    String batsman,bowlerName,strikerName;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the over");
	    over=s.nextLong();
	    System.out.println("Enter the ball");
	    ball=s.nextLong();
	    System.out.println("Enter the runs");
	    runs=s.nextLong();
	    System.out.println("Enter the batsman");
	    batsman=s.nextLine();
	    s.nextLine();
	    System.out.println("Enter the bowlename");
	    bowlerName=s.nextLine();
	    s.nextLine();
	    System.out.println("Enter the nonStrikername");
	    strikerName=s.nextLine();
	    
	Delivery d=new Delivery(over,ball,runs,batsman,bowlerName,strikerName);
	d.print();
	    
	}

}
