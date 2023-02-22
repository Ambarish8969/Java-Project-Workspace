package innerclass;

abstract class Person{
	abstract void eat();
}
class Tom extends Person{
	public void eat() {
		System.out.println("Eating Chicken");
	}
}
public class Solution {
	public static void main(String[] args) {
		
		// Anonymous class
		Tom t=new Tom();
		t.eat();
		
		Person p=new Person() {
			@Override
			void eat() {
				System.out.println("eating banana.");
			}
		};
		p.eat();
	}
}
