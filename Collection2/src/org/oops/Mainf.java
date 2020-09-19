package org.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Mainf {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stall> stall_list = new ArrayList<Stall>();
		int count = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of stall details");
		int n = scn.nextInt();
		scn.nextLine();
		while(n-- > 0) {
			System.out.println("Enter the HallName "+ (++count) );
			String name=sc.nextLine();
			
			Stall stall = new Stall(name,detail,type,ownerName);
			stall_list.add(stall);
		}
		
	 
		
		Iterator itr = stall_list.iterator();
		while (itr.hasNext()) {
			Stall stall_obj = (Stall)itr.next();
			if(stall_obj.getName().startsWith("test")) {
				itr.remove();
			}
		}
		
		System.out.printf("%-20s%-20s%-20s%-20s %n%n","name","details","type","ownerName");
		for(Stall disp_obj:stall_list) {
			System.out.printf("%-20s%-20s%-20s%-20s %n%n",disp_obj.getName(),disp_obj.getDetail(),disp_obj.getType(),disp_obj.getOwnerName());
		}
	}


	}


