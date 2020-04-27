package mx.com.omar.ejemplos.dependency_injection;

public class EmployeeServiceImpl  implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
	this.employeeDao = employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
