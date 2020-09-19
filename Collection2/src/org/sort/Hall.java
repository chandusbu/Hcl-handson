package org.sort;
import java.util.ArrayList;
import java.util.Collections;
class Hall implements Comparable<Hall>{
		private String name;
		private String contactNumber;
		private Double costPerDay;
		private String ownerName;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public Double getCostPerDay() {
			return costPerDay;
		}
		public void setCostPerDay(Double costPerDay) {
			this.costPerDay = costPerDay;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		
		public Hall() {
			super();
			this.name = "";
			this.contactNumber = "";
			this.costPerDay = 0D;
			this.ownerName = "";
		}
		
		public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
			super();
			this.setName(name);
			this.setContactNumber(contactNumber);
			this.setCostPerDay(costPerDay);
			this.setOwnerName(ownerName);
		}
		
		public int compareTo(Hall h) 
	    { 
			if(this.costPerDay<h.costPerDay)
		          return -1;
		    else if(h.costPerDay<this.costPerDay)
		          return 1;
		    return 0;
	    }
		
		public String toString() {
			return String.format("%-20s%-20s%-20s%-20s %n",this.getName(),this.getContactNumber(),this.getCostPerDay(),this.getOwnerName());
		}
	}

	
