package mx.com.omar.ejemplos.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceApplication {
	
	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// using 'employeeBean'
		Employee employeeA = (Employee)	context.getBean("employeeBean");
		logger.info("Ejemplo en Spring utilizando Inheritance");
		logger.info(employeeA);
		// using 'indianEmployee'
		Employee employeeB = (Employee)	context.getBean("indianEmployee");
		logger.info(employeeB);
	}

}
