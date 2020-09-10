package com.cs1;

import java.util.Scanner;
import java.util.*;
public class Sample5 {

	private static final String String = null;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String name;
	 String runs;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the ExtratypePlayer details:");
		name=s.nextLine();
		runs=s.nextLine();
		
		String strMain = "wide#1";
		 String[] array = strMain.split("#");
	    
	    for (int i=0; i < array.length; i++)
	    {
	      System.out.println(array[i]);
	    }
	    
		Extratype e=new Extratype(String,String);
	   
	}


}