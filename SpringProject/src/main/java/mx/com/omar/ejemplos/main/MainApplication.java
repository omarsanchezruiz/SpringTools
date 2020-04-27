package mx.com.omar.ejemplos.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.omar.ejemplos.component_scan.MessageService;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessageService messageService = context.getBean("messageServiceImpl", MessageService.class);
		logger.info(messageService.greetUser());
	}

}
