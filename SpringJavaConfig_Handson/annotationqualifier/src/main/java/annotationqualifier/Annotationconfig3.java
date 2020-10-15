package annotationqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages = {"annotationqualifier"})
@Component
public class Annotationconfig3 {
@Bean(name="orderone")	
public Order getOrder()
{
	Order orders=new Order();
	orders.setItemname("item1");
	orders.setPrice(230.7);
	return orders;
}
@Bean(name="ordertwo")
@Autowired
@Qualifier("Ordertwo") 
public Order getOrder1()
{
	Order orders1=new Order();
	orders1.setItemname("item2");
	orders1.setPrice(230.07);
	return orders1;
}
@Bean(name="user1")
public User getUser()
{
	User user=new User();
	user.setName("jegen");
	user.setAge(24);
	user.setCity("Chennai");
	
	return user;
	
}

}
