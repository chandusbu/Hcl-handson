package com.abstract2;

public abstract class Medicine {

public Medicine(String name, double price, ExpiryDate date) {
		super();
		Name = name;
		Price = price;
		this.date = date;
	}
public Medicine() {
	// TODO Auto-generated constructor stub
}
String	Name;
	double Price;
	ExpiryDate date = new ExpiryDate();
	private String name;
	private String ExpiryDate;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public ExpiryDate getDate() {
		return date;
	}
	public void setDate(ExpiryDate date) {
		this.date = date;
	}
	public void getDetails()
	{
		System.out.println("Medicine name:"+name);
		System.out.println("MedicinePrice:"+Price);
		System.out.println("Medicine ExpiryDate:"+ExpiryDate);
		
	}
	public abstract void displayLabel();
}
