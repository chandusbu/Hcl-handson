package annotationqualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Annotationconfig3.class);
		User user=context.getBean(User.class,"user");
		
		user.display();
		
				((AnnotationConfigApplicationContext)context).close();
			}
	}


