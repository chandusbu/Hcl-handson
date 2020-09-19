package org.min_max;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Mainvv {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of customers");
		String num = scn.nextLine();
		int n = Integer.parseInt(num);

		System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
		ArrayList<TicketBooking> tb_list = new ArrayList<TicketBooking>(); 
		while (n-- > 0) {
			String cust_details = scn.nextLine();
			String csv[] = cust_details.split(",");
			String name = csv[0];
			int prize = Integer.parseInt(csv[1]);
			tb_list.add(new TicketBooking(name,prize));	
		}
		Collections.sort(tb_list);
		TicketBooking minCostCust = Collections.min(tb_list);
		TicketBooking maxCostCust = Collections.max(tb_list);
		System.out.println(minCostCust.getCustomerName()+" spends minimum amount of Rs."+minCostCust.getPrize());
		System.out.println(maxCostCust.getCustomerName()+" spends maximum amount of Rs."+maxCostCust.getPrize());
		
	}

}