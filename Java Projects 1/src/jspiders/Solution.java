package jspiders;

// Java is a Bottom-Up approach.

abstract class Person{
	abstract void eat();
}
class Jerry extends Person{
	@Override // -> Override annotation
	void eat() {
		System.out.println("Eating NonVeg");
	}
}
public class Solution { 
	public static void main(String[] args) {
		Jerry jerry=new Jerry();
		jerry.eat();
	}
}

// Contract of abstract --> Rules.
// 1. make the class as bstract
// 2. override the absract method.