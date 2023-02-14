package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeSolution {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		Employee e1=new Employee(100,"Ambarish",1000);
		Employee e2=new Employee(300,"Ambika",5000);
		Employee e3=new Employee(200,"Aishwarya",3000);
		
//		SortEmployeeById obj1=new SortEmployeeById();
//		TreeSet<Employee> t1=new TreeSet<Employee>(obj1);
//		t1.add(e1);
//		t1.add(e2);
//		t1.add(e3);
//		
//		for(Employee e:t1) {
//			System.out.println(e);
//		}
		
		List<Employee> l1=new ArrayList<Employee>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		while(true) {
			System.out.println("1:ById\n2:ByName\n3:BySalary");
			int choice=ip.nextInt();
			switch(choice) {
			case 1:
				Collections.sort(l1,new SortEmployeeById());
				for(Employee e:l1) {
					System.out.println(e);
				}
				break;
			case 2:
				Collections.sort(l1,new SortEmployeeByName());
				for(Employee e:l1) {
					System.out.println(e);
				}
				break;
			case 3:
				Collections.sort(l1,new SortEmployeeBySalary());
				for(Employee e:l1) {
					System.out.println(e);
				}
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid Choice.");
			}
		}
	}
}

// Only TreeSet will give an exception (classCastException)
// ArrayList do not call the compareTo() method.