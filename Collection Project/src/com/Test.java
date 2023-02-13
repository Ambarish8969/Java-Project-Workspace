package com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student(23,"Ambi");
		Student s2=new Student(24,"Abhi");
		Student s3=new Student(26,"Ambika");
		
		Map<Integer,Student> map=new LinkedHashMap<Integer,Student>();
		map.put(1, s1); // map.put(1,new Student(23,"Ambi");
		map.put(2, s2); // map.put(2,new Student(24,"Abhi");
		map.put(3, s3); // map.put(3,new Student(26,"Ambika");
		
		// Converting Map into a set which stores only keys using keySet().
		Set<Integer> keys=map.keySet();
		
		// Creating an instance of ArrayList and storing into reference of List.
		List<Student> list=new ArrayList<Student>();
		
		// Traversing Entries.
		for(int key:keys) {
			Student std=map.get(key); // Getting the value(Student object).
			list.add(std); // Adding the value(Student object) into ArrayList.
			System.out.println(std); // Printing the value (Student object).
		}
	}
}
