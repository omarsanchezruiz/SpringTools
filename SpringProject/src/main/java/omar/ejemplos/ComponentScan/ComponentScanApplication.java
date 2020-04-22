package omar.ejemplos.ComponentScan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ComponentScanApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessageService messageService =	context.getBean("messageServiceImpl", MessageService.class);
	    System.out.println(messageService.greetUser());
	}

}
