package com.jj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("static-access")
	@Autowired
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("courseapplicationContext.xml");
		
			CourseList2 courselist=new CourseList2();
			ArrayList<String> list=new ArrayList<>();
	Course2 Course1=context.getBean("Course1",Course2.class);
	Course2 Course2=context.getBean("Course2",Course2.class);
	Course2 Course3=context.getBean("Course3",Course2.class);
	
	courselist.insert(Course1);
	courselist.insert(Course2);
	courselist.insert(Course3);
	System.out.println(courselist.getDiscountedPrice()+ "for" + Course1.getName());
	System.out.println(courselist.getDiscountedPrice()+ "for" + Course2.getName());
	System.out.println(courselist.getDiscountedPrice()+ "for" + Course3.getName());
			((ClassPathXmlApplicationContext)context).close();
		
	}
	}


