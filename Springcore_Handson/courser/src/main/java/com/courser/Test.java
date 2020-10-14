package com.courser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		CourserList courselist=new CourserList();
		ArrayList<String> list=new ArrayList<>();
Course Course1=context.getBean("Course1",Course.class);
Course Course2=context.getBean("Course2",Course.class);
Course Course3=context.getBean("Course3",Course.class);
System.out.println("Enter Your Budget");
Double budget=Double.parseDouble(read.readLine());
courselist.insert(Course1);
courselist.insert(Course2);
courselist.insert(Course3);
list=courselist.noOfCourse(budget);
if(list.isEmpty())
{
	System.out.println("No courses available");
}
else {
	for(String values:list) {
		System.out.println(list);
	}
}
	
		((ClassPathXmlApplicationContext)context).close();
	

}


	}


