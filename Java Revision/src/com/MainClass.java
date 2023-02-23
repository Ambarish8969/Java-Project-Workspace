package com;

class Car{
	String brand;
	int cost;
	
	Car(String brand,int cost){
		this.brand=brand;
		this.cost=cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		Car c=(Car) obj;
		return ((this.brand.equals(c.brand))&& (this.cost==c.cost));
	}
}
public class MainClass {
	public static void main(String[] args) {
		Car c1=new Car("Abc",456);
		Car c2=new Car("Abc",489);
		System.out.println(c1.equals(c2));
	}
}
