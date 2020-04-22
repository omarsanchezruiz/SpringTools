package omar.ejemplos.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService empService = (EmployeeServiceImpl) context.getBean("empServiceContext");
		System.out.println("Ejemplo en Spring utilizando Context Application");
		System.out.println("Unique Employee Id: " +	empService.generateEmployeeId());
	}

}
