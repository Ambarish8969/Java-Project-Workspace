package edbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import customexception.EmployeeNotFoundException;
import customexception.InvalidChoiceException;
import customsorting.SortEmployeeByAge;
import customsorting.SortEmployeeById;
import customsorting.SortEmployeeByName;
import customsorting.SortEmployeeBySalary;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem {
	
	Scanner ip=new Scanner(System.in);
	Map<String, Employee> db=new TreeMap<String, Employee>();
	
	@Override
	public void addEmployee(){
		System.out.println("Enter Employee age : ");
		int age=ip.nextInt();
		System.out.println("Enter Employee name : ");
		String name=ip.next();
		System.out.println("Enter Employee salary : ");
		double salary=ip.nextDouble();
		Employee e1=new Employee(age,name,salary);
		db.put(e1.getId(), e1);
		System.out.println("Employee Added.");
	}
	@Override
	public void displayEmployee(){
		System.out.println("Enter Employee Id : ");
		String emp_id=ip.next().toUpperCase();
		if(db.containsKey(emp_id)) {
//			System.out.println(db.get(emp_id));
			Employee emp=db.get(emp_id);
			System.out.println("Id : "+emp.getId());
			System.out.println("Age : "+emp.getAge());
			System.out.println("Name : "+emp.getName());
			System.out.println("Salary : "+emp.getSalary());
		}else {
			try {
				throw new EmployeeNotFoundException("Employee Not Found");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void displayAllEmployees() {
		if(db.size() != 0) {
			Set<String> keys=db.keySet();
			for(String key:keys) {
				System.out.println(db.get(key));
			}
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employee Not Found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void removeEmployee() {
		System.out.println("Enter Employee Id to Remove : ");
		String emp_id=ip.next().toUpperCase();
		if(db.containsKey(emp_id)) {
			db.remove(emp_id);
			System.out.println("Employee Removed Successfully.");
		}else {
			try {
				throw new EmployeeNotFoundException("Employee Not Found");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void removeAllEmployees() {
		if(db.size() != 0) {
			System.out.println("Employee Records Available : "+db.size());
			db.clear();
			System.out.println("All Employee Records Deleted Successfully");
			System.out.println("Employee Records Available : "+db.size());
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employee Database is Empty, Nothing to Delete");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void updateEmployee() {
		System.out.println("Enter Employee Id to Edit : ");
		String emp_id=ip.next().toUpperCase();
		if(db.containsKey(emp_id)) {
			Employee emp=db.get(emp_id);
			System.out.println("1: Update Name\n2: Update Age\n3: Update Salary");
			int choice=ip.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Employee Name : ");
				String name=ip.next();
				emp.setName(name);
				break;
			case 2:
				System.out.println("Enter Employee Age : ");
				int age=ip.nextInt();
				emp.setAge(age);
				break;
			case 3:
				System.out.println("Enter Employee Salary : ");
				double salary=ip.nextDouble();
				emp.setSalary(salary);
				break;
			default:
				try {
					throw new InvalidChoiceException("Invalid choice");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employee Not Found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void countEmployees() {
		System.out.println("No of Employees : "+db.size());
	}
	
	// display method is to retrieve all the objects from list.
	public static void display(List<Employee> list) {
		for(Employee key:list) {
			System.out.println(key);
		}
	}
	
	@Override
	public void sortEmployee() {
		Set<String> keys=db.keySet();
		List<Employee> list=new ArrayList<Employee>();
		for(String key:keys) {
			list.add(db.get(key));
		}
		System.out.println("1:Sort By Age\n2:Sort By Id\n3:Sort By Name\n4:Sort By Salary");
		System.out.println("Enter Your choice : ");
		int choice=ip.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(list,new SortEmployeeByAge());
			display(list);
			break;
		case 2:
			Collections.sort(list,new SortEmployeeById());
			display(list);
			break;
		case 3:
			Collections.sort(list,new SortEmployeeByName());
			display(list);
			break;
		case 4:
			Collections.sort(list,new SortEmployeeBySalary());
			display(list);
			break;
		default:
			try {
				throw new InvalidChoiceException("Invalid Choice");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void getEmployeeWithHighestSalary() {
		if(db.size()>=2) {
			Set<String> keys=db.keySet();
			List<Employee> list=new ArrayList<Employee>();
			for(String key:keys) {
				list.add(db.get(key));
			}
			Collections.sort(list,new SortEmployeeBySalary());
			System.out.println(list.get(list.size()-1));
		}
		else {
			try {
				String message="No sufficient Employee records to compare";
				throw new EmployeeNotFoundException(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	@Override
	public void getEmployeeWithLowestSalary() {
		if(db.size()>=2) {
			Set<String> keys=db.keySet();
			List<Employee> list=new ArrayList<Employee>();
			for(String key:keys) {
				list.add(db.get(key));
			}
			Collections.sort(list,new SortEmployeeBySalary());
			System.out.println(list.get(0));
		}
		else {
			try {
				String message="No sufficient Employee records to compare";
				throw new EmployeeNotFoundException(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
