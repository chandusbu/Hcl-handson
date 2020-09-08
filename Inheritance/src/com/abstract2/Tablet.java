package com.abstract2;

public class Tablet extends Medicine {

	

	private static com.abstract2.ExpiryDate Expirydate;



	public Tablet(String name, double price) {
		super(name, price, Expirydate);
		// TODO Auto-generated constructor stub
	}

	

	public Tablet() {
		super();// TODO Auto-generated constructor stub
	}



	public Tablet(String string) {
		// TODO Auto-generated constructor stub
	}



	public Tablet(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("“store in a cool dry place”");
	}

}
