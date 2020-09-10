package com.sample;

public class PremiumStall implements Stall {
	public PremiumStall()
	{
		
	}
	public PremiumStall(String stallName, int cost, String ownerName, int projector) {

		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
	}
	String stallName;
	int cost;
	String ownerName; 
	int projector;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("stallName:"+stallName);
		System.out.println("cost"+cost);
		System.out.println("ownerName:"+ownerName);
		System.out.println("no.of projectors"+projector);
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}
	@Override
	public void display(String string, int i, String string2, int j) {
		// TODO Auto-generated method stub
		
	}

}
