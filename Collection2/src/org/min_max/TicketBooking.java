package org.min_max;


	import java.util.Collections;
	import java.util.ArrayList;

		@SuppressWarnings("unused")
		class TicketBooking implements Comparable<TicketBooking> {
			private String customerName;
			private int prize;

			public String getCustomerName() {
				return customerName;
			}

			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}

			public int getPrize() {
				return prize;
			}

			public void setPrize(int prize) {
				this.prize = prize;
			}

			
			public TicketBooking() {
				super();
				this.customerName = "";
				this.prize = 0;
			}

			public TicketBooking(String customerName, int prize) {
				super();
				this.setCustomerName(customerName);
				this.setPrize(prize);
			}

			// Comparable method

			public int compareTo(TicketBooking tb) {
				return this.prize - tb.prize;
			}

		
		}




