package mx.com.omar.ejemplos.construction_arg;

public class Employee2 {

	private String employeeName;
	private int employeeAge;
	private String employeeId;
	
	Employee2(String employeeName, int employeeAge, String	employeeId) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeId = employeeId;
	}
	
	Employee2(String employeeName, String employeeId, int	employeeAge) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeAge = employeeAge;
	}
	
	@Override
	public String toString() {
		return "Employee Name: " + employeeName + ", Employee Age: "
		+ employeeAge + ", Employee Id: " +
		employeeId;
	}
}
