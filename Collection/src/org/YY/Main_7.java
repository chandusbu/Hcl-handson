package org.YY;
import java.util.*;
import java.util.Scanner;
public class Main_7 {

	private static String name;



	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String c;
		Scanner sc=new Scanner(System.in);
		        // Set demonstration using HashSet 
		        Set<String> hash_Set 
		            = new HashSet<String>(); 
		        
		        
		        do {
		        	System.out.println("Do you want to continue?(y/n)");
		   		  c= sc.nextLine();
		        	
		  
		 if(c.equals("y")) {
			 System.out.println("Enter the username");
			  name=sc.nextLine();
			  hash_Set.add(name);
		 }
		 else
		 {
			 break;
		 }
		  }
		        while(c.equals("y"));
		 System.out.println("The unique number of usernames is: "+hash_Set.size());
		 
		       // System.out.println(hash_Set.size()); 
		  
	
	}

}
