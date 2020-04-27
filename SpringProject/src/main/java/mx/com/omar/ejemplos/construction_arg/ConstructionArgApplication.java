package mx.com.omar.ejemplos.construction_arg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructionArgApplication {
	
	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) context.getBean("employIndex");
		Employee2 emp2 = (Employee2) context.getBean("employType");
		logger.info("Ejemplo en Spring utilizando Construction Arg");
		logger.info("Employee: " +	emp.toString());
		logger.info("Employee2: " +	emp2.toString());
	}

}
