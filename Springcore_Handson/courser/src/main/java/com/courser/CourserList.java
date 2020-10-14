package com.courser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourserList {
	public CourserList() {
		
	}
public CourserList(ArrayList<Course> courseList) {
		super();
		this.courseList = courseList;
	}
ArrayList<Course> courseList=new ArrayList<>();

public void insert(Course course)
{
	
	courseList.add(course);
	
}
public ArrayList<String> noOfCourse(double budget){
	ArrayList<String> no=new ArrayList<>();
	for(Course course:courseList) {
		if(budget>=course.getFee()) {
			no.add(course.getName()+"-"+(int)(budget/course.getFee()));
		}
	}
	return no;
}
public ArrayList<Course> getCourseList() {
	return courseList;
}
public void setCourseList(ArrayList<Course> courseList) {
	this.courseList = courseList;
}

}
