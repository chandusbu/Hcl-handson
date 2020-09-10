package com.hcl9;

public class Type {
			public Type(String name, double i, double j) {
		super();
		this.name = name;
		this.deposit = i;
		this.costPerDay = j;
	}
			public Type() {
				// TODO Auto-generated constructor stub
			}
			String name	;
		Double deposit;
	Double costPerDay;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//Name:Electronics
		//Deposit:1000.0
		//Cost Per Day:100.0
System.out.println("Name:"+name);
		System.out.println("Deposit:"+deposit);
		System.out.println("Cost pER dAY:"+costPerDay);
		return super.toString();
	}
	
}
