package com;

import java.util.TreeSet;
// customSorting
public class Solution {
	public static void main(String[] args) {
		Student s1=new Student(25);
		Student s2=new Student(23);
		Student s3=new Student(24);
		
		SortStudentAge obj=new SortStudentAge();
		TreeSet<Student> t1=new TreeSet<Student>(obj);
//		TreeSet<Student> t1=new TreeSet<Student>(new SortStudentAge());
		
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		
		for(Student e:t1) {
			System.out.println(e);
		}
	}
}
