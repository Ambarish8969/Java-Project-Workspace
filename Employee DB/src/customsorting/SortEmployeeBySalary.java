package customsorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		Double sal1=e1.getSalary();
		Double sal2=e2.getSalary();
		return sal1.compareTo(sal2);
	}
}
