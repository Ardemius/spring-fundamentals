import com.spring.fundamentals.service.CustomerService;
import com.spring.fundamentals.service.CustomerServiceImpl;

/**
 * <b>Spring Fundamentals</b> <br/>
 * by Bryan Hansen (Pluralsight course)
 * <p>
 * A course covering the fundamentals of using Spring for building Java applications.
 */
public class Application {

	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImpl();

		System.out.println(service.findAll().get(0).getFirstname());

	}

}
