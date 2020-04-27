package mx.com.omar.ejemplos.application_context;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextApplication {

	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("file:C:\\workspaceSpringTols\\SpringProject\\src\\main\\resources\\beans.xml");
		EmployeeService empService = (EmployeeServiceImpl) context.getBean("empServiceContext");
		logger.info(context.getDisplayName());
		logger.info(context.getBeanDefinitionCount());
		logger.info("Ejemplo en Spring utilizando Context Application");
		logger.info("Unique Employee Id: {}",	empService.generateEmployeeId());
	}

}
