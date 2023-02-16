package sdbms;

import java.util.Scanner;

import customexception.InvalidChoiceException;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome to student Database Management System");
		System.out.println("---------------------------------------------");
		Scanner ip=new Scanner(System.in);
		StudentManagementSystem s1=new StudentManagementSystemImpl();
		while(true) {
			System.out.println("1:Add Student\n2:Display Student\n3:Remove Student");
			System.out.println("4:Remove All Student\n5:Update Student\n6:Count Students");
			System.out.println("7:Sort Students\n8:Get Students With Higest Marks");
			System.out.println("9:Get Students With Lowest Marks\n10:Display All Students\n11:Exit");
			System.out.println("Enter your choice : ");
			int choice=ip.nextInt();
			switch(choice) {
			case 1:
				s1.addStudent();
				break;
			case 2:
				s1.displayStudent();
				break;
			case 3:
				s1.removeStudent();
				break;
			case 4:
				s1.removeAllStudent();
				break;
			case 5:
				s1.updateStudent();
				break;
			case 6:
				s1.countStudents();
				break;
			case 7:
				s1.sortStudents();
				break;
			case 8:
				s1.getStudentWithHighestMarks();
				break;
			case 9:
				s1.getStudentWithLowestMarks();
				break;
			case 10:
				s1.displayAllStudent();
				break;
			case 11:
				System.out.println("Thank You");
				System.exit(0);
			default:
				try {
					throw new InvalidChoiceException("Invalid Choice");
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("----------------------------------------------");
		}
	}
}
