import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
//@ComponentScan = 
public class AppConfig {

	
	/*
	 * @Bean(name = "customerService") public CustomerService getCustomerService() {
	 * CustomerService service = new CustomerServiceImpl(); return service;
	 * 
	 * }
	 * 
	 * @Bean(name = "customerRepository") public CustomerRepository
	 * getCustomerRepository() { return new HibernateCustomerRepositoryImpl(); }
	 */}
