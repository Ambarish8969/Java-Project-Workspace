package sdbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customSorting.SortByAge;
import customSorting.SortById;
import customSorting.SortByMarks;
import customSorting.SortByName;
import customexception.InvalidChoiceException;
import customexception.StudentNotFoundException;

public class StudentManagementSystemImpl implements StudentManagementSystem {

	Scanner ip=new Scanner(System.in);
	Map<String,Student> db=new LinkedHashMap<String,Student>();

	@Override
	public void addStudent() {
		System.out.println("Enter student age : ");
		int age=ip.nextInt();
		System.out.println("Enter student name : ");
		ip.nextLine(); // if didn't write ip.nextLine() then cursor will go to the 3rd input.
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
		System.out.println("Enter Student ID");
		String sid=ip.next().toUpperCase();
		if(db.containsKey(sid)) {
			Student std=db.get(sid);
			System.out.println(" 1.Update age\n 2.Update Name\n 3.Update Marks ");
			int choice=ip.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter Age");
			int age=ip.nextInt();
			std.setAge(age);
			break;
			case 2:System.out.println("Enter Name");
			String name=ip.next();
			std.setName(name);
			break;
			case 3:System.out.println("Enter Marks:");
			int marks=ip.nextInt();
			std.setMarks(marks);
			break;
			default:try {
				throw new InvalidChoiceException("Invalid Choice");
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				updateStudent();
			}

			}
		}
		else
		{
			try {
				throw new StudentNotFoundException("Student with the ID "+sid+" is Not Found");
			}
			catch(Exception e) {
				System.err.println(e.getMessage());

			}
		}
	}
	@Override
	public void countStudents() {
		System.out.println("No of Student records : "+db.size());
	}
	private static void display(List<Student> list) {
		for(Student S:list) {
			System.out.println(S);
		}
	}
	@Override
	public void sortStudents() {
		Set<String> s=db.keySet();
		List<Student> al= new ArrayList<Student>();
		for(String ele:s) {
			al.add(db.get(ele));
		}
		System.out.println(" 1.Sort By ID\n 2.Sort By Age\n 3.Sort By Name\n 4.Sort By Marks");
		System.out.println("Enter Choice");
		int choice=ip.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(al,new SortById());
			display(al);
			break;
		case 2:
			Collections.sort(al,new SortByAge());
			display(al);
			break;
		case 3:
			Collections.sort(al,new SortByName());
			display(al);
			break;
		case 4:
			Collections.sort(al,new SortByMarks());
			display(al);
			break;
		default:try {
			throw new InvalidChoiceException("Invalid Choice");
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			updateStudent();
		}
		}
	}
	@Override
	public void getStudentWithHighestMarks() {
		if(db.size()>=2) {
			Set<String> s=db.keySet();
			List<Student> al=new ArrayList<Student>();
			for(String ele:s) {
				al.add(db.get(ele));
			}
			Collections.sort(al,new SortByMarks());
			System.out.println(al.get(al.size()-1));
		}
		else {
			try {
				String message="No sufficient student records to compare";
				throw new StudentNotFoundException(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void getStudentWithLowestMarks() {
		if(db.size()>=2) {
			Set<String> s=db.keySet();
			List<Student> al=new ArrayList<Student>();
			for(String ele:s) {
				al.add(db.get(ele));
			}
			Collections.sort(al,new SortByMarks());
			System.out.println(al.get(0));
		}
		else {
			try {
				String message="No sufficient student records to compare";
				throw new StudentNotFoundException(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
