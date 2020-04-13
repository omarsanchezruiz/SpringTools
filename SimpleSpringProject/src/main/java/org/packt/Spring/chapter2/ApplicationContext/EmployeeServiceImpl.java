package org.packt.Spring.chapter2.ApplicationContext;

public class EmployeeServiceImpl implements EmployeeService{
	
	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}

}
