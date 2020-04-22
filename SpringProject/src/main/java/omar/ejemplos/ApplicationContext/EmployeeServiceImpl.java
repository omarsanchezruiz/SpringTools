package omar.ejemplos.ApplicationContext;

public class EmployeeServiceImpl implements EmployeeService{
	
	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}

}
