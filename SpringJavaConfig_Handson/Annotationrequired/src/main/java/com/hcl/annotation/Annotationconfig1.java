package com.hcl.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages = {"com.hcl.annotation"})
@Component
public class Annotationconfig1 {
@Bean(name="box")
public Box getBox()
{
	Box box=new Box();
	box.setLength(12);
	box.setWidth(10);
	return box;
}
@Bean(name="user")
public User getUser()
{
	User user=new User();
	user.setName("surya");
	user.setPassword("Surya");
	return user;
}
}
