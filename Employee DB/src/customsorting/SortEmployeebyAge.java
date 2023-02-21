package customsorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeebyAge implements Comparator<Employee> {
	@Override
	public int compare(Employee e1,Employee e2) {
//		Integer x=e1.getAge();
//		Integer y=e2.getAge();
//		return x.compareTo(y);
		return e1.getAge()-e2.getAge();
	}
}


// compareTo() do not compare primitive data types , it only compare wrapper classes.