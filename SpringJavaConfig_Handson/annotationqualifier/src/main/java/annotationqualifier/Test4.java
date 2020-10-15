package annotationqualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Annotationconfig3.class);
		User user=context.getBean(User.class,"user");
		Order orders =context.getBean("order1",Order.class);
		Order orders1=context.getBean("order2",Order.class);
		user.display();
		orders1.display();
				((AnnotationConfigApplicationContext)context).close();
			}
	}


