package mx.com.omar.ejemplos.setter_injection;

public class ATM {
	
	private Printer printer;
	
	public Printer getPrinter() {
		return printer;
	}
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void printBalance(String accountNumber) {
		getPrinter().printBalance(accountNumber);
	}

}
