package lambdaexpressions;

@FunctionalInterface
interface Person{
	
	String display(int age);
	
}
public class Test {
	public static void main(String[] args) {
		Person p= (age) -> {
			return "Age : "+age;
//			return (""+age);
		};
		System.out.println(p.display(20));
		System.out.println(p.display(15));
	}
}
