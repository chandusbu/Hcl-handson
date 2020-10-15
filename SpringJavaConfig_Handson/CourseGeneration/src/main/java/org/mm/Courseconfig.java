package org.mm;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



	@Configuration
	public class Courseconfig {
		@Bean(name = "Course1")
		public Course getcourse() {
	Course Course1=new Course();
			Course1.setName("java");
			Course1.setMentor("sathish");
			Course1.setFee("1000.0");
			return Course1;
			
			}
		
		@Bean(name = "Course2")
		public Course getcourse2() {
	Course Course2=new Course();
			Course2.setName("selenium");
			Course2.setMentor("krishna");
			Course2.setFee("2000");
			return Course2;
			
			}
		@Bean(name = "Course3")
		public Course getcourse3() {
	Course Course3=new Course();
			Course3.setName("python");
			Course3.setMentor("david");
			Course3.setFee("3000.0");
			return Course3;
			
			}
		
	}


