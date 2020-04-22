package omar.ejemplos.ComponentScan;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{
	
	public String greetUser() {
		return "Ejemplo en Spring utilizando Component-scan base";
		}

}
