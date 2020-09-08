package com.Hcl2;

public class Event {
	String name;
	String detail;
	String ownerName;
	public Event(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}
	public Event() {
		// TODO Auto-generated constructor stub
	}
	public Event(int noofStall) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Double projectedRevenue()
	{
		return null;
		
	}

}
