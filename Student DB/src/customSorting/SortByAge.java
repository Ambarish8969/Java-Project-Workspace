package customSorting;

import java.util.Comparator;

import sdbms.Student;

public class SortByAge implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2) {
		return s1.getAge()-s2.getAge();
	}
}
