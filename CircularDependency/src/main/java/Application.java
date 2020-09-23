import org.springframework.context.ApplicationContext;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.model.Customer;


public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
			//	Customer c = new Customer(Shopkeeper);
				//c.Dosomething();
				
		
	}

}
