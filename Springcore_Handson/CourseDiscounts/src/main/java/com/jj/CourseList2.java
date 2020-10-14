package com.jj;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class CourseList2 {

static ArrayList<Course2> courseList=new ArrayList<>();

public ArrayList<Course2> getCourselist() {
	return courseList;
}

public void setCourselist(ArrayList<Course2> courselist) {
	this.courseList = courselist;
}
public void insert(Course2 course)
{
	
	courseList.add(course);
	
}
public Double getDiscountedPrice()
{
	double price=Course2.getFee();
if(price>=500)
{
price=(5.0/100)*Course2.getFee();
return price;
}
else if(price>=500)
{
price=(10.0/100)*Course2.getFee();
return price;
}
return price;
		
	
	
}




}


