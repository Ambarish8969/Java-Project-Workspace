package sdbms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customexception.StudentNotFoundException;

public class StudentManagementSystemImpl implements StudentManagementSystem {
	
	Scanner ip=new Scanner(System.in);
	Map<String,Student> db=new LinkedHashMap<String,Student>();
	
	@Override
	public void addStudent() {
		System.out.println("Enter student age : ");
		int age=ip.nextInt();
		System.out.println("Enter student name : ");
		ip.nextLine();
		String name=ip.nextLine(); // we can take input using next() also.
		System.out.println("Enter student marks : ");
		int marks=ip.nextInt();
		Student s1=new Student(age,name,marks);
		db.put(s1.getId(), s1);
		System.out.println("Student Id : "+s1.getId());
	}
	@Override
	public void displayStudent() {
		System.out.println("Enter student id : ");
		String std_id=ip.next().toUpperCase();
		if(db.containsKey(std_id)) { // checking id is present or not.
//			System.out.println(db.get(std_id));
			Student std=db.get(std_id);
			System.out.println("Id : "+std.getId());
			System.out.println("Age : "+std.getAge());
			System.out.println("Name : "+std.getName());
			System.out.println("Marks : "+std.getMarks());
		}else {
			try {
				throw new StudentNotFoundException("Student not found.");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void displayAllStudent() {
		if(db.size() != 0) {
			Set<String> keys1=db.keySet(); // JSP101 JSP102 JSP103. and keyset will return keys of map.
			for(String key:keys1) {
				Student std=db.get(key);
				System.out.println(std); // System.out.println(db.get(key));
			}
		}
		else {
			try {
				throw new StudentNotFoundException("Student Database is Empty.");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void removeStudent() {
		String std_id=ip.next();
		if(db.containsKey(std_id)) {
			db.remove(std_id);
		}else {
			try {
				throw new StudentNotFoundException(std_id+" not found");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void removeAllStudent() {
		if(db.size() != 0) {
			System.out.println("Student Records Available : "+db.size());
			db.clear();
			System.out.println("All Student Records Deleted Successfully");
			System.out.println("Student Records Available : "+db.size());
		}
		else {
			try {
				throw new StudentNotFoundException("Student Database is Empty, Nothing to Delete");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void updateStudent() {
		
	}
	@Override
	public void countStudents() {
		System.out.println("No of Student records : "+db.size());
	}
	@Override
	public void sortStudents() {
		
	}
	@Override
	public void getStudentWithHighestMarks() {
		
	}
	@Override
	public void getStudentWithLowestMarks() {
		
	}
}
