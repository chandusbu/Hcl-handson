package com.chandu4;
import java.util.Scanner;
import java.util.*;


public class Venue {
	private String name;
	private String city;
	
	
	Venue(String name,String city)
	{
		this.name=name;
		this.city=city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
