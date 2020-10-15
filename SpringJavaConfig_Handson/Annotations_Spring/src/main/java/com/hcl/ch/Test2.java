package com.hcl.ch;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext(Annotationconfig.class);
Employee  emp=context.getBean(Employee.class,"employee");
Address add=context.getBean(Address.class,"address");
emp.Display();
add.display();

		((AnnotationConfigApplicationContext)context).close();
	}

}
