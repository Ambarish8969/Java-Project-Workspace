package com;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee>{
	@Override
	public int compare(Employee x,Employee y) {
		return x.name.compareTo(y.name);
	}
}

// To compare String objects.
// we are using compareTo() of String class