package com;

import java.util.Comparator;

public class Student {
	int age; 
	
	Student(int age){
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Age is : "+age;
	}
}

// Rules : Comparator -> Interface ->java.util ->JDK1.2

// 1. Create a new class which implements comparator interface and import from java.util package
// 2. Specify Generic. 
// 3. Override compare(). Syntax : public int compare(Element e1,Element e2);
// 4. Create an object of sorting logic class and pass it to constructor of TreeSet.