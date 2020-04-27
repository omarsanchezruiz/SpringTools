package mx.com.omar.ejemplos.dependency_injection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionApplication {
	
	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService emp = (EmployeeService) context.getBean("employeeService");
		logger.info("Ejemplo en Spring utilizando Dependency Injection");
		logger.info("EmployeeService: " +	emp.toString());
		
	}

}
