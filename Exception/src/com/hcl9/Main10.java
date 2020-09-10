package com.hcl9;
import java.util.Scanner;
public class Main10 {

	@SuppressWarnings("unused")
	private static String name;
	@SuppressWarnings("unused")
	private static double deposit;
	@SuppressWarnings("unused")
	private static double costPerDay;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Item type details:");
				System.out.println("Enter the name:");
				name=sc.nextLine();
				System.out.println("Enter the deposit:"); 
					deposit=sc.nextDouble();
					System.out.println("Enter the cost per day:");
					costPerDay=sc.nextDouble();
					Type c=new Type("Electronics",1000,100);
					System.out.println("Name:"+c.getName());
					System.out.println("Deposit:"+c.getDeposit());
					System.out.println("Cost pER dAY:"+c.getCostPerDay());
				double j=Double.parseDouble("10");
		      }catch(NumberFormatException e){
			 e.printStackTrace();
		       }
	}

}
