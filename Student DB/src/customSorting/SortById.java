package customSorting;

import java.util.Comparator;

import sdbms.Student;

public class SortById implements Comparator<Student> {
	@Override
	public int compare(Student s1,Student s2) {
		return s1.getId().compareTo(s2.getId());
	}
}
