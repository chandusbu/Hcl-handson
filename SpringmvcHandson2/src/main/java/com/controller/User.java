package com.controller;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;  
@Component
public class User {
public User(String userName, String password) {
		super();
		UserName = userName;
		Password = password;
	}
public User() {
		super();
		// TODO Auto-generated constructor stub
	}
private String UserName;
@Size(min=1,message="required")  
private String Password;
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
}
