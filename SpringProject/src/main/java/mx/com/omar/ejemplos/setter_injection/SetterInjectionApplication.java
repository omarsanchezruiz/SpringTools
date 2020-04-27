package mx.com.omar.ejemplos.setter_injection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApplication {
	
	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger();
		String accountNumber= "";
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee) context.getBean("employProperty");
		Employee2 employee2 = (Employee2) context.getBean("employPropertyList");
		ATM atmBean = (ATM) context.getBean("atmBean");
		logger.info("Haciendo uso de Setter Injection: ");
		logger.info("property  --> "+employee);
		logger.info(" property list --> "+ employee2.toString());
		
		logger.info("property printer:");
		atmBean.printBalance(accountNumber);
		}

}
