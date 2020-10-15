package com.hcl.annotation;

public class User {
public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
public User() {
		super();
		// TODO Auto-generated constructor stub
	}
private String name;
private String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public void display()
{
	System.out.println(name+"\t");
}
}
