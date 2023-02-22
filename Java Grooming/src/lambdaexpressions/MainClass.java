package lambdaexpressions;

interface Student{
	void study(String name,String subject);
}
public class MainClass {
	public static void main(String[] args) {
		Student std= (name,subject) ->{
			System.out.println(name+" is studying "+subject);
		};
		std.study("Ambika", "Java");
	}
}
