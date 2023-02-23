package com;

// Overriding equals() method.

class Student{
	int age;
	String name;
	
	Student(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	@Override  // Object obj = new Student(20,"Tom");
	public boolean equals(Object obj) {  // 1 -> upcasting
		Student s= (Student) obj;        // 2 -> downcasting
		return this.age==s.age;			 // 3 -> comparison logic
	}
}

public class Solution {
	public static void main(String[] args) {
		Student s1=new Student(20,"Tom");
		Student s2=new Student(20,"Tom");
		System.out.println(s1.equals(s2)); // false
		// s1.equals(new Student(20,"Tom"));
	}
}

// s1 -> this and s2 -> obj -> s
// Rules to Override equals()
// 1. Upcasting 2. Downcasting 3. Comparison logic