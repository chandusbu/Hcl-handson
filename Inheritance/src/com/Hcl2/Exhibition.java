package com.Hcl2;

public class Exhibition extends Event {
	int noofstall;
	public Exhibition(int noofStall) {
		super();
		this.noofStall = noofStall;
	}

	public Exhibition() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	int noofStall;

	public int getNoofStall() {
		return noofStall;
	}

	public void setNoofStall(int noofStall) {
		this.noofStall = noofStall;
	}
	public Double projectedRevenue()
	{
		
			Double revenue;
			revenue=  (double) (noofStall*1000);
			return revenue;
		}
		
	}
	


