package omar.ejemplos.ConstructionArg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructionArgApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) context.getBean("employIndex");
		Employee2 emp2 = (Employee2) context.getBean("employType");
		System.out.println("Ejemplo en Spring utilizando Construction Arg");
		System.out.println("Employee: " +	emp.toString());
		System.out.println("Employee2: " +	emp2.toString());
	}

}
