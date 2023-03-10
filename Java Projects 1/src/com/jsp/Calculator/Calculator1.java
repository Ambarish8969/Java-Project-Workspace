package com.jsp.Calculator;

import java.util.Scanner;

// <<  >>  --> Stereotypes
// <  >   --> Generics
interface Calculator{
	int add(int a, int b);
	int sub(int a, int b);
	int mul(int a, int b); 
	int div(int a, int b);
	String displayErrorMessage();
}

class CalculatorImpl implements Calculator{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int sub(int a, int b) {
		return a-b;
	}
	@Override
	public int mul(int a, int b) {
		return a*b; 
	} 
	@Override
	public int div(int a, int b) {
		if(b == 0 || b>a) {
			return 0;
		}
		return a/b;
	}
	@Override
	public String displayErrorMessage() {
		return "Invalid Choice";
	} 
}
public class Calculator1 {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		// Upcasting --> abstraction.
		Calculator c=new CalculatorImpl();  
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.print("Enter your Choice : ");
			System.out.println("\n1 : Add\n2 : Sub\n3 : Mul\n4 : Div\n5 : Exit");
			int choice=ip.nextInt();
			int a=0; 
			int b=0;
			if(choice>=1 && choice<=4) {
				System.out.println("Enter two numbers : ");
				a=ip.nextInt();
				b=ip.nextInt();
			}
		    
			switch(choice) {
			case 1: System.out.println("Add : "+c.add(a, b));
			break;
			case 2: System.out.println("Sub : "+c.sub(a, b));
			break;
			case 3: System.out.println("Mul : "+c.mul(a, b));
			break;
			case 4: int result =c.div(a,b);
					if(result !=0) {
						System.out.println("Div : "+c.div(a, b));
					}else {
						System.out.println("Kindly do not divide by zero or big number.");
					}
			break;
			case 5:System.out.println("Thank You");
				   System.exit(0);
			break;
			default: System.out.println(c.displayErrorMessage());
			}
		}
	}
}
// all the above methods are automatically public and abstract.