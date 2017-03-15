import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.fundamentals.service.CustomerService;

/**
 * <b>Spring Fundamentals</b> <br/>
 * by Bryan Hansen (Pluralsight course)
 * <p>
 * A course covering the fundamentals of using Spring for building Java applications.
 */
public class Application {

	public static void main(String[] args) {

		// This hardcoded instantiation is no more needed when using Spring application context
		// CustomerService service = new CustomerServiceImpl();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstname());

	}

}
