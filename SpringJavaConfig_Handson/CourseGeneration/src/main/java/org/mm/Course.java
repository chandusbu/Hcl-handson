package org.mm;

import org.springframework.beans.factory.annotation.Autowired;

public class Course {
	public Course() {
		
	}
public Course(String name, String mentor, String fee) {
		super();
		this.name = name;
		this.mentor = mentor;
		this.fee = fee;
	}
private  String name;
private  String mentor;
private  String fee;
public String getName() {
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
public String getFee() {
	return fee;
}
public void setFee(String fee) {
	this.fee = fee;
}
void diplay() {
	System.out.println("Name:"+name);
	System.out.println("SME by"+mentor);
	System.out.println("fee"+fee);
}
}
