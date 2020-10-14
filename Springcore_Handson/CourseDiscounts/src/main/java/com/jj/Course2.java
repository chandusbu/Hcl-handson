package com.jj;

public class Course2 {
	public Course2() {
		
	}
public Course2(String name, Double fee, String mentor) {
		super();
		this.name = name;
		this.fee = fee;
		this.mentor = mentor;
	}
String name;
static Double fee;
String mentor;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static Double getFee() {
	return fee;
}
public void setFee(Double fee) {
	this.fee = fee;
}
public String getMentor() {
	return mentor;
}
public void setMentor(String mentor) {
	this.mentor = mentor;
}
}
