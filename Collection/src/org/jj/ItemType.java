package org.jj;

public class ItemType {
	public ItemType(String name, Double deposit, Double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public ItemType() {
		// TODO Auto-generated constructor stub
		super();
		
		
		
	}
	private		String name;
	private	Double deposit;
	private	Double costPerDay;
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
		return  name + " " + deposit + " " + costPerDay;
	}
		

}
