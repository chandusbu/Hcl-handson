package com.oo;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Configuration;


@Component
public class Owner {
private static String name;
private String password;
private static String mobilenumber;
public Owner() {
	super();
	// TODO Auto-generated constructor stub
}

public Owner(String name, String password, String mobilenumber) {
		super();
		this.name = name;
		this.name = password;
		this.mobilenumber = mobilenumber;
	}

public  Owner setDetails()
{
	Owner owner=new Owner();
	owner.setName(name);
	owner.setPassword(password);
	owner.setMobilenumber(mobilenumber);
	return owner;
	
	
}

public static String getName() {
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
public static String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}


}


