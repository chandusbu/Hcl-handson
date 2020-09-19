package org.jj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main44 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name;
	double deposit;
	double costperDay;
	String c;
	int count=0;
		ArrayList<ItemType> List = new ArrayList<ItemType>();
		Scanner sc=new Scanner(System.in);
		do {
        	System.out.println("Do you want to continue?(y/n)");
   		  c= sc.nextLine();
        	
  
 if(c.equals("y")) {
	 System.out.println("Enter the details of the the itemtype:"+ (++count) );
	 System.out.println("name:");
	  name=sc.nextLine();
	  System.out.println(" Deposit:");
	  deposit=sc.nextDouble();
	  System.out.println("CostperDay:");
	   costperDay = sc.nextDouble();
	  
	  
 }
 else
 {
	 break;
 }
  
      
		
}while(c.equals("y"));
		System.out.printf("%-20s%-20s%-20s%%n","name","Deposit","costperDay");
		for(ItemType disp_obj:List) {
			System.out.printf("%-20s%-20s%-20s%%n",disp_obj.getName(),disp_obj.getDeposit(),disp_obj.getCostPerDay());
		}

}}