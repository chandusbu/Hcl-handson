package com.Hcl3;
import java.util.Scanner;
public class Stall {
@SuppressWarnings("static-access")
public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}
public Stall() {
	// TODO Auto-generated constructor stub
}
static String	name;	
	static String detail;	
static String	ownerName;
public String getName() {
	return name;
}
@SuppressWarnings("static-access")
public void setName(String name) {
	this.name = name;
}
public String getDetail() {
	return detail;
}
@SuppressWarnings("static-access")
public void setDetail(String detail) {
	this.detail = detail;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	Stall.ownerName = ownerName;
}	
static String stallType;
static Integer squareFeet;
public Double computeCost(String stallType, Integer squareFeet)	
{
	double cost=0;
	if(stallType.contentEquals("platinum")) {
		cost=squareFeet*200;
		return cost;
	}
	if(stallType.contentEquals("Diamond")) {
		cost=squareFeet*150;
		return cost;
	}
	if(stallType.contentEquals("gold")) {
		cost=squareFeet*100;
		return cost;
	}
	return cost;
	
	
}
public Double computeCost(String stallType, Integer squareFeet,Integer numberOfTV)	
{
	double cost=0;
	if(stallType.contentEquals("platinum")) {
		cost=(squareFeet*200)+numberOfTV*1000;
		return cost;
	}
	if(stallType.contentEquals("Diamond")) {
		//
		cost=squareFeet*150;
		cost=(squareFeet*150)+numberOfTV*1000;
		return cost;
	}
	if(stallType.contentEquals("gold")) {
		//cost=squareFeet*100;
		cost=(squareFeet*100)+numberOfTV*1000;
		return cost;
	}
	return cost;
	
	
}

					
						
								
								

								
								
				
		
	
}

