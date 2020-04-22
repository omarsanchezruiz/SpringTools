package omar.ejemplos.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApplication {
	
	public static void main(String[] args) {
		String accountNumber= "";
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee) context.getBean("employProperty");
		Employee2 employee2 = (Employee2) context.getBean("employPropertyList");
		ATM atmBean = (ATM) context.getBean("atmBean");
		System.out.println("Haciendo uso de Setter Injection: ");
		System.out.println("property  --> "+employee);
		System.out.println(" property list --> "+ employee2.toString());
		
		System.out.println("property printer:");
		atmBean.printBalance(accountNumber);
		}

}
