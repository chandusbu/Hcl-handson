package org.mm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Courseconfig.class);
		
		Course  Course1=context.getBean("Course1",Course.class);
		Course Course2=context.getBean("Course2",Course.class);
		Course Course3=context.getBean("Course3",Course.class);
		Course1.diplay();
		Course2.diplay();
		Course3.diplay();
		((AnnotationConfigApplicationContext)context).close();
	}

	}


