package com.abstract2;

public class Ointment extends Medicine {

	public Ointment(String name, double price, com.abstract2.ExpiryDate date) {
		super(name, price, date);
		// TODO Auto-generated constructor stub
	}

	public Ointment(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("“for external use only”");
	}

}
