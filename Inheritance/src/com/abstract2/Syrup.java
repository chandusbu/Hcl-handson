package com.abstract2;

public class Syrup extends Medicine {

	private String name;
	private String ExpiryDate;

	public Syrup(String name, double price, com.abstract2.ExpiryDate date) {
		super(name, price, date);
		// TODO Auto-generated constructor stub
	}

	public Syrup(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Medicine name:"+name);
		System.out.println("MedicinePrice:"+Price);
		System.out.println("Medicine ExpiryDate:"+ExpiryDate);
	}

}
