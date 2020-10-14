package com.kk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e=context.getBean(Employee.class,"employee");
		Address add=e.getAddress();
		e.display();
		add.display();
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
