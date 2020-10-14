package com.courser;

public class Course {
	public Course()
	{
		super();
	}
public Course(String name, String mentor, Double fee) {
		super();
		this.name = name;
		this.mentor = mentor;
		this.fee = fee;
	}
private String name;
private String mentor;
private Double fee;
public  String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMentor() {
	return mentor;
}
public void setMentor(String mentor) {
	this.mentor = mentor;
}
public Double getFee() {
	return fee;
}
public void setFee(Double fee) {
	this.fee = fee;
}

}
