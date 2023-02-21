package edbms;

import java.util.Scanner;

import customexception.InvalidChoiceException;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Database Management System");
		System.out.println("---------------------------------------------");
		Scanner ip=new Scanner(System.in);
		EmployeeManagementSystemImpl e1=new EmployeeManagementSystemImpl();
		while(true) {
			System.out.println("1: Add Employee\n2: Display Employee\n3: Display All Employee");
			System.out.println("4: Remove Employee\n5: Rempve All Employees\n6: Update Employee");
			System.out.println("7: Count Employee\n8: Sort Employee\n9: Get Employee With Highest Salary");
			System.out.println("10: Get Employee With Lowest Salary\n11:Exit");
			System.out.println("Enter your choice : ");
			int choice=ip.nextInt();
			switch(choice) {
			case 1:
				e1.addEmployee();
				break;
			case 2:
				e1.displayEmployee();
				break;
			case 3:
				e1.displayAllEmployees();
				break;
			case 4:
				e1.removeEmployee();
				break;
			case 5:
				e1.removeAllEmployees();
				break;
			case 6:
				e1.updateEmployee();
				break;
			case 7:
				e1.countEmployees();
				break;
			case 8:
				e1.sortEmployee();
				break;
			case 9:
				e1.getEmployeeWithHighestSalary();
				break;
			case 10:
				e1.getEmployeeWithLowestSalary();
				break;
			case 11:
				System.out.println("Thank You.");
				System.exit(0);
			default:
				try {
					throw new InvalidChoiceException("Invalid Choice.");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
