package org.sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Maink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int count = 1;
		ArrayList<Hall> hall_list = new ArrayList<>();
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


