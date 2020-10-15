package com.hcl.ch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Configuration
@ComponentScan(basePackages = {"org.writer"})
@Component
public class Annotationconfig {
	
	@Bean(name = "employee")
	public Employee getEmp() {
		Employee emp=new Employee();
		emp.setEmployeeName("Sathish");
		emp.setEmployeeMobileNumber((long) 831758714);
		emp.setEmployeeSalary((long) 45000);
		emp.setEmployeeEmail("me@gmail.com");
		emp.setAddress(getAdd());
		
		return emp;
		
	}
	@Bean(name="address")
	public Address getAdd()
	{
		Address add=new Address();
		add.setLine1("AnnaNagar");
		add.setLine2("Kaveripattnam");
		add.setCity("Krishnagiri");
		add.setPincode("560084");
		return add;
		
	}

}
