package com;

public class Employee {
	int id;
	String name;
	int salary;
	
	Employee(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Id : "+id+", Name : "+name+", Salary : "+salary;
	}
}
