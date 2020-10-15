package annotationqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class User {
public User(String name, int age, String city, Order order) {
		super();
		this.name = name;
		this.age = age;
		City = city;
		this.order = order;
	}
public User() {
		super();
		// TODO Auto-generated constructor stub
	}
private String name;
private int age;
private String City;


private Order order;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public Order getOrder() {
	return order;
}
@Autowired
@Qualifier("order2")
public void setOrder(Order order) {
	this.order = order;
}
public void display()
{
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("City:"+City);
	System.out.println("Order Details:");
	System.out.println("itemname:"+order.getItemname());
	System.out.println("Price:"+order.getPrice());
}
}
