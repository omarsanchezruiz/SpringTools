package mx.com.omar.ejemplos.setter_injection;

public class Employee {

	String employeeName;
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee Name: " + employeeName;
	}
}
