package com.sample;

public class ExecutiveStall implements Stall {
	public ExecutiveStall() {
		
	}
	public ExecutiveStall(String stallName, int cost, String ownerName, int screens) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.screens = screens;
	}
	String stallName;
	int cost;
	String ownerName; 
	int screens;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("stallName:"+stallName);
		System.out.println("cost"+cost);
		System.out.println("ownerName:"+ownerName);
		System.out.println("no.of screens"+screens);
		
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
	public int getScreen() {
		return screens;
	}
	public void setScreen(int screen) {
		this.screens = screen;
	}
	@Override
	public void display(String string, int i, String string2, int j) {
		// TODO Auto-generated method stub
		
	}
	

}
