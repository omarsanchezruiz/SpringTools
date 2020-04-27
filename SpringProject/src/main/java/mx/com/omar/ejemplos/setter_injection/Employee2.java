package mx.com.omar.ejemplos.setter_injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee2 {

	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;
	
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
		
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
		
	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}
	
	@Override
	public String toString() {
		return "Employee Name: " + lists.get(0)+ ", "+ lists.get(1)+ ", "+ lists.get(2);
	}
}
