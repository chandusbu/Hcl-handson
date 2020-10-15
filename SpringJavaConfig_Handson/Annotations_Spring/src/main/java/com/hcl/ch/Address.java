package com.hcl.ch;

public class Address {
public Address(String line1, String line2, String city, String pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		City = city;
		this.pincode = pincode;
	}
public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
private String line1;
private String line2;
private String City;
private String pincode;
public String getLine1() {
	return line1;
}
public void setLine1(String line1) {
	this.line1 = line1;
}
public String getLine2() {
	return line2;
}
public void setLine2(String line2) {
	this.line2 = line2;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public void display()
{
	System.out.println("Address:");
	System.out.println(getLine1());
	System.out.println(getLine2());
	System.out.println(getCity());
	System.out.println(getPincode());
}


}
