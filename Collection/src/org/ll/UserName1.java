package org.ll;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserName1 {

	private static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c;
		Scanner sc=new Scanner(System.in);
		        // Set demonstration using HashSet 
		        Set<String> h  = new HashSet<String>(); 
		         do {
		        	System.out.println("Do you want to continue?(y/n)");
		   		  c= sc.nextLine();
		        	
		  
		 if(c.equals("y")) {
			 System.out.println("Enter the username");
			  name=sc.nextLine();
			  h.add(name);
		 }
		 else
		 {
			 break;
		 }
		  }
		        while(c.equals("y"));
		 System.out.println("The unique number of usernames is: "+h.size());
		 
	}

}
