package jspiders;

class Student{ 
	private int age; 
	private String name; 
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Test {
	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.setAge(23); // Initialising the age
		s1.setName("Ambarish"); // Initialising the name
		
		System.out.println("Age : "+s1.getAge());
		System.out.println("Name : "+s1.getName());
	}
}
