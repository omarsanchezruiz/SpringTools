package omar.ejemplos.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import omar.ejemplos.ComponentScan.MessageService;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessageService messageService = context.getBean("messageServiceImpl", MessageService.class);
		System.out.println(messageService.greetUser());
	}

}
