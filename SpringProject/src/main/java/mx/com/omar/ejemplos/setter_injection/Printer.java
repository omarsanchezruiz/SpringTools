package mx.com.omar.ejemplos.setter_injection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Printer {
	final Logger logger = LogManager.getLogger();
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printBalance(String accountNumber) {
		logger.info(message + accountNumber);
	}

}
