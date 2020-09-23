import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.AddressService;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//appContext.getBean( CustomerService.class);
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service);
		CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service1);
		
		AddressService serviceadd = appContext.getBean("AddressService",AddressService.class);
		System.out.println(serviceadd);
		
		AddressService serviceadd1 = appContext.getBean("AddressService",AddressService.class);
		System.out.println(serviceadd1);
		
		System.out.println(service.findAll().get(0).getFirstname());
		System.out.println(serviceadd.Address().get(0));
	}

}
