package mx.com.omar.ejemplos.construction_arg;

public class Employee {

	private String employeeName;
	private int employeeAge;
	private boolean isMarried;
	
	public Employee(String employeeName, int employeeAge, boolean isMarried) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.isMarried = isMarried;
	}
	
	@Override
	public String toString() {
		return "Employee Name: " + this.employeeName + " , Age:"
				+ this.employeeAge + ", IsMarried: " +
				isMarried;
	}
}
