package mx.com.omar.ejemplos.application_context;

public class EmployeeServiceImpl implements EmployeeService{
	
	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}

}
