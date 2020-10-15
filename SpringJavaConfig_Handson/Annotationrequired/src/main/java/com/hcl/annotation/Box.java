package com.hcl.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Box {
public Box(User user, int length, int width) {
		super();
		this.user = user;
		this.length = length;
		this.width = width;
	}
public Box() {
		super();
		// TODO Auto-generated constructor stub
	}
private User user;
private int length;
private int width;
public User getUser() {
	return user;
}
@Required
public void setUser(User user) {
	this.user = user;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
}
