package com.abstract2;
import java.util.Random;
import java.util.Scanner;
@SuppressWarnings("unused")
public class TestMedicine {

	
	private static Object name;
	private static String price;
	private static String ExpiryDate;

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	Name;
		double Price;
		ExpiryDate date = new ExpiryDate();
Scanner sc=new Scanner(System.in);
String details2 = null;
String medicine[]=new String[5];
medicine=details2.split(",");
name=medicine[0];
price=medicine[1];
ExpiryDate=medicine[2];
System.out.println("Enter 5 Medicine Details :(name,price,exp date)");
System.out.println("enter ointment details:");
Medicine n=new Tablet("Soframycine",60,21/06/2020);
n.displayLabel();



}}