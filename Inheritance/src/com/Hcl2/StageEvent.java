package com.Hcl2;

public class StageEvent extends Event {
	public StageEvent( int noofshows, int noofseatsperperson) {
		super();
		this.noofshows = noofshows;
		this.noofseatsperperson = noofseatsperperson;
	}
	
	public StageEvent() {
		// TODO Auto-generated constructor stub
	}

	public StageEvent(boolean noofshows2, boolean noofseatsperperson2) {
		// TODO Auto-generated constructor stub
	}

	int noofshows;
	int noofseatsperperson;
	private int noofStall;

	
	public int getNoofshows() {
		return noofshows;
	}
	public void setNoofshows(int noofshows) {
		this.noofshows = noofshows;
	}
	public int getNoofseatsperperson() {
		return noofseatsperperson;
	}
	public void setNoofseatsperperson(int noofseatsperperson) {
		this.noofseatsperperson = noofseatsperperson;
	}
	public Double projectedRevenue()
	{
		Double revenue;
		revenue= (double) (noofStall*noofseatsperperson*50);
		return revenue;
	}
}
