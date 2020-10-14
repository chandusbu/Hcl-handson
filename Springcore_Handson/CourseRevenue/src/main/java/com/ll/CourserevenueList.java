package com.ll;

import java.util.ArrayList;




public class CourserevenueList {
	public CourserevenueList(ArrayList<Courserevenue> courseList) {
		super();
		this.courseList = courseList;
	}

	public CourserevenueList() {
		// TODO Auto-generated constructor stub
	}

	ArrayList<Courserevenue> courseList=new ArrayList<>();

	public ArrayList<Courserevenue> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Courserevenue> courseList) {
		this.courseList = courseList;
	}
	public double Revenue()
	{
		int total=(int) (200*Courserevenue.getFee()*20)/100;
		return total;
		
	}

	public void insert(Courserevenue course)
	{
		
		courseList.add(course);
		
	}

}
