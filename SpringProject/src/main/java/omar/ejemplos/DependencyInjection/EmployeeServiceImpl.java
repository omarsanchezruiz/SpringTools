package omar.ejemplos.DependencyInjection;

public class EmployeeServiceImpl  implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
	this.employeeDao = employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
