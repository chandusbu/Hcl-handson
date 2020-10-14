package com.oo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main3 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Owner.class);
		Owner owner=context.getBean(Owner.class);
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name,password,mobilenumber");
		String name=read.readLine();
		String password=read.readLine();
		String mobilenumber=read.readLine();
		System.out.println("Name:"+name);
		System.out.println("MobileNumber:"+mobilenumber);
		((AnnotationConfigApplicationContext)context).close();

		
	}

}
