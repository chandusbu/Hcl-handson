package com.ll;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
		
			CourserevenueList courselist=new CourserevenueList();
			ArrayList<String> list=new ArrayList<>();
	Courserevenue Course1=context.getBean("Course1",Courserevenue.class);
	Courserevenue Course2=context.getBean("Course2",Courserevenue.class);
	Courserevenue Course3=context.getBean("Course3",Courserevenue.class);
	
	courselist.insert(Course1);
	courselist.insert(Course2);
	courselist.insert(Course3);
	
	
		System.out.println("Total Revenue:"+courselist.Revenue());
		
			((ClassPathXmlApplicationContext)context).close();
		

	}

}
