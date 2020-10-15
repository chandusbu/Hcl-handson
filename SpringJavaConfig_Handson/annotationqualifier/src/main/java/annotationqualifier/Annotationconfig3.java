package annotationqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
public class Annotationconfig3 {
@Bean(name="order1")	
public Order getOrder()
{
	Order orders=new Order();
	orders.setItemname("item1");
	orders.setPrice(230.7);
	return orders;
}
@Bean(name="order2")
public Order getOrder1()
{
	Order orders=new Order();
	orders.setItemname("item2");
	orders.setPrice(230.07);
	return orders;
}
@Bean(name="user")
public User getUser()
{
	User user=new User();
	user.setName("jegen");
	user.setAge(24);
	user.setCity("Chennai");
	
	return user;
	
}

}
