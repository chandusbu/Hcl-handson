package com.hcl10;
import java.util.InputMismatchException;
import java.util.Scanner; 
public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an integer input");
	n=sc.nextInt();
	System.out.println("Entered value is "+n);
			
}
catch(InputMismatchException e)

{
	e.toString();
}
	}

}
