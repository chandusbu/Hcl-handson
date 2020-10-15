package com.hcl.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Annotationconfig1.class);
		Box  box=context.getBean(Box.class,"box");
		User user=context.getBean(User.class,"user");
		System.out.println("The hall of length"+"\t"+box.getLength()+"and width"+"\t"+box.getWidth()+"is owned by"+user.getName());;

				((AnnotationConfigApplicationContext)context).close();
			}
	}


