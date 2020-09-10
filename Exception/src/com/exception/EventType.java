package com.exception;

public class EventType {
	public  EventType()
	{
		super();
	}
public EventType(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
@SuppressWarnings("unused")
private	Long id;
@SuppressWarnings("unused")
private		String name;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	System.out.println("id:"+id);
	System.out.println("name"+name);
	return super.toString();
}

}
