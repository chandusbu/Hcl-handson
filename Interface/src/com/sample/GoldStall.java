package com.sample;

public class GoldStall implements Stall {
	public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
	}
	public GoldStall()
	{
		
	}
	String stallName;
	int cost;
	String ownerName;
	int tvSet;
		
	@Override
	public void display(String stallName, int cost, String ownerName, int tvSet) {
		// TODO Auto-generated method stub
		System.out.println("stallName:"+stallName);
		System.out.println("cost"+cost);
		System.out.println("ownerName:"+ownerName);
		System.out.println("no.of tvSet"+tvSet);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
		
	}
	
	
