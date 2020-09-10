package com.hcl8;
import java.util.Scanner;
class EventTypeDoesNotExistsException that extends Exception.
 {

	@SuppressWarnings("unused")
//	private static int n;
	//private static int cost;

	public static void main(String[] args) {
		
		try
		{
			// declare and initialize here.
			int cost,n,c;
			Scanner KB=new Scanner(System.in);
			
			// input numbers here.
			System.out.print("Enter the cost of item for n days: ");
			cost=KB.nextInt();
       
			System.out.print("Enter the value of n : ");
			n=KB.nextInt();
       
			//throw to catch
			c=cost/n;
			System.out.println("Cost per day of the item is \r\n" + 
					":"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}
	}

}
