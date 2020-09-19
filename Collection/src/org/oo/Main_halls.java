package org.oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_halls {

  public static void main(String[] args) {
	 ArrayList<String> hall_list = new ArrayList<>();
	 Scanner scn=new Scanner(System.in);
	 int count=0;
		System.out.println("Enter the number of halls:");
		int n = scn.nextInt();
		scn.nextLine();
		while(n-- > 0) {
			System.out.println("Enter the details of hall "+count++);
			String csv[] = scn.nextLine().split(",");
			String name = csv[0];
			String contactNumber = csv[1];
			double costPerDay = Double.parseDouble(csv[2]);
			String ownerName = csv[3];
			hall_list.add(new Hall(name,contactNumber,costPerDay,ownerName));
		}
		Collections.sort(hall_list);
		System.out.printf("%-20s%-20s%-20s%-20s %n%n","name","contactNumber","costPerDay","ownerName");
		for(Hall disp_obj:hall_list) {
			System.out.println(disp_obj.toString());

		}
}

	}


