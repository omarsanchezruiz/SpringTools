package omar.ejemplos.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService emp = (EmployeeService) context.getBean("employeeService");
		System.out.println("Ejemplo en Spring utilizando Dependency Injection");
		System.out.println("EmployeeService: " +	emp.toString());
		
	}

}
