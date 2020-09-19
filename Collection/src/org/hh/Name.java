package org.hh;
import java.util.ArrayList;
import java.util.Scanner;
public class Name {

	//private static Object name;

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<String>();
		        Scanner sc = new Scanner(System.in);
		System.out.println("enter username1");
		        String userName = sc.nextLine();
		        System.out.println("Do you want to continue ?(y/n)");
		        sc.nextLine();
		        System.out.println("enter username2");
		        String userName2 = sc.nextLine();
		        System.out.println("Do you want to continue ?(y/n)");
		        sc.nextLine();
		        
		
		      
System.out.println("entered names are:\n"+userName+ "\n" +userName2);
	}

}