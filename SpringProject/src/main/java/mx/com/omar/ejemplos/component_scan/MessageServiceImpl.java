package mx.com.omar.ejemplos.component_scan;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{
	
	public String greetUser() {
		return "Ejemplo en Spring utilizando Component-scan base";
		}

}
